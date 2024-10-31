

enum FoodItem {
    IDLY(35), DOSA(40), PURI(50), PONGAL(45);

    private double price;

    FoodItem(double price) {
        this.price = price;
    }

    public double price() {
        return price;
    }
}
