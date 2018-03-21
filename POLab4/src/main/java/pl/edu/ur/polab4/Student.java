/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Student {
    
    private String imie;
    private String nazwisko;
    private int nr_indeksu;
    private String nazwaSpecjalnosci;
    private int rok_studiow;
    
    Scanner odczyt = new Scanner(System.in);
    
  
    
    public Student(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    
    public Student(){}
    
    public Student(String imie, String nazwisko, int nr, String spec, int rok)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nr_indeksu=nr;
        this.nazwaSpecjalnosci=spec;
        this.rok_studiow=rok;
        
    }
    
    
     public Student(String imie, String nazwisko, int nr)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nr_indeksu=nr;
    }
    
     
     
     public void pokazDane()
     {
         System.out.println("Imię: "+this.imie);
         System.out.println("Nazwisko: "+this.nazwisko);
         System.out.println("Nr_indeksu: "+this.nr_indeksu);
         System.out.println("Nazwa Specjalnosci: "+this.nazwaSpecjalnosci);
         System.out.println("Rok studiów : "+this.rok_studiow);
     }
     
     
     public void setDane()
     {
        String imie, nazwisko, spec;
        int rok, indeks;
        
         System.out.println("Imie: "); imie=odczyt.nextLine();
         System.out.println("Nazwisko: "); nazwisko=odczyt.nextLine();
         System.out.println("Nr_indeksu: "); indeks=odczyt.nextInt();
         System.out.println("Nazwa Specjalności: "); spec=odczyt.nextLine();
         System.out.println("Rok studiów: "); rok=odczyt.nextInt();
        
        
        
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nr_indeksu=indeks;
        this.nazwaSpecjalnosci=spec;
        this.rok_studiow=rok;
     }
    
}
