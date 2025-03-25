package src.strings.exercises;

import java.util.ArrayList;
import java.util.List;

public class IT {

    public static void main(String[] args) {

    }

    public List<String> invalidTransactions(String[] transactions) {

        List<String> invalidTransactions = new ArrayList<>();

        for (var i = 0; i < transactions.length; i++) {
            var currentTransaction = transactions[i];

            var transactionData = currentTransaction.split(",");

            var name = transactionData[0];
            var time = transactionData[1];
            var amount = Double.parseDouble(transactionData[2]);
            var city = transactionData[3];

            if (amount > 1000.00) {
                invalidTransactions.add(currentTransaction);
            }

            for (var j = 1; j < transactions.length; j++) {
                var transaction = transactions[j];

            }

        }

        return List.of("");
    }

}
