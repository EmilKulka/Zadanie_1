import java.util.ArrayList;

public class ReducedVatRateValueCalculator {
    
    public float sumReducedVatRateValue(ArrayList<Product> itemOfExpanditure) {
        float reducedVatRateValue = 0;
        
        for(Product product : itemOfExpanditure) {
            if(product.getVatRate() == 8) {
                reducedVatRateValue += product.getProductPrice() * (product.getVatRate() / 100.0);
            }
        }

        return reducedVatRateValue;
    }

}
