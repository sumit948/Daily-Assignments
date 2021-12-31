package com.example.memoryauthencation.Week4.memoryauthspringboot.memoryconfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class MemoryConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	private DataSource dataSource;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic().and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
/*        auth.inMemoryAuthentication().withUser("jhon").password("$2a$10$3pD9yuq4/9FIyTZ/6zSGbOizsarCY340sIVhNh2KukobcGocTlrjy")
//             .roles("USER").and().withUser("admin")
//            .password("$2a$10$YueglY92fcm9nZ0CjU8USOA0gNyRLW2bW9FP5e87osR/bniL3LoWG").credentialsExpired(true).accountExpired(true).accountLocked(true)
            .authorities("WRITE_PRIVILEGES", "READ_PRIVILEGES").roles("ADMIN");
            */
    	
    	String userPassword = passwordEncoder().encode("weak");
    	String adminPassword = passwordEncoder().encode("admin");
    	auth.inMemoryAuthentication().withUser("jhon").password(userPassword)
        .roles("USER").and().withUser("admin")
       .password(adminPassword)
       //.credentialsExpired(false).accountExpired(false).accountLocked(false)
       .authorities("WRITE_PRIVILEGES", "READ_PRIVILEGES").roles("ADMIN");
    }
    
//    @Bean public PasswordEncoder passwordEncoder() {
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//        return encoder;
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
