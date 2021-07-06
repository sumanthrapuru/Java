package com.sumanth.java.java8.ch15lambdaFI;

import java.util.Date;
import java.util.function.*;
import java.util.stream.IntStream;

public class PredefinedFIExamples {
    interface Fun1 {
        void m1();
    }

    interface Fun2 {
        void m1(int a, int b);
    }

    interface Fun3 {
        int m1(String s);
    }

    @FunctionalInterface
    interface Fun4 extends Fun1 {

    }

    interface Fun5 extends Fun1 {
        void m1();
    }
//    @FunctionalInterface
//    interface Fun6 extends Fun1{
//        void m2();
//    }

    int instanceVar = 10;

    public static void main(String[] args) {
        //FI = lambda expressions

        Fun1 fun1 = () -> System.out.println("hi");
        Fun2 fun2 = (a, b) -> System.out.println(a + b);
        Fun3 fun3 = s -> s.length() + 1;

        PredefinedFIExamples fiExamples = new PredefinedFIExamples();
        fiExamples.localVarFinalInsideLambda();

        //Predefined FI Predicate, Function, Consumer
        Predicate<String> p = s -> s.length() > 3;
        System.out.println(p.test("sumanth"));
        p.and(p);
        p.or(p);
        p.negate();
        Predicate.isEqual(p);

        Function<String, Integer> lengthFun = String::length;
        Function<Integer, String> stringFun = i -> i + ".";
        String res = lengthFun.andThen(stringFun).apply("su");
        System.out.println(res);
        res = stringFun.compose(lengthFun).apply("su");
        System.out.println(res);

        Function<String, String> identityFunc = Function.identity();
        System.out.println(identityFunc.apply("sumanth"));


        Consumer<String> consumer = s -> System.out.print(lengthFun.apply(s));
        consumer.accept("sumanth");
        consumer.andThen(consumer).accept("sum");


        Supplier<Date> supplier = Date::new;
        System.out.println(supplier.get());

        IntStream.range(0, 10).forEach(i ->
                System.out.print((int) (Math.random() * 10))
        );

        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
        biPredicate.test("test", "sum");
        BiFunction<String, Integer, String> biFunction = (s1, len) -> s1 + len;
        biFunction.apply("sum", 3);
        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + i);
        biConsumer.accept("sum", 10);
        //No BiSupplier

        //primitive FI w/o auto boxing


    }

    void localVarFinalInsideLambda() {
        int instanceVar = 1000;
        Fun4 fun4 = () -> {
            //instanceVar = 2000;//local variables referenced from a lambda expression must be final or effectively final
            System.out.println(instanceVar);
            System.out.println(this.instanceVar);//inside lambda this reference to outer class obj
            //inside anonymous inner class this ref to anonymous class obj
        };
        fun4.m1();
    }
}

class PrimitiveFI {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Predicate<Integer> evenPredicate = I -> I % 2 == 0;
        for (int num : nums) {
            if (evenPredicate.test(num)) System.out.println(num);
        }
        IntPredicate evenPred = i -> i % 2 == 0;
        LongPredicate longPred = l -> l % 2 == 0;
        DoublePredicate doublePred = d -> d % 2 == 0;
        System.out.println(doublePred.test(12.0));

        IntFunction<Integer> intFunction = i -> i * i;
        intFunction.apply(12);
        ToIntFunction<String> toIntFunction = String::length;
        toIntFunction.applyAsInt("sumanth");
        IntToLongFunction intToLongFunction = i -> i + 1L;
        intToLongFunction.applyAsLong(10);
        IntToDoubleFunction intToDoubleFunction = Math::sqrt;
        intToDoubleFunction.applyAsDouble(122);

        LongFunction<Integer> longFunction = l -> (int) (l + l);
        longFunction.apply(10L);
        ToLongFunction<Integer> toLongFunction = l -> l - 1L;
        toLongFunction.applyAsLong(10);
        LongToIntFunction longToIntFunction = l -> (int) l;
        longToIntFunction.applyAsInt(10L);
        LongToDoubleFunction longToDoubleFunction = l -> l * 1.0;
        longToDoubleFunction.applyAsDouble(1L);

        DoubleFunction<Double> doubleFunction = d -> d / (d+1);
        doubleFunction.apply(1.0);
        ToDoubleFunction<Integer> toDoubleFunction = i -> i * 10L;
        toDoubleFunction.applyAsDouble(10);
        DoubleToIntFunction doubleToIntFunction = d -> (int) d;
        doubleToIntFunction.applyAsInt(10.0);
        DoubleToLongFunction doubleToLongFunction = d -> (long) d;
        doubleToLongFunction.applyAsLong(10.0);

        ToIntBiFunction<Long, Double> toIntBiFunction = (l, d) -> (int) (l + d);
        toIntBiFunction.applyAsInt(1L, 1.0);
        ToLongBiFunction<Long, Double> toLongBiFunction = (l, d) -> (long) (l + d);
        toLongBiFunction.applyAsLong(1L, 1.0);
        ToDoubleBiFunction<Long, Double> toDoubleBiFunction = Double::sum;
        toDoubleBiFunction.applyAsDouble(1L, 1.0);

        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(10);
        LongConsumer longConsumer = System.out::println;
        longConsumer.accept(10L);
        DoubleConsumer doubleConsumer = System.out::println;
        doubleConsumer.accept(1.0);

        //use instead of BiConsumer if one param is primitive
        ObjIntConsumer<String> objIntConsumer = (s, i) -> System.out.println(s.length() + i);
        objIntConsumer.accept("s", 0);
        ObjLongConsumer<String> objLongConsumer = (s, l) -> System.out.println(s + l);
        objLongConsumer.accept("s", 1L);
        ObjDoubleConsumer<String> objDoubleConsumer = (s, d) -> System.out.println(s + d);
        objDoubleConsumer.accept("s", 1.0d);

        IntSupplier intSupplier = () -> 10;
        intSupplier.getAsInt();
        LongSupplier longSupplier = () -> 1L;
        longSupplier.getAsLong();
        DoubleSupplier doubleSupplier = () -> 1.0;
        doubleSupplier.getAsDouble();
        BooleanSupplier booleanSupplier = () -> true;
        booleanSupplier.getAsBoolean();

        //unary child of function
        UnaryOperator<Integer> unaryOperator = i -> i * i;
        unaryOperator.apply(10);
        IntUnaryOperator intUnaryOperator = i -> i * i;
        intUnaryOperator.applyAsInt(10);
        LongUnaryOperator longUnaryOperator = l -> l;
        longUnaryOperator.applyAsLong(10);
        DoubleUnaryOperator doubleUnaryOperator = d -> d;
        doubleUnaryOperator.applyAsDouble(1.0);

        BinaryOperator<Integer> binaryOperator = Integer::sum;
        binaryOperator.apply(10, 20);
        IntBinaryOperator intBinaryOperator = Integer::sum;
        intBinaryOperator.applyAsInt(10, 20);
        LongBinaryOperator longBinaryOperator = Long::sum;
        longBinaryOperator.applyAsLong(10L, 2L);
        DoubleBinaryOperator doubleBinaryOperator = Double::sum;
        doubleBinaryOperator.applyAsDouble(1.9, 2.1);


    }
}

interface Interface {
    void m1();

    class Demo implements Interface {
        @Override
        public void m1() {
            System.out.println("method one execution");
        }
    }

    class Test {
        public static void main(String[] args) {
            new Demo().m1();
            Interface i = () -> System.out.println("method one execution lambda");
            i.m1();

        }
    }
}
