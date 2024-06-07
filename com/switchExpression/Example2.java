package com.switchExpression;

public class Example2 {

	public static void main(String[] args) {

		String day = "monday";

		String output = switch (day.toLowerCase()) {

		case "monday", "tuesday", "wednesday", "thursday", "friday" -> "Working Day...";

		case "saturday", "sunday" -> "Holiday...";

		default -> "Enter Valid Day...";

		};

		System.out.println(output);

	}

}
