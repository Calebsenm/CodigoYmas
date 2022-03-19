import java.util.Scanner;
public class EjercicioCoca{
   public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int clave =0;
   int antiguedad;

   System.out.println("_______________________");
   System.out.println("Vienvenido a mi sistema");
   System.out.println("_______________________");
  
   System.out.println("Cual es nombre del trabajador:  ");
   nombre = in.nextLine();
   
   System.out.println("Cuantos años de servicio tiene el trabajador: ");
   antiguedad = in.nextInt();

    System.out.println("Cual es la clave de su departamento: ");
    clave = in.nextInt();
       
       if (clave <1){
           System.out.println("Su clave no existe");
       }    
              else if(clave == 1){
              if(antiguedad <1){
                     System.out.println("La antiguedad que eligio no existe");
              }    else if(antiguedad == 1){
                     System.out.println(nombre+" tiene derecho a 6 dias de vaciones");
                     }    else if (antiguedad >=2 && antiguedad <=7){
                            System.out.println(nombre +"tiene derecho a 14 dias de vacaciones");
                            }   else if (antiguedad <=10){ 
                                   System.out.println(nombre +"tienes derecho a 20 de vacaciones ");
                                   }    else{  
                                          System.out.println("Aun no tiene derecho a vacaciones");
                                          }

       }  else if(clave ==2){

              if(antiguedad <1){
                     System.out.println("La antiguedad que eligio no existe");
              }      else if(antiguedad == 1){
                            System.out.println(nombre+" tiene derecho a 6 dias de vaciones");
                     }    else if (antiguedad >=2 && antiguedad <=7){
                            System.out.println(nombre +"tiene derecho a 15 dias de vacaciones");
                            }   else if (antiguedad <=10){ 
                                   System.out.println(nombre +"tienes derecho a 22 de vacaciones ");
                                   }    else{  
                                          System.out.println("Aun no tiene derecho a vacaciones");
                                          }


       }      else if(clave ==3){
                     if(antiguedad <1){
                            System.out.println("La antiguedad que eligio no existe");
                     }      else if(antiguedad == 1){
                                   System.out.println(nombre+" tiene derecho a 6 dias de vaciones");
                            }      else if (antiguedad >=2 && antiguedad <=7){
                                          System.out.println(nombre +"tiene derecho a 14 dias de vacaciones");
                                   }      else if (antiguedad <=10){ 
                                          System.out.println(nombre +"tienes derecho a 20 de vacaciones ");
                                          }    else{  
                                                 System.out.println("Aun no tiene derecho a vacaciones");
                                                 }
       }  else{ 
              System.out.println("Su clave no existe");
       }

   }
}