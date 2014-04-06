package sec4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class BeanConfig {
	
	@Bean
	public Instrument guitar() {
		return new Instrument("guitar");
	}
	
	@Bean
	public Singler singler(){
		return new Singler(guitar());
	}
}
