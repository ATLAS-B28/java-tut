package Experimental.functionalpro;

import java.util.Objects;

import java.time.Instant;

public final class SensorEvent {
    //we will cover diff aspects of fp - here we cover immutability of data
    private final String sensorId;
    private final double temp;
    private final Instant timeStamp;
    public SensorEvent(String sensorId, double temp) {
        this.sensorId = Objects.requireNonNull(sensorId);//not null values;
        this.temp = temp;
        this.timeStamp = Instant.now();
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getTemp() {
        return temp;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return "SensorEvent{" +
                "sensorId='" + sensorId + '\'' +
                ", temperature=" + temp +
                ", timestamp=" + timeStamp +
                '}';
    }
}
