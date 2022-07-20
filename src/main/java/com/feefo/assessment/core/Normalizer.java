package com.feefo.assessment.core;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Normalizer {

    private final List<String> possibleTitles = Arrays.asList("Architect", "Software Engineer", "Quantity Suerveyor", "Accountant");


    public String normalize(String jobTitle) {
        int[] rates = getRates(jobTitle);
        String result = "JobTitle not found";

        int higherRateIndex = getHigherRate(rates);
        int higherRate = rates[higherRateIndex];

        if (higherRate != 0) {
            result = possibleTitles.get(higherRateIndex);
        }

        return result;

    }

    private int[] getRates(String jobTitle) {
        return possibleTitles.stream().mapToInt((title) -> findMatchingWord(jobTitle, title)).toArray();
    }

    private int findMatchingWord(String jobTitle, String possibleTitle) {
        int score = 0;

        String[] jobTitleWords = jobTitle.toLowerCase().split(" ");
        String[] possibleTitleWords = possibleTitle.toLowerCase().split(" ");

        for(String jobTitleWord: jobTitleWords) {
            if (Arrays.asList(possibleTitleWords).contains(jobTitleWord)) {
                score = 1;
                break;
            }
        }

        return score;
    }

    private int getHigherRate(int[] rates) {
        int higherRateIndex = 0;

        for (int i = 0; i < rates.length; i++) {
            if (rates[i] > rates[higherRateIndex]) {
                higherRateIndex = i;
            }

        }
        return higherRateIndex;
    }

}
