package com.example.user.wordcountthursdaylab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 13/12/2016.
 */

    public class Sentence {
        private String words;

    public Sentence(String words) {
        this.words = words;
    }

    public int countWords() {
        return words.split(" ").length;

    }

    public String printWordsAndCount() {
        Map<String, Integer> occurrences = new HashMap<String, Integer>();

        for (String word : words.split(" ")) {
            Integer oldCount = occurrences.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
             occurrences.put(word, oldCount + 1);
        }
        return occurrences.toString();
    }
}