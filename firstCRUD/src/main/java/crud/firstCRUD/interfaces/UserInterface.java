package crud.firstCRUD.interfaces;

import crud.firstCRUD.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends CrudRepository<UserModel, Long> {
}
