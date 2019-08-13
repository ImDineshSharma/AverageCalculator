import java.util.*;

public class Average{
   public static void main(String[] args){
   
     Scanner cn = new Scanner(System.in);  
     
     System.out.println("Enter 10 values here: ");
     
     int counter;
     int average;
     int inputHolder;
     int total = 0;

     counter = 0;
    
     
    
     while( counter < 10 ){
          inputHolder = cn.nextInt();
          total =  total + inputHolder;
          counter++;          
}
      average = total / 10;

      System.out.println("The average is " + average);
}
}