import java.util.*;
public class Ch5{


	public static void main(String[]args){
		Scanner console=new Scanner(System.in);
			
			//System.out.println("Max = "+ max);
	//}
	//public static int maxValue(Scanner scan){
		//System.out.print("Enter number of Numbers ++>");
		//int n= scan.nextInt();
		//int max=Integer.MIN_VALUE;
		//if(max<=0){
			//throw new IllegalArgumentException("Number of Numbers must be positive!");
		//}
		//for(int i=0; i<n;i++){
				//int temp= scan.nextInt();
				//if (temp >max){
					//max= temp;
				//}
			//}
		//return max;
		//double avg =averageValue2(console);
			//System.out.println( "average===> "+ avg);
			double avg= averageValue4(console);
				System.out.println("Ave++>"+avg);
}
	public static int averageValue(Scanner scan){
		System.out.print("Enter number of Numbers ++>");
		int n= scan.nextInt();
		if(n<=0){
			throw new IllegalArgumentException("Number of Numbers must be positive!");
		}
		int total= 0;
		for(int i=0;i<n;i++){
			total=total+ scan.nextInt();
		}
		return total/n;
	}
	public static double averageValue2(Scanner scan){
		System.out.println("Enter number -1 to stop");
		int n= 0; int x=0;
		int total= 1;
		for(; x != -1;){
			x=scan.nextInt();
			total=total+x;
			n++;
	}
	return total/(n-1);
}
	public static double averageValue3(Scanner scan){
		System.out.println("Enter done to stop");
		int n= 0; int x=0;
		int total= 0;
		boolean done=false;
		while(!done){
			String temp= scan.next();
			if(temp.equals("done")){
				done=true;
			}else{
				x=Integer.parseInt(temp);
				total= total+x;
				n++;
			}
			}return total/(n-1);
	}
	public static double averageValue4(Scanner scan){
		System.out.println("Enter done to stop");
		int n= 0; 
		double total= 0, x=0;
		while(scan.hasNextDouble()){
				x=scan.nextDouble();
				total= total+x;
				n++;
			}
			return total/(n-1);
	}
	
}
