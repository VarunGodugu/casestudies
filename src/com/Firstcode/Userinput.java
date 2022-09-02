package com.Firstcode;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how old are you? ");
		int age=sc.nextInt();
		System.out.println("my age is :"+age);
		sc.close();
	}}