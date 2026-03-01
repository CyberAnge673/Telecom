package com.telecore.telefon.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private JwtRequestFilter jwtRequestFilter;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf(csrf -> csrf.disable()).httpBasic(Customizer.withDefaults())
				.sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) // Sin estado
				.authorizeHttpRequests(auth -> auth.requestMatchers("/auth/**").permitAll()
						// Permitir crear usuarios y extensiones sin estar logueado
						.requestMatchers(HttpMethod.POST, "/Usuario", "/extensiones").permitAll() // TODO cambiar a
																									// autenticado
						// Permitir consultar usuarios y extensiones
						.requestMatchers(HttpMethod.GET, "/Usuario/**", "/extensiones/**").hasRole("ADMIN")
						// Cualquier otra ruta requiere autenticación
						.anyRequest().authenticated())
				.formLogin(form -> form.disable()) // Desactivar formulario
				.httpBasic(Customizer.withDefaults()) // Permitir Auth básica para pruebas
				.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class).build();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
			throws Exception {
		return authenticationConfiguration.getAuthenticationManager();

	}

	// TODO eliminar si no se usara
	// @Bean
	// public UserDetailsService userDetailsService(){
	//
	// }

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
