package pl.kurs.homework2.model;
import java.io.Serializable;

public class Object3D implements Serializable {
    private int a;
    private int b;
    private int c;

    public Object3D(){
    }

    public Object3D(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void printInfo(){
        System.out.println(a + "/" + b + "/" + c);
    }


    }



