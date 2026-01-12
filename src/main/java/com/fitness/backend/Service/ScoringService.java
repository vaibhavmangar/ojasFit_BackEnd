package com.fitness.backend.Service;

import org.springframework.stereotype.Service;

@Service
public class ScoringService {

    // Lower time = better
    public int endurancePoints(double time) {
        if (time <= 2.20) return 25;
        if (time <= 2.30) return 24;
        if (time <= 2.40) return 23;
        if (time <= 2.50) return 22;
        if (time <= 3.00) return 21;
        if (time <= 3.10) return 20;
        if (time <= 3.20) return 19;
        if (time <= 3.30) return 18;
        if (time <= 3.40) return 17;
        if (time <= 3.50) return 16;
        if (time <= 4.00) return 15;
        if (time <= 4.10) return 14;
        if (time <= 4.20) return 13;
        if (time <= 4.30) return 12;
        if (time <= 4.40) return 11;
        if (time <= 4.50) return 10;
        if (time <= 5.00) return 9;
        if (time <= 5.10) return 8;
        if (time <= 5.20) return 7;
        if (time <= 5.30) return 6;
        if (time <= 5.40) return 5;
        if (time <= 5.50) return 4;
        if (time <= 6.00) return 3;
        if (time <= 6.10) return 2;
        return 1;
    }

    // Higher value = better
    public int directPoints(int value) {
        return Math.max(1, Math.min(25, value));
    }

    public int calculateTotal(int... points) {
        int sum = 0;
        for (int p : points) sum += p;
        return sum;
    }
}
