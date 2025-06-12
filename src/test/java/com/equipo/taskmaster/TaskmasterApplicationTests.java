package com.equipo.taskmaster;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskmasterApplicationTests {

	@Test
	public void testTaskmasterApplication() {
		TaskmasterApplication.tasks.clear();
		TaskmasterApplication.addTask("Terminar ejercicio Maven");
		assertEquals(1, TaskmasterApplication.tasks.size());

	}

}
