package com.sumanth.java8.pragmatic_school.fi;


import java.util.Objects;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = i -> i % 2 == 0;

    }
}

interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<T> other){
        Objects.requireNonNull(other);
        return (t) ->
            test(t) &&
                    other.test(t);

    }

    default Predicate<T> negate(){
        return t -> !test(t);
    }

    default Predicate<T> or(Predicate<T> other){
        Objects.requireNonNull(other);
        return t -> test(t) || other.test(t);
    }

    static <T> Predicate<T> isEqual(Object obj){
        return obj == null ? Objects::isNull : t -> obj.equals(t);
    }

    static <T> Predicate<T> not(Predicate<? super T> target){
        return (Predicate<T>) target.negate();
    }

}
