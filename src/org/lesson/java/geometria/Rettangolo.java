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

}
