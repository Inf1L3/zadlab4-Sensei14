/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.ObliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Sensei
 */
public class Kula {
    
    private int promien;
  
    
     Scanner odczyt = new Scanner(System.in);
    
    public void setPromien()
    {
        int pr;
        System.out.println("Podaj promien Kuli: ");
        pr=odczyt.nextInt();
        this.promien=pr;
    }
    
    
    public double pole()
    {
        double p;
        p=4*(Math.PI*(this.promien*this.promien));
        System.out.println("Promień: "+this.promien);
        System.out.println("Pole: "+p);
        return p;
    }
    
     public double obj()
    {
        double o;
        o=(4/3)*Math.PI*Math.pow(this.promien, 3);
        System.out.println("Promień: "+this.promien);
        System.out.println("Objętość: "+o);
        return o;
    }
    
}
