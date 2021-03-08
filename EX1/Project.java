package ro.fasttrackit.curs1.First.EX1;

import java.util.ArrayList;
import java.util.Objects;

public class Project {
    private final String name;
    private final int price;
    private final String description;
    private final ArrayList<String> categories;


    public Project(String name, int price, String description, ArrayList<String> categories) {
        this.name=name;
        this.price=price;
        this.description=description;
        this.categories=categories;
    }


    public String getName() {
        
        return name;
    }

    public int getPrice() {
        
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project=(Project) o;
        return price == project.price && Objects.equals(name, project.name) && Objects.equals(description, project.description) && Objects.equals(categories, project.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, categories);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", categories=" + categories +
                '}';
    }



    static class ProjectBuilder {
        private String name;
        private int price;
        private  String description;
        private  ArrayList<String> categories;

        public static ProjectBuilder Product(){
            return new ProjectBuilder();
        }
        public ProjectBuilder name(String name) {
            this.name=name;
            return this;
        }
        public ProjectBuilder price(int price) {
            this.price=price;
            return this;
        }
        public ProjectBuilder description(String description) {
            this.description = description;
            return this;
        }
        public ProjectBuilder categories(ArrayList<String> categories) {
            this.categories = categories;
            return this;
        }
        public Project build() {
            return new Project(name, price, description, categories);
        }

    }

    // Exercises 3

    static class Shop{
        private String products;
        private int count = 0;

        public Shop(String products, int count) {
            this.products=products;
            this.count=count;
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
}
