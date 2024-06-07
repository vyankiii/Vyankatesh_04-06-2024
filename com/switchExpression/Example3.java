package com.switchExpression;

public class Example3 {

	public static void main(String[] args) {

		byte value = '5';

		String output = switch (value) {

		case 'B', 'C', 'D', 'b', 'd' -> "Consonents";

		case 'a', 'e', 'i', 'o', 'u', 'A', 'I' -> "Vowels";

		default -> "Enter valid character....";

		};

		System.out.println(output);

	}

}
