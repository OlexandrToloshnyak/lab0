package com.company.tasks;
import java.util.Arrays;

public class ArrayTask {

    private int nums[];
    private int N;
    private int K;

    public ArrayTask(int N) {
        this.N = N;
        nums = new int[N];
        for (int i = 0; i < N; ++i) {
            nums[i] = i;
        }
        this.K = 3;
    }

    public ArrayTask(int n, int k, int nums[]) {
        this.N = n;
        this.K = k;
        this.nums = nums;
    }

    public int[] calculate() {
        int res[] = {};
        for (int i = K - 1; i < N; i += K) {
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = nums[i];
        }
        return res;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }


    @Override
    public String toString() {
        return "ArrayTask{" +
                "nums=" + Arrays.toString(nums) +
                ", N=" + N +
                ", K=" + K +
                '}';
    }
}

