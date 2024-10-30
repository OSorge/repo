/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Deals with the dimensions of an area of land, irrespective of property-specific issues
 * Due: 10/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Owen Sorge
*/

public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot(Plot otherPlot) {
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	public boolean encompasses(Plot plot) {
		if(this.x <= plot.x && this.y <= plot.y && (this.x + this.width) >= (plot.x + plot.width) && (this.y + this.depth) >= (plot.y + plot.depth)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean overlaps(Plot plot) {
		if(this.x + this.width <= plot.x || plot.x + plot.width <= this.x || this.y + this.depth <= plot.y || plot.y + plot.depth <= this.y) {
			return false;
		}
		else {
			return true;
		}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	@Override
	public String toString() {
		return x + "," + y + "," + width + "," + depth;
	}
}
