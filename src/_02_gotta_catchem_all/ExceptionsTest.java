package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();

	// 1. This is an example of how one might test that an exception is thrown.
	// It tests that an IndexOutOfBoundsException is thrown
	@Test
	public void testIndexOOBException() {
		int[] vars = { 0, 1, 2, 3 };

		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] { 4, 1, 2, 3 });
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] { 4, 1, 2, 3 });
		}
	}

	// 2. In the ExceptionMethods class, write a method called divide that takes
	// two doubles as parameters and returns their quotient as a double. This method
	// should throw an IllegalArgumentException if the denominator is 0.0.

	// 3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
		try {
			assertEquals(4, em.divide(8, 2));
			assertEquals(0, em.divide(5, 0));
			// assertEquals(2, em.divide(5, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	// 4. In the ExceptionMethods class, write a method called reverseString that
	// takes a
	// String and returns the reverse of that String. It should throw an
	// IllegalStateException
	// if the String passed in is empty

	// 5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		try {
			assertTrue("abc".equals(em.reverseString("cba")));
			assertTrue("".equals(em.reverseString("")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
