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
	 * remove jdbc.batch_size property from persistence.xml or application.yaml to persist
	 * correctly with JpaRepository or EntityManager
	 *
	 */
	@Override
	public void run(String... args) throws Exception {
		//joinedInheritanceJpaService.saveEntity();

		joinedInheritanceEntityManagerService.saveEntity();
	}
}
