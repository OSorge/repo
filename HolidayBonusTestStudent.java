import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestStudent {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonus() {
		double[][] data = {
				{1000, 2000, 3000},
	            {1500, 100, 2500},
	            {0, 3000, 1000},
	            {-500, 100, 2000}
		};
		double[] expectation = {9000, 8000, 6000, 4000};
		double[] actual = HolidayBonus.calculateHolidayBonus(data);
		assertArrayEquals(expectation, actual, 0.01);
	}

	@Test
	public void testCalculateTotalHolidayBonus() {
		double [][] data = {
				{1000, 2000, 3000},
				{1500, 100, 2500},
				{0, 3000, 1000},
				{-500, 100, 2000}
		};
		double expectation = 27000;
		double actual = HolidayBonus.calculateTotalHolidayBonus(data);
		assertEquals(expectation, actual, 0.01);
	}

}
