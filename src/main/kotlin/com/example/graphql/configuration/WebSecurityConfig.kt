package com.example.graphql.configuration

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.cors.CorsConfiguration

@EnableWebSecurity
class WebSecurityConfig : WebSecurityConfigurerAdapter() {

	override fun configure(http: HttpSecurity) {
		http.cors()
			.configurationSource { CorsConfiguration().applyPermitDefaultValues() }
			.and().csrf().disable()
	}
}
