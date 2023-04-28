import java.util.*;
public class Ch4{

	public static void main(String[]args){
		//System.out.println(filter("      Hello   there person   ", ' '));
		//for (int i=55;i<110;i+=10){
			//System.out.println(letterGrade3(i));
		//}
			System.out.println(isInInterval('m', 'a','z'));
			System.out.println(isInInterval('a', 'm','z'));
			//System.out.println(isInInterval('z', 'a','m'));
		String str= null;
		example("hello");
		example("");
		//example(null);
		
		Scanner console=new Scanner(System.in);
			int max= maxValue(console);
			System.out.println("Max = "+ max);
	}
	public static int maxValue(Scanner scan){
		System.out.print("Enter number of Numbers ++>");
		int n= scan.nextInt();
		int max=Integer.MIN_VALUE;
		if(max<=0){
			throw new IllegalArgumentException("Number of Numbers must be positive!");
		}
		for(int i=0; i<n;i++){
				int temp= scan.nextInt();
				if (temp >max){
					max= temp;
				}
			}
		return max;
	}
	public static Exception example(String str) throws IllegalArgumentException{
		if(str==null){
			throw new IllegalArgumentException("String Must Exist");
			//throw new Exception("String Must Exist");* More complicated
			}
			System.out.println(str.length());
			Exception e= new Exception();
			return e;
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
		return !(searchFor< start|| searchFor>end);//opt 6 logical or
		//if (searchFor>=start & searchFor<=end){ //using logical and
		//return true;
		//}
		//return searchFor>=start & searchFor<=end;
	/*if (searchFor < start || searchFor > end){ //use logical or
		return false;
		}
		return true;*/
	/*if (searchFor<start){ //use indy ids
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
