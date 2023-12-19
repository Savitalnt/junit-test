 package com.javainuse.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class test{

	@Test
	public void test(){
		addition t=new addition();
		int actual = t.sum(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}
}

// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
// import static org.junit.Assert.assertTrue;

// import org.junit.Before;
// import org.junit.Test;


// public class test extends SpringBootHelloWorldTests {

// 	// @Autowired
// 	// private WebApplicationContext webApplicationContext;

// 	// private MockMvc mockMvc;

// 	// @Before
// 	// public void setup() {
// 	// 	mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
// 	// }

// 	// @Test
// 	// public void testEmployee() throws Exception {
// 	// 	mockMvc.perform(get("/employee")).andExpect(status().isOk())
// 	// 			.andExpect(content().contentType("application/json;charset=UTF-8"))
// 	// 			.andExpect(jsonPath("$.name").value("emp1")).andExpect(jsonPath("$.designation").value("manager"))
// 	// 			.andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));

// 	// }

//   @Test
// public void givenNumber_whenEven_thenTrue() {
// 	int number=12;
//     assertTrue(number % 2 == 0);
// }
// }
