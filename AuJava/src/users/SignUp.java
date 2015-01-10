package users;
/**
 * 
 * @author Pietro Passarelli
 *
 */
public class SignUp {
	public static boolean authenticate(String username, String password) {
        // hardcoded username and password
		if (username.equals("bob") && password.equals("secret")) {
            return true;
       }
        return true;
    }

}
