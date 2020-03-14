package com.example.YouOnWork;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YouOnWorkApplicationTests {

	@Test
	void contextLoads() {
		int po = 1;
		int po2 = 1;

		assertThat(po).isEqualTo(po2);
	}

}
