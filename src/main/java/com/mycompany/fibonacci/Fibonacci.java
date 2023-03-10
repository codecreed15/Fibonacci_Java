package com.mycompany.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner L=new Scanner(System.in);
        
        int a, r;
        System.out.println("Ingresa el tamaño de la serie");
        a=L.nextInt();
        
        
        //valor anterior y valor actual
        int an=0, ac=0;
        System.out.println("----------Serie de Fibonacci-----------\n");
        
        for (int i = 1; i < a; i++) {
            
            if(i<=1){
             //Le asigna el indice 1 a los dos para ue oomience de esta manera:
             // 1,1
             ac=i;
             an=i;
             System.out.print(an+","+ac);
            }
            else if(i>1){
                //Suma el anterior más el actual y se va haciendo la suceción así
                //1,1,2,3........
                r=an + ac;
                System.out.print(","+r);
                
                //le asigna el valor actual al anterior y al actual el resultado
                an=ac;
                ac=r;
            }
            
        }
    }
}
