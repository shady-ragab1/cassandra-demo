package com.shady.cassandrademo;

import com.shady.cassandrademo.model.MagazineName;
import com.shady.cassandrademo.repos.MagazineRepo;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CassandraDemoApplicationTests {

	@Autowired
	MagazineRepo repo;

	@Test
	@Order(1)
	void save() {
		MagazineName mag = MagazineName.builder().frequency(5).name("Al-shabab").magazineId("1").build();
		repo.save(mag);

		mag = MagazineName.builder().frequency(10).name("AL-ahram").magazineId("2").build();
		repo.save(mag);

		mag = MagazineName.builder().frequency(0).name("Mozabeeq today").magazineId("3").build();
		repo.save(mag);


		assertEquals(3,repo.count());

	}

	@Test
	@Order(2)
	void query(){
		assertEquals(repo.findMagazineCQlQuery("1"),repo.findMagazineNameByName("Al-shabab"));
		assertTrue(repo.findById("1").isPresent());
		assertEquals(repo.findMagazineNameByNameStartsWith("Al"),repo.findById("1").get());
	}

}
