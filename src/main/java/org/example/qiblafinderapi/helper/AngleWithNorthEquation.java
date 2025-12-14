package org.example.qiblafinderapi.helper;


public class AngleWithNorthEquation {

    private static final double KAABA_LAT = Math.toRadians(21.4225);
    private static final double KAABA_LON = Math.toRadians(39.8262);

    public double calculateAngle(double latitude, double longitude) {

        double lat1 = Math.toRadians(latitude);
        double lon1 = Math.toRadians(longitude);

        double deltaLon = KAABA_LON - lon1;

        // Forward azimuth formula
        double y = Math.sin(deltaLon);
        double x = Math.cos(lat1) * Math.tan(KAABA_LAT)
                - Math.sin(lat1) * Math.cos(deltaLon);

        double angle = Math.toDegrees(Math.atan2(y, x));

        return (angle + 360.0) % 360.0;
    }
}
