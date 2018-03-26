/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.ObliczanieFigur.wprowadzDane;

import java.util.Scanner;
import pl.edu.ur.polab4.*;

/**
 *
 * @author Sensei
 */
public class TablicaStudent {

    public Student[] tabStudent = new Student[100];
    Scanner odczyt = new Scanner(System.in);

    
    
    public void create() {
        for (int i = 0; i < 100; i++) {
            this.tabStudent[i] = new Student();
        }
    }

    public void wprowadz() {
        System.out.println("Podaj index studenta do wprowadzenia danych: ");
        int i;
        i = odczyt.nextInt();

        tabStudent[i].setDane();
    }

    public void edit() {
        System.out.println("Podaj index studenta do wprowadzenia nowych danych: ");
        int i;
        i = odczyt.nextInt();

        tabStudent[i].setDane();
    }

    public void del() {
        System.out.println("Podaj index studenta do usunięcia danych: ");
        int i;
        i = odczyt.nextInt();

        tabStudent[i].reset();
    }

    public void show() {
        System.out.println("Podaj index studenta do wyświetlenia danych: ");
        int i;
        i = odczyt.nextInt();

        tabStudent[i].pokazDane();
    }

    public void showAll() {
        for (int i = 0; i < 100; i++) 
        {
            tabStudent[i].pokazDane();
        }
    }
    
    public void showZakres()
    {
        int zd, zg;
        do{
        System.out.println("Podaj dolny zakres: ");
        zd = odczyt.nextInt();
        System.out.println("Podaj górny zakres: ");
        zg = odczyt.nextInt();
        if(zd>=zg) System.out.println("Nieprawidłowy zakres!");
        }while(zd>=zg);
        
        for (int i=zd; i<=zg; i++)
        {
            tabStudent[i].pokazDane();
        }
        
    }
    

}


