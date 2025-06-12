package com.equipo.taskmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class TaskmasterApplication {

	public static ArrayList<String> tasks = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(TaskmasterApplication.class, args);
		System.out.println("Ambiente: " + System.getProperty("env.name"));
		System.out.println("Bienvenidos a TaskMaster!");
		addTask("Estudiar Maven");
		addTask("Leer sobre CI/CD");
		printTasks();
	}

	public static void addTask(String task){
		tasks.add(task);
	}

	public static void printTasks(){
		System.out.println("Tareas pendientes:");
		for(String t : tasks){
			System.out.println("_ " +  t);
		}
	}

}
