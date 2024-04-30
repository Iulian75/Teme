package Teme.DiscordHomeWork.Homework26x27;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    String title;
    private String gen;
    private List<Double> ratings;

    // Constructor
    public Movie(String title, String gen) {
        this.title = title;
        this.gen = gen;
        this.ratings = new ArrayList<>();
    }


    public void addRating(double rating) {
        ratings.add(rating);
    }


    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0;
        }

        double total = 0;
        for (double rating : ratings) {
            total += rating;
        }
        return total / ratings.size();
    }
}
