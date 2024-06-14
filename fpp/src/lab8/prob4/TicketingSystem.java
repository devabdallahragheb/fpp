package lab8.prob4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        ticketQueue = new LinkedList<>();
    }

    public Ticket addTicket(String description) {
        Ticket ticket = new Ticket(description);
        ticketQueue.add(ticket);
        return ticket;
    }

    public Ticket processTicket() {
        return ticketQueue.poll();
    }

    public Ticket viewNextTicket() {
        return ticketQueue.peek();
    }
}
