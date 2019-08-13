package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> listChildren = new ArrayList<>();
        Human child1 = new Human(18, false, "Зоя");
        Human child2 = new Human(20, true, "Борис");
        Human child3 = new Human(22, true, "Глеб");
        listChildren.add(child1);
        listChildren.add(child2);
        listChildren.add(child3);
        Human mother = new Human(50, false, "Галя", listChildren);
        Human father = new Human(55, true, "Федя", listChildren);
        Human grandmotherFather = new Human(70, false, "Маша");
        Human grandfatherFather = new Human(75, true, "Егор");

        Human grandmotherMother = new Human(68, false, "Уля");
        Human grandfatherMother = new Human(73, true, "Коля");

        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandmotherFather);
        System.out.println(grandfatherFather);
        System.out.println(grandmotherMother);
        System.out.println(grandfatherMother);
        for (Human child : listChildren) {

            System.out.println(child);
        }


        }



    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(int age, boolean sex, String name) {
            this.age = age;
            this.sex = sex;
            this.name = name;

        }

        public Human(int age, boolean sex, String name, ArrayList<Human> listChildren) {
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.children = listChildren;

        }




        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
