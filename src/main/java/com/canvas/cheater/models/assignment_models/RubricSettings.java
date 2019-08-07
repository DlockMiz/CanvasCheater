package com.canvas.cheater.models.assignment_models;

public class RubricSettings {
    private long id;
    private String title;
    private float points_possible;
    private boolean free_form_criterion_comments;
    private boolean hide_score_total;
    private boolean hide_points;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPoints_possible() {
        return points_possible;
    }

    public void setPoints_possible(float points_possible) {
        this.points_possible = points_possible;
    }

    public boolean isFree_form_criterion_comments() {
        return free_form_criterion_comments;
    }

    public void setFree_form_criterion_comments(boolean free_form_criterion_comments) {
        this.free_form_criterion_comments = free_form_criterion_comments;
    }

    public boolean isHide_score_total() {
        return hide_score_total;
    }

    public void setHide_score_total(boolean hide_score_total) {
        this.hide_score_total = hide_score_total;
    }

    public boolean isHide_points() {
        return hide_points;
    }

    public void setHide_points(boolean hide_points) {
        this.hide_points = hide_points;
    }
}
