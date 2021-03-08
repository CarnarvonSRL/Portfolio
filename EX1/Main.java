package ro.fasttrackit.curs1.First.EX1;

import jdk.jfr.Category;
import ro.fasttrackit.curs1.First.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        immutabilityExercise();
        projectExercises();
        ShopExercises();

    }



    private static void immutabilityExercise() {


        ArrayList<String> categories = new ArrayList<String>();
        categories.add("Electronics");
        categories.add("Clothes");
        categories.add("Food");



        Project project = new Project("Philips", 250, "25 inch", categories);
        System.out.println(project);
        Project project1 = new Project("Levis", 100, "T-shirt", categories);
        System.out.println(project1);
        Project project2 = new Project("Milk", 2, "Food", categories);
        System.out.println(project1);
    }


    private static void projectExercises() {
        ArrayList<String> categories = new ArrayList<String>();
        categories.add("Laptop");

        Project apple = Project.ProjectBuilder.Product()
                .name("Apple")
                .price(450)
                .description("13\"")
                .categories(categories)
                .build();
        System.out.println(apple);

        Project sony = Project.ProjectBuilder.Product()
                .name("Sony")
                .price(450)
                .description("21\"")
                .categories(categories)
                .build();
        System.out.println(sony);
    }


    private static void ShopExercises() {
        Shop shop = new Shop("Laptop", 0);
        System.out.println(shop);
        System.out.println(shop.getProducts());

    }
}
