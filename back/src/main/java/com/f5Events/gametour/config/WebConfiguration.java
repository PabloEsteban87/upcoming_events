 package com.f5Events.gametour.config;


@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
} */


  */