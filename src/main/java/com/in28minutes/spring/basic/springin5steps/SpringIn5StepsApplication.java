package com.in28minutes.spring.basic.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch(new QuickSortAlgorithm());
		BinarySearch binarySearch1 = new BinarySearch(new BubbleSortAlgorithm());

		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
