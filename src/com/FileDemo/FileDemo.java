package com.FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File f= new File("C:\\java basics","myfile.txt");
		try {
			boolean flag=f.createNewFile();
			System.out.println(flag);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.getName());
		System
