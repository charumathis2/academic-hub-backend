package com.academic.backend.controller;

import com.academic.backend.model.Deadline;
import com.academic.backend.service.DeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/deadlines")
@CrossOrigin(origins = "*")
public class DeadlineController {

    @Autowired
    private DeadlineService deadlineService;

    @GetMapping("/student/{id}")
    public List<Deadline> getDeadlines(@PathVariable Long id) {
        return deadlineService.getDeadlines(id);
    }

    @PostMapping
    public Deadline create(@RequestBody Deadline deadline) {
        return deadlineService.createDeadline(deadline);
    }

    @PutMapping("/{id}/complete")
    public Deadline markComplete(@PathVariable Long id) {
        return deadlineService.markComplete(id);
    }
}