package dev.kojinaka.study_spot_rater.service.impl;

import dev.kojinaka.study_spot_rater.entity.StudySpot;
import dev.kojinaka.study_spot_rater.dto.StudySpotDto;
import dev.kojinaka.study_spot_rater.exception.ResourceNotFoundException;
import dev.kojinaka.study_spot_rater.mapper.StudySpotMapper;
import dev.kojinaka.study_spot_rater.repository.StudySpotRepository;
import dev.kojinaka.study_spot_rater.service.StudySpotService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class StudySpotServiceImpl implements StudySpotService {

    private StudySpotRepository studyspotRepository;

    @Override
    public StudySpotDto createStudySpot(StudySpotDto studyspotDto) {
        StudySpot studyspot = StudySpotMapper.mapToStudySpotEntity(studyspotDto); //converts DTO -> JPA entity
        StudySpot savedStudySpot = studyspotRepository.save(studyspot); //saves entity to JPA repo. Returns instance
        return StudySpotMapper.mapToStudySpotDto(savedStudySpot); //converts JPA entity -> DTO for client
    }

    //GET request for StudySpot by Id
    //finds entity by id in the database
    // converts ENTITY -> DTO & returns DTO
    @Override
    public StudySpotDto getStudySpotById(Long studySpotId) {
        StudySpot studySpot = studyspotRepository.findById(studySpotId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee with the given Id: " + studySpotId + " does not exist"));

        return StudySpotMapper.mapToStudySpotDto(studySpot);
    }

    @Override
    public List<StudySpotDto> getAllStudySpots() {
        List<StudySpot> studySpotList = studyspotRepository.findAll();
        return studySpotList.stream().map((studyspot) -> StudySpotMapper.mapToStudySpotDto(studyspot))
                .collect(Collectors.toList());
    }
}
