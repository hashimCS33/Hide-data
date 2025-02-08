
package one.time.pad.cipher;

import java.util.Scanner;


public class OneTimePadCipher {

  
    public static void main(String[] args) {
      String alpha= "abcdefghijklmnopqrstuvwxyz"; 
        String plaintext; 
        String key = ""; 
        String ciphertext = ""; 
        int i,j,k; 
         
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Plaintext: "); 
        plaintext = sc.nextLine(); 
        sc.close(); 
 
        //Generate a random key 
        for (i = 0; i < plaintext.length(); i++)  
        { 
            if (plaintext.charAt(i)==' ') 
            { 
                key+=' '; 
                continue; 
            } 
 
            int index=(int)(alpha.length() * Math.random()); 
            key+=alpha.charAt(index); 
        } 
         
        for (i = 0; i<plaintext.length(); i++)  
        { 
            if (plaintext.charAt(i)==' ') 
            { 
                ciphertext+=' '; 
                continue; 
            } 
             
            for (j=0; j<alpha.length(); j++)   
                if (plaintext.charAt(i) == alpha.charAt(j))  
                    break; 
            for (k=0; k<alpha.length(); k++)   
                if (key.charAt(i) == alpha.charAt(k))  
                    break; 
            ciphertext+=alpha.charAt(((j + k) % 26)); 
        } 
        System.out.println("Plaintext  : " + plaintext); 
        System.out.println("Key        : " + key); 
        System.out.println("Ciphertext : " + ciphertext); 
    
    }
    
}
