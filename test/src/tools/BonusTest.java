package tools;

import static org.junit.Assert.*;
import org.junit.Test;

public class BonusTest {
	@Test
	public void testProcessBonus() {
		assertEquals(400, Bonus.getBonus(100, "A"));
		assertEquals(300, Bonus.getBonus(100, "B"));
		assertEquals(200, Bonus.getBonus(100, "C"));
	}
}
