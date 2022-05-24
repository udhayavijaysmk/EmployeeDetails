package com.example.demo;

public class Sample {

	public static void main(String[] args) {
try {
	String a = null;
	a.length();
	}
catch(NullPointerException e) {
	e.printStackTrace();
}
System.out.println("Checked");
}
}
