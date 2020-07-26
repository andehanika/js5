package com.code;
import java.util.*;
import java.io.*;
 
public class App1 {
	 static int add(int a,int b)
	    {
	      return a+b;
	    }
	    static int  subtract(int a,int b)
	    {
	      return a-b;
	      
	    }
	    static int  multiply(int a,int b)
	    {
	      return a*b;
	    }
	    static int  divide(int a,int b)
	    {
	      return a/b;
	    }
	  public static void main(String[] args) 
	  {
	    Scanner s=new Scanner(System.in);
	    int i=s.nextInt();
	    int j=s.nextInt();  
	    System.out.println("enter your option \n1.add \n2.sub \n3.mul \n4.div");    
	    int c=s.nextInt();
	    while(c>0)
	      {
	        if(c==1){
	          int b=add(i,j);
	          System.out.println("The result is:"+" "+b);
	          break;
	        }
	        else if(c==2){
	          int b=subtract(i,j);
	          System.out.println("The result is:"+" "+b);
	          break;
	        }
	        else if(c==3)
	        {
	         int b=multiply(i,j);
	          System.out.println("The result is:"+" "+b);
	          break;
	        }
	        else if(c==4){
	          int b=divide(i,j);
	          System.out.println("The result is:"+" "+b);
	          break;
	        }
	    }
	 }
}

