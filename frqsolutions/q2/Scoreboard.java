public class Scoreboard {
    private String t1;
    private String t2;
    private int s1 = 0;
    private int s2 = 0;
    private boolean turn = true;

    public Scoreboard(String t1, String t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void recordPlay(int score) {
        if (turn) {
            s1 += score;
        } else {
            s2 += score;
        }
        if (score == 0) {
            turn = !turn;
        }
    }

    public String getScore() {
        String s;
        if (turn) {
            s = t1;
        } else {
            s = t2;
        }

        return s1 + "-" + s2 + "-" + s;
    }
}
