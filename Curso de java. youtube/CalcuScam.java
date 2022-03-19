import java.util.Scanner;
public class CalcuScam{ 
  public static void main(String args[]){
    Scanner un = new Scanner(System.in);
  
    String nombre = "";
    int numUno = 0, numDos = 0, resultado = 0 ;

    System.out.println("�Cual es tu nombre?");
    nombre = un.nextLine();

    System.out.println ("Dame el primer valor para tu suma: ");
    numUno = un.nextInt();

    System.out.println("Dame el segundo numero para tu suma: ");
    numDos = un.nextInt ();
    
    resultado = numUno + numDos;
    System.out.println("Se�or: "+ nombre);
    System.out.println("EL Resultado de tu suma es el Siguiente: "+ resultado); 
    
  }
}