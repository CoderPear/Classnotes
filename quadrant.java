import java.util.*;
public class quadrant{
		int x = console.next();
		int y = console.next();
	public static void main(String[]args){
		quad(x,y)
	}
	public static void quadrant(Scanner console,Scanner console){
	//use if x is neg then it's in quad 2 or 3 then check if y is +or- for if it's in 2 or 3 for if x is neg or 1 or 4 for pos x
	//{x>0,y>0=q1}{x>0,y<0=q4}{x<0,y<0=q3}
		if(x<0){
			if (y<0){
				System.out.println("Q3!");
				}else{
				System.out.println("Q2");
			}
			if(x>0){
				if (y>0){
				ystem.out.println("Q1");
				}else(if y<0){
					if (y>0){
				System.out.println("Q4");
					}
				}
			}
		}
	}
}
