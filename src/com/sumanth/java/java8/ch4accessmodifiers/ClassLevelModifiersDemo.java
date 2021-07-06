package com.sumanth.java.java8.ch4accessmodifiers;

/**
 * public       final           native
 * protected    abstract        strictfp
 *              static          transient
 * private      synchronized    volatile
 */
public class ClassLevelModifiersDemo {

    public class InnerClass{    }
    protected class InnerClass2{    }
    class InnerClass3{    }
    private class InnerClass4{    }

    final class InnerClass5{    }
    abstract class InnerClass6{    }
    static class InnerClass7{    }

    strictfp class InnerClass8{    }

    public static void main(String[] args) {

    }
}

class TopClassLevelModifiers {//can't be accessed outside of this package
}

final class TopClassLevelModifiers2 {
}

abstract class TopClassLevelModifiers3 {
}

strictfp class TopClassLevelModifiers4 {
}

//abstract - private (final synchronized static) native strictfp //illegal with abstract
abstract strictfp class TopClassLevelModifiers5 {//abstract strictfp combination is legal here. illegal at method level.
}

