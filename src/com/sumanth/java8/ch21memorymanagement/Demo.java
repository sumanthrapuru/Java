package com.sumanth.java8.ch21memorymanagement;

public class Demo {
    public static void main(String[] args) {
        //mark and sweep GC
        for(int i =0; i<500; i++){
            Demo d = new Demo();
            d = null;
            System.gc();//doesn't run if few obj are in heap
        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(this +" obj cleaned from heap");
    }
}
