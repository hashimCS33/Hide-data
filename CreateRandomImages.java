
package create.random.images;

import java.util.Scanner;

public class CreateRandomImages {

   
    public static void main(String[] args) throws IOException {
       String alpha= "abcdefghijklmnopqrstuvwxyz"; 
        String plaintext; 
        String binaryplaintext = ""; 
        String key; 
        String binarykey = ""; 
        String ciphertext = ""; 
        int i,j,k,key_index=0; 
         
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Plaintext: "); 
        plaintext = sc.nextLine(); 
        System.out.println("Enter the key: "); 
        key = sc.next(); 
        sc.close(); 
         
        for (i=0; i<plaintext.length(); i++)  
        { 
            if (plaintext.charAt(i)==' '){ 
                binaryplaintext+=' '; 
                continue; 
            } 
        binaryplaintext += Integer.toBinaryString( (int) plaintext.charAt(i)); 
        } 
         
        System.out.println("Plaintext  : " + plaintext); 
        System.out.println("Ciphertext : " + binaryplaintext); 
    
    
    
    }

    }
    

