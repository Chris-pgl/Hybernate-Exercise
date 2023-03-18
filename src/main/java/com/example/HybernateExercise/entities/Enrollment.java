package com.example.HybernateExercise.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;

    @JoinColumn(name = "corse_id")
    @ManyToOne()
    private Course corses;




}

