package dev.kojinaka.study_spot_rater.mapper;

import dev.kojinaka.study_spot_rater.dto.StudySpotDto;
import dev.kojinaka.study_spot_rater.entity.StudySpot;

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
