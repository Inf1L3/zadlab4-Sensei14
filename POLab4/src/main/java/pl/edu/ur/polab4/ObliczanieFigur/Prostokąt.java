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
public class Prostokąt {
    
    private int a;
    private int b;
    
    
  Scanner odczyt = new Scanner(System.in);
    
    
    public void setBoki()
    {
        
        System.out.println("Podaj pierwszy bok: ");
        this.a=odczyt.nextInt();
        System.out.println("Podaj drugi bok: ");
        this.b=odczyt.nextInt();
    }
    
    public int pole()
    {
        int p;
        p=this.a*this.b;
        System.out.println("Boki: \n"+a+"\n"+b);
        System.out.println("Pole: "+p);
        return p;
    }
    
    public int obwod()
    {
        int o;
        o=2*this.a+(2*this.b);
        System.out.println("Boki: \n"+a+"\n"+b);
        System.out.println("Obwód: "+o);
        return o;
    }
    
}
