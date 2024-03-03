import java.util.ArrayList;

public class ReducedVatRateNettoCalculator {

    public float sumReducedVatRateNetto(ArrayList<Product> itemOfExpanditure) {
        float reducedVatRateNetto = 0;

        for(Product product : itemOfExpanditure) {
            if (product.getVatRate() == 8) {
                reducedVatRateNetto += product.getProductPrice();
            }
    }

        return reducedVatRateNetto;
    }
}
