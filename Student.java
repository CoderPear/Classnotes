import java.util.*;
public class Student implements Comparable<Student>{
	
	// members or fields, each instance gets their own copies of each member
	private String given;
	private String family;
	private int year;
	private String[] grades;
	
	public static final int ANSWER = 42;
	// no-arg constructor (default constructor)
	public Student(){
		this("", "", 0, new String[0]);
	}
	
	// canonical constructor (fancy constructor)
	public Student(String given, String family, int year, String[]grades){
		setGiven(given);
		setFamily(family);
		setYear(year);
		setGrades(grades);
	}
	// setter
	public void setGiven(String given){
		if(given == null){
			given = "";
		}
		this.given = given.toLowerCase();
	} 
	public void setFamily(String family){
		if(family == null){
			family = "";
		}
		this.family = family.toUpperCase();
	}
	public void setYear(int year){
		if(year < 0){
			year = 0;
		}
		this.year = year;
	}
	private void setGrades(String[] grades){
		if(grades == null){
			grades = new String[0];
		}
		this.grades = grades;
	}
	// getter
	public String getGiven(){
		return given;
	}
	public String getFamily(){
		return family;
	}
	public int getYear(){
		return year;
	}
	public String[] getGrades(){
		return Arrays.copyOf(grades, grades.length);
	}
	
	
	public double avg(){
		double total = 0.0;
		for(String grade : grades){
			total += Integer.parseInt(grade);
		}
		return total / grades.length;
	}
	
	public int compareTo(Student other){
		return this.family.compareTo(other.family);
	}
	
	public String toString(){
		return "Given:\t" + this.given + "\n" +
				"Family:\t" + family + "\n" +
				"year:\t" + year + "\n" +
				"Avg:\t" + avg() + "\n";
	}
}
