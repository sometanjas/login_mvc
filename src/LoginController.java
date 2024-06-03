import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {
    //The controller needs to know the model
    public UserModel model;
    public LoginView loginView;


    public LoginController(UserModel model, LoginView view) {
        this.model = model;
        this.loginView = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // check if the credentials are valid. The method will notify the observers
        model.isValidCredentials(loginView.getUsernameField().getText(),
                loginView.getPasswordField().getText());
    }
}