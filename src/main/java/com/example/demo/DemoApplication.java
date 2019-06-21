package com.example.demo;

import com.example.demo.service.JoinedInheritanceEntityManagerService;
import com.example.demo.service.JoinedInheritanceJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private JoinedInheritanceJpaService joinedInheritanceJpaService;

	@Autowired
	private JoinedInheritanceEntityManagerService joinedInheritanceEntityManagerService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * remove DiscriminatorColumn annotation from BaseEntity class
	 * and DiscriminatorValue annotation from DescendantEntity to persist
	 * correctly with JpaRepository
	 *
	 * Also entity could be persisted correctly with joinedInheritanceEntityManagerService
	 * with these annotation stayed intact
	 */
	@Override
	public void run(String... args) throws Exception {
		joinedInheritanceJpaService.saveEntity();

		//joinedInheritanceEntityManagerService.saveEntity();
	}
}
