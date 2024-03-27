package pe.cjjc.projects.dao;

import org.springframework.stereotype.Repository;
import pe.cjjc.projects.model.UserDTO;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {


    private List<UserDTO> users;

    public UserDAO() {
        this.setUsers(new ArrayList<UserDTO>());
        getUsers().add(new UserDTO("jperez", "123456", "Javier Perez"));
        getUsers().add(new UserDTO("cjimenez", "123456", "Christian Jiménez"));
        getUsers().add(new UserDTO("ecastro", "123456", "Emily Castro"));
        getUsers().add(new UserDTO("hjimenez", "123456", "Hanna Jiménez"));
        getUsers().add(new UserDTO("cjimenez", "123456", "Chimi Jiménez"));
    }


    public void addUser(UserDTO user) {
        getUsers().add(user);
    }

    public void addUser(String userName, String password, String fullUserName) {
        getUsers().add(new UserDTO(userName, password, fullUserName));
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    public UserDTO validaUsuario(UserDTO user) {

        UserDTO userFound = null;

        for (UserDTO u : getUsers()) {
            if (user.getUserName().equalsIgnoreCase(u.getUserName()) &&
                    user.getPassword().equalsIgnoreCase(u.getPassword())) {
                userFound = u;
                break;
            }
        }

        return userFound;

    }

}
