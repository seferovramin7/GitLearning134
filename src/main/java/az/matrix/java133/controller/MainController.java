package az.matrix.java133.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/udemy")
    public void getMyText() {
        System.out.println(" udemy ++ -- udemy !, I'm udemy udemy");
    }


    @GetMapping("/matrix")
    public String getMyTexttt() {
        return " Hello Matrix !, I'm matrix matrix";
    }

}
//github.com/python-projects/spring-boot/wiki/Spring-Boot-2.0-Migration-Guide