
public class Decrypter {
	// Do the same stuff as encrypt, but add 3 (-7mod10) instead of adding 7
	public static String decrypt(String numToDecrypt) {
		int decryptSize = 4;
		int parse = Integer.parseInt(numToDecrypt);
		int temp;
		
		int[] digits = new int[decryptSize];
		
		for(int i = decryptSize - 1; i >=0; i--) {
			digits[i] = ((parse % 10) + 3) % 10;
			parse /= 10;
		}
		
		temp = digits[0];
		digits[0] = digits[2];
		digits[2] = temp;
		
		temp = digits[1];
		digits[1] = digits[3];
		digits[3] = temp;
		
		return Integer.toString(digits[0]) + Integer.toString(digits[1]) + Integer.toString(digits[2]) + Integer.toString(digits[3]);
	}
}
