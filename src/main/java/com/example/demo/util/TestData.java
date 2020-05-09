package com.example.demo.util;

import com.example.demo.model.Post;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TestData {

    public static List<Post> generatePosts(HashMap<String, Integer> availableCategories) {
        List<Post> newPosts = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : availableCategories.entrySet()) {
            newPosts.add(new Post(
                    new Random().nextLong(),
                    between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                    new Faker().name().fullName(),
                    "Project title",
                    "https://image.shutterstock.com/z/stock-photo-hello-hi-people-greeting-communication-saying-hello-in-english-hello-my-name-is-name-hello-519204124.jpg",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum " +
                            "has been the industry's standard dummy text ever since the 1500s, when an unknown printer " +
                            "took a galley of type and scrambled it to make a type specimen book. It has survived not " +
                            "only five centuries, but also the leap into electronic typesetting, remaining essentially " +
                            "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
                            "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker " +
                            "including versions of Lorem Ipsum.",
                    entry.getKey()
            ));
        }
        return newPosts;
    }

    // source: https://www.baeldung.com/java-random-dates
    private static LocalDate between(LocalDate startInclusive, LocalDate endExclusive) {
        long startEpochDay = startInclusive.toEpochDay();
        long endEpochDay = endExclusive.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }
}
