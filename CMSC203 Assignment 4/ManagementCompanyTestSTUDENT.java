import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	
	ManagementCompany m;
	Property p1 ,p2,p3,p4,p5,p6;
	@Before
	public void setUp() throws Exception 
	{
		//student create a management company
	
		//student add three properties, with plots, to mgmt co
		p1= new Property("New Fishman","Boston",4844.00,"My son",1,2,2,2);
		p2= new Property("Old Fishman","Washignton DC",4114,"My daughter",4,6,2,3);
		p3= new Property("OG Fishman","Portland",6000,"My step-son",5,1,1,2);
	
		m= new ManagementCompany("Davin Fishman IT", "5555",6);
		
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() 
	{
		//student set mgmt co to null  
		m=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
	p4= new Property("AmericaFishman","Huston",321,"My Uncle",0,0,1,1);
	p5= new Property("CanadaFishman","Vancouver",5327,"My Aunt",8,5,2,2);
	p6= new Property("RoyalFishman","London",1000,"My Wife",6,5,2,2);
	
	
	assertEquals(m.addProperty(p4),3);
	assertEquals(m.addProperty(p5),4,0);
	assertEquals(m.addProperty(p6),-1,0); 
	
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentProp(),6000.0,0);
	}

	@Test
	public void testTotalRent() 
	{
		//student should test if totalRent returns the total rent of properties
		assertEquals(m.totalRent(),14958.0,0);  
	}

 }