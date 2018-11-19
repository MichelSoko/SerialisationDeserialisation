package serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import metier.Animal;

public class Serialisation { 
	
      public static void main(String argv[]) { 
    	  
         Animal animal = new Animal("Médor", "Noir"); 
         try { 
             FileOutputStream f = new FileOutputStream("leChienMédor.serialisation"); 
             ObjectOutputStream o = new ObjectOutputStream(f); 
             o.writeObject(animal); o.close(); 
         } 
         catch (IOException e) { 
             System.out.println(e); 
         } 
         
     } 
      
}