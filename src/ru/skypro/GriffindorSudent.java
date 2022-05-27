package ru.skypro;

public class GriffindorSudent extends HogwartsStudent{

    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorSudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public int ability() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return String.format("%s; Благородство: %d; Честность: %d; Храбрость: %d", super.toString(), nobility, honor, bravery);

    }
}

