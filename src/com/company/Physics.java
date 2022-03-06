package com.company;

public class Physics extends Lesson{
    @Override
    public void prerequisite() {
        System.out.println("None.");
    }

    @Override
    public void together() {
        System.out.println("math.");
    }
}
