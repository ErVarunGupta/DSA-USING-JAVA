package Basics.Abstraction;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.vegetarian();
        b.non_vegetarian();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal( in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up , down, left, right, diagonal (by one steps)");
    }
}


// Multiple inheritance implementation

interface Herbivore{
    void vegetarian();
}

interface Carnovore{
    void non_vegetarian();
}

class Bear implements Herbivore, Carnovore{
    public void vegetarian(){
        System.out.println("Herbivore is vegetarian");
    }

    public void non_vegetarian(){
        System.out.println("Carnovore is non vegetarian");
    }
}

