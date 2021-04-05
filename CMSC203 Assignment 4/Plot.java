/*
 * 
 * @author Davicheanin Meas
 * 
 * 
 */

public class Plot {

	private int x, y, width, depth;

	// No-arg Constructor, creates a default Plot with args x=0, y=0, width=1,
	// depth=1
	public Plot() {
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}

	// Copy Constructor, creates a new object using the information of the object
	// passed to it.
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}

	// Parameterized Constructor
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	// Determines if the plot overlaps, returns true if two plots overlap, false
	// otherwise 
	public boolean overlaps(Plot plot) {
		boolean oneOverlapA = (plot.x >= x && plot.x < (x + width)) && (plot.y >= y && plot.y < (y + depth));
		boolean oneOverlapB = (plot.x <= x && x < (plot.x + plot.width)) && (plot.y <= y && y < (plot.y + plot.depth));

		boolean twoOverlapsA = ((plot.x + plot.width) > x && (plot.x + plot.width) < (x + width))
				&& (plot.y >= y && plot.y < (y + depth));
		boolean twoOverlapsB = ((x + width) > plot.x && (plot.x + plot.width) > (x + width))
				&& (plot.y <= y && y < (plot.y + plot.depth));

		boolean threeOverlapsA = (plot.x >= x && plot.x < (x + width))
				&& ((plot.y + plot.depth) > y && (plot.y + plot.depth) <= (y + depth));
		boolean threeOverlapsB = (plot.x <= x && x < (plot.x + plot.width))
				&& ((y + depth) > plot.y && (plot.y + plot.depth) >= (y + depth));

		boolean fourOverlapsA = ((plot.x + plot.width) > x && (plot.x + plot.width) <= (x + width))
				&& ((plot.y + plot.depth) > y && (plot.y + plot.depth) <= (y + depth));
		boolean fourOverlapsB = ((x + width) > plot.x && (plot.x + plot.width) >= (x + width))
				&& ((y + depth) > plot.y && (plot.y + plot.depth) >= (y + depth));

		return oneOverlapA || oneOverlapB || twoOverlapsA || twoOverlapsB || threeOverlapsA || threeOverlapsB
				|| fourOverlapsA || fourOverlapsB;
	}

	// Takes the Plot instance and determines if the current plot contains it 
	public boolean encompasses(Plot plot) {
		boolean X = plot.x >= x;
		boolean Y = plot.y >= y;
		boolean Width = (plot.x + plot.width) <= (x + width);
		boolean Depth = (plot.y + plot.depth) <= (y + depth);

		return X && Y && Width && Depth;
	}

	//Returns the x value 
	public int getX() {
		return x;
	}

	// Sets the x value 
	public void setX(int x) {
		this.x = x;
	}

	// Returns the y value 
	public int getY() {
		return y;
	}

	// Sets the y value
	public void setY(int y) {
		this.y = y;
	}

	// Returns the width value 
	public int getWidth() {
		return width;
	}

	// Sets the width value 
	public void setWidth(int width) {
		this.width = width;
	}

	// Returns the depth value 
	public int getDepth() {
		return depth;
	}

	// Sets the depth value 
	public void setDepth(int depth) {
		this.depth = depth;
	}

	// Prints the X,Y of the upper left corner, the width and the depth.
	public String toString() 
	{
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}
}
