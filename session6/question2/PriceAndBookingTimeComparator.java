package session6.question2;

import java.util.Comparator;

public class PriceAndBookingTimeComparator extends TicketBooking implements Comparator<PriceAndBookingTimeComparator> {
    private TicketBooking ticketBooking;

    public PriceAndBookingTimeComparator(TicketBooking ticketBooking) {
        this.ticketBooking=ticketBooking;
    }
    
    public TicketBooking getTicketBooking() {
        return ticketBooking;
    }

    public void setTicketBooking(TicketBooking ticketBooking) {
        this.ticketBooking = ticketBooking;
    }

    @Override
    public int compare(PriceAndBookingTimeComparator t1,PriceAndBookingTimeComparator t2) {
        if (t1.getTicketBooking().getPrice()!=t2.getTicketBooking().getPrice()) {
          return (int)(t1.getTicketBooking().getPrice() - t2.getTicketBooking().getPrice());
        }
        return t1.getTicketBooking().getBookingTime().compareTo(t2.getTicketBooking().getBookingTime());        
    }
}
    
