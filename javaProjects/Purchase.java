// created class named Purchase
public class Purchase {

        // instantiatied required variables
        public int invoice;
        public double sale;
        public double tax;

        // set method for invoice
        public void setInvoice(int invoice) {
            this.invoice = invoice;
        }

        // set method for sale & tax
        public void setSale(double sale) {
            this.sale = sale;
            tax = sale * 0.05;
        }

        // display method for actual purchase
        public void Details() {
            System.out.println("Invoice Number: " + invoice);
            System.out.println("Total Sale: $ " + sale);
            System.out.println("Tax Amount: $ " + tax);
            System.out.println("Total Purchase: $ " + (sale + tax));
        }
    }
