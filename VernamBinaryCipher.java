
package vernam.binary.cipher;

public class VernamBinaryCipher {

  
    public static void main(String[] args) {
     String p = "attack"; 
        String key = "attac"; 
        String cypher = ""; 
 
        int j = 0; 
        for(int i= 0 ; i < p.length() ; i++){ 
 
            int bp = Integer.valueOf(Integer.toBinaryString(p.charAt(i)), 2); 
            int bk = Integer.valueOf(Integer.toBinaryString(key.charAt(j)), 2); 
 
            int c = bp^bk; //to perform XOR 
            cypher += Integer.toBinaryString(c); 
             
            if(j == key.length()-1){ 
                j = 0; 
            } 
 
        } 
        System.out.println(cypher); 
    } 
} 
 
 
  
