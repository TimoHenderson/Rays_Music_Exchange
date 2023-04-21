package Behaviours;

public interface ISell {
    double getBuyingPrice();

    double getSellingPrice();

    default double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
