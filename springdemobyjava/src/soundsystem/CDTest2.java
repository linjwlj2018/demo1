package soundsystem;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)

public class CDTest2 {
	
	private ApplicationContext ac;

	@Before
	public void init() 
	{
		System.out.println("init¡­¡­");
		ac=new ClassPathXmlApplicationContext("spring-configuration.xml");
	}
	
	@Test
	public void springXmlTest1()
	{
		CompactDisc cd=(CompactDisc)ac.getBean("compactDisc");
		cd.play();
	}
}
