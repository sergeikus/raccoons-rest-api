package com.example.demo.util;

import com.example.demo.model.Post;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TestData {

    public static List<Post> generatePosts(HashMap<String, Integer> availableCategories) {
        List<Post> newPosts = new ArrayList<>();
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "App for navigating OS",
                "https://image.shutterstock.com/image-vector/tropical-palm-tree-on-ultraviolet-600w-1487426630.jpg",
                "I want to build an application for operating system that helps you to navigate around.",
                "software"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Disaply image in Python flask page from Sqlite database",
                "https://miro.medium.com/max/800/1*Q5EUk28Xc3iCDoMSkrd1_w.png",
                "I have problem displaying image from Sqlite database in Python Flask page.",
                "software"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Dating app for cats",
                "https://trupanion.com/blog/wp-content/uploads/2015/03/9582722403_52f8eac02f_o-1024x768.jpg",
                "Looking for teammates who would like to make a dating app for cats.",
                "software"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "PC Hardware",
                "https://p0.piqsels.com/preview/1000/1007/653/audio-mixer-set.jpg",
                "Want to learn more about hardware and how does it proceed.",
                "software"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Books with VR",
                "https://p1.pxfuel.com/preview/112/687/769/engineer-design-car-vr-ar-headset.jpg",
                "Need help making a structure on how to make VR game where people can read books.",
                "software"
        ));
        
//        for (Map.Entry<String, Integer> entry : availableCategories.entrySet()) {
//            newPosts.add(new Post(
//                    new Random().nextLong(),
//                    between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
//                    new Faker().name().fullName(),
//                    "Project title",
//                    "https://image.shutterstock.com/z/stock-photo-hello-hi-people-greeting-communication-saying-hello-in-english-hello-my-name-is-name-hello-519204124.jpg",
//                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum " +
//                            "has been the industry's standard dummy text ever since the 1500s, when an unknown printer " +
//                            "took a galley of type and scrambled it to make a type specimen book. It has survived not " +
//                            "only five centuries, but also the leap into electronic typesetting, remaining essentially " +
//                            "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
//                            "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker " +
//                            "including versions of Lorem Ipsum.",
//                    entry.getKey()
//            ));
//        }
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
