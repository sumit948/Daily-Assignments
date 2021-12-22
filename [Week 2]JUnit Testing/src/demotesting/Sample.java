package demotesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }
 
    @AfterClass
    public static void afterClass() {
        System.out.println("in after class");
    }
 
    @Before
    public void before() {
        System.out.println("in before");
    }
 
    
    @After
    public void after() {
        System.out.println("in after");
    }
 
    @Test
    public void testing1() {
        System.out.println("in test 1");
    }
    
    @Test
    public void testing2() {
        System.out.println("in test 2");
    }
 
    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }
}
