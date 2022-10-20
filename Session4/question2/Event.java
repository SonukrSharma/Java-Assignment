package Session4.question2;

public class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiserName;
    Event(){
        
    }
    public Event(String name, String detail, String type, String organiserName){
        this.name=name;
        this.detail=detail;
        this.type=type;
        this.organiserName=organiserName;
    }
}
