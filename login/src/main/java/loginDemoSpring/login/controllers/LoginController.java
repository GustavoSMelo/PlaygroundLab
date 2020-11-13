package loginDemoSpring.login.controllers;

import loginDemoSpring.login.interfaces.UserInterface;
import loginDemoSpring.login.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserInterface userManipulator;

    @PostMapping("/login/user")
    public String Index (@RequestBody Map<String, String> params) throws RuntimeException {
        if(params.get("email").isBlank() || params.get("password").isBlank()) {
            return "{"+"Error:"+"Please complete all the fields and try again"+"}";
        } else {
            try {
                ArrayList<UserModel> listUsers = (ArrayList<UserModel>) userManipulator.findAll();

                for(int i = 0; i <= listUsers.size(); i++) {
                    if(listUsers.get(i).getEmail().equalsIgnoreCase(params.get("email")) &&
                            listUsers.get(i).getPassword().equalsIgnoreCase(params.get("password"))){
                        return  "{" +
                                "id: "+listUsers.get(i).getId()+"\n" +
                                "name: " +listUsers.get(i).getEmail()+"\n"+
                                "email: "+listUsers.get(i).getEmail() + "\n" +
                                "}";
                    }
                }
                return "{"+"Error: "+ "Any user as founded with this email or password wrong" +"}";
            } catch (Error err) {
                return "{"+"Error: "+"Any user as founded with this email or password wrong"+"}";
            }
        }
    }
}
