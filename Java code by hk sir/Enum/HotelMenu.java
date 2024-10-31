
class HotelMenu {
    public static void main(String[] args) {
        FoodItem[] foodItems = FoodItem.values();
        System.out.println("====================================");
        System.out.println("S.no\tItem\tPrice");
        System.out.println("====================================");
        for (int i = 0; i < foodItems.length; i++) {
            FoodItem foodItem = foodItems[i];
            System.out.println(
                    foodItem.ordinal() + 1 + "\t" +
                            foodItem.name() + "\t" +
                            foodItem.price());
        }

    }

}
