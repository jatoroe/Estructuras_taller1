/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorizame;
import java.util.*;

public class Memorizame
{

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
              
        //Logica.
        System.out.println("Por favor ingrese el tamaño de la serie.");
        int N = sc.nextInt();
        int[] w= new int[N];        
        for (int i = 0; i < N; i++)
        {
            System.out.println("Por favor ingrese el numero " + (i+1));
            int lecN = sc.nextInt();
            w[i]=lecN;
        }       
       
        System.out.println("Cantidad de numeros a comparar");        
        int Q = sc.nextInt();
        int[] num_times = new int[Q];
        int counter = 0;
        for (int i = 0; i < Q; i++)
        {
            System.out.println("Por favor ingrese el valor numero " + (i+1)
                    +" a comparar " );
            int comparar = sc.nextInt();
            for (int j = 0; j < N; j++) 
            {
                if (comparar == w[j])
                {
                  counter++;  
                }
            }
            num_times[i] = counter;
            counter = 0;
            
        }
        System.out.println("\n\nLacantidad de veces que se presentan los numeros"
                + "en la serie son");        
        for (int i = 0; i < Q; i++) 
        {
            if (num_times[i]==0)
            {
                System.out.println("NOT PRESENT");
            } else 
            {
             System.out.println(num_times[i]);
            }
        }
       
        
    }
    
}
