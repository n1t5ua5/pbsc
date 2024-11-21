public class NonFiction extends Books {
    // Created child class Non-Fiction

    public NonFiction(String title) {
        super(title);
        setPrice();
        // Constructor method to call parent class & set price
    }

    @Override
    public void setPrice() {
        this.price = 37.99;
        // Override setPrice method to set price for Non-Fiction books
    }

}
