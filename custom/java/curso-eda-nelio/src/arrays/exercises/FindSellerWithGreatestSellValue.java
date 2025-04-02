package src.arrays.exercises;

public class FindSellerWithGreatestSellValue {

    public static void main(String[] args) {
        Seller[] sellers = {
                new Seller("Barry Allen", 18196.0),
                new Seller("Logan", 4255.0),
                new Seller("Maria", 10298.0),
                new Seller("Ana", 26485.0),
                new Seller("Aurora", 19982.0),
                new Seller("Noah", 15820.0),
                new Seller("Leo", 21412.0),
                new Seller("Alex", 12000.0)
        };

        Seller greatestSeller = find(sellers);
        System.out.println(STR."Seller with greatest sell value: \{greatestSeller}");
    }

    public static Seller find(Seller[] sellers) {
        var greatestSellValue = 0.0;
        Seller greatestSeller = null;

        for (var seller : sellers) {
            if (seller.amount > greatestSellValue) {
                greatestSellValue = seller.amount;
                greatestSeller = seller;
            }
        }

        return greatestSeller;
    }

    public record Seller(String name, Double amount) { }
}
