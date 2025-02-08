
package caesar2.cipher.technique;


public class Caesar2CipherTechnique {

  
    public static void main(String[] args) {
       String plaintext = "attack"; 
        String alpha= "abcdefghijklmnopqrstuvwxyz"; 
        StringBuffer ciphertext = new StringBuffer(); 
        int key = 3; 
        char ch = 0; 
 
        for (int i=0; i<plaintext.length(); i++)  
        { 
            for (int j=0; j<alpha.length(); j++)  
                if (plaintext.charAt(i)==alpha.charAt(j)) 
                { 
                    ch = (char) alpha.charAt((j + key) % 26); 
                    break; 
                } 
        ciphertext.append(ch); 
        } 
             
        System.out.println("Plaintext  : " + plaintext); 
        System.out.println("Key        : " + key); 
        System.out.println("Ciphertext : " + ciphertext); 
    
    }
    
}
