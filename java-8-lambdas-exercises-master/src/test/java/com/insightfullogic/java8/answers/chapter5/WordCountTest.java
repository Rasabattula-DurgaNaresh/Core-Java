package com.insightfullogic.java8.answers.chapter5;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.stream.Stream;

import org.junit.Test;

public class WordCountTest {

    @Test
    public void passesBookExample() {
        Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");
        Map<String, Long> counts = WordCount.countWords(names);

        assertEquals(3, counts.size());
        assertEquals(Long.valueOf(3), counts.get("John"));
        assertEquals(Long.valueOf(2), counts.get("Paul"));
        assertEquals(Long.valueOf(1), counts.get("George"));
    }

}
