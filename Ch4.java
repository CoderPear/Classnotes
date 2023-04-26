public class Ch4{


	public static void main(String[]args){
		System.out.println(filter("      Hello   there person   ", ' '));
		
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
}
