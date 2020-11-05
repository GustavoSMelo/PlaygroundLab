package demo.firstAppSpring.controllers;

import demo.firstAppSpring.models.GreetingsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping("/greetings")
    public GreetingsModel Greetings(@RequestParam(value = "content", defaultValue = "Hello world") String content) {
        return new GreetingsModel(01, content);
    }
}
