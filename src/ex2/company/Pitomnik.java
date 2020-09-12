package ex2.company;

import java.util.Scanner;

public class Pitomnik {
    static class ObjMass {
        static Dog[] abc = new Dog [3];

        public static void main (String[] args){
            abc[0] = new Dog("Billy",3);
            abc[1] = new Dog("Tom",5);
            abc[2] = new Dog("Jonny",10);

            for (int i = 0; i<3; i++){
                System.out.println(abc[i]);
            }
        }
    }
}
