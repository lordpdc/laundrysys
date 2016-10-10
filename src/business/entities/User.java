package business.entities;

/**
 * Created by cesar on 20/09/16.
 */
public class User {
    private int id;
    private String username;
    private String password;
    private int permission_lvl;

    public User(){}

    public User(String username, String password, int permissionLvl){
        this.username = username;
        this.password = password;
        this.permission_lvl = permissionLvl;
    }

    public User(int id, String username, String password, int permissionLvl){
        this.id = id;
        this.username = username;
        this.password = password;
        this.permission_lvl = permissionLvl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPermission_lvl() {
        return permission_lvl;
    }

    public void setPermission_lvl(int permission_lvl) {
        this.permission_lvl = permission_lvl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPermissionLvl(Integer value) {

    }
}
