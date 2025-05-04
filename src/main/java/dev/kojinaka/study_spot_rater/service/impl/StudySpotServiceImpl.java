package dev.kojinaka.study_spot_rater.service.impl;

import dev.kojinaka.study_spot_rater.entity.StudySpot;
import dev.kojinaka.study_spot_rater.dto.StudySpotDto;
import dev.kojinaka.study_spot_rater.mapper.StudySpotMapper;
import dev.kojinaka.study_spot_rater.repository.StudySpotRepository;
import dev.kojinaka.study_spot_rater.service.StudySpotService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class StudySpotServiceImpl implements StudySpotService {

    private StudySpotRepository studyspotRepository;

    @Override
    public StudySpotDto createStudySpot(StudySpotDto studyspotDto) {
        StudySpot studyspot = StudySpotMapper.mapToStudySpotEntity(studyspotDto); //converts DTO -> JPA entity
        StudySpot savedStudySpot = studyspotRepository.save(studyspot); //saves entity to JPA repo. Returns instance
        return StudySpotMapper.mapToStudySpotDto(savedStudySpot); //converts JPA entityy -> DTO for client
    }
}
