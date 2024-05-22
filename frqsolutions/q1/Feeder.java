public class Feeder {
    private int currentFood;

    public Feeder(int currentFood) {
        this.currentFood = currentFood;
    }

    public void simulateOneDay(int numBirds) {
        if (Math.random() < 0.95) {
            currentFood -= numBirds * (int)(41 * Math.random()) + 10;
        } else {
            currentFood = 0;
        }

        if (currentFood < 0) {
            currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        if(currentFood == 0) {
            return 0;
        }
        
        for (int i = 0; i < numDays; i++) {
            simulateOneDay(numBirds);
            if (currentFood == 0) {
                return i + 1;
            }
        }

        return numDays;
    }
}
