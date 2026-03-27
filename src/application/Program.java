package application;

import entities.Product;
import services.ProductService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {


       List<Product> list = new ArrayList<>();

       list.add(new Product("TV", 900.00));
       list.add(new Product("Mouse", 70.00));
       list.add(new Product("Tablet", 450.00));
       list.add(new Product("HD Case", 400.90));

       list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);


       list.forEach(System.out::println);
    }
}
