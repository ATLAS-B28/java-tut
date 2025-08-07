package Experimental.functionalpro;

import java.time.Duration;

public class EventProcessor {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();

        eventSource.generateSensorEvents()
                //filter events where temp > 25
                //map to a func to transform event into string to alert user
                //also take in account error messaging
                .filter(event -> event.getTemp() > 25.0)//filter events where temp lets say is > 25
                .map(event -> "High Temperature alert for " + event.getSensorId())
                .delayElements(Duration.ofMillis(500))
                .subscribe(
                        alertMsg -> {
                            System.out.println("Broadcasting Alert: " + alertMsg);
                            WebSocEmitter.broadcast(alertMsg);
                        },
                        error -> System.out.println("Error processing alert: "+error.getMessage()),
                        () -> System.out.println("Event processing completed.")
                );
        //keep the main thread alive to see the async stream in action
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
