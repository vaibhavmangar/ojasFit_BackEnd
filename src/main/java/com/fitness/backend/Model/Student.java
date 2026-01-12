package com.fitness.backend.Model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Unique ID for each student

    private String name;
    // Student name

    private double enduranceTime;
    // 800m running time (minutes)

    private int flexibilityDistance;
    // V-Sit reach distance (cm)

    private int agilityTime;
    // 100m shuttle run time (seconds)

    private double speedTime;
    // 30m sprint time (seconds)

    private int strengthCount;
    // Number of abdomen sit-ups

    private double powerDistance;
    // Standing long jump distance (meters)

    private int totalPoints;
    // Sum of points from all 6 tests

    private double percentage;
    // (totalPoints / 150) * 100

    private int rank;
    // Overall rank among all students

    // Getters and Setters
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
