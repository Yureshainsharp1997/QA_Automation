package org.example;


import javaSample.Animal;
import javaSample.Bird;
import javaSample.SubClassB;
import javaSample.Sum;

public class Main {


    public static void main(String[] args) {
        /*
        SubClassB b = new SubClassB();
        b.bar();
        b.foo();


        Sum s=new Sum();
        System.out.println(s.sum(x:10, y:20));
        System.out.println(s.sum(x:10.5, y:20.5));
*/
        Animal myAnimal=new Animal();
        //myAnimal.eat();
        Animal myBird=new Bird();
        myBird.eat();
        }
    }
