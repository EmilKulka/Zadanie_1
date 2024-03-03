import java.util.ArrayList;

public class BasicVatRateNettoCalculator {
    
    public float sumBasicVatRateNetto(ArrayList<Product> itemOfExpanditure) {
        float basicVatRateNetto = 0;

        for(Product product : itemOfExpanditure) {
            if (product.getVatRate() == 23) {
                basicVatRateNetto += product.getProductPrice();
            }
    }

        return basicVatRateNetto;
    }
}