public class Student{
	//members of the fields
	public String given;
	public String family;
	public int year;
	public String[] grades;
	
	
	public double avg(){
		double total=0.0;
		for(String grade: grades){
			total += Integer.parseInt(grade);
			
		}
		return total/grades.length;
	}
	public String toString(){
		return "Given:\t" + given+"\n"+
			"Family:\t" + family+"\n"+
			"Year:\t" + year+"\n"+
			"Average:\t" + avg()+"\n";
	}
	
}
