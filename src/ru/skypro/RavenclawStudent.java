package ru.skypro;

public class RavenclawStudent extends HogwartsStudent{
    private int cleverness;
    private int wisdom;
    private int win;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int cleverness, int wisdom, int win) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.win = win;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
       this.creativity = creativity;
    }


    public int ability() {
        return cleverness + wisdom + win + creativity;
    }

    @Override
    public String toString() {
        return String.format("%s; Ум: %d; мудрость: %d; сообразительность: %d; творчество: %d", super.toString(), cleverness, wisdom, win, creativity);

    }
}
