package session6.question1;

import java.util.Objects;

public class Event {
    private String eventName;
    private int maxTickets;
    private String ownerName;

    Event() {}

    public Event(String eventName, int maxTickets, String ownerName) {
        this.eventName = eventName;
        this.maxTickets = maxTickets;
        this.ownerName = ownerName;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getMaxTickets() {
        return this.maxTickets;
    }

    public void setMaxTickets(int maxTickets) {
        this.maxTickets = maxTickets;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Event)) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(event.ownerName, this.ownerName);
    }

}