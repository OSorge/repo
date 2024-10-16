/*Class: CMSC203 CRN 22824
 Program: Assignment #3
 Instructor: Ahmed Tarek
 Summary of Description: Allows for encryption and decryption of messages using two different ciphers, includes gui
 Due Date: 10/15/2024
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source - Owen Sorge
 */

public class CryptoManager {

	public static boolean isStringInBounds (String plainText) {
		for(int i = 0; i < plainText.length(); i++) {
			if(plainText.charAt(i) < ' ' || plainText.charAt(i) > '_') {
				return false;
			}
		}
		return true;
	}
	public static String caesarEncryption (String plainText, int key) {
		if(!isStringInBounds(plainText)) {
			return "The selected string is not in bounds. Try again";
		}
		String encryption = "";
		for(int i = 0; i < plainText.length(); i++) {
			int charAtIndex = plainText.charAt(i);
			int encryptedChar = charAtIndex + key;
			while(encryptedChar > '_') {
				encryptedChar -= 64;
			}
			encryption += (char) encryptedChar;
		}
		return encryption;
	}
	public static String caesarDecryption (String encryptedText, int key) {
		String decryption = "";
		for(int i = 0; i < encryptedText.length(); i++) {
			int charAtIndex = encryptedText.charAt(i);
			int decryptedChar = charAtIndex - key;
			while(decryptedChar < ' ') {
				decryptedChar += 64;
			}
			decryption += (char) decryptedChar;
		}
		return decryption;
	}
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		String encryption = "";
		for(int i = 0; i < plainText.length(); i++) {
			int charAtIndex = plainText.charAt(i);
			int charAtIndexKey = bellasoStr.charAt(i % bellasoStr.length());
			int encryptedChar = charAtIndex + charAtIndexKey;
			while(encryptedChar > '_') {
				encryptedChar -= 64;
			}
			encryption += (char) encryptedChar;
		}
		return encryption;
	}
	public static String bellasoDecryption (String encryptedText, String bellasoStr) {
		String decryption = "";
		for(int i = 0; i < encryptedText.length(); i++) {
			int charAtIndex = encryptedText.charAt(i);
			int charAtIndexKey = bellasoStr.charAt(i % bellasoStr.length());
			int decryptedChar = charAtIndex - charAtIndexKey;
			while(decryptedChar < ' ') {
				decryptedChar += 64;
			}
			decryption += (char) decryptedChar;
		}
		return decryption;
	}
}