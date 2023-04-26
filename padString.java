public class padString{
	
	public static void main(String[]args){
		
      padString("congratulation",10);
    }
    public static String padString(String x, int y){
		char b= ' ';
		if (x.length()<y){
		    for (int i=0; i <=y; i++){
		        System.out.print(b);
		        }
		        return x; 
		    
	/*	for(int i=0 ; i < x.length();i++){
			char temp= x.charAt(i);
			if(y != temp){
				filtered += temp;
				}
			
			}*/
		}
	
        return x+y;
    }
}
	}
	
}
