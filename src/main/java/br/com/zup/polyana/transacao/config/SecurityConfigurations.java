package br.com.zup.polyana.transacao.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http.csrf().disable()
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests

                                .antMatchers(HttpMethod.GET,"/api/transacoes/**").hasAuthority("SCOPE_transacoes-escopo")
                                .anyRequest().authenticated()

        ).oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
    }

}