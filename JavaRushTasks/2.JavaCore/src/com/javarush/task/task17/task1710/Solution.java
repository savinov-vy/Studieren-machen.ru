package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("d/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case ("-c"):
                Date inputDateC = dateFormat.parse(args[3]);
                Person hum = null;
                if (args[2].equals("м")) {
                    hum = Person.createMale(args[1], inputDateC);
                    allPeople.add(hum);
                   // System.out.print(allPeople.indexOf(Person.createMale(args[1], inputDateC)));
                    System.out.println(allPeople.size() - 1);
                } else if (args[2].equals("ж")) {

                    hum = Person.createFemale(args[1], inputDateC);
                    allPeople.add(hum);
                    System.out.println(allPeople.size() - 1);
                  //  System.out.print(allPeople.indexOf(Person.createFemale(args[1], inputDateC)));
                }
                break;
            case ("-u"):
                Date inputDateU = dateFormat.parse(args[4]);
                if (args[3].equals("м")) {
                    allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], inputDateU));

                } else if (args[3].equals("ж")) {
                    allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], inputDateU));
                }
                break;
            case ("-d"):
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setSex(null);
                person.setName(null);
                person.setBirthDate(null);
                //
                break;
            case ("-i"):
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person.getSex().equals(Sex.MALE))
                System.out.println(person.getName() + " м " + dateFormatOut.format(person.getBirthDate())); //http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html
                else if (person.getSex().equals(Sex.FEMALE))
                System.out.println(person.getName() + " ж " + dateFormatOut.format(person.getBirthDate())); //http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html
                break;
        }
    }
}
