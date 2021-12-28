package com.POC1.Week4.RestPOC1;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CustomersTest extends ApplicationTests {
			@Autowired
			private WebApplicationContext wac;
			
			private MockMvc mmc;
			
			@Before
			public void setup() {
				mmc = MockMvcBuilders.webAppContextSetup(wac).build();
			}



			@Test
			public void testgetcallCustomers() throws Exception {
				mmc.perform(get("/get-All-Customer")).andExpect(status().isOk())
			.andExpect(content().contentType("application/json;charset=UTF-8"))
			.andExpect(jsonPath("$.customerName").value("Rajesh"))
			.andExpect(jsonPath("$.customerId").value("1"))
			.andExpect(jsonPath("$.phoneCustomer").value("916840110"));



			}


			
}
