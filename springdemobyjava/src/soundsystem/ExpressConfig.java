package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/soundsystem/blankdisc.properties")
public class ExpressConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	@Primary
	public BlankDisc disc()
	{
		return new BlankDisc(env.getProperty("title"),env.getProperty("singer"));
	}
}
