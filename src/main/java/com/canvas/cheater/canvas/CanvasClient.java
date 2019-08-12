package com.canvas.cheater.canvas;


import com.canvas.cheater.models.Assignment;
import com.canvas.cheater.models.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class CanvasClient {
    @Value("${canvas.api_token}")
    private String api_token;
    private String url = "https://canvas.instructure.com/api/v1/";

    RestTemplate template = new RestTemplate();


    public Assignment[] getAllAssignmentsFromCourse(Course course){
        String id = String.valueOf(course.getId());
        Assignment[] list = template.getForObject(url+"courses/"+id+"/assignments"+api_token, Assignment[].class);
        return list;
    }

    public Course[] getAllCourses(){
        Course[] courses = template.getForObject(url+"courses"+api_token+"&enrollment_state=active", Course[].class);
        return courses;
    }
}
