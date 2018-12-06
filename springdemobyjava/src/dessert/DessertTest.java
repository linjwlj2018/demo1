package dessert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DessertConfiguration.class)
public class DessertTest {
	
	@Autowired
	@Qualifier("cake1")
	private Dessert des;
	
	@Test
	public void desTest1()
	{
		des.delicious();
	}
}
