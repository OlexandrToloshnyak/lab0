package com.company.tasks;

public class BooleanTask {
    private int A;
    private int B;

    public BooleanTask() {
        this.A=2;
        this.B=2;
    }

    public BooleanTask(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public boolean check() {
        return this.A % 2 == this.B % 2;

    }
}