import java.util.*;
public class quadrant{
		
	public static void main(String[]args){
		int x = 4;
		int y = -2;
		quadrant(x,y);
		y=3;
		x=2;
		quadrant(x,y);
	}
	public static void quadrant(int x, int y){
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
				System.out.println("Q1");
				}else {
				System.out.println("Q4");
					}
				}
			}
		}
	}

