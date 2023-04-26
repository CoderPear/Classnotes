public class Ch4{


	public static void main(String[]args){
		//System.out.println(filter("      Hello   there person   ", ' '));
		for (int i=55;i<110;i+=10){
			System.out.println(letterGrade(i));
		}
	/*public static String filter(String x, char y){
		String filtered="";
		for(int i=0 ; i < x.length();i++){
			char temp= x.charAt(i);
			if(y != temp){
				filtered += temp;
				}
			
			}
		return filtered;
	}*/
}
	public static char letterGrade( int grade){
		char letter='0';
		if(grade>=90){
				letter = 'A';
			}else if(grade>=80){
				letter = 'B';
			}else if(grade>=70){
					letter = 'C';
				}
			else if(grade>=60){
					letter = 'D';
				}
			else{
				letter='F';
				}
		return letter;
	}
}
