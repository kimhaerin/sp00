package org.zerock.web;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**-context.xml" })

public class SmemControllerTest {
	
	@Inject
	private WebApplicationContext ctx;
	
	private MockMvc mockMVC;
	
	@Before
	public void setup(){
		System.out.println("왜 안되니??");
	}

}
