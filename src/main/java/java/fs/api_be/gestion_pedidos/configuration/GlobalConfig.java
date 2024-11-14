package java.fs.api_be.gestion_pedidos.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfig {
	
	@Bean
	ModelMapper modelMaper(){
		return new ModelMapper();	 // es necesario la libreria modelmapper en pom.xml
	}
}
