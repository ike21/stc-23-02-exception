package ru.innopolis.stc12.second.homework;


public class MathBox {

    public int summa(Integer a, Integer b) {
        return a + b;
    }

    public int diff(Integer a, Integer b) {
        return a - b;
    }

    public long factorial(Integer a) {
        if (a == 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public double dividerExceptionInside(Integer a, Integer b) {
        if (b != 0) {
            return a / b;
        }
        return b;
    }

    public double divider(Integer a, Integer b) throws Exception {
        int result;
        try {
            result = a / b;
        } catch (Exception e) {
            throw new DivisionException("Division by zero");
        }
        return result;
    }
}
