//Test cases for CryptoManager class
	import org.junit.Test;
	import static org.junit.Assert.*;

	public class CryptoManagerTestStudent {

		@Test
		public void testStringInBounds() {
			assertTrue(CryptoManager.isStringInBounds("2fH5"));
			assertTrue(CryptoManager.isStringInBounds("HGUAD"));
			assertFalse(CryptoManager.isStringInBounds("igloo"));
			assertFalse(CryptoManager.isStringInBounds("#IGLOO"));
			assertFalse(CryptoManager.isStringInBounds("THIS WILL *DEFINITELY* PASS }"));
		}

		@Test
		public void testEncryptCaesar() {
			assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("jacob", 6));
			assertEquals("HYU", CryptoManager.caesarEncryption("BCD", 4));
			assertEquals("!\"#", CryptoManager.caesarEncryption("GHW", 788));
			assertEquals("56.231", CryptoManager.caesarEncryption("GOODBYE", 827));
			assertEquals("DJAOGNI", CryptoManager.caesarEncryption("OJJABZJ", 7));
			assertEquals("WJDNFAIQOENDANN", CryptoManager.caesarEncryption("THIS PROBABLY WON'T PASS", 3));
		}

		@Test
		public void testDecryptCaesar() {
			assertEquals("HDHAFJA", CryptoManager.caesarDecryption("DNAIWAD", 1));
			assertEquals("GOOD DAY SUNSHINE", CryptoManager.caesarDecryption(";,:;06.G(56;/,9H:;905.", 999));
			assertEquals("HELLO UNIVERSE", CryptoManager.caesarDecryption("4188;LC;>80", 300));
			assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("WKLV#LV#DQRWKHU#WHVW", 3));
		}

		@Test
		public void testEncryptBellaso() {
			assertEquals("WN#KHADN &", CryptoManager.bellasoEncryption("TESTING", "REALLY_DANG_LONG_CIPHER_I_DONT_KNOW_IF_THIS_WILL_WORK"));
			assertEquals("UJ^^((HT^X[UHD\"", CryptoManager.bellasoEncryption("HAPPY HALLOWEEN", "HELLO"));
			assertEquals("WU\\VR9F#N!RF88U-'HED", CryptoManager.bellasoEncryption("TESTNUMBER43525", "CMSC203"));

		}

		@Test
		public void testDecryptBellaso() {
			assertEquals("TESTING", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
			assertEquals("HAPPY HALLOWEEN", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
			assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));

		}
	}