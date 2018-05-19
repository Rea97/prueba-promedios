package me.readeveloper;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomNumberGenerator {
    private int quantity;
    private int decimalQuantity;

    public RandomNumberGenerator() throws Exception {
        this.setQuantity(10);
        this.setDecimalQuantity(5);
    }

    public RandomNumberGenerator(int quantity, int decimalQuantity) throws Exception {
        this.setQuantity(quantity);
        this.setDecimalQuantity(decimalQuantity);
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) throws Exception {
        if (quantity < 1) {
            throw new Exception("Quantity must be greater than 0.");
        }
        this.quantity = quantity;
    }

    public int getDecimalQuantity() {
        return this.decimalQuantity;
    }

    public void setDecimalQuantity(int decimalQuantity) throws Exception {
        if (quantity < 1) {
            throw new Exception("Decimal quantity must be greater than 0.");
        }
        this.decimalQuantity = decimalQuantity;
    }

    private String getDecimalFormatPattern() {
        int i;
        int decimalQuantity = this.getDecimalQuantity();
        StringBuilder decimalFormatPattern = new StringBuilder(".");
        for (i = 0; i < decimalQuantity; i++) {
            decimalFormatPattern.append("#");
        }
        return decimalFormatPattern.toString();
    }

    public double[] make() {
        int i;
        double[] randomNumbers = new double [this.getQuantity()];
        DecimalFormat decimalFormat = new DecimalFormat(this.getDecimalFormatPattern());

        for (i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = Double.parseDouble(decimalFormat.format(Math.random()));
        }

        return randomNumbers;
    }
}
