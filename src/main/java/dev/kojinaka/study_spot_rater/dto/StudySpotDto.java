package dev.kojinaka.study_spot_rater.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudySpotDto {
    private Long id;
    private String name;
    private String address;
    private String amenities;
    private String type;
    private double average_rating;
}
