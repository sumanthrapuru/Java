package com.sumanth.java8.ch20jvmarchitecture;

import com.sumanth.java8.ch17datetime.JodaDateTimeDemo;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Class Loader
 * Memory Areas of JVM(Method Area, Heap Area)
 * Execution Engine
 */

class CustomizedClassLoader extends ClassLoader{
    public Class loadClass(String name) throws ClassNotFoundException{
        return super.loadClass(name);
    }
}

public class JVMArchitectureBasicsDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        Method[] methods = c.getDeclaredMethods();
        long count = Arrays.stream(methods).count();

        //BootStrapClassLoader impl in C rt.jar
        System.out.println(String.class.getClassLoader());//BootStrapClassLoader is not java so null
        //ExtensionClassLoader jdk/jre/lib/ext/*.jar
        //ApplicationClassLoader
        CustomizedClassLoader cl = new CustomizedClassLoader();
        cl.loadClass("com.sumanth.java8.ch17datetime.JodaDateTimeDemo");
        System.out.println(JodaDateTimeDemo.class.getClassLoader());

        Runtime r = Runtime.getRuntime();
        System.out.printf("max:%d,free:%d",r.maxMemory()/(1024*1024*1024), r.freeMemory());
        //java -Xmx4000m -Xms3000m JVMArchitectureBasicsDemo

        //interpreter interprets total program at least once
        //jit for repeated methods
        //UnsupportedClassVersionError major.minor 51.0 51 1.7 52 1.8
    }
}