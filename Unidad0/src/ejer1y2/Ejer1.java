package ejer1y2;


public class Ejer1 {

	public static void main(String[] args) {
		
		int num=5, resul=num;
		
		for(int i=1; i<num; i++){
			int provisional = num - i; 
			resul *= provisional;
			
		}
		
		System.out.println("El factorial es : "+resul);
		
	}
	
	
	
	
}
