package com.company.tasks;

public class IfTask {

    private int firstNumber;

    private int secondNumber;

    public IfTask(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int maxvalue() {
        if (this.firstNumber > this.secondNumber) {
            return this.firstNumber;
        }
        return this.secondNumber;
    }

    public void comparison() {
        if (this.firstNumber == this.secondNumber) {
            this.firstNumber=0;
            this.secondNumber=0;
        }
        else {
            int max=this.maxvalue();
            this.firstNumber=max;
            this.secondNumber=max;
        }
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
