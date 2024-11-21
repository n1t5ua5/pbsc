public abstract class Books {
    // Created abstract class titled Books
    public static void main (String[] args) {
        protected String title;
        protected double price;
        // Named variable types title & price

    public Books(String title) {
        this.title = title;
        this.price = 0.0;
        // Constructor method to initialize attributes
    }

    public String getTitle() {
        return title;
    }
    // Getter method to return title

    public double getPrice() {
        return price;
        // Getter method to return price
    }

    public abstract void setPrice();
    // Abstract method will be implemented by subclass
}
