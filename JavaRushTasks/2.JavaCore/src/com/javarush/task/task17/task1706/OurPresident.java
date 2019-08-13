package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    static {
        synchronized (OurPresident.class) {
            OurPresident.president = new OurPresident();
        }
    }

    public static OurPresident getOurPresident() {

        if (president == null) {
            {
            }
        }
        return president;

    }
}
//почитать https://javarush.ru/groups/posts/1994-sinkhronizacija-potokov-operator-synchronized