//package com.program.Assertion;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertAll;
//
//import java.security.Permission;
//
//import org.junit.Test;
//
//import com.program.testcalculateradd.Calculator;
//
//public class AssertionTest {
//	private final Calculator calculator = new Calculator();
//    private final Permission person = new Permission("Jane", "Doe");
//    @Test
//    void standardAssertions() {
//        assertEquals(2, calculator.add(1, 1));
//        assertEquals(4, calculator.multiply(2, 2), "The optional failure message is now the last parameter");
//        assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "  + "to avoid constructing complex messages unnecessarily.");
//    }
////    @Test
////    void groupedAssertions() {
////        // In a grouped assertion all assertions are executed, and all
////        // failures will be reported together.
////        assertAll("person",
////            () -> assertEquals("Jane", person.getFirstName()),
////            () -> assertEquals("Doe", person.getLastName())
////        );
////    }
//}
