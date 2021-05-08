package homework7.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework7.dataAccess.abstracts.UserDaoService;
import homework7.entities.concretes.User;

public class UserDao implements UserDaoService {

	List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {

		users.add(user);
		System.out.println(user.getFirstName().toUpperCase() + " " + user.getLastName().toUpperCase()
				+ " adlý kullanýcý kayýt edildi.");

	}

	@Override
	public boolean checkEmail(User user) {
		for (User u : users) {
			if (u.geteMail() == user.geteMail()) {
				return false;
			}

		}
		return true;
	}

	@Override
	public boolean loginCheck(String email, String password) {
		for (User user : users) {
			if (user.geteMail() == email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

}