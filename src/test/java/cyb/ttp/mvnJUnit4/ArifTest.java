package cyb.ttp.mvnJUnit4;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class ArifTest {
    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        return Arrays.asList(new Object[][] {{3,3,3,9},{1,1,1,3},{2,1,1,4}});
    }
	private int a;
	private int b;
	private int c;
	private int expected;	
	public ArifTest(int a, int b, int c, int expected) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}
	private static Arif arifBLessA;
	private static Arif arifALessB;
	private static Arif arifLessOne;
	private static Arif arifDefolt;
	@BeforeClass
    public static void GlobalSetUp(){
        System.out.println("Lets start testing.");
    }
    @Before
    public  void setUp(){
    	arifBLessA = new Arif(4,1,1,2);
    	arifALessB = new Arif(1,4,1,2);
    	arifLessOne = new Arif(0,4,1,2);
    	arifDefolt = new Arif();
    }
    @Test
    public void testSetUp(){
        assertNotNull(arifDefolt);
    }
    @Test
    public void testPerimeter(){
        assertEquals((arifDefolt.a + arifDefolt.b),arifDefolt.SubAB(),2);
    }
    @Test
    public void testIsAMoreB(){
       assertTrue(arifBLessA.AMoreB());
    }
    @Test
    public void testIsBMoreA(){
        assertFalse(arifBLessA.ALessB());
    }
    @Test
    public void testIsALessB(){
        assertTrue(arifALessB.ALessB());
    }
    @Test
    public void testFindSqrt(){
        assertThat(arifBLessA.Sqrt(),is(2));
    }
    @Test
    public void testFindSqrtLessOne(){
        assertThat(arifLessOne.Sqrt(),is(-1));
    }
    @Test
    public void testPow(){
        assertThat(arifBLessA.Pow(), equalTo(16));
    }
    @Test
    public void testSumWithParam(){
        assertThat(arifDefolt.SumWithParam(a, b, c),is(expected));
    }
}
