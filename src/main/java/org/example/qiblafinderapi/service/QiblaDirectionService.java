package org.example.qiblafinderapi.service;

import org.example.qiblafinderapi.dto.requests.QiblaRequest;

public interface QiblaDirectionService {


    Double getAngleWithNorth(QiblaRequest request);


}
