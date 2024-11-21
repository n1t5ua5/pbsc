public class Fiction extends Books {
    // Created child class Fiction

    public Fiction(String title) {
        super(title);
        setPrice();
        // Constructor method to call parent class & set price
    }

    @Override
    public void setPrice() {
        this.price = 24.99;
        // Override setPrice method to set price for Fiction books
    }

}
