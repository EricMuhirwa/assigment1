enum MeatChoice {
    PEPPERONI, SAUSAGE, CHICKEN;
}

enum VegChoice {
    OLIVES, MUSHROOMS, ONIONS, PEPPERS, SPINACH;
}

class InvalidPizzaChoiceException extends Exception {
    public InvalidPizzaChoiceException(String message) {
        super(message);
    }
}