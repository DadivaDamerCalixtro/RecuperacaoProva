/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author IFSC
 */
public class Exercicio7 extends Farmacia{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Remedio rem = new Remedio();
        Remedio_Gene remG = new Remedio_Gene();
        
        remG.setNome("Omepraszol"+"(Generico)");
        rem.setMarca("Prilosec");
        rem.setValor(40.83);
        rem.setNome("levotiroxina sódica"+"(Generico)");
        rem.setMarca("Levoid");
        rem.setValor(10.38);
        rem.setNome("Aciclovir"+"(Generico)");
        rem.setMarca("Zovirax");
        rem.setValor(7.15);
        remG.setNome("Albendazol"+"(Generico)");
        remG.setValor(15.00);
        remG.setNome("Dopamina"+"(Generico)");
        remG.setValor(29.90);
    }
       
}
