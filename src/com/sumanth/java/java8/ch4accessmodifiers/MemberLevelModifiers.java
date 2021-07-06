package com.sumanth.java.java8.ch4accessmodifiers;

abstract public class MemberLevelModifiers {

    public MemberLevelModifiers(){
        super();
    }

    static class InnerClass{

    }

    //methods
    public void m1(){

    }
    protected void m4(){
        //outside this package can access this method only with inherited class ref inside inherited class only
        //C extends MemberLevelModifiers
        //C c = new C()
        //c.m4();
    }
    void m3(){

    }
    private void m2(){

    }
    final void m5(){

    }
    abstract void m6();
    synchronized void m7(){ }//synchronized for classes blocks
    //abstract synchronized void m12();//abstract synchronized illegal combi
    static void m8(){
    }
    //abstract static void m11(){}//abstract static is illegal combi
    native void m9();//
    //abstract native void m11()//abstract native is illegal combi

    strictfp void m10(){ }
    //strictfp native void m11();//strictfp native is illegal combi


    // variables
    final int fVar = 10;//final var have to be initialized at the time of declaration or instance block or constructor completion

    static int sVar = 10;

    final static int fsVar = 0;//at the time of declaration or static block

    void meth(){
        final int i;//even though final we don't have to initialize
        System.out.println("Hi");
    }

    transient int tVar = 10;
    volatile int vVar = 10;//separate local copy / thread
    //final volatile int vVAr = 100;//illegal combination

}
