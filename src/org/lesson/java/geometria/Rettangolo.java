package org.lesson.java.geometria;

public class Rettangolo {

    // ATTRIBUTI
    int base ;
    int height ;

    // COSTRUTTORI

    Rettangolo(int base, int height){
        this.base = base;
        this.height = height;
    }

    // METODI

    int getPerimeter (){
        int  perimeter = (base * 2) + (height * 2);
        return perimeter;
    }

    int getArea (){
        int area = base * height;
        return area;
    }

    String getData (){
        String info = "Il perimetro è: " + getPerimeter() + ", mentre l'area è: " + getArea();
        return info;
    }

    String disegna (){
        String nuovoDisegno = new String();
        for (int i = 1; i <= base; i++) {
            System.out.print("0");
        }
        System.out.println();
        for (int x = 1; x <= height - 2; x++) {
            System.out.print("0");
            for (int i = 1; i <= base - 2; i++) {
                System.out.print(" ");
            }
            System.out.println("0");
        }
        for (int i = 1; i <= base; i++) {
            System.out.print("0");
        }
        return nuovoDisegno;

    }

}
