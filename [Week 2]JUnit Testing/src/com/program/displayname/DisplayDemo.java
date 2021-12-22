package com.program.displayname;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("DisplayDemo")
public class DisplayDemo {
		@DisplayName("testWithSpaces")
		public void testWithSpaces() {
			
		}
//		@DisplayName("")
//		public void displayWithSymbols() {
//			
//		}
		@Test
		@DisplayName("सुमित मोहिते")
		public void displayNameInMarathi() {
			
			String[] name = {"सुमित","मोहिते"};
			String[] name2 = name;
			assertEquals(name,name2);
		}
}
