package com.canvas.cheater.models.course_models;

public class BlueprintRestriction {
    private boolean content;
    private boolean points;
    private boolean due_dates;
    private boolean availability_dates;

    public boolean isContent() {
        return content;
    }

    public void setContent(boolean content) {
        this.content = content;
    }

    public boolean isPoints() {
        return points;
    }

    public void setPoints(boolean points) {
        this.points = points;
    }

    public boolean isDue_dates() {
        return due_dates;
    }

    public void setDue_dates(boolean due_dates) {
        this.due_dates = due_dates;
    }

    public boolean isAvailability_dates() {
        return availability_dates;
    }

    public void setAvailability_dates(boolean availability_dates) {
        this.availability_dates = availability_dates;
    }
}
