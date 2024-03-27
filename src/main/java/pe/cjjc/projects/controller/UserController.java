package pe.cjjc.projects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.cjjc.projects.model.UserDTO;
import pe.cjjc.projects.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/loginform")
    public String loginform() {
        return "login";
    }

    /* //ya no se requiere el redireccionamiento tonto.
    @RequestMapping("/loginaction")
    public ModelAndView loginaction(UserDTO userDTO) {
        ModelAndView view = null;
        UserDTO validUser = getUserService().validaUsuario(userDTO);
        if (validUser != null) {
            view = new ModelAndView("users", "usuario", validUser.getFullUserName());
        } else {
            view = new ModelAndView("users", "usuario", "Usuario Inválido");
        }
        return view;
    }
    */


    // Se cargga la lista si el usuario es correcto
    @RequestMapping("/loginaction")
    public ModelAndView loginaction(UserDTO userDTO) {
        ModelAndView view = null;
        UserDTO validUser = getUserService().validaUsuario(userDTO);
        if (validUser != null) {
            view = new ModelAndView("users", "userlist", getUserService().getUsers());
        } else {
            view = new ModelAndView("users", "msgError", "Usuario o clave no son correctos");
        }
        return view;
    }
}