
public class InterfacesConcept {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

    }
}

interface ChasePlayer {
    void moves();
}

class Queen implements ChasePlayer {
    public void moves() {
        System.out.println("up, down left, right, diagonal");
    }
}

class Rook implements ChasePlayer {
    public void moves() {
        System.out.println("up, down left, right");
    }
}
