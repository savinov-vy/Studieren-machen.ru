package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        return  super.getDescription()  + " Моя страна - " + Country.BELARUS + ". Я несу "+ this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
 /*   Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen
    должны переопределять метод getDescription родительского класса,
    таким образом, чтобы возвращаемая ими строка имела вид: <getDescription()
        родительского класса> + < Моя страна - Sssss. Я несу N яиц в месяц.>
        где Sssss - название страны, а N - количество яиц в месяц.*/

   /* Описание курицы UkrainianHen должно соответствовать формату "getDescription() " +
        "родительского класса + Моя страна - Ukraine. Я несу N яиц в месяц.",
        где N - число яиц в месяц(возвращаемое методом getCountOfEggsPerMonth.
        Например: Я - курица. Моя страна - Ukraine. Я несу 5 яиц в месяц.*/
 /*  String UKRAINE = "";
    String RUSSIA = "";
    String MOLDOVA = "";
    String BELARUS = "";*/