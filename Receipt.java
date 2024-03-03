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
    TotalNettoValueCalculator nettoCalc;
    BasicVatRateNettoCalculator basicVatNettoCalc;
    ReducedVatRateNettoCalculator reducedVatNettoCalc;
    BasicVatRateValueCalculator basicVatValueCalc;
    ReducedVatRateValueCalculator reducedVatValueCalc;

    public Receipt() {
        this.itemOfExpanditure = new ArrayList<>();
        this.nettoCalc = new TotalNettoValueCalculator();
        this.basicVatNettoCalc = new BasicVatRateNettoCalculator();
        this.reducedVatNettoCalc = new ReducedVatRateNettoCalculator();
        this.basicVatValueCalc = new BasicVatRateValueCalculator();
        this.reducedVatValueCalc = new ReducedVatRateValueCalculator();
        this.totalNettoValue = 0;
        this.basicVatRateValue = 0;
        this.basicVatRateNetto = 0;
        this.reducedVatRateValue = 0;
        this.reducedVatRateNetto = 0;
        
    }
    
    public void printReceipt() {

        try {
            FileWriter myWriter = new FileWriter("Receipt.md");
            myWriter.write(String.format("|Vat Rate|Total Netto|Total Value|\n|---|---|---|\n|Vat 8%%|%.2f|%.2f|\n|Vat 23%%|%.2f|%.2f|", 
            reducedVatNettoCalc.sumReducedVatRateNetto(itemOfExpanditure), reducedVatValueCalc.sumReducedVatRateValue(itemOfExpanditure), 
            basicVatNettoCalc.sumBasicVatRateNetto(itemOfExpanditure), basicVatValueCalc.sumBasicVatRateValue(itemOfExpanditure)));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
