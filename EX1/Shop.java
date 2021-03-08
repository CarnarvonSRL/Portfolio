package ro.fasttrackit.curs1.First.EX1;

import java.util.Objects;

public class Shop {
    private String products;
    private int count = 0;



    public Shop(String products, int count) {
        this.products=products;
        this.count=count;
        if (count >= 1) {
            System.out.println("Products in the bag");
        } else {
            System.out.println("Your bag is empty");
        }
    }

    public String getProducts() {
        return products;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop=(Shop) o;
        return count == shop.count && Objects.equals(products, shop.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, count);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products='" + products + '\'' +
                ", count=" + count +
                '}';
    }
}
