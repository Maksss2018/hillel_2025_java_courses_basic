/**
 * @author Viktor Hevod
 */


void main() {

    // byte short int long
    // float double
    // char
    // boolean


//    String template = "Шановний %s, вітаю вас з купівлею %s. Ви придбали %x товарів, сума вашого замовлення складає %.2f.";

    boolean b1 = true;
    boolean b2 = false;
    char c = 'a';
    byte b = 100;
    short s = 10000;
    int i = 100000;
    long l = 10000000L;
    double d = 1.234567;
    float f = 3.14f;


    String template = """
            Name: %s
            Age: %d"
            """;

    String name = "Alice";
    int age = 25;

    String result = String.format(template, name, age);
    System.out.println(result);


    String s1 = "hello!";

    String s2 = new String("world!");

    char[] chars = {'J', 'a', 'v', 'a'};
    String s3 = new String(chars);

    byte[] bytes = {65, 66, 67};
    String s4 = new String(bytes);

    String s14 = String.join(" - ", "J", "A", "V", "A");


    String helloWorld = "hello" + "world";


    System.out.println(
            helloWorld
    );

    String purchasingTemplate = """
            Dear %s,
            
            Thank you for your purchase!
            
            Order Summary:
            ----------------------------------------
            Order ID (decimal): %d
            
            Product: %s
            Quantity: %d units
            Unit price: %c%.2f
            Total amount: %c%,.2f
            
            Discount applied: %.2f%%
            Loyalty points change: %+d points
            
            Shipping weight: %e kg
            Express delivery: %b
            
            Payment method: %10s
            ----------------------------------------
            
            Thank you for choosing our store!
            Have a great day!
            """;

    String message = purchasingTemplate
            .formatted(
                    "John Doe",
                    1, "Wireless Headphones", 2,
                    '$',
                    89.99,
                    '$',
                    179.98,
                    15.0,
                    +30,
                    0.450,
                    true,
                    "VISA"
            );

    System.out.println(message);



}