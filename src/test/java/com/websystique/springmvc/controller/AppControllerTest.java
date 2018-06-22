package com.websystique.springmvc.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class AppControllerTest {

	/*@Test
	public void testHomePage() throws Exception {
		AppController controller = new AppController();
		String view = controller.homePage(new ModelMap());
		assertTrue(view.equals("home"));
	}*/

	@Test
	public void testHomePage() throws Exception {
		AppController controller = new AppController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
		mockMvc = standaloneSetup(controller).build();

		/*mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/contactus")).andExpect(view().name("contactus"));*/

	}

	@Test
	public void testProductPage() throws Exception {
		AppController controller = new AppController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/products")).andExpect(view().name("products"));
	}

}
