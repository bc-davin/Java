import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	// attributes
	private GradeBook g1;
	private GradeBook g2;

	@BeforeEach
	void setUp() throws Exception 
	{
	    g1= new GradeBook(5);
	    g2= new GradeBook(5);
	  
	    //grade 1
	    g1.addScore(50);
	    g1.addScore(75);
	
	    //grade 2
	    g2.addScore(65);
	    g2.addScore(90);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
	          g1=null;
	          g2=null;
	
	}


	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() 
	{
		assertTrue(g1.toString().equals("50.0 75.0"));
		assertTrue(g2.toString().equals("65.0 90.0"));
	}

	@Test
	void testSum() {
		assertEquals(125, g1.sum(), .0001);
		assertEquals(155, g2.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(50, g1.minimum(), .001);
		assertEquals(65, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75, g1.finalScore(), .001);
		assertEquals(90, g2.finalScore(), .001);
	}

}
