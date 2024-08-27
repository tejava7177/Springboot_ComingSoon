package org.comingSoonPrac.springDeveloper.model;

import jakarta.persistence.*;

@Entity
@Table(name="TEXT")
public class TextEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "text", updatable = false)
    private String text;

    // Getters and Setters
}