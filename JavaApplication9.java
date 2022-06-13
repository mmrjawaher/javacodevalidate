/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author jawaher
 */
import java.util.Scanner;
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n= new String();
        Scanner in= new Scanner(System.in);
        String p= new String();
       
        int kg=0 ;
        double h=0.0;
        int j;
        boolean flag=false;
         System.out.println("enter your name ");
        n=in.nextLine();
        System.out.println("enter your password ");
        p=in.nextLine();
       while(!flag){
         
          if(p.length()>=8 && p.length()<=12  ){
          if (p.charAt(p.length()-1)>=0 && p.charAt(p.length()-1)<=9 && p.charAt(0)>='A' && p.charAt(0)<='Z' || p.charAt(0)>='a' && p.charAt(0)<='z'){
              
              flag=true;}
              System.out.println("Enter your weight(kg) ");
          kg=in.nextInt();
         
          System.out.println("Enter your height (m)");
          h=in.nextDouble();break;}
              
           System.out.println("Invalid password, Enter another password: ");
           p=in.nextLine();
       }
       
        System.out.println("Your BMI = "+(kg/(h*h)));
    }
    
}
