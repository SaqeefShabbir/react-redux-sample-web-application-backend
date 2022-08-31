package com.conure.restaurant_application_backend_v1.Database;

import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

//@Configuration
//@ComponentScan(basePackages = {"com.conure.restaurant_application_backend_v1.*"})
public class DatabaseConfiguration  {

//    @Bean
//    public DataSource datasource() {
//        return DataSourceBuilder.create()
//                .driverClassName("org.postgresql.Driver")
//                .url("jdbc:postgresql://db:5432/restaurant_application")
//                .username("postgres")
//                .password("123")
//                .build();
//    }
}
