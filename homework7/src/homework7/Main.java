package homework7;
import homework7.business.abstracts.UserService;
import homework7.business.concretes.UserManager;
import homework7.core.concretes.GoogleUserVerificationAdapter;
import homework7.core.concretes.ValidatorManager;
import homework7.core.concretes.VerificationManager;
import homework7.dataAccess.concretes.UserDao;
import homework7.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user1 = new User("Ýrem", "Can", "ireem1881@gmail.com", "prensesirem");

		User user2 = new User("Zeynep", "Can", "zeynepp12@gmail.com", "5978zeyno");
		
		User user3= new User("Alex", "Chico", "ceaserlm@gmail.com", "lmao78");
		
		UserService service =new UserManager(new VerificationManager(),new UserDao(),new ValidatorManager());

		
		System.out.println("Kayýt Baþarýlý");
		System.out.println("---------");
		service.register(user1);
		service.login(user1.geteMail(), user1.getPassword());
		
		System.out.println("---------");
		System.out.println("Kayýt Baþarýsýz");
		System.out.println("---------");
		service.register(user2);
		service.login(user2.geteMail(), user2.getPassword());
		
		UserService service2= new UserManager(new GoogleUserVerificationAdapter(), new UserDao(), new ValidatorManager());
		
		System.out.println("---------");
		System.out.println("Basarýlý GOOGLE kayýt");
		System.out.println("---------");
		service2.register(user3);
		service2.login(user3.geteMail(), user3.getPassword());
		
		
		
		
	}
	
	

}