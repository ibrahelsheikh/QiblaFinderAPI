package org.example.qiblafinderapi.serviceImp;


import org.example.qiblafinderapi.dto.requests.QiblaRequest;
import org.example.qiblafinderapi.service.QiblaDirectionService;
import org.example.qiblafinderapi.helper.AngleWithNorthEquation;
import org.springframework.stereotype.Service;


@Service
public class QiblaDirectionServiceImpl implements QiblaDirectionService {

    @Override
    public Double getAngleWithNorth(QiblaRequest request) {

        AngleWithNorthEquation angleWithNorthEquation = new AngleWithNorthEquation();

        return angleWithNorthEquation.calculateAngle(request.getLatitude(), request.getLongitude());
    }

}
