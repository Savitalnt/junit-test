package com.javainuse.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

  @Test
public void givenNumber_whenEven_thenTrue() {
	int number=12;
    assertTrue(number % 2 == 0);
}
