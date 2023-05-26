import java.util.*;
public class CollegeStudent extends Student{
	
	// members or fields, each instance gets their own copies of each member

	private String major;
	private String advisor;
	public static void main(String[]args){
		CollegeStudent peter = new CollegeStudent("Peter","Parker",12,null,"Bio-engineering", "Doctor Octavous");
		peter.setYear(17);
		System.out.println(peter);
		}
		public CollegeStudent(String given, String family,int year,String[]grades,String major, String advisor){
		/*setGiven(given);
		setFamily(family);
		setYear(year);
		setGrades(grades);*/
		super(given, family, year, grades);
		this.major=major;
		this.advisor=advisor;
		
			}
	
}
