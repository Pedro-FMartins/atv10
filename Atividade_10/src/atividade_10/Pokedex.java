/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_10;

/**
 *
 * @author Pedro Ferreira Martins <'11201100435'>
 * @author Raphael Ninomiya <'1121110998'>
 */
public class Pokedex {

    public static void main(String[] args) {
     
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Flareon f = new Flareon();
        Vaporeon v = new Vaporeon();
        Umbreon u = new Umbreon();
        Leafeon l = new Leafeon();
        Sylveon s = new Sylveon();
        Glaceon g = new Glaceon();
        Espeon es = new Espeon();
        
        // Eevee:
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial() + "\n");
        
        // Vaporeon:
        e = v;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial() + "\n");
        
        // Jolteon:
        e = j;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial() + "\n");
        
        // Leafeon:
        e = l;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial() + "\n");
        
        // Sylveon:
        e = s;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial() + "\n");
        
        // Glaceon:
        e = g;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial() + "\n");
        
        //Espeon:
        e = es;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());
    }
}
