package Task1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        LoginViewImpl view = new LoginViewImpl();

        LoginPresenter presenter = new LoginPresenter(view);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        presenter.login(username, password);

        scanner.close();
    }
}
