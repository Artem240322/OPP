package ru.skypro;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main (String[] args) {

        HogwartsStudent harry;
        harry = GriffindorSudent("Гарри Потер", generate(), generate(), generate(), generate(), generate());
        HogwartsStudent ron = GriffindorSudent("Рон Уизли", generate(), generate(), generate(), generate(), generate());
        HogwartsStudent luna = RavenclawStudent("Палувна Лавгуд", generate(), generate(), generate(), generate(), generate());
        HogwartsStudent draco = SlytherinStudent("Драко Малфлой", generate(), generate(), generate(), generate(), generate());
        HogwartsStudent sedric = HufflepuffStudent("Седрик Диггори", generate(), generate(), generate(), generate(), generate());

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(luna);
        System.out.println(draco);
        System.out.println(sedric);

        harry.compareTo(draco);
        harry.compareTo(ron);
    }

    private static int generat() {
        return RANDOM.nextInt(100);
    }
}
