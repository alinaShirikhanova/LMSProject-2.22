package com.company;


import view.MainFrame;
import view.repository.CourseRepository;
import view.repository.StudentRepository;

class Main {

    public static MainFrame mainFrame = new MainFrame();
    public static void main(String[] args) {
        StudentRepository.getAll();
        CourseRepository.getAll();
    }
}

