package lesson4.hw;

/**
 * @author Viktor Hevod
 */
public class App {

    static void main() {

        var salesStatisticsTemplate = """
                Product No %d: %s,
                total sales for %d days is EUR %.2f,
                sales by day is EUR %.2f.""";

        var smartphoneProductNumber = 1;
        var smartphoneProductName = "smartphone";
        var smartphoneDaysWithSales = 5;
        var smartphoneSalesAmount = 12153.41;
        var smartphoneDailySales = smartphoneSalesAmount / smartphoneDaysWithSales;

        var laptopProductNumber = 2;
        var laptopProductName = "laptop";
        var laptopDaysWithSales = 7;
        var laptopSalesAmount = 10486.85;
        var laptopDailySales = laptopSalesAmount / laptopDaysWithSales;


        IO.println(
                salesStatisticsTemplate
                        .formatted(
                                smartphoneProductNumber,
                                smartphoneProductName,
                                smartphoneDaysWithSales,
                                smartphoneSalesAmount,
                                smartphoneDailySales
                        ));

        IO.println(
                salesStatisticsTemplate
                        .formatted(
                                laptopProductNumber,
                                laptopProductName,
                                laptopDaysWithSales,
                                laptopSalesAmount,
                                laptopDailySales
                        ));
    }
}
