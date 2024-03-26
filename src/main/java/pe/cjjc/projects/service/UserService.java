package pe.cjjc.projects.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cjjc.projects.dao.UserDAO;
import pe.cjjc.projects.model.UserDTO;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public UserDTO validaUsuario(UserDTO user){
        return getUserDAO().validaUsuario(user);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

}
