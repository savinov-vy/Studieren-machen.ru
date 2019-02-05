package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);


        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName, catGrandfather);


        String motherName = reader.readLine();
        Cat catMother = new Cat(catGrandmother, motherName);


        System.out.println(catDad);
        System.out.println(catMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catDad);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catDad);

        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;

        private Cat parentM;
        private Cat parentD;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentD) {
            this.name = name;
            this.parentD = parentD;
        }

        Cat(Cat parentM, String name) {
            this.name = name;
            this.parentM = parentM;
        }

        Cat(String name, Cat parentM, Cat parentD) {
            this.name = name;
            this.parentM = parentM;
            this.parentD = parentD;

        }

        @Override
        public String toString() {
            if (parentM == null && parentD == null) return "The cat's name is " + name + ", no mother, no father";
            else if ((parentM == null) && (parentD != null))
                return "The cat's name is " + name + ", no mother, father is " + parentD.name;
            else if ((parentM != null) && (parentD == null))
                return "The cat's name is " + name + ", mother is " + parentM.name + ", no father";
            else if ((parentM != null) && (parentD != null))
                return ("The cat's name is " + name + ", mother is " + parentM.name + ", father is " + parentD.name);
            else return " ";


        }
    }

}
