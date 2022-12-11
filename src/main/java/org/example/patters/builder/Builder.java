package org.example.patters.builder;

import org.example.patters.builder.cars.CarType;
import org.example.patters.builder.components.Engine;
import org.example.patters.builder.components.GPSNavigator;
import org.example.patters.builder.components.Transmission;
import org.example.patters.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
