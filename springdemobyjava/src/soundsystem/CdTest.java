package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {CDPlayerConfig.class})
public class CdTest {
	//@Autowired
	//private ApplicationContext acac=new AnnotationConfigApplicationContext(CDPlayerConfig.class);
	
	@Autowired
	@Qualifier("sgt")
	private CompactDisc comd;
	
//	@Autowired
	private CDPlayer cdplayer;
	
	@Autowired
	private MagicBean magicbean;
	

	
	
	@Test
	public void cdSystemTest1()
	{
		comd.play();
	}
			
	@Test
	public void cdSystemTest2()
	{
		System.out.println("cdSystemTest2");
		cdplayer.play();
		//System.out.println(cdplayer.getCompactDisc()==comd);
	}
	
	@Test
	public void cdSystemTest3()
	{
		System.out.println("cdSystemTest3");
		cdplayer.play();
	}
	
	@Test
	public void cdSystemTest4()
	{
		magicbean.playMagic();
		System.out.println("cdSystemTest4");
		
	}
}
