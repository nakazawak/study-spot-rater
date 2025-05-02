package dev.kojinaka.study_spot_rater.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "study spots")

public class StudySpot {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "type")
    private String type;

    @Column(name = "amenities")
    private String amenities;

    @Column(name = "average_rating")
    private double averageRating;

}
