package pe.cjjc.projects.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("users")
    public ModelAndView users(){
        String userlist [] = {"pepito","juancito", "luchito"};
        ModelAndView model = new ModelAndView("users", "userlist", userlist);
        return model;
    }
}
