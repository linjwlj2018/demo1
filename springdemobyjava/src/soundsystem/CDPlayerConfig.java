package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class CDPlayerConfig {
	
	@Bean
	@Qualifier("sgt")
	public CompactDisc sgtPeppers()
	{
		return new SgtPeppers();
	}
	
	@Bean
	public CompactDisc blankDisc()
	{
		return new BlankDisc(new String(),new String());
	}
/*	
	@Bean
	public CDPlayer cdPlayer(CompactDisc cd)
	{
		return new CDPlayer(cd);
	}
*/	
	@Bean
	@Conditional(MagicExistsCondition.class)
	public MagicBean magicBean()
	{
		return new MagicBean();
	}
}
