public class MiniCalcu {
  public static void main (String args[]){

    int operacion = 4;
    int numUno = 10;
    int numDos = 2;
    int resultado = 0;
    
    if(operacion ==1){
       resultado = numUno + numDos;
         System.out.println("El resultado de tu suma es: "+ resultado);
    } else if (operacion ==2){
         resultado = numUno - numDos; 
         System.out.println("El resultado de tu resta es: "+ resultado);        
      } else if (operacion ==3){
         resultado = numUno * numDos;
         System.out.println("El resultado de tu multiplicacion es: "+ resultado);         
      }  else if (operacion ==4){
         resultado = numUno / numDos;
         System.out.println("El resultado de tu division es: "+ resultado);         
      }
  }
}