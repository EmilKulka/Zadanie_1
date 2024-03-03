public class Test {
    public static void main(String[] args) {
        
        Product product1 = new Product("Clean Code, Robert C. Martin",100,8);
        Product product2 = new Product("Applying UML and Patterns, C. Larman",300,8);
        Product product3 = new Product("Shipping",50, 23);

        Receipt receipt1 = new Receipt();
        receipt1.itemOfExpanditure.add(product1);
        receipt1.itemOfExpanditure.add(product2);
        receipt1.itemOfExpanditure.add(product3);
        
        receipt1.printReceipt();

    }
    
} 
