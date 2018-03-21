/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.ObliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Kwadrat {
    
  
    private int bok;
   
    
    Scanner odczyt = new Scanner(System.in);
    
    public void setBok()
    {
        int a;
        System.out.println("Podaj długość boku: ");
        a=odczyt.nextInt();
        this.bok = a;
    }
    
    public int pole()
    {
        int p;
        p=this.bok*this.bok;
        System.out.println("Długość boku: "+this.bok);
        System.out.println("Pole: "+p);
        return p;
        
    }
    
    public int obw()
    {
        int o;
        o=this.bok*4;
        System.out.println("Długość boku: "+this.bok);
        System.out.println("Obwód: "+o);
        return o;
    }
    
    
    
}
