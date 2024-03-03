import java.util.ArrayList;

public class TotalNettoValueCalculator {
  
    public float sumTotalNettoValue(ArrayList<Product> itemOfExpanditure) {
        float totalNettoValue = 0;
        
        for(Product product : itemOfExpanditure) {
         totalNettoValue += product.getProductPrice();
        }       

        return totalNettoValue;
     }
     
}
