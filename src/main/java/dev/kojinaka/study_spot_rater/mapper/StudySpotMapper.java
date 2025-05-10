package dev.kojinaka.study_spot_rater.mapper;

import dev.kojinaka.study_spot_rater.dto.StudySpotDto;
import dev.kojinaka.study_spot_rater.entity.StudySpot;

import java.util.List;


//converts StudySpot ENTITY -> DTO
//Used to send data to the client in REST API response (GET, POST, PUT, DELETE)

public class StudySpotMapper {
    public static StudySpotDto mapToStudySpotDto(StudySpot studyspot)
    {
        return new StudySpotDto(
                studyspot.getId(),
                studyspot.getName(),
                studyspot.getAddress(),
                studyspot.getAmenities(),
                studyspot.getType(),
                studyspot.getAverageRating()
        );
    }

    //Used to convert DTO -> ENTITY
    //Used when receiving data from front-end client (POST, PUT)
    public static StudySpot mapToStudySpotEntity(StudySpotDto studyspotDto){
        return new StudySpot(
                studyspotDto.getId(),
                studyspotDto.getName(),
                studyspotDto.getAddress(),
                studyspotDto.getAmenities(),
                studyspotDto.getType(),
                studyspotDto.getAverage_rating()
                );
    }
}
