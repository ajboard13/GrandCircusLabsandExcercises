package Labs.Lab5;


class Dice {
    private int numOfSides;

    Dice(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    int rollDice(){
        int result = (int) (Math.random() * (numOfSides+1));
        return result;
    }

    void casinoGame(int result1, int result2){
        if ((result1 + result2) == 1) {
            System.out.println("\tSnake eyes!");
        } else if ((result1 + result2) == 7) {
            System.out.println("\tCraps!");
        } else if ((result1 + result2) == 12) {
            System.out.println("\tBox cars!");
        }
    }

}
