package com.company.tasks;

import java.util.Objects;

public class IntegerTask {

    private int ThreeDigitNumber;
    private int FirstPartOfNumber;
    private int SecondPartOfNumber;
    private int ThirdPartOfNumber;

    public IntegerTask(int ThreeDigitNumber) {
        this.ThreeDigitNumber = ThreeDigitNumber;
    }

    public int getThreeDigitNumber() {
        return ThreeDigitNumber;
    }

    public void setThreeDigitNumber(int ThreeDigitNumber) {
        this.ThreeDigitNumber = ThreeDigitNumber;
    }

    public int getFirstPartOfNumber() {
        return FirstPartOfNumber;
    }

    public int getSecondPartOfNumber() {
        return SecondPartOfNumber;
    }

    public int getThirdPartOfNumber() {
        return ThirdPartOfNumber;
    }

    public void calculate() {
        this.FirstPartOfNumber = this.ThreeDigitNumber / 100;
        this.SecondPartOfNumber = this.ThreeDigitNumber % 100 /10;
        this.ThirdPartOfNumber = this.ThreeDigitNumber % 10;
    }

    public int sum() {
        int sum=this.FirstPartOfNumber+this.SecondPartOfNumber+this.ThirdPartOfNumber;
        return sum;
    }

    public int multiplication() {
        int mult=this.FirstPartOfNumber*this.SecondPartOfNumber*this.ThirdPartOfNumber;
        return mult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerTask that = (IntegerTask) o;
        return ThreeDigitNumber == that.ThreeDigitNumber &&
                FirstPartOfNumber == that.FirstPartOfNumber &&
                SecondPartOfNumber == that.SecondPartOfNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ThreeDigitNumber, FirstPartOfNumber, SecondPartOfNumber);
    }

    @Override
    public String toString() {
        return "IntegerMain{" +
                "ThreeDigitNumber=" + ThreeDigitNumber +
                ", FirstPartOfNumber=" + FirstPartOfNumber +
                ", SecondPartOfNumber=" + SecondPartOfNumber +
                ", ThirdPartOfNumber=" + ThirdPartOfNumber +
                '}';
    }
}
