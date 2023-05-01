import java.util.*;
public class printRange{
	
	public static void main(String[]args){
		int a = console.next();
		int b = console.next();
		range(a,b);
	}
//	this will need to take value a and value b and print values between a and b 
//if a>b then it will do for loop with 
	public static void range(int a, int b){
		int a = console.next();
		int b = console.next();
		for(int i= a; i<= b; i++){
			system.out.print(i+" ");
			}
		
	}
}	
