
public class T20 extends Match{

    @Override
    float calculateRunrate() {
        float reqRunRate=(float)((getTarget()-getCurrentScore())/calculateBalls());
        return reqRunRate * 6;
    }

    @Override
    int calculateBalls() {
        int over = (int)(getCurrentOver()*10);
        int ballsRemaining=(20*6)-((over%10)+(over/10)*6);
        return ballsRemaining;
    }
    
}
