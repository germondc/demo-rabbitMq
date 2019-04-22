package test.clyde.rabbitMqTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.clyde.rabbitMqTest.Application;
import test.clyde.rabbitMqTest.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@DirtiesContext
public class Tester {

	@Autowired
	private Sender sender;
	
	@Test
	public void testMessage() {
		sender.send("wtf");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
