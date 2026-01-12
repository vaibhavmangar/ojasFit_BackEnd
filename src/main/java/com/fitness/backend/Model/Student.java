package com.fitness.backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "students") // PostgreSQL table name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Unique ID (auto-increment in PostgreSQL)

    @Column(nullable = false)
    private String name;
    // Student name

    private double enduranceTime;
    // 800m running time (minutes)

    private int flexibilityDistance;
    // V-Sit reach distance (cm)

    private int agilityTime;
    // Shuttle run time (seconds)

    private double speedTime;
    // 30m sprint time (seconds)

    private int strengthCount;
    // Sit-ups count

    private double powerDistance;
    // Long jump distance (meters)

    private int totalPoints;
    // Sum of all test points

    private double percentage;
    // (totalPoints / 150) * 100

    private int rank;
    // Overall ranking

    // Getters & Setters (unchanged)
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getEnduranceTime() { return enduranceTime; }
    public void setEnduranceTime(double enduranceTime) { this.enduranceTime = enduranceTime; }

    public int getFlexibilityDistance() { return flexibilityDistance; }
    public void setFlexibilityDistance(int flexibilityDistance) { this.flexibilityDistance = flexibilityDistance; }

    public int getAgilityTime() { return agilityTime; }
    public void setAgilityTime(int agilityTime) { this.agilityTime = agilityTime; }

    public double getSpeedTime() { return speedTime; }
    public void setSpeedTime(double speedTime) { this.speedTime = speedTime; }

    public int getStrengthCount() { return strengthCount; }
    public void setStrengthCount(int strengthCount) { this.strengthCount = strengthCount; }

    public double getPowerDistance() { return powerDistance; }
    public void setPowerDistance(double powerDistance) { this.powerDistance = powerDistance; }

    public int getTotalPoints() { return totalPoints; }
    public void setTotalPoints(int totalPoints) { this.totalPoints = totalPoints; }

    public double getPercentage() { return percentage; }
    public void setPercentage(double percentage) { this.percentage = percentage; }

    public int getRank() { return rank; }
    public void setRank(int rank) { this.rank = rank; }
}
