package behavioral.observer;

public class EventGenerator {
    private EventManager eventManager;

    public EventGenerator(EventManager eventManager) {
        this.eventManager = new EventManager("eventA", "eventB");
    }

    public void eventA(){
        //do A
        eventManager.notify("eventA");
    }
}
