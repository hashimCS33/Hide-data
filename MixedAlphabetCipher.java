
package mixed.alphabet.cipher;


public class MixedAlphabetCipher {

   
    public static void main(String[] args) {
         String plaintext = "attack"; 
        String key = "information"; 
        String alpha= "abcdefghijklmnopqrstuvwxyz"; 
        char[] cipher= new char[alpha.length()]; 
        StringBuffer ciphertext = new StringBuffer(); 
        int c=0,i,j,index = 0;  
         
        key = key + alpha;   
 
        for (i=0; i<key.length(); i++)  
        {  
            for (j=0; j<i; j++)   
                if (key.charAt(i) == key.charAt(j))  
                    break;  
 
            if (j == i)  
                cipher[index++] = key.charAt(i);  
        } 
         
        System.out.println(alpha);   
        System.out.println(cipher); 
         
        index=0;   
        for (i=0; i<plaintext.length(); i++) {  
            if (plaintext.charAt(i)==' ') 
            { 
                ciphertext.append(' '); 
            } 
            else 
            {    
            for (j=0; j<alpha.length(); j++)   
                if (plaintext.charAt(i) == alpha.charAt(j))  
                    break;   
         
            ciphertext.append(cipher[j]);                
        } 
            } 
         
        System.out.println("Plaintext  : " + plaintext); 
        System.out.println("Ciphertext : " + ciphertext); 
    } 

    
}
