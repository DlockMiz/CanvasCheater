package com.canvas.cheater.controllers;

import com.canvas.cheater.canvas.CanvasClient;
import com.canvas.cheater.models.Assignment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CanvasController {
    CanvasClient canvasClient;

    public CanvasController(CanvasClient canvasClient){
        this.canvasClient = canvasClient;
    }

    @GetMapping("/getAssignments")
    public Assignment[] getAssignments(){
        return canvasClient.getAllAssignmentsFromCourse();
    }

}
