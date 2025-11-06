public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation (){
    }
    public FrogSimulation (int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }
    public int hopDistance(){
        int x = 0;
        x = (int) (Math.random() * Integer.MAX_VALUE * 2 - Integer.MAX_VALUE);
        return x;
    }
    public boolean simulate (){
        for (int i = 0; )
    }
}
