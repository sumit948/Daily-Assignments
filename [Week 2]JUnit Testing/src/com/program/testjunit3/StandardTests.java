package com.program.testjunit3;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

public class StandardTests {
	@BeforeAll
    static void initAll() {
		System.out.println("This is initAll and it's working");
    }
    @BeforeEach
    void init() {
    	System.out.println("This is init and it's working");
    }
    @Test
    public void succeedingTest() {
    }
    @Test
    public void failingTest() {
        fail("a failing test");
    }
    @Test
    @Disabled("for demonstration purposes")
    public void skippedTest() {
        // not executed
    	System.out.println("This is skipped Test and it's still working");
    }
    @Test
    public void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
        System.out.println("This is aborted Test and it's working");
    }
    @AfterEach
    void tearDown() {
    	System.out.println("This is tearDown and it's working");
    }
    @AfterAll
    static void tearDownAll() {
    	System.out.println("This is tearDownAll and it's working");
    }
}
