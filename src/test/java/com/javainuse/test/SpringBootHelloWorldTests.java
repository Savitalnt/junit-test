package com.javainuse.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHelloWorldTests {

	@Test
	public void contextLoads() {
	}
        @Test
	public void test() {
 	int number=12;
    assertTrue(number % 2 == 0);
 }
}
