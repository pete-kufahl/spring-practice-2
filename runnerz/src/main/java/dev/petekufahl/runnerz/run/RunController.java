package dev.petekufahl.runnerz.run;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class RunController {

    @GetMapping("/hello")
    public String home(@RequestParam String param) {
        return "Hello, Runnerz!";
    }
}
