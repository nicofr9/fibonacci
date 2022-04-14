package printFibonacci;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author nicolo.frongia
 * questo programma crea un file di nome fibonacci e lo inserisce all'interno del nostro file system locale,
 * ci permette inoltre di poterlo leggere 
 */
public class Main{

	public static void main(String[] args) {
		try { 
			FileWriter file = new FileWriter("fibonacci.txt"); 
		  Integer a = 2;
		  Integer b = 1;
		  file.write("welcome in fibonacci !!\n");
		  for(int i = 0; i <100; i++) {
			 int temp = a;
			  a += b;
			  b= temp;
			  file.append(Integer.toString(a) + " this is the number " + (i+1)+ " of fibonacci series\n");
			  
		  }
		  file.close();
		} catch (IOException e) {
		 e.printStackTrace(); 
		 }
		 
		try {
			FileReader reader = new FileReader("fibonacci.txt");
			int data = reader.read();
			while (data != -1) { //restituisce il codice ascii della lettera che viene letta e per questo il while si occupa di ciclare tutti i caratteri 
				//finchè non trova -1 che non corrisponde a nessun codice ascii
				System.out.print((char)data);
				 data = reader.read();	
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
	}
}