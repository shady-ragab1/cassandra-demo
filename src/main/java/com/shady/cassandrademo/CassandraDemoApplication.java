package com.shady.cassandrademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories
public class CassandraDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraDemoApplication.class, args);
	}

}
