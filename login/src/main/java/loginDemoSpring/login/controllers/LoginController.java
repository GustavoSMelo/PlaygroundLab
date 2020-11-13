package loginDemoSpring.login.controllers;

import loginDemoSpring.login.interfaces.UserInterface;
import loginDemoSpring.login.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserInterface userManipulator;

    @PostMapping("/login/user")
    public Map<String, String> Index (@RequestBody Map<String, String> params) throws RuntimeException {
        if(params.get("email").isBlank() || params.get("password").isBlank()) {
            HashMap<String, String> jsonObject = new HashMap<>();
            jsonObject.put("Error", "Complete all fields and try again ");
            return jsonObject;
        } else {
            try {
                ArrayList<UserModel> listUsers = (ArrayList<UserModel>) userManipulator.findAll();

                for(int i = 0; i <= listUsers.size(); i++) {
                    if(listUsers.get(i).getEmail().equalsIgnoreCase(params.get("email"))
                            && listUsers.get(i).getPassword().equalsIgnoreCase(params.get("password"))){
                        HashMap<String, String> jsonObject = new HashMap<>();
                        jsonObject.put("email", listUsers.get(i).getEmail());
                        jsonObject.put("name", listUsers.get(i).getName());
                        jsonObject.put("id", listUsers.get(i).getId().toString());

                        return jsonObject;
                    }
                }
                HashMap<String, String> jsonObject = new HashMap<>();
                jsonObject.put("Error", "Any user as founded with this email or password wrong");
                return jsonObject;
            } catch (Error err) {
                HashMap<String, String> jsonObject = new HashMap<>();
                jsonObject.put("Error", "Any user as founded with this email or password wrong");
                return jsonObject;
            }
        }
    }
}
