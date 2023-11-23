package Repaso06;

public class Repaso06 {
	
	public static void main(String[] args) {
		
		
		Integer contador =0;
		
		for (int i = 3; i <= 30; i += 3) {
			
			
			if (i < 30) {
				
				System.out.print(i + " + ");
				
			}
			
			contador = contador + i;
			if (i == 30) {
				
				System.out.print(i + " = " + contador);
				
			}
			
		}
	
	}

}
