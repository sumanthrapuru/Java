package com.sumanth.java8.ch21memorymanagement;

public class JavaMemoryManagementDemo {
    public static void main(String[] args) {
        //mark and sweep GC
        for(int i =0; i<5; i++){
            JavaMemoryManagementDemo d = new JavaMemoryManagementDemo();
            d = null;
            System.gc();//doesn't run if few obj are in heap
        }

        Runtime runtime = Runtime.getRuntime();
        runtime.maxMemory();//configured max memory
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        int mb = (1024*1024);
        System.out.format("max %dMB total %dMB free %dMB used %dMB",
                runtime.maxMemory()/mb,
                runtime.totalMemory()/mb,
                runtime.freeMemory()/mb,
                usedMemory/mb
        );
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(this +" obj cleaned from heap");
    }
}
