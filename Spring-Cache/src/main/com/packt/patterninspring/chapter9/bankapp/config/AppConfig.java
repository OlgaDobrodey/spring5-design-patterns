package main.com.packt.patterninspring.chapter9.bankapp.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@EnableCaching
@ComponentScan(basePackages={"main.com.packt.patterninspring.chapter9.bankapp"})
@Import(InfrastructureConfig.class)
public class AppConfig {
	
	@Bean
	public CacheManager cacheManager() {
		CacheManager cacheManager = new ConcurrentMapCacheManager();
		return cacheManager;
	}
}
