import java.util.*;
public class Ary{
public static void main (String[]args){
	
		String data ="1 2 3 4 5 6";
		String data2= "";
		Scanner scan= new Scanner(data);
		while(scan.hasNext()){
			data2+=(scan.nextInt()+1)+ " ";
		}
		System.out.println(data2);
		int[]numbers={1,2,3,4,6,6};
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[0]);
		System.out.println(Arrays.toString(args));
		
		
		Random rand= new Random();
		if(args.length>0){
			rand= new Random(Integer.parseInt(args[0]));
		 }
		 for(int i=0;i<10;i++){
			 System.out.println(rand.nextInt(10));
			 
			 
		 }
		 shuffle(numbers);
		int [] numbers2= new int[10];
		double[] x = new double[5];
		String [] y = new String [7];
		//numbers2=numbers;
		numbers2= Arrays.copyOf(numbers,numbers.length);
		numbers2[numbers2.length-1]= 42;
		//System.out.println(Arrays.toString(numbers));
		//System.out.println(Arrays.toString(numbers2));
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		 System.out.println(Arrays.toString(numbers));
		 //System.out.println(max(new int[0]));
		 System.out.println(max3(numbers));
		 System.out.println(Arrays.toString(numbers)); 
		 
		 
	int[] a ={1,2};
	int[] b ={3,4};
	int[][] c= {a,b};
	System.out.println(Arrays.toString(c));
		for(int[] array:c){
		System.out.println(Arrays.toString(array));
		}
		c[1]=numbers;
		System.out.println(Arrays.deepToString(c));
		
		
		int[][][] d=new int [4][5][6];
			System.out.println(Arrays.deepToString(d));
	}
	public static void shuffle(int[]numbers){
		
		
		//p= numbers[1];
		//numbers[1]=numbers[0];
		//numbers[0]=p;
		//System.out.println(Arrays.toString(numbers));
		Random r= new Random();
		
		for (int i=0;i<numbers.length;i++){
			int p=0;
			int randIndex= r.nextInt(numbers.length);
			p= numbers[randIndex];
			numbers[randIndex]=numbers[i];
			numbers[i]=p;
			System.out.println("randIndex " + randIndex+" i "+i+" "+ Arrays.toString(numbers));
			}
		System.out.println(max(numbers));
	}

	public static int max(int[]numbers){
		if (numbers.length==0)
			throw new IllegalArgumentException("Array Must Have Elements!");
		int largest= Integer.MIN_VALUE;
		for (int i=0;i<numbers.length;i++){
			if( numbers[i]>largest){
				largest=numbers[i];
			}
			}
			return largest;
	}
	public static int max2(int[]numbers){
		if (numbers.length==0){
			throw new IllegalArgumentException("Array Must Have Elements!");
		}
		numbers= Arrays.copyOf(numbers,numbers.length);
		Arrays.sort(numbers);
		
	
			return numbers[numbers.length-1];
	}
	public static int max3(int[]numbers){
		if (numbers.length==0)
			throw new IllegalArgumentException("Array Must Have Elements!");
		int largest= Integer.MIN_VALUE;
		for (int element:numbers){
			if( element>largest){
				largest=element;
			}
			}
			return largest;
	}
}
