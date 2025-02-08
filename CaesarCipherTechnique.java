
package caesar.cipher.technique;


public class CaesarCipherTechnique {
public static StringBuffer encrypt(String text, int s){  
    StringBuffer result= new StringBuffer(); 
    char ch; 
    for (int i=0; i<text.length(); i++)  
    { 
        if (text.charAt(i)==' ') 
        { 
            result.append(' '); 
            continue; 
        } 
        if (Character.isUpperCase(text.charAt(i))) 
            ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);  
        else 
            ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);  
        result.append(ch); 
    } 
    return result; 
} 
    
    public static void main(String[] args) {
 String text = "ahen julius caesar sent messages to his generals he did not trust his messengers"; 
int key = 3; 
System.out.println("Plaintext : " + text);  
System.out.println("Key : " + key);  
System.out.println("Ciphertext : " + encrypt(text, key));  
}
    }
    

