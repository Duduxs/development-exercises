package src.recursivity.challenges;

import java.util.List;
import static java.util.Locale.US;

/**
 * @author Eduardo J
 * JDK 22.0.1 (Zulu) with preview features enabled.
 */

final class SalesDepartment {

    void main() {
        final List<String> sales = List.of(
                "8349,14/09/2024,899.9,ESPORTE",
                "4837,17/09/2024,530.0,VESTUARIO",
                "15281,21/09/2024,1253.99,ESPORTE",
                "15344,27/09/2024,1000.9,VESTUARIO",
                "18317,04/10/2024,250.4,VESTUARIO",
                "18972,11/10/2024,385.5,JARDINAGEM"
        );

        final var result = totalSales(sales,  "VESTUARIO");
        System.out.println(String.format(US,"%.0f VENDAS\nTOTAL = $ %.2f", result[0], result[1]));
    }

    public double[] totalSales(List<String> sales, String department) {
        return totalSales(sales, department, new double[2]);
    }

    public double[] totalSales(List<String> sales, String department, double[] result) {
        if (sales.isEmpty()) {
            return result;
        }

        var head = sales.getFirst().split(",");
        var headDepartment = head[3];
        var headSales = Double.parseDouble(head[2]);

        if (headDepartment.equalsIgnoreCase(department)) {
            result[0] += 1;
            result[1] += headSales;
        }

        var tail = sales.subList(1, sales.size());

        return totalSales(tail, department, result);
    }

}
