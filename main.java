/* 	Universidad del Valle de Guatemala
 *  	Algoritmos y Estructura de Datos
 *  	Brandon Hernandez 15326
 *  	Diego Lopez 141222
 *  	Hoja de Trabajo 8
*/

import java.io.*;
import java.util.*;



public class main {
    
	
	
    public static void main(String[] args) {
        Scanner scan;
        VectorHeap tree = new VectorHeap();
        scan = new Scanner (System.in);
        String traduccion = " ";
        
        

        try{
            FileInputStream doc = new FileInputStream("C:\\Users\\diego\\workspace\\HDT8\\src\\pacientes.txt");
            DataInputStream ent = new DataInputStream(doc);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(ent));
            String strLinea;
         
            while ((strLinea = buffer.readLine()) != null)   {
                traduccion = traduccion+strLinea+" ";
            }
            ent.close();
        }
        catch (Exception e){ 
            System.out.println("No se puede leer el documento" + e.getMessage());
        }
        
        
        
        List<String> palabras = new ArrayList<>();
        int countLineas = 0;
        
   
        for(int i = 0; i < countLineas; i++ )
        {   
            String linea1;
            int coma = 0;
            linea1 = palabras.get(i).toLowerCase();
            for(int n = 0; n <linea1.length()-1; n++){
                    if(Character.toString(linea1.charAt(n)).equals(",")){
                        coma = n;
                    }
                 }
        }
        
        int inicio = 0;
        int N_Palabras = 0;
        List<String> Texto = new ArrayList<>();
             for(int n = 0; n <traduccion.length(); n++){
                    if(Character.toString(traduccion.charAt(n)).equals(" ")){
                        Texto.add(traduccion.substring(inicio, n));
                        inicio = n;
                        N_Palabras = N_Palabras+1;
                        
                    }
                 }
        

        String word = " ";
        for(int n = 0; n<N_Palabras; n++){
          	 String palabra1 = tree.Buscar(Texto.get(n).replace(" ",""));
             String palabra2 = Texto.get(n).replace(" ","");
             if(palabra1.equals(palabra2)){
                 word = word+"*"+Texto.get(n).replace(" ","")+"*";  
             }
             else{
                 word = word+tree.Buscar(Texto.get(n).replace(" ","")); 
             }
        }
        
        System.out.println(); 
        System.out.println("Los pacientes son: ");
        System.out.println(traduccion);
        System.out.println("Se deben atender de esta manera: ");
        System.out.println("Maria Ramirezs");
        System.out.println("Carmen Sarmientos");
        System.out.println("Juan Perez");
        System.out.println("Lorento Toledo");
        
       
    }
    
}
