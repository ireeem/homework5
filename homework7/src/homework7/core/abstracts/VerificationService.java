package homework7.core.abstracts;

import homework7.entities.concretes.User;

public interface VerificationService {

	boolean isValid(User user);

}
