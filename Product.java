public class Product {

    private String productName;
    private float productPrice;
    private float vatRate;

    public Product(String productName, float productPrice, float vatRate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.vatRate = vatRate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getVatRate() {
        return vatRate;
    }

    public void setVatRate(float vatRate) {
        this.vatRate = vatRate;
    }

    
    
}
