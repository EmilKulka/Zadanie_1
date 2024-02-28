import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Receipt {
    float totalNettoValue;
    float basicVatRateNetto;
    float basicVatRateValue;
    float reducedVatRateNetto;
    float reducedVatRateValue;
    ArrayList<Product> itemOfExpanditure;

    public Receipt() {
        this.itemOfExpanditure = new ArrayList<>();
        this.totalNettoValue = 0;
        this.basicVatRateValue = 0;
        this.basicVatRateNetto = 0;
        this.reducedVatRateValue = 0;
        this.reducedVatRateNetto = 0;
    }

    public void sumTotalNettoValue() {

       for(Product product : itemOfExpanditure) {
        totalNettoValue += product.getProductPrice();
        if(product.getVatRate() == 8) {
            reducedVatRateNetto += product.getProductPrice();
        }else if (product.getVatRate() == 23) {
            basicVatRateNetto += product.getProductPrice();
        }
       }       
    }
    
    public void sumVatRate() {
        for(Product product : itemOfExpanditure) {
            if(product.getVatRate() == 23) {
                basicVatRateValue += product.getProductPrice() * (product.getVatRate() / 100.0);
            }
            else if(product.getVatRate() == 8) {
                reducedVatRateValue += product.getProductPrice() * (product.getVatRate() / 100.0);
            }
        }
    }

    public String toString() {
        return String.format("Total Netto value is: %.2f \nTotal 8%% VAT is: %.2f \nTotal 23%% VAT is: %.2f", totalNettoValue, reducedVatRateValue, basicVatRateValue);
    }

    public void printReceipt() {
        sumTotalNettoValue();
        sumVatRate();

        try {
            FileWriter myWriter = new FileWriter("Receipt.md");
            myWriter.write(String.format("|Vat Rate|Total Netto|X|\n|---|---|---|\n|Vat 8%%|%.2f|%.2f|\n|Vat 23%%|%.2f|%.2f|", reducedVatRateNetto, reducedVatRateValue, 
            basicVatRateNetto, basicVatRateValue));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

          System.out.println(toString());
    }
    
}
