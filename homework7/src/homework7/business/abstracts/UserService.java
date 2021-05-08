package homework7.business.abstracts;

import homework7.entities.concretes.User;

public interface UserService {

	void register(User user);

	void login(String email, String password);

}