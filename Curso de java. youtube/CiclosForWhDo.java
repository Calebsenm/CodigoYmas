public class CiclosForWhDo{
  public static void main(String args[]){
   
    int i = 0;
    int j = 0;
    
      for (j = 100; j >= 90 ; j--){
        i = i+1;
          System.out.print(i+", ");
          System.out.print(j+",");
      }  
      System.out.println("");
    i = 1;
    j = 100;
      while( i <= 11){
       
        if (i<11){
          System.out.print(i+", ");
          System.out.print(j+",");
        } else{ 
          System.out.print(i+(", "));
          System.out.print(j+(" "));}
       i++;
       j--;
      }
      i = 1;
      j = 100;
      System.out.println("");
      do{
        
        if (i<11){
          System.out.print(i+", ");
          System.out.print(j+",");
        } else{ 
          System.out.print(i+(", "));
          System.out.print(j+(" "));}
       

       i++;
       j--;
      } while(i < 12);  
              
  }
}