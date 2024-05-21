// Laborant.java
package model;


import jakarta.persistence.*;
import java.util.*;

@Entity
public class Laborant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, length = 7, unique = true)
    private String hospitalId; // Assuming it's 7 digits

    @OneToMany(mappedBy = "laborant", cascade = CascadeType.ALL)
    private List<Report> reports = new ArrayList<>();

    // Constructors, getters, and setters
    // Omitted for brevity
}
