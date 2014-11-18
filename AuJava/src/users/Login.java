package users;
/**
 * from http://www.zentut.com/java-swing/simple-login-dialog/
 * @param parent
 */
public class Login {
	public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("bob") && password.equals("secret")) {
            return true;
        }
        return false;
    }
}
