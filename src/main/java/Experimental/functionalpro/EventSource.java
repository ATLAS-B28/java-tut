package Experimental.functionalpro;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class EventSource {
    //this is here to simulate data simulations
    //flux is created from sensor sources, other sources could be
    //collections, data generators, async operations
    public Flux<SensorEvent> generateSensorEvents() {
        return Flux.interval(Duration.ofSeconds(1))
                //emit sensor events every second
                //and map it to a new sensor event object
                .map(i->new SensorEvent("sensor-"+(i%3), 20.0+Math.random()*10))
                .take(10);//take is the limit set
    }
}
