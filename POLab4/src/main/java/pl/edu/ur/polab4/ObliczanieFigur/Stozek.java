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
public class Stozek {
    
    private int promien;
    private int t;
    private int h;
    
    
    Scanner odczyt = new Scanner(System.in);
    
    public void setPromien()
    {
        int pr;
        System.out.println("Podaj promien Stożka: ");
        pr=odczyt.nextInt();
        this.promien=pr;
        int l;
        System.out.println("Podaj tworzącą stożka: ");
        l=odczyt.nextInt();
        this.t=l;
        int wys;
        System.out.println("Podaj wysokość stożka: ");
        wys=odczyt.nextInt();
        this.h=wys;
    }
    
    
    public double pole()
    {
        double p;
        p=(Math.PI*(this.promien*this.promien))+(Math.PI*this.promien*this.t);
        System.out.println("Promień: "+this.promien+"\n Tworząca stożka:"+this.t);
        System.out.println("Pole: "+p);
        return p;
    }
    
     public double obw()
    {
        double o;
        o=(Math.PI*(this.promien*this.promien)*this.h)/3;
        System.out.println("Promień: "+this.promien+"\n Tworząca stożka:"+this.t);
        System.out.println("Objętość: "+o);
        return o;
    }
}
