// Report.java
package model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fileNumber;

    @Column(nullable = false)
    private String patientName;

    @Column(nullable = false)
    private String patientId;

    @Column(nullable = false)
    private String diagnosisTitle;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String diagnosisDetails;

    @Column(nullable = false)
    private LocalDate reportDate;

    @Column(nullable = false)
    private String photoUrl; // Assuming you store the URL to the photo

    @ManyToOne
    @JoinColumn(name = "laborant_id", nullable = false)
    private Laborant laborant;

    // Constructors, getters, and setters
    // Omitted for brevity
}
