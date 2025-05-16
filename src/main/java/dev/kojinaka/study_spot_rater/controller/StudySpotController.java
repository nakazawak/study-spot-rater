package dev.kojinaka.study_spot_rater.controller;

import dev.kojinaka.study_spot_rater.dto.StudySpotDto;
import dev.kojinaka.study_spot_rater.service.StudySpotService;
import dev.kojinaka.study_spot_rater.service.impl.StudySpotServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studyspots")
@AllArgsConstructor
public class StudySpotController {
    private StudySpotService studySpotService;

    //Build ADD StudySpot REST API
    @PostMapping
    public ResponseEntity<StudySpotDto> createStudySpot(@RequestBody StudySpotDto studyspotDto){
        StudySpotDto savedStudySpot = studySpotService.createStudySpot(studyspotDto);
        return new ResponseEntity<>(savedStudySpot, HttpStatus.CREATED);
    }

    //Build GET StudySpot REST API
    @GetMapping({"{id}"})
    public ResponseEntity<StudySpotDto> getStudySpotById(@PathVariable("id") Long studySpotId){
        StudySpotDto studySpotDto = studySpotService.getStudySpotById(studySpotId);
        return ResponseEntity.ok(studySpotDto);
    }

    //Build GET ALL StudySpot REST API
    @GetMapping
    public ResponseEntity<List<StudySpotDto>> getAllStudySpots(){
        List<StudySpotDto> studySpotDtoList = studySpotService.getAllStudySpots();
        return ResponseEntity.ok(studySpotDtoList);
    }

    //Build UPDATE StudySpot REST API
    @PutMapping("{id}")
    public ResponseEntity<StudySpotDto> updateStudySpot(@PathVariable("id") Long studySpotId, @RequestBody StudySpotDto updatedStudySpot) {
        StudySpotDto studySpotDto = studySpotService.updateStudySpot(studySpotId, updatedStudySpot);
        return ResponseEntity.ok(studySpotDto);
    }

    //Build DELETE StudySpot REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudySpot(@PathVariable("id") Long studySpotId) {
        studySpotService.deleteStudySpot(studySpotId);
        return ResponseEntity.ok("Study Spot deleted successfully!");
    }
}
