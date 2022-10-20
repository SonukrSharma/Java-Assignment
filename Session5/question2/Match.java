
public abstract class Match {
    private int currentScore;
    private float currentOver;
    private int target;

    void display(){
        System.out.println("Requirements:\nNeed "+(getTarget()-getCurrentScore())+" in "+calculateBalls()+" balls");
        System.out.println("Require Run Rate - "+calculateRunrate());
    }
    abstract float calculateRunrate();
    abstract int calculateBalls();

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public float getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(float currentOver) {
        this.currentOver = currentOver;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

}
