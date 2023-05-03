import java.util.*;
public class Ch5{


	public static void main(String[]args){
		fence();
		Scanner console=new Scanner(System.in);
		Random rand=new Random();//psudo-random
			guessing(console, rand.nextInt(100));
			
			for (int i=0;i<10;i++){
				System.out.print(rand.nextInt(20)+" ");}
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
			/*double avg= averageValue4(console);
				System.out.println("Ave++>"+avg);
				avg= (int)((avg*100)/100);
				System.out.println(avg);
				System.out.printf("average==>%.2f and the number %8d and string %s",avg,42, "HI");
				//f for float, d for int and s for string, an num inc digits or spaces.*/
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
	public static void guessing(Scanner scan, int secret){
	int guess= scan.nextInt();
	while(guess != secret){//checks befor look aka ask permission
			if(guess>secret){
				System.out.println("too high");
				}else{
				System.out.println("too low");}
			
			guess=scan.nextInt();
			}
			System.out.println("congrats");
		}
	public static void guessing2(Scanner scan, int secret){
	int guess= -1;
	do{//do loop at least once
		guess=scan.nextInt();
			if(guess>secret){
				System.out.println("too high");
				}else{
				System.out.println("too low");}
			
			
			}while(guess != secret);//checks after loop aka asks forgiveness
			System.out.println("congrats");
		}
	public static void fence(){
		Random rand=new Random();
		//System.out.print("|");
		for(int i=0;i<9;i++){
			if(i%2==0){
		System.out.print("|");
	}else{
		System.out.print("-");}
		}
	//System.out.println("|");
		//for(int i=0;i<5;i++){
		
		//System.out.print("|-");
		//}
	//System.out.println("|");
	
	}
}
	

