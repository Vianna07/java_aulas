package banco;

import java.util.Random;

public class RandomBytes {
	public static final Random r = new Random();
	
    public static void main(String[] args) 
    { 
        // create byte array 
        byte[] bytes = new byte[10]; 
  
        // put the next byte in the array 
        r.nextBytes(bytes); 
  
        System.out.println(bytes[0]); 

        // print random value of array 
        System.out.print("Random bytes = [ "); 
        for (int i = 0; i < bytes.length; i++) { 
            System.out.printf("%d ", bytes[i]); 
        } 
        System.out.print("]"); 
    } 
}
