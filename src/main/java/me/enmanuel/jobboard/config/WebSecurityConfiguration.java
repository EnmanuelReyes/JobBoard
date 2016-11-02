package me.enmanuel.jobboard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 1:47 PM
 */
@Configuration
public class WebSecurityConfiguration extends
        WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll();
//        http_0_, user0_.last_name as last_nam2_0_, user0_.name as n
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/profile")
//                .and()
//                .logout().logoutSuccessUrl("/login")
//                .and()
//                .authorizeRequests()
//                .antMatchers("/webjars/**", "/login","/signin/**","/signup").permitAll()
//                .anyRequest().authenticated();
    }
}