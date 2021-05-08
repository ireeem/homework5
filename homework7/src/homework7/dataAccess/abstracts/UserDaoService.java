package homework7.dataAccess.abstracts;

import homework7.entities.concretes.User;

public interface UserDaoService {

	void add(User user);

	boolean checkEmail(User user);

	boolean loginCheck(String email, String password);

}
