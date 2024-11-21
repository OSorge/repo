public class HolidayBonus{
	private static final double HIGH_BONUS = 5000.0;
	private static final double LOW_BONUS = 1000.0;
	private static final double OTHER_BONUS = 2000.0;
	public HolidayBonus() {
		
	}
	public static double[] calculateHolidayBonus(double[][] data) {
		double[] bonuses = new double[data.length];
		int maxCols = 0;
		for(double[] row : data) {
			if(row.length > maxCols) {
				maxCols = row.length;
			}
		}
		for(int col = 0; col < maxCols; col++) {
			int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col);
			int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);
			for(int row = 0; row < data.length; row++) {
				if(col < data[row].length && data[row][col] > 0) {
					if(row == highestIndex) {
						bonuses[row] += HIGH_BONUS;
					}
					else if(row == lowestIndex) {
						bonuses[row] += LOW_BONUS;
					}
					else {
						bonuses[row] += OTHER_BONUS;
					}
				}
			}
		}
		return bonuses;
	}
	public static double calculateTotalHolidayBonus(double[][] data) {
		double[] bonuses = calculateHolidayBonus(data);
		double totalBonus = 0.0;
		for(double bonus : bonuses) {
			totalBonus += bonus;
		}
		return totalBonus;
	}
}