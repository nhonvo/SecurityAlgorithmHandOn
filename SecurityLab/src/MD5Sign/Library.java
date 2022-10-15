package MD5Sign;

import java.math.BigInteger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author truongnhons
 */


public class Library {
    static class Keys{
        BigInteger n= new BigInteger("9617");
        BigInteger d= new BigInteger("3869");
        BigInteger e= new BigInteger("17");
    }
    String encode(String message){
        byte[] textChars = message.getBytes();
        String temp ="";
        String encodedMsg="";
        
        for (int i=0; i<message.length(); i++){
            //textChars[i]-''
            temp = String.valueOf(textChars[i]);
            if (temp.length()<2)temp= "0" +temp;
            encodedMsg +=temp;
        }
        return encodedMsg;
    }//end encode
    String decode (String encodedMsg){
        String tempString="";
        String decodedTextString="";
        for (int i=0; i<encodedMsg.length();i+=2){
            tempString=encodedMsg.substring(i,i+2);
            int val = Integer.parseInt(tempString)+32;
            decodedTextString+=String.valueOf((char)val);
        }
        return decodedTextString;
    }
    String doRSA(String inputString, BigInteger exp, BigInteger n,int blockSize){
        try {
            BigInteger block;
            BigInteger output;
            String temp ="";
            String outputString ="";
            for (int i=0; i<inputString.length(); i+=blockSize){
                temp = inputString.substring(i,i+blockSize);
                block = new BigInteger(temp);
                output = block.modPow(exp, n);
                temp = output.toString();
                while(temp.length()< blockSize){
                    temp ="0" +temp;
                }
                outputString +=temp;
            }
            return outputString;
        } catch (Exception e) {
            e.printStackTrace(); return "loi";
        }    
    }
}
