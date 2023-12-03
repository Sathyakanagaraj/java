package evaluvation_1;

import java.util.Scanner;
public class Valid_pasword {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a password: ");
	        String password = scanner.nextLine();
	        scanner.close();

	        if (isValidPassword(password)) {
	            System.out.println("Password is valid.");
	        } else {
	            System.out.println("Password is invalid.");
	        }
	    }

	    public static boolean isValidPassword(String password) {
	        // Password length should be at least 8 characters
	        if (password.length() < 8) {
	            return false;
	        }

	        // Password should contain at least one uppercase letter
	        if (!password.matches(".*[A-Z].*")) {
	            return false;
	        }

	        // Password should contain at least one lowercase letter
	        if (!password.matches(".*[a-z].*")) {
	            return false;
	        }

	        // Password should contain at least one digit
	        if (!password.matches(".*\\d.*")) {
	            return false;
	        }

	      
	        // If all conditions are met, the password is valid
	        return true;
	    }
	}
