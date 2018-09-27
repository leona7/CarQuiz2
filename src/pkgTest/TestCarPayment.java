package pkgTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pkgMain.Payment;


public class TestCarPayment {

	@Test
	public void testTIOL() {
		Payment a = new Payment(35000, 0, 60, 10, 0);
		assertEquals("743.65", a.TIOL());
		// checks that the two objects are equals or not
		// error wasn't displayed so they're equal :)
	}
	@Test

	public void testTIOL2() {
		Payment a = new Payment(37000, 0, 15, 30, 0);
		assertEquals("2988.36",a.TIOL());
		// error wasn't displayed so they're equal :)
		}
}
