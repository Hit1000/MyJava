package Problem;

class level {
    int point=0;
    boolean reached=false;

    level(int point, boolean reached){
        this.reached = reached;
        this.point = point;
    }
    public boolean goalReached(){
        return reached;
    }
    public int getPoints(){
        return point;
    }
}

class game{
    private level level1;
    private level level2;
    private level level3;

    public game(){
        level1 = new level(200, true);
        level2 = new level(100, true);
        level3 = new level(100, true);
    }
    public boolean isBonus(){
        return false;
    }

    public void play(){

    }

    public int getScore(){
        int score = 0;
        if (level1.goalReached()) {
            score = level1.getPoints();
            if (level2.goalReached()) {
                score += level2.getPoints();
                if (level3.goalReached()) {
                    score += level3.getPoints();
                }
            }
        }
        if (isBonus()) {
            score *= 3;
        }
        return score;
    }

    public int playManyTimes(int num){
        int max = 0;
        for (int i = 0; i < num; i++) {
            play();
            int score = getScore();
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
}

public class collageExam22 {
    public static void main(String[] args) {

    }
}