import java.util.ArrayList;

public class BasicVatRateValueCalculator {
    
    public float sumBasicVatRateValue(ArrayList<Product> itemOfExpanditure) {
        float basicVatRateValue = 0;

        for(Product product : itemOfExpanditure) {
            if(product.getVatRate() == 23) {
                basicVatRateValue += product.getProductPrice() * (product.getVatRate() / 100.0);
            }
        }

        return basicVatRateValue;
    }
}
