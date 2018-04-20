import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static boolean problema (String s){
   //Obtenemos los substrings de una cadena de 
   // n caracteres hasta n/2 sub cadenas
    String subString;
    boolean res=false;
    int lgt=s.length();
    int nConc=lgt;
    int longSub=1;
    while(!res && longSub<=lgt/2){
      subString=s.substring(0,longSub-1);
      nConc=lgt/(longSub);
      for(int i = 1; i<nConc; i++)
      {
        subString+= subString+subString;
      }
      if(subString.equals(s)) res=true;
      longSub++;
    } 
    return res;
  }
  
  public static void main(String...argsv){
    String s= "asdasdasd";
    System.out.println(problema(s));
    
    String s1= "popopotototpopo";
    System.out.println(problema(s1));
    
    String s2= "gustavogustavo";
    System.out.println(problema(s2));
    
    String s3= "yogiyogiyogi";
    System.out.println(problema(s3));
    
    String s4= "aaaaddddaaaadddd";
    System.out.println(problema(s4));
    
    String s5= "asd";
    System.out.println(problema(s5));
    
    String s6= "aba";
    System.out.println(problema(s6));
    
    String s7= "abiabia";
    System.out.println(problema(s7));
    
    String s8= "poertpoertpoert";
    System.out.println(problema(s8));
    
    String s9= "012301230123";
    System.out.println(problema(s9));
    
    String s10= "popopopopopo";
    System.out.println(problema(s10));
    
    String s11= "porporporpor";
    System.out.println(problema(s11));
    
    String s12= "piewpiwepiew";
    System.out.println(problema(s12));
    
    String s13= "010111010111010111";
    System.out.println(problema(s13));
    
    String s14= "123123123123";
    System.out.println(problema(s14));
    
    String s15= "01020102010201";
    System.out.println(problema(s15));
    
    String s16= "12312312321312";
    System.out.println(problema(s16));
    
    String s17= "a3131313131a13131313131313";
    System.out.println(problema(s17));
    
    String s18= "asiasiasiasiassi";
    System.out.println(problema(s18));
    
    String s19= "asdasdasd2";
    System.out.println(problema(s19));
    
    String s20= "adad";
    System.out.println(problema(s20));
  }
}
