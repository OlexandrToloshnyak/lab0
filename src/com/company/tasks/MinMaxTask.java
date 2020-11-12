package com.company.tasks;

public class MinMaxTask {

    private int nums[];
    private int N;

    public MinMaxTask(int N) {
        this.N = N;
        nums=new int[N];
        for (int i=0;i<N;++i){
            nums[i]=i;
        }
    }
    public MinMaxTask(int N,int nums[]) {
        this.N = N;
        this.nums=nums;
    }

    public int calculate() {
        int i,min,max,minn,maxn;
        min=nums[0];
        max=nums[0];
        minn=min;
        maxn=max;
        for (i=1;i<=N;++i){
            if ((i==1)||(nums[i]<=min)){
                min=nums[i];
                minn=i;
            }
            if ((i==1)||(nums[i]>=max)){
                max=nums[i];
                maxn=i;
            }
        }
        if (minn>maxn){
            return minn;
        }
        return maxn;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }


}

