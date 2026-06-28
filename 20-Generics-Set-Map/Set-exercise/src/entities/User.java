package entities;

import java.util.Objects;

public class User {

    private Integer unicNumber;

    public User(Integer unicNumber) {
        this.unicNumber = unicNumber;
    }

    public Integer getUnicNumber() {
        return unicNumber;
    }

    public void setUnicNumber(Integer unicNumber) {
        this.unicNumber = unicNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((unicNumber == null) ? 0 : unicNumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (unicNumber == null) {
            if (other.unicNumber != null)
                return false;
        } else if (!unicNumber.equals(other.unicNumber))
            return false;
        return true;
    }

}
