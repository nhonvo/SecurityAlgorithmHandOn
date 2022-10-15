/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.random;
import java.math.BigInteger;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class RSA_Class {
   int primSIze;
   BigInteger p,q;
   BigInteger N;
   BigInteger r;
   BigInteger E,D;
   public RSA_Class() {
       
   }
   public RSA_Class(int primSIze) {
       this.primSIze =primSIze;
       generatePrimeNumbers() ;
       generatePublicPrivatekeys() ;
   }
   
   Random random = new Random();
   public void generatePrimeNumbers(){
       p=BigInteger.probablePrime(primSIze/2, random);
       do{
           q=BigInteger.probablePrime(primSIze/2, random);
       }while(q.compareTo(p)==0);
   }
   public void generatePublicPrivatekeys(){
       N=p.multiply(q);
       
       r=p.subtract(BigInteger.valueOf(1));
       r=r.multiply(q.subtract(BigInteger.valueOf(1)));
       
       do{
           E=new BigInteger(2*primSIze,new Random());
       }while((E.compareTo(r)!=1)||(E.gcd(r).compareTo(BigInteger.valueOf(1))!=0));
       
       D=E.modInverse(r);
   }
   public BigInteger[] encrypt(String message){
       int i;
       byte[] temp = new byte[1];
       byte[] digits = message.getBytes();
       BigInteger[] bigdigits = new BigInteger[digits.length];
       for (int j = 0; j < bigdigits.length; j++) {
           temp[0] =digits[j];
           bigdigits[j] = new BigInteger(temp);
       }
       BigInteger[] encrypted = new BigInteger[bigdigits.length];
       for (int j = 0; j < bigdigits.length; j++) {
           
           encrypted[j] = bigdigits[j].modPow(E, N);
       }
       return (encrypted);
   }
   public BigInteger[] encrypt(String message,BigInteger userD,BigInteger userN){
       int i;
       byte[] temp = new byte[1];
       byte[] digits = message.getBytes();
       BigInteger[] bigdigits = new BigInteger[digits.length];
       for (int j = 0; j < bigdigits.length; j++) {
           temp[0] =digits[j];
           bigdigits[j] = new BigInteger(temp);
       }
       BigInteger[] encrypted = new BigInteger[bigdigits.length];
       for (int j = 0; j < bigdigits.length; j++) {
           
           encrypted[j] = bigdigits[j].modPow(userD, userN);
       }
       return (encrypted);
   }
   public String decrypt(BigInteger[] encrypted,BigInteger D,BigInteger N){
       int i;
       
       BigInteger[] decrpyted = new BigInteger[encrypted.length];
       for (int j = 0; j < decrpyted.length; j++) {
           
           decrpyted[j] = encrypted[j].modPow(D, N);
       }
       
       char[] charArr = new char[decrpyted.length];
       for (int j = 0; j < charArr.length; j++) {
           charArr[j] = (char) (decrpyted[j].intValue());
       }
       return (new String (charArr));
   }
   
    public BigInteger getP(){
        return (p);
    }
    public BigInteger getQ(){
        return (q);
    }
    public BigInteger getR(){
        return (r);
    }
    public BigInteger getN(){
        return (N);
    }
    public BigInteger getE(){
        return (E);
    }
    public BigInteger getD(){
        return (D);
    }
    
    public static void main(String[] args) throws IOException {
        int primeSize=8;
        RSA_Class rsa= new RSA_Class(primeSize);
        System.out.println("Key Size: ["+primeSize+"]");
        System.out.println("");
        
        System.out.println("Generate prime numbers p and q");
        System.out.println("p: ["+rsa.getP().toString(16).toUpperCase()+"]");
        System.out.println("q: ["+rsa.getQ().toString(16).toUpperCase()+"]");
        System.out.println("");
        
        System.out.println("The public key is the pair (N,E) which will be published");
        System.out.println("N: ["+rsa.getN().toString(16).toUpperCase()+"]");
        System.out.println("E: ["+rsa.getE().toString(16).toUpperCase()+"]");
        System.out.println("");
        
        System.out.println("The private key is the pair (N,D) which will be private");
        System.out.println("N: ["+rsa.getN().toString(16).toUpperCase()+"]");
        System.out.println("D: ["+rsa.getD().toString(16).toUpperCase()+"]");
        System.out.println("");
        
        
        
        System.out.println("Nhap noi dung can ma hoa' : ");
        
        String plaintext = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        System.out.println(" ");
        
        BigInteger[] ciphertext = rsa.encrypt(plaintext);
        System.out.println("Cipher: [");
        for (int i = 0; i < ciphertext.length; i++) {
            System.out.println(ciphertext[i].toString(16).toUpperCase());
            if(i!=ciphertext.length-1){
                System.out.println(" ");
            }
        }
        System.out.println("]");
        System.out.println("");
        RSA_Class rsa1=new RSA_Class(8);
        
        
        String recoveredPlaintext = rsa1.decrypt(ciphertext, rsa.getD(), rsa.getN());
        System.out.println("Recovered plaintext: ["+recoveredPlaintext+"]");
        
        
        
    }
}
