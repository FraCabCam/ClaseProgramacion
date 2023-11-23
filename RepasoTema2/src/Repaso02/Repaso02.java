package Repaso02;

import java.util.Scanner;

public class Repaso02 {
	 public static void main(String[] args) {
			
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Hola indique el nombre de una ciudad.");
		 
		 String ciudad1 = sc.nextLine().trim();
		 
		 System.out.println("Ahora indique otro nonbre de ciudad.");
		 
		 String ciudad2 = sc.nextLine().trim();
		 
		 System.out.println("Por último indique otro nombre de una ciudad");
		 
		 String ciudad3 = sc.nextLine().trim();
		 
	
		 
		 if (ciudad1.length() < ciudad2.length() && ciudad2.length() < ciudad3.length()) {
		 
		 	System.out.println(ciudad1);
		 	System.out.println(ciudad2);
		 	System.out.println(ciudad3);
		 }
		 else if (ciudad1.length() < ciudad3.length() && ciudad3.length() < ciudad2.length()){
			 
			 System.out.println(ciudad1);
			 System.out.println(ciudad3);
			 System.out.println(ciudad2);
		 }
		 else if (ciudad2.length() < ciudad1.length() && ciudad1.length() < ciudad3.length()){
			 
			 System.out.println(ciudad2);
			 System.out.println(ciudad1);
			 System.out.println(ciudad3);
		 }
		 else if (ciudad2.length() < ciudad3.length() && ciudad3.length() < ciudad1.length()){
			 
			 System.out.println(ciudad2);
			 System.out.println(ciudad3);
			 System.out.println(ciudad1);
		 }
		 else if (ciudad3.length() < ciudad1.length() && ciudad1.length() < ciudad2.length()){
			 
			 System.out.println(ciudad3);
			 System.out.println(ciudad1);
			 System.out.println(ciudad2);
		 }
		 else if (ciudad3.length() < ciudad2.length() && ciudad2.length() < ciudad1.length()){
			 
			 System.out.println(ciudad3);
			 System.out.println(ciudad2);
			 System.out.println(ciudad1);
		 }
		 sc.close();
	 }

}
