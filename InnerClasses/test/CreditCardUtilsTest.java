import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author danni
 *
 */

class CreditCardUtilsTest {

	@Test
	void test() {
		//setup
		String ccNumber = "1122334455667788";
		
		//execute
		String result = CreditCardUtils.mask(ccNumber);
		
		//assert
		String expected = "xxxxxxxxxxxx7788";
		assertEquals(expected, result);

	}
//
//	
//	@Test (expected = IllegalArgumentException.class)
//	public void test_nulls() {
//		//setup 
//		String ccNumber = null;
//		
//		//execute
//		String result= CreditCardUtils.mask(ccNumber);
//		
//		
//	}
//	
//	
	 @Test
	  void testExpectedExceptionFail() {
	 
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    	//setup 
			String ccNumber = null;
			
			//execute
			String result= CreditCardUtils.mask(ccNumber);
	    });
	  }
	 
	 
}
