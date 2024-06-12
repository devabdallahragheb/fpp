package lab8.prob4;

public class Ticket {
    private static int nextId = 0;
    private int id = 0;
    private String description;

    public Ticket(String description) {
        nextId++;
        this.id = nextId;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return STR."""
        Id: \{id}
        Description: \{description}
        """;
    }
}
