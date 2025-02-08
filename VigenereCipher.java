
package vigenere.cipher;

import java.util.Scanner;


public class VigenereCipher {

   
    public static void main(String[] args) {
    String alpha= "abcdefghijklmnopqrstuvwxyz"; 
        String plaintext; 
        String key; 
        int i,j,k,key_index=0; 
        String ciphertext = ""; 
         
     Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Plaintext: "); 
        plaintext = sc.nextLine(); 
        System.out.println("Enter the key: "); 
        key = sc.next(); 
        sc.close(); 
         
        for (i=0; i<plaintext.length(); i++)  
        { 
            if (plaintext.charAt(i)==' '){ 
                ciphertext+=' '; 
                continue; 
            } 
             
            for (j=0; j<alpha.length(); j++)   
                if (plaintext.charAt(i) == alpha.charAt(j))  
                    break; 
             
            for (k=0; k<alpha.length(); k++)   
                if (key.charAt(key_index) == alpha.charAt(k))  
                    break; 
 
            ciphertext+=alpha.charAt(((j + k) % 26)); 
             
        if (key_index==key.length()-1) 
            key_index=0; 
        else 
            key_index++; 
        } 
         
        System.out.println("Plaintext  : " + plaintext); 
        System.out.println("Ciphertext : " + ciphertext); 
    
    }
    
}
