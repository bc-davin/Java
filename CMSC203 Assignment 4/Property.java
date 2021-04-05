/*
 * 
 * @author Davicheanin Meas
 * 
 * 
 */
public class Property 
{

	private String city,owner,propertyName;
	private double rentAmount;
	private Plot plot;
	
	// No-arg Constructor, creates a new object with default values of empty strings, 0 for rent amount, and default Plot (sets the x, y values to zero, depth and width to 1)
	public Property() 
	{
		city = null;
		owner = null;
		propertyName = null;
		rentAmount = 0;
		plot = new Plot();
	}
	
	//Copy Constructor, creates a new object using the information of the object passed to it.
	public Property(Property p) 
	{
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
		this.plot = new Plot(p.plot);
	}
	
	// Parameterized Constructor, no Plot information provided
	public Property(String propertyName, String city, double rentAmount, String owner) 
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	// Constructor, Parameterized constructor
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width,
			int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	//return city
	public String getCity()
	{
		
		return city;
	}
	//Return the owner name
	
	public String getOwner()
	{
		
		return owner;
	}
	//Return the property Name
	public String getPropertyName()
	{
		
		return propertyName;
	}
	
	//  Return the rent amount
	
	public Double getRentAmount()
	{
		return rentAmount;
		
	}
	
	// Set the Plot values and return the Plot instance
	
	public Plot setPlot(int x, int y, int width, int depth) {
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		return plot;
	}
    // Set the city
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
    //Set the owner name
	public void setOwner(String owner) {
		this.owner = owner;
	}
    //Set the property name
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
    //  Set the rent amount
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
    /*
	 Prints out the name, city, owner and rent amount for a property.
          Example:
              Property Name: Lakewood
               Located in Rockville
               Belonging to: Alex Tan
               Rent Amount: 3000.0
          Be sure the last item is the rent amount, preceded by a space.
	*/
	public String toString() {
		return "Property Name: " + propertyName + "\n Located in " + city + "\nBelonging to: " + owner
				+ "\nRent Amount: " + String.format("%.1f", rentAmount);
	}

	public Plot getPlot() {
		return plot;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
