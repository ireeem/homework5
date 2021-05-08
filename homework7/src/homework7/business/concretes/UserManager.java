package homework7.business.concretes;

import homework7.business.abstracts.UserService;
import homework7.core.abstracts.ValidatorService;
import homework7.core.abstracts.VerificationService;
import homework7.dataAccess.abstracts.UserDaoService;
import homework7.entities.concretes.User;

public class UserManager implements UserService {

	VerificationService verificationService;
	UserDaoService userDaoService;
	ValidatorService validatorService;

	public UserManager(VerificationService verificationService, UserDaoService userDaoService,
			ValidatorService validatorService) {

		super();
		this.verificationService = verificationService;
		this.userDaoService = userDaoService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if (!verificationService.isValid(user)) {
			System.out.println("Kay�t Ba�ar�s�z.NOT: �stenilen formata uymad�n�z.");
		} else if (!userDaoService.checkEmail(user)) {
			System.out.println("Bu email adresi al�nm��t�r. L�tfen farkl� bir email adresi giriniz.");
		}else {
			userDaoService.add(user);
			validatorService.verificationMail();
		}

	}

	@Override
	public void login(String email, String password) {
		if(userDaoService.loginCheck(email, password)) {
			System.out.println("Login succes.");
		}else {
			System.out.println("Login failed.");
		
		}

	}

}
