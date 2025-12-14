package org.example.qiblafinderapi.controller;


import lombok.RequiredArgsConstructor;
import org.example.qiblafinderapi.dto.requests.QiblaRequest;
import org.example.qiblafinderapi.dto.response.QiblaResponse;
import org.example.qiblafinderapi.serviceImp.QiblaDirectionServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/v1/qiblaFinder")
@RequiredArgsConstructor
public class qiblaFinderAPI {
    private final QiblaDirectionServiceImpl QiblaDirectionServiceImpl;

    @PostMapping
    public ResponseEntity<QiblaResponse> findQiblaDirection(
            @Valid @RequestBody QiblaRequest request
    ) {

        Double angle = QiblaDirectionServiceImpl.getAngleWithNorth(request);

        QiblaResponse response = new QiblaResponse(angle);

        return ResponseEntity.ok(response);
    }



}
