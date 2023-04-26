public class Ch4{


	public static void main(String[]args){
		//System.out.println(filter("      Hello   there person   ", ' '));
		//for (int i=55;i<110;i+=10){
			//System.out.println(letterGrade3(i));
		//}
			System.out.println(isInInterval('m', 'a','z'));
			System.out.println(isInInterval('a', 'm','z'));
			System.out.println(isInInterval('z', 'a','m'));
		
	}
	public static boolean isInInterval(char searchFor,char start,char end){
		if(end<start){
			throw new IllegalArgumentException("Start Must Be Less Than Start");
		}
	/*if (searchFor>start){
			if(searchFor<end){
				return true;
			}
		}
		return false;*/
		/*if (searchFor>=start & searchFor<=end){
		return true;
		}
		return false;*/
	if (searchFor < start || searchFor > end){
		return false;
		}
		return true;
	/*if (searchFor<start){
		return false;
		}
		if (searchFor>end){
			return false;
		}
		return true;*/
	}
	public static String filter(String x, char y){
		String filtered="";
		for(int i=0 ; i < x.length();i++){
			char temp= x.charAt(i);
			if(y != temp){
				filtered += temp;
				}
			
			}
		return filtered;
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
	public static char letterGrade2( int grade){
		char letter='0';
		if(grade<60){
				return 'F';
			}else if(grade<70){
				return'D';
			}else if(grade<80){
					return'C';
				}
			else if(grade<90){
					return 'B';
				}
			else{
				return 'A';
				}
		//return '0';
	}
	public static char letterGrade3( int grade){
		char letter='0';
		if(grade<60){
				return 'F';
			}
			if(grade<70){
				return'D';
			}
			if(grade<80){
				return'C';
			}
			if(grade<90){
				return 'B';
			}
				return 'A';
		//return '0';
	}	
}
