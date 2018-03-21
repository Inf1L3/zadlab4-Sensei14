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
public class Kolo {
    
    private int promien;
  
    
     Scanner odczyt = new Scanner(System.in);
    
    public void setPromien()
    {
        int pr;
        System.out.println("Podaj promien Koła: ");
        pr=odczyt.nextInt();
        this.promien=pr;
    }
    
    
    public double pole()
    {
        double p;
        p=Math.PI*(this.promien*this.promien);
        System.out.println("Promień: "+this.promien);
        System.out.println("Pole: "+p);
        return p;
    }
    
     public double obw()
    {
        double o;
        o=2*Math.PI*this.promien;
        System.out.println("Promień: "+this.promien);
        System.out.println("Pole: "+o);
        return o;
    }
    
    
    
    
}
