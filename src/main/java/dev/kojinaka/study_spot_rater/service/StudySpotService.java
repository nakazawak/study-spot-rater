package dev.kojinaka.study_spot_rater.service;

import dev.kojinaka.study_spot_rater.dto.StudySpotDto;

import java.util.List;

public interface StudySpotService {
    StudySpotDto createStudySpot(StudySpotDto studyspotDto);

    StudySpotDto getStudySpotById(Long studySpotId);

    List<StudySpotDto> getAllStudySpots();
}
