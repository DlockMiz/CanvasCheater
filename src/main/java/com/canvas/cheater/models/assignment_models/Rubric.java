package com.canvas.cheater.models.assignment_models;

public class Rubric {
    private String id;
    private float points;
    private String description;
    private String long_description;
    private boolean criterion_use_range;
    private RubricRatings[] ratings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLong_description() {
        return long_description;
    }

    public void setLong_description(String long_description) {
        this.long_description = long_description;
    }

    public boolean isCriterion_use_range() {
        return criterion_use_range;
    }

    public void setCriterion_use_range(boolean criterion_use_range) {
        this.criterion_use_range = criterion_use_range;
    }

    public RubricRatings[] getRatings() {
        return ratings;
    }

    public void setRatings(RubricRatings[] ratings) {
        this.ratings = ratings;
    }
}
