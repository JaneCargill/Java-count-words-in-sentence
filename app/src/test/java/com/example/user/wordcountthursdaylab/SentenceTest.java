package com.example.user.wordcountthursdaylab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SentenceTest {
    @Test
    public void canGetNumberOfWords() {

        Sentence sentence = new Sentence("Hi there");

        assertEquals(2, sentence.countWords());
    }

    @Test
    public void canPrintWordsAndNumberOfOccurrences() {

        Sentence sentence = new Sentence("Hi Hi");

        assertEquals("{Hi=2}" , sentence.printWordsAndCount());
    }
}