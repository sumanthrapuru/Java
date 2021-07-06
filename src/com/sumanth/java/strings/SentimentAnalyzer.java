package com.sumanth.java.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class SentimentAnalyzer {
    // Tip: labeled continue can be used when iterating featureSet + convert review to lower-case
    public static int[] detectProsAndCons(String review, String[][] featureSet, String[] posOpinionWords,
                                          String[] negOpinionWords) {
        int[] featureOpinions = new int[featureSet.length]; // output

        // your code ~ you will be invoking getOpinionOnFeature
        int i = 0;
        for(String[] features : featureSet){

            for(String feature : features){
                int res = getOpinionOnFeature(review, feature, posOpinionWords, negOpinionWords);
                if(res != 0){
                    featureOpinions[i] = res;

                    break;
                }
            }
            i = i+1;
        }

        return featureOpinions;
    }

    // First invoke checkForWasPhrasePattern and
    // if it cannot find an opinion only then invoke checkForOpinionFirstPattern
    private static int getOpinionOnFeature(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {

        // your code
        int wasPattern = checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords);
        return wasPattern==0 ?
                checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords) : wasPattern;



    }

    // Tip: Look at String API doc. Methods like indexOf, length, substring(beginIndex), startsWith can come into play
    // Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
    // You can first look for positive opinion. If not found, only then you can look for negative opinion
    private static int checkForWasPhrasePattern(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
        int opinion = 0;
        String pattern = feature + " was ";

        // your code
        for(String pw : posOpinionWords){
            String temp = pattern + pw;
            if(review.contains(temp)){
                opinion = 1;
                return opinion;
            }
        }
        for(String nw : negOpinionWords){
            String temp = pattern + nw;
            if(review.contains(temp)){
                opinion = -1;
                return opinion;
            }
        }

        return opinion;
    }

    // You can first look for positive opinion. If not found, only then you can look for negative opinion
    private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords,
                                                   String[] negOpinionWords) {
        // Extract sentences as feature might appear multiple times.
        // split() takes a regular expression and "." is a special character
        // for regular expression. So, escape it to make it work!!


        // your code for processing each sentence. You can return if opinion is found in a sentence (no need to process subsequent ones)

        String[] sentences = review.split("\\.");
        int opinion = 0;
        for(String sentence : sentences){
            for(String opinionStr : posOpinionWords){
                if(sentence.contains(opinionStr.concat(" ").concat(feature))){
                    opinion = 1;
                    return opinion;
                }
            }
            for(String opinionStr : posOpinionWords){
                if(sentence.contains(opinionStr.concat(feature))){
                    opinion = -1;
                    return opinion;
                }
            }
        }

        return opinion;
    }

    public static void main(String[] args) {
        String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive";

        //String review = "Sorry OG, but you just lost some loyal customers. Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, appetizer was cold and the food came out before the salad.";

        String[][] featureSet = {
                { "ambiance", "ambience", "atmosphere", "decor" },
                { "dessert", "ice cream", "desert" },
                { "food" },
                { "soup" },
                { "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };
        String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
                "delicious" };
        String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor" };

        int[] featureOpinions = detectProsAndCons(review.toLowerCase(), featureSet, posOpinionWords, negOpinionWords);
        System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
    }
}

class CurrencyConverter {

    // Currency exchange rates of different currencies relative to 1 US dollar

    double[] exchangeRates = new double[] {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};



    void setExchangeRates(double[] rates) {

        exchangeRates = rates;

    }

    void updateExchangeRate(int countryIndex, double newVal) {

        exchangeRates[countryIndex] = newVal;

    }



    double getExchangeRate(int countryIndex) {

        return exchangeRates[countryIndex];

    }

    double computeTransferAmount(int countryIndex, double amount) {

        return amount * getExchangeRate(countryIndex);

    }



    static void printCurrencies() {

        long start = System.currentTimeMillis();
        long sum = 0L;
        for(long i = 0; i < Integer.MAX_VALUE; i++){
            sum+=i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start);





    }

    void m(){

    }

    double m(int i){
        return 0.0;
    }

    public static void main(String[] args) {
        printCurrencies();
    }

}