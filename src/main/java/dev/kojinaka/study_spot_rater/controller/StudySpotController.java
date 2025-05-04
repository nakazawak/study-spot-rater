package dev.kojinaka.study_spot_rater.controller;

import dev.kojinaka.study_spot_rater.dto.StudySpotDto;
import dev.kojinaka.study_spot_rater.service.StudySpotService;
import dev.kojinaka.study_spot_rater.service.impl.StudySpotServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/studyspots")
@AllArgsConstructor
public class StudySpotController {
    private StudySpotService studySpotService;

    //Build Add StudySpot REST API
    @PostMapping
    public ResponseEntity<StudySpotDto> createStudySpot(@RequestBody StudySpotDto studyspotDto){
        StudySpotDto savedStudySpot = studySpotService.createStudySpot(studyspotDto);
        return new ResponseEntity<>(savedStudySpot, HttpStatus.CREATED);
    }
}
