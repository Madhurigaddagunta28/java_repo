package com;


import java.util.Scanner;

public class EmailDemo {
public static void main(String[] args)  { 
	      String[] strArray = { "mad.sl@gmail.com","abc.sl@gmail.com","xyz.sl@gmail.com","lmn.sl@gmail.com" };
	        boolean found = false;
	        
	        String searchStr="xyz.sl@gmail.com";  
	        
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Search Email");
	        searchStr = obj.nextLine();
	        
	       for (int i = 0; i <strArray.length; i++) {
	       if(searchStr.equals(strArray[i])) {
	           found = true; 
	            break;
	            }
	        }
	       if(found)
	          System.out.println(searchStr + "\n"+ "found ");
	        else
	          System.out.println(searchStr +" not found in the array");
	 }
	    }

