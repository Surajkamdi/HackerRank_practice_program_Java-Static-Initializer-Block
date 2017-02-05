import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticBlock {
// code written by suraj kamdi
static int B,H;
static boolean flag=false;
static{
    Scanner suraj= new Scanner(System.in);
 B = suraj.nextInt();
 H = suraj.nextInt();
if(B>0 && B<=100 && H>0 && H<=100){
    flag=true;
}
else{
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
