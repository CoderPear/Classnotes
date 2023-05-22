
import java.util.*;
import java.io.*;


public class StudentsDirrectory{
	
	
	

	public static void main (String[]args) throws FileNotFoundException{
		
		Scanner scan= new Scanner(System.in);
		
		File students = new File("../other/students.txt");
		int n=0;
		while (scan.hasNextLine()){
			n++;
			scan.nextLine();
			}
			Student[] dir= new Student[n];
		for(int i=0;1<n;i++){
					dir[i]= new Student();
					dir[i].given=scan.next();
					dir[i].family= scan.next();
					dir[i].year=scan.nextInt();
					dir[i].grades=scan.nextLine().split(" ");
					//println(Arrays.toStrings(average));
					//dir[i].grades =grades;
		}
		Arrays.sort(dir);
		//println(Arrays.toString(dir));
			//catch (FileNotFoundException fnfe){
		//System.out.println(fnfe.getMessage());
		//out.println(Arrays.toString(given));
		//out.println(Arrays.toString(family));
		//out.println(Arrays.toString(year));
		//out.println(Arrays.toString(avg));
	}
}



