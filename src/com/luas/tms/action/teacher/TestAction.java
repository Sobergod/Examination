package com.luas.tms.action.teacher;

public class TestAction {
	public static void main(String[] args) {
		System.out.println("TestAction Start!");
		   String filePath = "D:\\gtz\\test\\examination.txt";
	       ReadFile readFile=new ReadFile();  
	       readFile.readTxtFile(filePath);
	       
	    }
}
