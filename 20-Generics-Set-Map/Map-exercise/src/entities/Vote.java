package entities;

import java.util.Objects;

public class Vote {

        private String candidateName;
        private double numberVotes;

    public double getNumberVotes() {
        return numberVotes;
    }

    public void setNumberVotes(double numberVotes) {
        this.numberVotes = numberVotes;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public Vote(String candidateName, double numberVotes) {
        this.candidateName = candidateName;
        this.numberVotes = numberVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Double.compare(numberVotes, vote.numberVotes) == 0 && Objects.equals(candidateName, vote.candidateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidateName, numberVotes);
    }
}
