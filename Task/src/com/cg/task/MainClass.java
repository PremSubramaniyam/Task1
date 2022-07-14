package com.cg.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Ajith", 30));
		list.add(new Employee("vikas", 24));
		list.add(new Employee("Johnson", 19));
		list.add(new Employee("Victor", 23));
		
		List<Employee> list3 = list.stream()
						.filter(e -> e.getAge() < 24)
						.collect(Collectors.toList());
		
		list3.forEach( e -> System.out.println("Name: " + e.getName() + " Age: " + e.getAge()));
		
		/*
		 * for(Employee e : list) { if(e.getAge() < 24) { list3.add(e); } }
		 * 
		 * for(Employee e : list) { System.out.println("Name: " + e.getName() +
		 * " , Age: " + e.getAge()); }
		 */		
	}

}
