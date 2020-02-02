
public class Encrypter {
	// Receive number as argument
	// Parse number into 4 digits
	// Add 7 to each mod 10
	// Swap 1&3 and 2&4
	// Create and return final number
	public static String encrypt(String numToEncrypt) {
		int encryptSize = 4;
		int parse = Integer.parseInt(numToEncrypt);
		int temp;
		String result;
		
		int[] digits = new int[encryptSize];
		
		for(int i = encryptSize - 1; i >=0; i--) {
			digits[i] = ((parse % 10) + 7) % 10;
			parse /= 10;
		}
		
		temp = digits[0];
		digits[0] = digits[2];
		digits[2] = temp;
		
		temp = digits[1];
		digits[1] = digits[3];
		digits[3] = temp;
		
		result = Integer.toString(digits[0]) + Integer.toString(digits[1]) + Integer.toString(digits[2]) + Integer.toString(digits[3]);
		
		return result;
	}
}
