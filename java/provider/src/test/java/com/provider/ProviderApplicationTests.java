package com.provider;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class ProviderApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Test
    void contextLoads() {
        System.out.println(jdbcTemplate);
    }

}
