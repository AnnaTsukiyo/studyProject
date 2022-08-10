package com.example.studyproject.oop.hometask15;

public enum Cru {
    BASE(80), PREMIER(90), GRAND(100);
    private final int quality;

    Cru(int quality) {
        this.quality = quality;
    }
}
