import java.util.ArrayList;

public class Receipt {
    float totalNettoValue;
    float basicVatRate;
    float reducedVatRate;
    ArrayList<Product> itemOfExpanditure;

    public Receipt() {
        this.itemOfExpanditure = new ArrayList<>();
        this.totalNettoValue = 0;
        this.basicVatRate = 0;
        this.reducedVatRate = 0;
    }

    public void sumTotalNettoValue() {

       for(Product product : itemOfExpanditure) {
        totalNettoValue += product.getProductPrice();
       }
    }
    
    public void sumVatRate() {

        for(Product product : itemOfExpanditure) {
            if(product.getVatRate() == 23) {
                basicVatRate += product.getProductPrice() * (product.getVatRate() / 100.0);
            }
            else if(product.getVatRate() == 8) {
                reducedVatRate += product.getProductPrice() * (product.getVatRate() / 100.0);
            }
        }
    }

    public String toString() {
        return String.format("Total Netto value is: %.2f \nTotal 23 VAT is: %.2f \nTotal 8 VAT is: %.2f", totalNettoValue, basicVatRate, reducedVatRate);
    }

    public static void main(String[] args) {
        Receipt receipt1 = new Receipt();

        Product product1 = new Product("Clean Code, Robert C. Martin",100,8);
        Product product2 = new Product("Applying UML and Patterns, C. Larman",300,8);
        Product product3 = new Product("Shipping",50, 23);

        receipt1.itemOfExpanditure.add(product1);
        receipt1.itemOfExpanditure.add(product2);
        receipt1.itemOfExpanditure.add(product3);
        
        receipt1.sumTotalNettoValue();
        receipt1.sumVatRate();

        System.out.println(receipt1.toString());
    }

}
