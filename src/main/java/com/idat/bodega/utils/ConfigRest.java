package com.idat.bodega.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.idat.bodega.model.Producto;

@Configuration
public class ConfigRest {
	
	@Bean
	public RepositoryRestConfigurer configurer() {
		return new RepositoryRestConfigurer() {
			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
				// TODO Auto-generated method stub
				config.exposeIdsFor(Producto.class);
				config.returnBodyOnCreate("Aea");
			}
		};
	}

}
