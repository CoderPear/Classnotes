
import java.util.*;
import java.io.*;


public class files{
	
	
	public static double avg(String grades){
	Scanner avg= new Scanner(grades);
	int n = 0;
	double total = 0.0;
	while (avg.hasNextInt()){
		total += avg.nextInt();
		n++;
		}
		return total/n;
	}

	public static void main (String[]args) throws FileNotFoundException{
		
		/*System.out.println(isRect2(1,2,3,4));
		System.out.println(isRect2(1,2,1,4));
		System.out.println(isRect2(1,4,3,4));
		System.out.println(isRect2(2,4,2,4));
		
		System.out.println(isSquare(1,2,3,4));
		System.out.println(isSquare(1,2,1,4));
		System.out.println(isSquare(1,4,3,4));
		System.out.println(isSquare(2,2,2,2));
		
		System.out.println(isSquare2(1,2,3,4));
		System.out.println(isSquare2(1,2,1,4));
		System.out.println(isSquare2(1,4,3,4));
		System.out.println(isSquare2(2,2,2,2));*/
		Scanner console= new Scanner(System.in);
		//relative from currect dirrectory, how to navigate to intended file.
		File students = new File("../other/students.txt");
		/*while(!students.canRead()){//asks for permision
			System.out.println("Enter file name");
			students=new File(console.nextLine());
		}*/
		try{//ask for forgiveness
			Scanner scan = new Scanner(students);
				while(scan.hasNextLine()){
					System.out.println("Given: "+scan.next());
					System.out.println("Family: "+scan.next());
					System.out.println("Year:\t"+scan.next());
					System.out.printf("Avg:\t%.2f\n",avg(scan.nextLine()));
					System.out.println();
		}
		}catch (FileNotFoundException fnfe){
		System.out.println(fnfe.getMessage());
	}
	System.out.println("gotHere");
}
	public static boolean isRect(int a, int b, int c, int d){//correspondind sides not =
		if(a !=c|| b !=d){
			return false;
		}
		return true;
	}
	public static boolean isRect2(int a, int b, int c, int d){//corresponding sides equal
		//if(a ==c&& b ==d){
			//return true;
		//}
		return a ==c&& b ==d;
	}
	public static boolean isSquare(int a, int b, int c, int d){
		//if(a ==b&& b ==c&&c==d){
			//return true;
		//}
		return isRect(a,b,c,d) && a ==b;
	}
	public static boolean isSquare2(int a, int b, int c, int d){
		//if(a !=b|| b !=c||c!=d){
			//return false;
		//}
		return !(a !=b|| b !=c||c!=d);
	}
}
