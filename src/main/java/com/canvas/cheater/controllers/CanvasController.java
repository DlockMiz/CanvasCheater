package com.canvas.cheater.controllers;

import com.canvas.cheater.canvas.CanvasClient;
import com.canvas.cheater.models.Assignment;
import com.canvas.cheater.models.Course;
import org.springframework.web.bind.annotation.*;

@RestController
public class CanvasController {
    CanvasClient canvasClient;

    public CanvasController(CanvasClient canvasClient){
        this.canvasClient = canvasClient;
    }

    @PostMapping(value = "/getAssignments")
    public Assignment[] getAssignments(@RequestBody Course course){
        return canvasClient.getAllAssignmentsFromCourse(course);
    }

    @GetMapping("/getCourses")
    public Course[] getCourses(){
        return canvasClient.getAllCourses();
    }

}
