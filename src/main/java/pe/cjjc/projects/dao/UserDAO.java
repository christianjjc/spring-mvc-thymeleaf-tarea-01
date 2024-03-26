package pe.cjjc.projects.dao;

import org.springframework.stereotype.Repository;
import pe.cjjc.projects.model.UserDTO;

@Repository
public class UserDAO {

    public UserDTO validaUsuario(UserDTO user) {

        if (user.getUserName().equalsIgnoreCase("user")
                && user.getPassword().equals("123456")
        ) {
            user.setFullUserName("Christian Jiménez");
        } else {
            user = null;
        }
        return user;
    }

}
