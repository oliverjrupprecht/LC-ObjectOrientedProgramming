public class BaseballGame {
    private String team1Name;
    private String team2Name;
    private int[][] gameScore;
    private static final int NUM_INNINGS = 9;

    public BaseballGame(String team1, String team2, int[][] gameScore) {
        this.team1Name = team1;
        this.team2Name = team2;
        this.gameScore = new int[2][NUM_INNINGS];

        for (int i=0; i < 2; i++) {
            for (int j=0; j < NUM_INNINGS; j++) {
                gameScore[i][j] = 0;
            }
        }
    }

    public void setTeam1Name(String team1Name) {
        this.team1Name = team1Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }

    public void setGameScore(int[][] gameScore) {
        this.gameScore = gameScore;
    }
}
