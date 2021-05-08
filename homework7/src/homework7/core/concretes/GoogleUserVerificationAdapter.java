package homework7.core.concretes;

import homework7.core.abstracts.VerificationService;
import homework7.entities.concretes.User;
import homework7.googleUserValidationService.GoogleVerificationService;

public class GoogleUserVerificationAdapter implements VerificationService {

	@Override
	public boolean isValid(User user) {
		GoogleVerificationService googleUserValid= new GoogleVerificationService();
		return googleUserValid.isValidGoogle();
	}
}
