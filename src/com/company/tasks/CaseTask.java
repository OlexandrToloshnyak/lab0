package com.company.tasks;

public class CaseTask {

    private char C;
    private int N1;
    private int N2;

    public CaseTask(char c,int n1,int n2) {
        C = c;
        N1 = n1;
        N2 = n2;
    }

    public void calculate() {
        switch (C) {
            case 'С':
                switch (N1+N2) {
                    case -1:
                    case 3:
                        C='В';
                        break;
                    case 1:
                        C='З';
                        break;
                    case -2:
                    case 2:
                        C='Ю';
                        break;
                }
                break;
            case 'В':
                switch (N1+N2) {
                    case -1:
                    case 3:
                        C='Ю';
                        break;
                    case 1:
                        C='С';
                        break;
                    case -2:
                    case 2:
                        C='З';
                        break;
                }
                break;
            case 'Ю':
                switch (N1+N2) {
                    case -1:
                    case 3:
                        C='З';
                        break;
                    case 1:
                        C='В';
                        break;
                    case -2:
                    case 2:
                        C='С';
                        break;
                }
                break;
            case 'З':
                switch (N1+N2) {
                    case -1:
                    case 3:
                        C='С';
                        break;
                    case 1:
                        C='Ю';
                        break;
                    case -2:
                    case 2:
                        C='В';
                        break;
                }
        }
    }

    public void setC(char c) {
        this.C = c;
    }

    public char getC() {
        return C;
    }


}

