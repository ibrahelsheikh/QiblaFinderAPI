package org.example.qiblafinderapi.dto.requests;

import lombok.Data;
import jakarta.validation.constraints.NotNull;


@Data
public class QiblaRequest {
    @NotNull(message = "Latitude must not be null")
    private Double latitude;

    @NotNull(message = "Longitude must not be null")
    private Double longitude;

}
