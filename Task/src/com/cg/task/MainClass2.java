package com.cg.task;

import java.util.Optional;

public class MainClass2 {

	public static void main(String[] args) {
		
        Optional<Integer> op = Optional.ofNullable(23);
 
        Optional<Integer> value = op.filter(number -> number < 24);
 
        if (value.isEmpty()) {
            System.out.println("The Given Number is greater than 24");
        } else {
            System.out.println("The Given Number is less than 24");
        }
 
    }

}
