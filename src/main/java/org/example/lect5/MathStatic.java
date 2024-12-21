package org.example.lect5;

public class MathStatic {
    public static String nameStatic;
    public static void setNameStatic(String nameStatic) {
        MathStatic.nameStatic = nameStatic;
    }
    public static String getNameStatic() {
        return nameStatic;
    }
    public String nameNonStatic;

    public String getNameNonStatic() {
        return nameNonStatic;
    }
    public void setNameNonStatic(String nameNonStatic) {
        this.nameNonStatic = nameNonStatic;
    }

    public static void main(String[] args) {
        nameStatic = "Adam";
        setNameStatic("Anna");
        System.out.println(getNameStatic());

        MathStatic mathStatic1 = new MathStatic();
        MathStatic mathStatic2 = new MathStatic();

        mathStatic1.setNameNonStatic("Jan1");
        mathStatic2.setNameNonStatic("Jan2");
        System.out.println(mathStatic1.getNameNonStatic());
        System.out.println(mathStatic2.getNameNonStatic());

        System.out.println("Liczba PI= " + Math.PI);

    }
}
