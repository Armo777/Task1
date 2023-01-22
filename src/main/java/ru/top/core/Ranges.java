package ru.top.core;

public class Ranges {
    protected Integer number1;
    protected Integer number2;
    private String lengthRanges;

    public Ranges(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Integer getNumber1() {
        return number1;
    }

    public Integer getNumber2() {
        return number2;
    }
    public Object getLengthRanges() {
        lengthRanges = Integer.toString(number2 - number1);
        if (number1 > number2) {
            return "error";
        }
        else
            return lengthRanges;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public void setLengthRange(String lengthRange) {
        this.lengthRanges = lengthRange;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Диапозон - ").append('\'');
        sb.append("от '").append(number1).append('\'');
        sb.append(" до '").append(number2).append('\'');
        return sb.toString();
    }
}
