package com.canvas.cheater.controllers;

import com.canvas.cheater.canvas.CanvasClient;
import com.canvas.cheater.models.Assignment;
import com.canvas.cheater.models.Course;
import com.canvas.cheater.repositories.CheaterRepository;
import com.canvas.cheater.repositories.repo_models.SavedAssignment;
import org.springframework.web.bind.annotation.*;

@RestController
public class CanvasController {
    CanvasClient canvasClient;
    CheaterRepository repo;

    public CanvasController(CanvasClient canvasClient, CheaterRepository repo){
        this.canvasClient = canvasClient;
        this.repo = repo;
    }

    @PostMapping("/getAssignments")
    public Assignment[] getAssignments(@RequestBody Course course){
        return canvasClient.getAllAssignmentsFromCourse(course);
    }

    @GetMapping("/getCourses")
    public Course[] getCourses(){
        return canvasClient.getAllCourses();
    }

    @GetMapping("/getSavedAssignments")
    public SavedAssignment test(){
        SavedAssignment ass = new SavedAssignment();
        repo.save(ass);
        return ass;
    }

}
