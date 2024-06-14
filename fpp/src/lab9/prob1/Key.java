package lab9.prob1;

import java.util.Objects;

public class Key {
    private final String firstName;
    private final String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Key key))
            return false;
        if (key.firstName == null || key.lastName == null)
            return false;
        return key.firstName.equals(firstName) && key.lastName.equals(lastName);
    }
}
