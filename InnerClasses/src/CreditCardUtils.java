
public class CreditCardUtils {
	
	public static String mask(String ccNumber) {
		if (ccNumber == null) {
			throw new IllegalArgumentException("must provide a cc number");
		}
		return "xxxxxxxxxxxx" + ccNumber.substring(ccNumber.length()-4);
	}

}
