package com.company.tasks;

public class WhileTask {

    private int N;

    public WhileTask(int n) {
        N = n;
    }

    public int calculate() {
        int K=0, temp=1;
        while ((temp+K)<N) {
            K++;
            temp+=K;
        }
        return K;
    }
}

