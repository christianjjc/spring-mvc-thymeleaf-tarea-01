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
        getUsers().add(new UserDTO("jperez", "123456", "Javier Perez","https://reqres.in/img/faces/1-image.jpg"));
        getUsers().add(new UserDTO("cjimenez", "123456", "Christian Jiménez","https://reqres.in/img/faces/2-image.jpg"));
        getUsers().add(new UserDTO("ecastro", "123456", "Emily Castro",	"https://reqres.in/img/faces/3-image.jpg"));
        getUsers().add(new UserDTO("hjimenez", "123456", "Hanna Jiménez","https://reqres.in/img/faces/4-image.jpg"));
        getUsers().add(new UserDTO("cjimenez", "123456", "Chimi Jiménez","https://reqres.in/img/faces/5-image.jpg"));
    }


    public void addUser(UserDTO user) {
        getUsers().add(user);
    }

    public void addUser(String userName, String password, String fullUserName, String avatar) {
        getUsers().add(new UserDTO(userName, password, fullUserName,avatar));
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
