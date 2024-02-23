package org.example;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 

    extends TestCase
{
    App app = new App();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return (Test) new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
    public void addmeTest(){assertEquals(app.addme(12,3), 15);}
}
