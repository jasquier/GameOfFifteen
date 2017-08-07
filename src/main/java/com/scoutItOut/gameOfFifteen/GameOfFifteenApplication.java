package com.scoutItOut.gameOfFifteen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jasquier
 * @since 0.1
 *
 * TODO add migration scripts to populate a starter db
 * TODO test board to boardDAO conversion method in board class
 *
 */
@SpringBootApplication
public class GameOfFifteenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameOfFifteenApplication.class, args);
	}
}
