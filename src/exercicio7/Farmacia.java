/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author IFSC
 */
public class Farmacia {
    Scanner entrada = new Scanner(System.in);
    public int Total;
    public int qtdRemedios;
    public void Compra(){
        
        System.out.println("Digite quantos remédios gostaria de comprar: ");
        qtdRemedios = entrada.nextInt();
        int tipoRemedios[];
        tipoRemedios = new int[5];
        
        for(int x=0;x<qtdRemedios;x++){
            int i = 0;
            switch (tipoRemedios[x]) {
               case 1:
                   System.out.println("----------Genéricos-----------");
                   System.out.println("Albendazol");
                   System.out.println("Dopamina");
                   System.out.println("Omeprazol");
               break;    
               case 2:
                   System.out.println("------Remédios de Marca------");
                   System.out.println("Prilosec");
                   System.out.println("Levoid"); 
                   System.out.println("Zovirax");
                   
               break;    
               default:  
               
            }
            tipoRemedios[x] = entrada.nextInt(); 
            System.out.println("Quais remedios você deseja comprar? ");
        }
        }
           }
