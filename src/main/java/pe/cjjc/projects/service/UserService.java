package pe.cjjc.projects.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cjjc.projects.dao.UserDAO;
import pe.cjjc.projects.model.UserDTO;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public UserDTO validaUsuario(UserDTO user) {
        return getUserDAO().validaUsuario(user);
    }

    public List<UserDTO> getUsers() {
        return getUserDAO().getUsers();
    }

    public void addUser(UserDTO user) {
        getUserDAO().addUser(user);
    }

    public void addUser(String userName, String password, String fullUserName) {
        getUserDAO().addUser(userName, password, fullUserName);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

}
