void main() {
    char currency = '\u20AC';
    Product [] productsArray = new Product[2];
    productsArray[0] = new Product(1, "Alice","smartphone", currency,305.99," Moon Street, 10");
    productsArray[1] = new Product(2, "Tom","laptop", currency,570.95,"Terra Street, 17");

    String template= """
Order No %s Client: %s.
Product: %s,
price %c %.2f.
Address: %s.
            """;
    for( int i = 0; i <  productsArray.length; i++ ){
        System.out.println("========check======="+i);
        System.out.printf(
                template,
                productsArray[i].orderNo,
                productsArray[i].client,
                productsArray[i].productStr,
                productsArray[i].priceCurrency,
                productsArray[i].priceSum,
                productsArray[i].address

        );
    };
}
static class Product {
    public int orderNo;
    public String client;
    public String  productStr;
    public char priceCurrency;
    public double priceSum;
    public String address;

    Product(
            int orderNo,
            String client,
            String  productStr,
            char priceCurrency,
            double priceSum,
            String address
    ){
        this.orderNo = orderNo;
        this.client = client;
        this.productStr = productStr;
        this.priceCurrency = priceCurrency;
        this.priceSum = priceSum;
        this.address = address;
    }
}