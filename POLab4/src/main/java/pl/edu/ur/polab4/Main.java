package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.ObliczanieFigur.*;
import pl.edu.ur.polab4.ObliczanieFigur.wprowadzDane.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5

        Scanner odczyt = new Scanner(System.in);
        //Zad 2
//       Student s1= new Student("Jan", "Kowalski", 1,"Informatyka",1);
//       Student s2= new Student();
//       Student s3= new Student("Adam", "Nowak", 3);
//       Student s4= new Student("Jan", "Król");
//        
//        
//       s1.pokazDane();
//       s2.pokazDane();
//       s3.pokazDane();
//       s4.pokazDane();

        //Zad3
//       Student s5=new Student();
//        
//        s5.setDane();
//        s5.pokazDane();
//ZADANIE 4
//        int figura;
//        boolean f = true;
//        while (f) {
//            System.out.println("Wybierz figurę.");
//            System.out.println("1 - Koło");
//            System.out.println("2 - Kwadrat");
//            System.out.println("3 - Prostokąt");
//            System.out.println("4 - Sześcian");
//            System.out.println("5 - Stożek");
//            System.out.println("6 - Kula");
//            System.out.println("7 - Prostopadłościan");
//            System.out.println("0 - Zakończ program \n");
//            figura = odczyt.nextInt();
//
//            switch (figura) {
//                case 0:
//                    System.out.println("Program zostanie wyłączony.");
//                    f = false;
//                    break;
//                case 1:
//                    Kolo k = new Kolo();
//                    k.setPromien();
//                    k.pole();
//                    k.obw();
//                    break;
//                case 2:
//                    Kwadrat a = new Kwadrat();
//                    a.setBok();
//                    a.pole();
//                    a.obw();
//                    break;
//                case 3:
//                    Prostokąt b = new Prostokąt();
//                    b.setBoki();
//                    b.pole();
//                    b.obwod();
//                    break;
//                case 4:
//                    Szescian c = new Szescian();
//                    c.setBok();
//                    c.pole();
//                    c.obj();
//                    break;
//                case 5:
//                    Stozek d = new Stozek();
//                    d.setPromien();
//                    d.obw();
//                    d.pole();
//                    break;
//                case 6:
//                    Kula e = new Kula();
//                    e.setPromien();
//                    e.pole();
//                    e.obj();
//                    break;
//                case 7:
//                    Prostopadloscian g = new Prostopadloscian();
//                    g.setBoki();
//                    g.pole();
//                    g.obj();
//                    break;
//                default:
//                    System.out.println("Wybrałeś złą opcję.");
//
//            }
//        }



// ZADANIE 5

//        TablicaStudent tab1 = new TablicaStudent();
//        tab1.create();
//        
//        boolean st = true;
//
//        while (st) {
//            int q;
//            System.out.println("Wybierz opcję: ");
//            System.out.println("1 - Wprowadź dane studenta");
//            System.out.println("2 - Modyfkuj dane studenta ");
//            System.out.println("3 - Usuń dane studenta ");
//            System.out.println("4 - Wyświetl dane studenta");
//            System.out.println("5 - Wyświetl dane wszystkich studentów");
//            System.out.println("6 - Wyświetl dane studentów z zakresu");
//            System.out.println("0 - Zakończ program.");
//            q = odczyt.nextInt();
//            switch (q)
//            {
//                case 0 : System.out.println("Koniec programu."); st = false; break;
//                case 1 : tab1.wprowadz(); break;
//                case 2 : tab1.wprowadz(); break;
//                case 3 : tab1.del(); break;
//                case 4 : tab1.show(); break;
//                case 5 : tab1.showAll(); break;
//                case 6 : tab1.showZakres(); break;
//                default : System.out.println("Podałeś złą opcję!"); break;
//            }
//            
//        }


           
    }

}
