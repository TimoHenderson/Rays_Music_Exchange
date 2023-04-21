import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int numItemsInStock() {
        return stock.size();
    }

    public void addItem(ISell item) {
        stock.add(item);
    }

    public void removeItem(ISell item) {
        stock.remove(item);
    }

    public double calculatePotentialProfit() {
        return stock.stream().map(ISell::calculateMarkup)
                .reduce(0.0, Double::sum);
    }
}
