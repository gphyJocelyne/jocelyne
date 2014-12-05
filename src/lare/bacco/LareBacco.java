/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lare.bacco;

/**
 *
 * @author JOCELYNE BACCO
 */
public class LareBacco {
   static int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Et toiiiii !!!");
         lapin lap = new lapin("petit lapin tout doux comme un poney", 3);
         while(i <= 10){ 
             lap.crier();
             i = i+1;
         }
         
         
         
    }
    
}
