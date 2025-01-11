import java.util.Random;

class Pizza {
    private int numSlices;
    private MeatChoice meatChoice;
    private VegChoice vegChoice;

    public Pizza() {
        Random rand = new Random();
        this.numSlices = new int[]{6, 8, 10}[rand.nextInt(3)];
        this.meatChoice = MeatChoice.values()[rand.nextInt(MeatChoice.values().length)];
        this.vegChoice = VegChoice.values()[rand.nextInt(VegChoice.values().length)];
    }

       public Pizza(int numSlices, MeatChoice meatChoice, VegChoice vegChoice) {
        this.numSlices = numSlices;
        this.meatChoice = meatChoice;
        this.vegChoice = vegChoice;
    }

       public int getNumSlices() {
        return numSlices;
    }

    public MeatChoice getMeatChoice() {
        return meatChoice;
    }

    public VegChoice getVegChoice() {
        return vegChoice;
    }

    @Override
    public String toString() {
        return "Pizza { Slices: " + numSlices + ", Meat: " + meatChoice + ", Vegetable: " + vegChoice + " }";
    }
}
