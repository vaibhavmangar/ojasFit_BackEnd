package com.fitness.backend.Controller;


import com.fitness.backend.Model.Student;
import com.fitness.backend.Repository.StudentRepository;
import com.fitness.backend.Service.ScoringService;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

    private final StudentRepository repo;
    private final ScoringService scoring;

    public StudentController(StudentRepository repo, ScoringService scoring) {
        this.repo = repo;
        this.scoring = scoring;
    }

    // Add student and calculate score
    @PostMapping
    public Student addStudent(@RequestBody Student s) {

        int endurance = scoring.endurancePoints(s.getEnduranceTime());
        int flexibility = scoring.directPoints(s.getFlexibilityDistance());
        int agility = scoring.directPoints(25 - s.getAgilityTime());
        int speed = scoring.directPoints((int)(10 - s.getSpeedTime()));
        int strength = scoring.directPoints(s.getStrengthCount());
        int power = scoring.directPoints((int)(s.getPowerDistance() * 10));

        int total = scoring.calculateTotal(
                endurance, flexibility, agility, speed, strength, power
        );

        s.setTotalPoints(total);
        s.setPercentage((total / 150.0) * 100);

        repo.save(s);
        updateRanking();

        return s;
    }

    // Get all students with rank
    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }

    // Ranking logic
    private void updateRanking() {
        List<Student> students = repo.findAll();
        students.sort(Comparator.comparingInt(Student::getTotalPoints).reversed());

        int rank = 1;
        for (Student s : students) {
            s.setRank(rank++);
            repo.save(s);
        }
    }
}

