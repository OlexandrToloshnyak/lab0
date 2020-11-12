package com.company.tasks;

import java.lang.Math;
import java.util.Arrays;
import java.util.Objects;

public class ForTask {

    private double nums[];
    private int N;

    public ForTask(int N) {
        this.N = N;
        nums=new double[N];
    }

    public double calculate() {
        double sum=0;
        for (int i = 0; i < this.N; i++){
            this.nums[i]=Math.pow(N+i,2);
            sum+=Math.pow(N+i,2);
        }
        return sum;
    }

    public void setNums(double[] nums) {
        this.nums = nums;
    }

    public double[] getNums() {
        return nums;
    }

    @Override
    public String toString() {
        return "ForTask{" +
                "nums=" + Arrays.toString(nums) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForTask forTask = (ForTask) o;
        return N == forTask.N &&
                Arrays.equals(nums, forTask.nums);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(N);
        result = 31 * result + Arrays.hashCode(nums);
        return result;
    }
}

