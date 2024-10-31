package Task1;

public class LoginPresenter {
    private LoginView view;
    private User user;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void login(String username, String password) {
        user = new User(username, password);
        if (validateUser(user)) {
            view.showLoginSuccess();
        } else {
            view.showLoginFailure();
        }
    }

    private boolean validateUser(User user) {
        return "admin".equals(user.getUsername()) && "password".equals(user.getPassword());
    }
}
