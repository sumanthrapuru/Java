package com.sumanth.java.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        // your code
        double[] result = new double[studentIdList.length];
        int i = 0;
        for(char[] studentGrades : studentsGrades){
            double sum = 0;
            for(char grade : studentGrades){
                switch(grade){
                    case 'A' : sum+=4; break;
                    case 'B' : sum+=3; break;
                    case 'C' : sum+=2; break;
                }
            }
            sum /= studentGrades.length;
            result[i++] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStudentsByGPA(2, 4, new int[]{1001}, new char[][]{{'A', 'A', 'A', 'C'}})));;
    }

    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
        if(lower < 0 || higher < 0 || lower > higher) return null;
        // invoke calculateGPA
        double[] studentGPAs = calculateGPA(studentIdList, studentsGrades);
        List<Number> list = new ArrayList<>();
        for(int i = 0; i< studentIdList.length; i++){
            if(studentGPAs[i]>=lower && studentGPAs[i]<= higher){
                list.add(studentIdList[i]);
            }
        }


        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array


        return list.stream().mapToInt(Number::intValue).toArray();
    }

}