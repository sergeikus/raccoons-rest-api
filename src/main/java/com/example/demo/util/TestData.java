package com.example.demo.util;

import com.example.demo.model.Post;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TestData {

    public static List<Post> generatePosts(HashMap<String, Integer> availableCategories) {
        List<Post> newPosts = new ArrayList<>();
        // Software posts
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

        // Electronics posts
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Self driving robot",
                "https://upload.wikimedia.org/wikipedia/commons/d/d8/NASA_Mars_Rover.jpg",
                "Looking forward to build rover type vehicle. Will include: solar, servos, gps-positioning and more.",
                "electronics"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Folkrace robot",
                "https://scontent.frix1-1.fna.fbcdn.net/v/t1.0-9/p960x960/54230824_2377004022581789_3865573040024715264_o.jpg?_nc_cat=109&_nc_sid=2d5d41&_nc_ohc=gTMmyGfKxTEAX-5BpKO&_nc_ht=scontent.frix1-1.fna&_nc_tp=6&oh=5a1b727ab9ce6a83874394ec081ddbc4&oe=5EDBAC9B",
                "I want to create a working folkrace robot which will be able to compete in competitions.",
                "electronics"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Linefollower",
                "https://image.shutterstock.com/image-photo/turin-piedmont-italy-june-3-260nw-1111118957.jpg",
                "Looking for someone to help me create The best line following robot.",
                "electronics"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Minisumo robot",
                "https://i.pinimg.com/originals/2b/74/50/2b7450a4d2c72f919dbf4fffe2b18c2d.jpg",
                "I am looking for someone with knowledge on how to create Minisumo robot which meets the requirements of compiting in robotic competitions.",
                "electronics"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Metal detector",
                "https://live.staticflickr.com/4513/37005931923_94f1bf4846_b.jpg",
                "Looking for teammate to help build or design cover and handles. I can do electronics.",
                "electronics"
        ));

        // Teachers & Students
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Integers for kids",
                "https://live.staticflickr.com/2897/14766193322_cecc0ddd38_b.jpg",
                "I do want to educate kids on integers at early age. My aim is to do it in small steps, making it easy to understand.",
                "teachers&students"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Square root",
                "https://storage.needpix.com/rsynced_images/square-27349_1280.png",
                "Want to learn all types of square root solutions.",
                "teachers&students"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Functions",
                "https://upload.wikimedia.org/wikipedia/commons/d/d9/Wykres_warto%C5%9Bci_bezwzgl%C4%99dnych.svg",
                "I want to get information about various functions and how do they work.",
                "teachers&students"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Trigonometry",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Unit_circle_angles.svg/350px-Unit_circle_angles.svg.png",
                "Looking for someone who could help me with understanding trigonometry.",
                "teachers&students"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Teacher behaviornometry",
                "https://p1.pxfuel.com/preview/25/559/684/teacher-board-tutor-school.jpg",
                "Need to understand how to act against children who don't follow teaching process.",
                "teachers&students"
        ));

        // Economics
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Get to know taxes",
                "https://live.staticflickr.com/5275/5913069484_bba50ff98e_b.jpg",
                "I have an idea of creating online tool for teaching kids taxes. Please help me.",
                "economics"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Partner in trades",
                "https://p0.pikist.com/photos/47/249/stock-trading-monitor-business-finance-exchange-investment-market-trade-thumbnail.jpg",
                "As some sort of crysis is approaching, I'm looking forward to investigate stock markets.",
                "economics"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Shoe lace factory",
                "https://c7.uihere.com/files/220/9/203/blur-close-up-depth-of-field-focus-thumb.jpg",
                "Project for buisness enthusiasts. Can small shoelace factory be profitable?",
                "economics"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Foreign Currency Markets and Exchange Rates",
                "https://image.shutterstock.com/image-photo/abstract-textured-backdrop-many-hundred-600w-1560666569.jpg",
                "Looking forward to learn how foreign exchange works with foreign currencys and learn other currency stuff.",
                "economics"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Credit",
                "https://cdn.pixabay.com/photo/2017/09/18/08/56/credit-card-2761073_960_720.png",
                "Want to teach others about credits, credit cards and other connections with it.",
                "economics"
        ));

        // Arts & Crafts
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Make a desk",
                "https://i2.wp.com/www.startstanding.org/wp-content/uploads/2018/01/Making-Your-Own-Tabletop-Sanding.jpg?resize=960%2C591&ssl=1",
                "Looking forward to teach how to make a well structured desk.",
                "arts&crafts"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Knitting",
                "https://www.theus.org.uk/sites/default/files/BKC%204.jpg",
                "I'm looking for a nice knitting group so we could share some ideas.",
                "arts&crafts"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Decoupage",
                "https://i.ytimg.com/vi/wsg-zSacXxw/maxresdefault.jpg",
                "I'm getting bored, can someone teach me how to make these nice jars?",
                "arts&crafts"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Knitting",
                "https://www.simplemost.com/wp-content/uploads/2017/12/AdobeStock_118794482.jpeg",
                "I REALLY want to cosplay The man behind the slaughter, but I can't sew.",
                "arts&crafts"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Latvian symbol carvings in wood",
                "https://live.staticflickr.com/3736/13168460614_d07c72654b_b.jpg",
                "I am interested in creating full collection of Latvian folk symbols carved in wood.",
                "arts&crafts"
        ));

        // Random
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Ways of tying a shoe",
                "https://p1.piqsels.com/preview/475/1003/751/chucks-converse-sneakers-hipster.jpg",
                "Looking forward to teaching multiple ways of tying a shoe.",
                "random"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Crack 6x6x6 rubics cube",
                "https://p1.piqsels.com/preview/475/1003/751/chucks-converse-sneakers-hipster.jpg",
                "Join in in adventure of finding and learnig algorithm that solves 6x6x6 rubics cube. No cube needed.",
                "random"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Guitar tricks",
                "https://storage.needpix.com/rsynced_images/guitar-3283649_1280.jpg",
                "Want to find out what to learn when starting playing guitar.",
                "random"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Bear encounter",
                "https://p1.piqsels.com/preview/475/1003/751/chucks-converse-sneakers-hipster.jpg",
                "Looking forward to teaching multiple ways of tying a shoe.",
                "random"
        ));
        newPosts.add(new Post(
                new Random().nextLong(),
                between(LocalDate.now().minusMonths((2L)), LocalDate.now()),
                new Faker().name().fullName(),
                "Bottle flip",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTx2Jpz2GWCIp0lcNvMdxTKV2dSAr10t3iSojd3TYd2mKgrC1AA&usqp=CAU",
                "Trying to impress my friends with bottle flips. Looking forward to gaining tips for better bottle flipping.",
                "random"
        ));

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
