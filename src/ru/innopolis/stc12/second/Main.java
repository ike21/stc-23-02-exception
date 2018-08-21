package ru.innopolis.stc12.second;

import ru.innopolis.stc12.second.homework.MathBox;

public class Main {
    public static void main(String[] args) throws Exception {
        MathBox math = new MathBox();
        System.out.println(math.summa(1, 2));
        System.out.println(math.diff(1, 2));
        System.out.println(math.factorial(100000));
        System.out.println(math.dividerExceptionInside(6, 0));
        System.out.println(math.divider(1, 0));
    }
}
