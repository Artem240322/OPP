package ru.skypro;

public abstract class HogwartsStudent {
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void print() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return String.format("Студент: %s; Сила магии: %d; Сила трансгрессии: %d", name, magic, transgression);
    }

}
