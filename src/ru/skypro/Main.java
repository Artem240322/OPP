package ru.skypro;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main (String[] args) {

        HogwartsStudent harry = new GriffindorSudent("Гарри Потер", generate(), generate(), generate(), generate(), generate());
        HogwartsStudent ron = new GriffindorSudent("Рон Уизли", generate(), generate(), generate(), generate(), generate());
        HogwartsStudent luna = new RavenclawStudent("Палувна Лавгуд", generate(), generate(), generate(), generate(), generate());
        HogwartsStudent draco = new SlytherinStudent("Драко Малфлой", generate(), generate(), generate(), generate(), generate());
        HogwartsStudent sedric = new HufflepuffStudent("Седрик Диггори", generate(), generate(), generate(), generate(), generate());

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(luna);
        System.out.println(draco);
        System.out.println(sedric);

        harry.compareTo(draco);
        harry.compareTo(ron);
    }

    private static int generate() {
        return RANDOM.nextInt(100);
    }

}
