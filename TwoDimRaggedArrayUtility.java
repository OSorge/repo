import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public final class TwoDimRaggedArrayUtility {
	private static final int MAX_ROWS = 10;
	private static final int MAX_COLUMNS = 10;
	private TwoDimRaggedArrayUtility() {
	}
	public static double[][] readFile(File file) throws FileNotFoundException{
		Scanner scanner = new Scanner(file);
		String[][] temp = new String[MAX_ROWS][MAX_COLUMNS];
		int rows = 0;
		while(scanner.hasNextLine() && rows < MAX_ROWS) {
			String[] l = scanner.nextLine().split(" ");
			System.arraycopy(l, 0, temp[rows], 0, l.length);
			rows++;
		}
		scanner.close();
		double[][] fileArray = new double[rows][];
		for(int i = 0; i < rows; i++) {
			int cols = 0;
			while(cols < MAX_COLUMNS && temp[i][cols] != null) {
				cols++;
			}
			fileArray[i] = new double[cols];
			for(int j = 0; j < cols; j++) {
				fileArray[i][j] = Double.parseDouble(temp[i][j]);
			}
		}
		if(fileArray.length == 0) {
			return null;
		}
		else {
			return fileArray;
		}
	}
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{
		PrintWriter writer = new PrintWriter(outputFile);
		for(double[] row : data) {
			for(double entry : row) {
				writer.print(entry + " ");
			}
			writer.println();
		}
		writer.close();
	}
	public static double getTotal(double[][] data) {
		double total = 0;
		for(double[] row : data) {
			for(double entry : row) {
				total += entry;
			}
		}
		return total;
	}
	public static double getAverage(double[][] data) {
		int counter = 0;
		double total = getTotal(data);
		for(double[] row : data) {
			counter += row.length;
		}
		return total / counter;
	}
	public static double getRowTotal(double[][] data, int row) {
		double rowTotal = 0;
		for(double entry : data[row]) {
			rowTotal += entry;
		}
		return rowTotal;
	}
	public static double getColumnTotal(double[][] data, int col) {
		double colTotal = 0;
		for(double[] row : data) {
			if(col < row.length) {
				colTotal += row[col];
			}
		}
		return colTotal;
	}
	public static double getHighestInRow(double[][] data, int row) {
		double highestInRow = Double.NEGATIVE_INFINITY;
		for(double entry : data[row]) {
			if(entry > highestInRow) {
				highestInRow = entry;
			}
		}
		return highestInRow;
	}
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highestInRow = Double.NEGATIVE_INFINITY;
		int index = -1;
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > highestInRow) {
				highestInRow = data[row][i];
				index = i;
			}
		}
		return index;
	}
	public static double getLowestInRow(double[][] data, int row) {
		double lowestInRow = Double.POSITIVE_INFINITY;
		for(double entry : data[row]) {
			if(entry < lowestInRow) {
				lowestInRow = entry;
			}
		}
		return lowestInRow;
	}
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowestInRow = Double.POSITIVE_INFINITY;
		int index = -1;
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] < lowestInRow) {
				lowestInRow = data[row][i];
				index = i;
			}
		}
		return index;
	}
	public static double getHighestInColumn(double[][] data, int col) {
		double highestInColumn = Double.NEGATIVE_INFINITY;
		for(double[] row : data) {
			if(col < row.length && row[col] > highestInColumn) {
				highestInColumn = row[col];
			}
		}
		return highestInColumn;
	}
	public static int getHighestInColumnIndex(double[][] data, int col) {
		double highestInColumn = Double.NEGATIVE_INFINITY;
		int index = -1;
		for(int i = 0; i < data.length; i++) {
			if(col < data[i].length && data[i][col] > highestInColumn) {
				highestInColumn = data[i][col];
				index = i;
			}
		}
		return index;
	}
	public static double getLowestInColumn(double[][] data, int col) {
		double lowestInColumn = Double.POSITIVE_INFINITY;
		for(double[] row : data) {
			if(col < row.length && row[col] < lowestInColumn) {
				lowestInColumn = row[col];
			}
		}
		return lowestInColumn;
	}
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowestInColumn = Double.POSITIVE_INFINITY;
		int index = -1;
		for(int i = 0; i < data.length; i++) {
			if(col < data[i].length && data[i][col] < lowestInColumn) {
				lowestInColumn = data[i][col];
				index = i;
			}
		}
		return index;
	}
	public static double getHighestInArray(double[][] data) {
		double highestInArray = Double.NEGATIVE_INFINITY;
		for(double[] row : data) {
			for(double entry : row) {
				if(entry > highestInArray) {
					highestInArray = entry;
				}
			}
		}
		return highestInArray;
	}
	public static double getLowestInArray(double[][] data) {
		double lowestInArray = Double.POSITIVE_INFINITY;
		for(double[] row : data) {
			for(double entry : row) {
				if(entry < lowestInArray) {
					lowestInArray = entry;
				}
			}
		}
		return lowestInArray;
	}
}