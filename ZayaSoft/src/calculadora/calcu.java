package calculadora;

import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {

        int numero;
        Scanner teclado=new Scanner (System.in);
        System.out.println("dame una opcion y cero para salir");
        numero=teclado.nextInt();
      while (numero!=0){
        switch (numero) {
            case 1:   System.out.println("sumar");
                     break;
            case 2:  System.out.println("restar"); 
                     break;
            case 3:  System.out.println("Multiplicar");
                     break;
            case 4:  System.out.println( "dividir");
                     break;
                        
        }
        System.out.println("dame una opcion y cero para salir");
        numero=teclado.nextInt();
      }
      if(numero==0){
    	  System.out.println("has salido de la calculadora");
      }
    }
}