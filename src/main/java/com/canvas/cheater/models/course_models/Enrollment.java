package com.canvas.cheater.models.course_models;

public class Enrollment{
    private String type;
    private String role;
    private long role_id;
    private long user_id;
    private String enrollment_state;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getEnrollment_state() {
        return enrollment_state;
    }

    public void setEnrollment_state(String enrollment_state) {
        this.enrollment_state = enrollment_state;
    }
}
