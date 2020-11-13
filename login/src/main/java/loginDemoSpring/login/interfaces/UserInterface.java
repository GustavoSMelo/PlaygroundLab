package loginDemoSpring.login.interfaces;

import loginDemoSpring.login.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends CrudRepository<UserModel, Long> {
}
