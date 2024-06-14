package lab8.prob4;

public class Test {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();
        System.out.println(STR."""
        Add ticket:
        \{ticketingSystem.addTicket("Row A")} """);
        System.out.println(STR."""
        Add ticket:
        \{ticketingSystem.addTicket("Row B")}""");
        System.out.println(STR."""
        Add ticket:
        \{ticketingSystem.addTicket("Row C")}""");

        System.out.println(STR."""
        Processing ticket:
        \{ticketingSystem.processTicket()}""");

        System.out.println(STR."""
        Next ticket:
        \{ticketingSystem.viewNextTicket()}""");
    }
}
