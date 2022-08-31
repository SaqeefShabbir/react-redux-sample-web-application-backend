package com.conure.restaurant_application_backend_v1.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void seed() {
        jdbcTemplate.execute("INSERT INTO item(id, title, price) VALUES(1, 'Fries', 2.95)");
        jdbcTemplate.execute("INSERT INTO item(id, title, price) VALUES(2, 'Burger', 4.95)");
        jdbcTemplate.execute("INSERT INTO item(id, title, price) VALUES(3, 'Pizza', 4.75)");
        jdbcTemplate.execute("INSERT INTO item(id, title, price) VALUES(4, 'Sandwich', 3.95)");
        jdbcTemplate.execute("INSERT INTO item(id, title, price) VALUES(5, 'Noodles', 6.50)");
        jdbcTemplate.execute("INSERT INTO item(id, title, price) VALUES(6, 'Pepsi', 3.45)");
        jdbcTemplate.execute("INSERT INTO item(id, title, price) VALUES(7, 'Milk Shake', 4.25)");
        jdbcTemplate.execute("INSERT INTO item(id, title, price) VALUES(8, 'Donut', 5.25)");
    }
}
