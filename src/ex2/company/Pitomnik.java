package ex2.company;

import java.util.Scanner;

public class Pitomnik {
        int i = 0;
        Dog[] dogs = new Dog[6];
        public void addDog(Dog dog) {
            dogs[i] = dog;
            i++;
        }
        public Dog[] list()
        {
            return dogs;
        }
    }

