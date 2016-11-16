package org.zerock.web;

import java.util.Map;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**-context.xml" })

public class SmemControllerTest {

	@Inject
	private WebApplicationContext ctx;

	private MockMvc mockMVC;

	@Before
	public void setup() {
		this.mockMVC = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Test
	public void testDoA() throws Exception {
		ResultActions result = mockMVC
				.perform(MockMvcRequestBuilders
						.post("/smem/doA")
						.param("userid", "AAAA")
						.param("userpw", "BBBB"));
		
		MvcResult mvcResult = result.andReturn();
		
		Map<String, Object> map = mvcResult.getModelAndView().getModel();
		
		System.out.println(map.get("vo"));
		
	}

}
