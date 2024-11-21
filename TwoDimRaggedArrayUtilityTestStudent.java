import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class TwoDimRaggedArrayUtilityTestStudent {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReadFile() throws FileNotFoundException {
		//create a test file and put it in the project's directory
		File file = new File("test.txt");
		double[][] expectation = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0},
				{6.0}
		};
		double[][] actual = TwoDimRaggedArrayUtility.readFile(file);
		assertArrayEquals(expectation,actual);
	}

	@Test
	public void testWriteToFile() throws FileNotFoundException{
		File file = new File("output.txt");
		double[][] data = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0},
				{6.0}
		};
		TwoDimRaggedArrayUtility.writeToFile(data, file);
		double[][] readFile = TwoDimRaggedArrayUtility.readFile(file);
		assertArrayEquals(data, readFile);
	}

	@Test
	public void testGetTotal() {
		double[][] data = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0},
				{6.0}
		};
		double expectation = 21.0;
		double actual = TwoDimRaggedArrayUtility.getTotal(data);
		assertEquals(expectation, actual, 0.01);
	}

	@Test
	public void testGetAverage() {
		double[][] data = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0},
				{6.0}
		};
		double expectation = 3.5;
		double actual = TwoDimRaggedArrayUtility.getAverage(data);
		assertEquals(expectation, actual, 0.01);
	}

	@Test
	public void testGetRowTotal() {
		double[][] data = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0},
				{6.0}
		};
		double expectation = 6.0;
		double actual = TwoDimRaggedArrayUtility.getRowTotal(data, 0);
		assertEquals(expectation, actual, 0.01);
	}

	@Test
	public void testGetColumnTotal() {
		double[][] data = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0},
				{6.0}
		};
		double expectation = 11.0;
		double actual = TwoDimRaggedArrayUtility.getColumnTotal(data, 0);
		assertEquals(expectation, actual, 0.01);
	}

	@Test
	public void testGetHighestInRow() {
		double[][] data = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0},
				{6.0}
		};
		double expectation = 3.0;
		double actual = TwoDimRaggedArrayUtility.getHighestInRow(data, 0);
		assertEquals(expectation, actual, 0.01);
	}

	@Test
	public void testGetHighestInRowIndex() {
		double[][] data = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0},
				{6.0}
		};
		int expectation = 2;
		int actual = TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 0);
		assertEquals(expectation, actual);
	}

	@Test
	public void testGetLowestInRow() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0}
        };

        double expected = 1.0;
        double actual = TwoDimRaggedArrayUtility.getLowestInRow(data, 0);
        assertEquals(expected, actual, 0.001);
    }

	@Test
	public void testGetLowestInRowIndex() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0}
        };

        int expected = 0;
        int actual = TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 0);
        assertEquals(expected, actual);
    }

	@Test
	public void testGetHighestInColumn() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0}
        };

        double expected = 6.0;
        double actual = TwoDimRaggedArrayUtility.getHighestInColumn(data, 0);
        assertEquals(expected, actual, 0.001);
    }

	@Test
	public void testGetHighestInColumnIndex() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0}
        };

        int expected = 2;
        int actual = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, 0);
        assertEquals(expected, actual);
    }

	@Test
	public void testGetLowestInColumn() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0}
        };

        double expected = 1.0;
        double actual = TwoDimRaggedArrayUtility.getLowestInColumn(data, 0);
        assertEquals(expected, actual, 0.001);
    }

	@Test
	public void testGetLowestInColumnIndex() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0}
        };

        int expected = 0;
        int actual = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, 0);
        assertEquals(expected, actual);
    }

	@Test
	public void testGetHighestInArray() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0}
        };

        double expected = 6.0;
        double actual = TwoDimRaggedArrayUtility.getHighestInArray(data);
        assertEquals(expected, actual, 0.001);
    }

	@Test
	public void testGetLowestInArray() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0}
        };

        double expected = 1.0;
        double actual = TwoDimRaggedArrayUtility.getLowestInArray(data);
        assertEquals(expected, actual, 0.001);
    }

}
