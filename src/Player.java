import java.util.LinkedList;
import java.util.List;

public class Player {
    enum Status {
        STAY, HIT
    }
    private List<Card> cards;
    private Status status;
    Player() {
        this.cards = new LinkedList<Card>();
        this.status = Status.HIT;
    }
//  ...
}