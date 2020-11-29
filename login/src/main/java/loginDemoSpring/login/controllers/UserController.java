package loginDemoSpring.login.controllers;

import loginDemoSpring.login.interfaces.UserInterface;
import loginDemoSpring.login.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserInterface userManipulator;

    @PostMapping("/user")
    public Map<String, String> Store(@RequestBody UserModel newUser) {
        if(newUser.getEmail().isEmpty() || newUser.getName().isEmpty() || newUser.getPassword().isEmpty()){
            HashMap<String, String> jsonObject = new HashMap<>();
            jsonObject.put("Error", "Complete all the fields to continue");
            return jsonObject;
        }else {
            try{
                userManipulator.save(newUser);
                HashMap<String, String> jsonObject = new HashMap<>();
                jsonObject.put("Message","User created with success ");
                return jsonObject;
            } catch (Error ERR) {
                HashMap<String, String> jsonObject = new HashMap<>();
                jsonObject.put("Error", "Error to save a new user in our database, please, try again ");
                return jsonObject;
            }
        }
    }

    @GetMapping("/user")
    public List<UserModel> Index() throws RuntimeException{
        try {
            return (List<UserModel>) userManipulator.findAll();
        } catch (Error err) {
            throw new RuntimeException("Error to list users");
        }
    }
}
