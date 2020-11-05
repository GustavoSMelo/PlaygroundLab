package crud.firstCRUD.Controllers;

import crud.firstCRUD.interfaces.UserInterface;
import crud.firstCRUD.models.UserModel;
import javassist.NotFoundException;
import jdk.jshell.spi.ExecutionControl;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.io.EOFException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@RestController
public class UserController {

    @Autowired
    private UserInterface userinterface;

    @GetMapping("/user")
    public List<UserModel> Index () {
        return (List<UserModel>) userinterface.findAll();
    }

    @PostMapping("/user")
    public UserModel Store (@RequestBody UserModel user) {
        userinterface.save(user);
        return user;
    }

    @PutMapping("/user/{ID}")
    public String Update (@PathVariable(value = "ID") long ID, @RequestBody UserModel userUpdated) throws NotFoundException {
        UserModel user = userinterface.findById(ID).orElseThrow(() -> new NotFoundException("User not founded"));
        user.setEmail(userUpdated.getEmail());
        user.setPassword(userUpdated.getPassword());

        userinterface.save(user);

        return String.format("Success: User updated with success\n{Email: %s, Password: %s, ID: %x}", user.getEmail(), user.getPassword(), user.getID());
    }

    @DeleteMapping("/user/{ID}")
    public String Destroy (@PathVariable(value = "ID") long ID) {
        try {
            userinterface.deleteById(ID);
            return "User deleted with success ";
        }catch (Exception err) {
            return "User not found";
        }
    }
}
