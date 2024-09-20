public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUART_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded = quartsNeeded / QUART_IN_GALLON;
        int extraQuarts = gallonsNeeded % QUART_IN_GALLON;
        System.out.printIn("A job that needs " + quartsNeeded + "quarts requires " + gallonsNeeded + "gallons plus" + extraQuarts + "quarts.");
    }
}
