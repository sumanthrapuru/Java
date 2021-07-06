package com.sumanth.java.java8.ch1languagefundamentals;

public class IdentifiersDemo {
    public static void main(String[] args) {
        //a name in java prog is called identifer
        //(class name, method name, var name, label name)
        //Rules for defining java identifiers
        //  a-zA-Z0-9$_
        //  should not start with digit
        //  can be any length
        //  can't be reserved words as identifiers
        //  case sensitive
        //Reserved Words 53
        //  reserved literals 3
        //      true false null
        //  unused 2
        //      goto const
        //  used 48
        //  datatypes 8
        //      byte short int long float double boolean char
        //  flow control 11
        //      if else switch case default do while for break continue return
        //  modifiers 11
        //      public protected default private
        //      static final abstract synchronized native strictfp transient volatile
        //  exception handling 6
        //      try catch finally throw throws assert
        //  class related keywords 6
        //      class interface extends implements package import
        //  object related 4
        //      new instanceof super this
        //  void
        //  enum


        //data types
        //  in java every var, exp checked for type compatibility
        byte bVar = Byte.MIN_VALUE;
        bVar = (byte) (bVar - 1);
        short sVar = Short.MIN_VALUE;
        int iVar = Integer.MIN_VALUE;
        long lVar = Long.MIN_VALUE;
        System.out.format("%d %d %d %d ", bVar, sVar, iVar, lVar);//127 -32768 -2_147_483_648
        // -9_223_372_036_854_775_808 9 Quintillion 223 Quadrillion 372 Trillion 036 B 854 M 775 T 808
        float fVar = Float.MIN_VALUE;
        double dVar = Long.MIN_VALUE;
        System.out.format("\n %f %f ", fVar, dVar);//0.000000 -9_223_372_036_854_776_000.000000
        fVar = Float.MAX_VALUE;
        dVar = Long.MAX_VALUE;
        System.out.format("%f %f", fVar, dVar);//340282346638528860000000000000000000000.000000 9223372036854776000.000000
        //float is not consistent use double

        //Literals
        //Integral(decimal, octal, hex, binary)
        //iVar = 0786;//CE
        dVar = 0786.0;
        iVar = 0xFace;
        iVar = 0B1_1000;//(use _ in between numbers only)
        lVar = 0X80000L;
        fVar = 1.2F;
        dVar = 1.2;
        dVar = iVar;
        dVar = 1.2e3;
        //char literal rep in 4 forms
        char cVar = 'a';
        cVar = 97;//(int literal in any form)
        cVar = '\u0061';
        cVar = '\n';//(n t r b f '" \)




    }
    enum Month{
        JAN, FEB, MAR;
    }
}
