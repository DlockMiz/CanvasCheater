package com.canvas.cheater.canvas;


import com.canvas.cheater.models.Assignment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class CanvasClient {
    @Value("${canvas.api_token}")
    private String api_token;
    private String url = "https://canvas.instructure.com/api/v1/courses/56170000000017556/assignments?access_token=";

    RestTemplate template = new RestTemplate();


    public Assignment[] getAllAssignmentsFromCourse(){
        System.out.println(url+api_token);
        Assignment[] list = template.getForObject(url+api_token, Assignment[].class);
        return list;
    }
}
