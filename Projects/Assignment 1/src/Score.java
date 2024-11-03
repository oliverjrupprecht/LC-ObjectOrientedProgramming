public class Score {
    private int startingScore;
    private int currentScore;
    private int numRoomVisit;
    private int numPuzzleSolved;
    private final int PUZZLE_VALUE = 10;


    public Score(int startingScore) {
        this.startingScore = startingScore;
        this.currentScore = startingScore;
        this.numRoomVisit = 0;
        this.numPuzzleSolved = 0;
    }

    public void visitRoom() {
        numRoomVisit++;
    }

    public void solvePuzzle() {
        numPuzzleSolved++;
    }

    public double getScore() {
        currentScore = startingScore - numRoomVisit + (PUZZLE_VALUE * numPuzzleSolved);
        return currentScore;
    }
}
