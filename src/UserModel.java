import java.util.Map;
import java.util.Observable;

public class UserModel extends Observable{

    private String username;
    private String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isValidCredentials(String username, String password) {
        boolean status = username.equals(this.username) && password.equals(this.password);
        setChanged();
        notifyObservers(status);
        return status;
    }
}