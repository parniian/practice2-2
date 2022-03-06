package com.company;

public class AdvanceComputer extends Lesson{
    @Override
    public void prerequisite() {
        System.out.println("Basic computer.");
    }

    @Override
    public void together() {
        System.out.println("None.");
    }
}
