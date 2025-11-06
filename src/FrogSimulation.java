public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation (int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }
    public int hopDistance(){
        int x = 0;
        x = Math.random() * Integer.MAX_VALUE * 2 - Integer.MAX_VALUE;
        return x;
    }
}
