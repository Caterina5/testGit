package test.test;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	static DateTime dt;
	
    @BeforeClass
    public static void inizioClasse(){
    	dt= new DateTime();
    	System.out.println("Before");
    }
    
    @AfterClass
    public static void fineClasse() {
    	System.out.println("After");
    }
    
    @Before
    public void inizio() {
    	System.out.println("inizio");
    }
    
    @After
    public void fine() {
    	System.out.println("fine");
    }
    
	
	@Test
	public void mainWork() {
		assertEquals("03-11-2020", dt.toString("dd-MM-yyyy"));
	}

}
