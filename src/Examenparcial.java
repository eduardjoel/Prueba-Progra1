import java.util.Scanner;
public class Examenparcial {

	public static void main(String[] args) {
		Scanner expert=new Scanner(System.in);
			int num1,num2;
			int sum=1;
			int rest=1;
			int mult=1;
			double division=1;
			
			System.out.println("Ingrese el Primer Numero");
			num1=expert.nextInt();
			
			System.out.println("Ingrese el Segundo Numero");
			num2=expert.nextInt();
			
			System.out.println("Ingrese que Accion Aritmetica desea Ejecutar");
			
			sum= num1+num2;
			System.out.println("La suma es:"+sum);
			
			
			rest=num1-num2;
			System.out.println("La resta es:"+rest);
			
			
			mult= num1*num2;
			System.out.println("La Multiplicacion es"+mult);
			
			
			
			division= num1 / num2;
			System.out.println("La division es:"+division);		
			
				

	}
}
  
