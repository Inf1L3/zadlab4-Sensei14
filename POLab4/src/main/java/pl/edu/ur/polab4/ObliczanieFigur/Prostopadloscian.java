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
public class Prostopadloscian {
    
    
     private int a;
     private int b;
     private int c;
    
    
  Scanner odczyt = new Scanner(System.in);
    
    
    public void setBoki()
    {
        
        System.out.println("Podaj pierwszy bok: ");
        this.a=odczyt.nextInt();
        System.out.println("Podaj drugi bok: ");
        this.b=odczyt.nextInt();
        System.out.println("Podaj trzeci bok: ");
        this.c=odczyt.nextInt();
    }
    
    public int pole()
    {
        int p;
        p=2*(this.a*this.b+this.a*this.c+this.b*this.c);
        System.out.println("Boki: \n"+a+"\n"+b);
        System.out.println("Pole: "+p);
        return p;
    }
    
    public int obj()
    {
        int o;
        o=this.a*this.b*this.c;
        System.out.println("Boki: \n"+a+"\n"+b+"\n"+c);
        System.out.println("Objętość: "+o);
        return o;
    }
    
}
