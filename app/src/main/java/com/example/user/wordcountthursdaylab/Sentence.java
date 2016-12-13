package com.example.user.wordcountthursdaylab;

import java.util.ArrayList;

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


}