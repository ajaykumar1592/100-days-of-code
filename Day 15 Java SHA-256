import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws IOException,

NoSuchAlgorithmException{
        
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        
        String str= bufferedReader.readLine();
        
        if(str.matches("[a-zA-z0-9]+")){
            md.update(str.getBytes());
             byte[] digest = md.digest();

            for (byte b : digest) {
            System.out.format("%02x", b);
            }
       }      
  }
}
