import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class LoginView extends JFrame implements Observer {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;

    public LoginView() {
        // Initialize UI components
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Login");
        statusLabel = new JLabel();

        JFrame frame = new JFrame("Login");

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(statusLabel);


        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        boolean status = (Boolean) arg;
        if (status) {
            statusLabel.setText("Login successful");
            return;
        }
        statusLabel.setText("Login failed");
    }

    public void addLoginButtonController(LoginController controller) {
        loginButton.addActionListener(controller);

    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
}
