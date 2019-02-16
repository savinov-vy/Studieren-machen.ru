package com.javarush.task.task07.task0724;

/* 
Семейная перепись

*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandmotherM = new Human("Катя", false, 70);
        Human grandmotherF = new Human("Маша", false, 73);
        Human grandfatherM = new Human("Петя", true, 75);
        Human grandfatherF = new Human("Гриша", true, 74);
        Human father = new Human("Паша", true, 55, grandfatherF, grandmotherF);
        Human mother = new Human("Галя", false, 52, grandfatherM, grandmotherM);
        Human child1 = new Human("Коля", true, 25, father, mother);
        Human child2 = new Human("Настя", false, 27, father, mother);
        Human child3 = new Human("Максим", true, 29, father, mother);
        System.out.println(grandfatherF);
        System.out.println(grandmotherF);
        System.out.println(grandfatherM);
        System.out.println(grandmotherM);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        public Human father, mother;


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}