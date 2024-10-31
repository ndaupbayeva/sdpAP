package Task1;

public class LoginViewImpl implements LoginView {

    @Override
    public void showLoginSuccess() {
        System.out.println("Login successful!");
    }

    @Override
    public void showLoginFailure() {
        System.out.println("Login failed. Check your credentials.");
    }
}
