public class Main {

    public static void main(String[] args) {
        LoginView myView = new LoginView();

        UserModel myModel = new UserModel("admin", "12341");
        myModel.addObserver(myView);

        LoginController controller = new LoginController(myModel, myView);
        myView.addLoginButtonController(controller);
    }
}
