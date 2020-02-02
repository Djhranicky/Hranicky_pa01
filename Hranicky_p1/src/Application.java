import java.util.Scanner;

public class Application {
	// Prompt for 4 digit number
	// Encrypt number
	// Print encrypted number
	// Decrypt number
	// Print decrypted number
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String number;
		String encryptedNum;
		String decryptedNum;
		
		System.out.println("Please enter a 4 digit number");
		number = in.nextLine();
		encryptedNum = Encrypter.encrypt(number);
		System.out.println("The encrypted number is " + encryptedNum);
		decryptedNum = Decrypter.decrypt(encryptedNum);
		System.out.println("The decrypted number is " + decryptedNum);
		in.close();
		return;
	}
}
