package pe.cjjc.projects.model;

public class UserDTO {

    private String userName;
    private String password;
    private String fullUserName;
    private String avatar;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    public UserDTO() {
    }

    public UserDTO(String userName, String password, String fullUserName, String avatar) {
        this.userName = userName;
        this.password = password;
        this.fullUserName = fullUserName;
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullUserName() {
        return fullUserName;
    }

    public void setFullUserName(String fullUserName) {
        this.fullUserName = fullUserName;
    }
}
