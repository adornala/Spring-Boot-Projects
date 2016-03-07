package home.Springboot.Trail1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import home.Springboot.SpringBootTrainingExample1Application;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootTrainingExample1Application.class)
@WebAppConfiguration
public class SpringBootTrainingExample1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
