package loginDemoSpring.login.controllers;

import loginDemoSpring.login.interfaces.UserInterface;
import loginDemoSpring.login.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserInterface userManipulator;

    @PostMapping("/user")
    public String Store(@RequestBody UserModel newUser) {
        if(newUser.getEmail().isEmpty() || newUser.getName().isEmpty() || newUser.getPassword().isEmpty()){
            return "400 - Complete all the fields to continue";
        }else {
            try{
                userManipulator.save(newUser);
                return "User created with success";
            } catch (Error ERR) {
                return "500 - Error to save a new user in our database, please, try again ";
            }
        }
    }

    @GetMapping("/user")
    public List<UserModel> Index() throws RuntimeException{
        try {
            return (List<UserModel>) userManipulator.findAll();
        } catch (Error err) {
            System.out.println("O ERRO TA AQUI OW : " + err);
            throw new RuntimeException("Error to list users");
        }

    }
}
