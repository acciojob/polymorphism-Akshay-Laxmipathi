package com.driver;

public class Main {

    class Product {
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Main mainObject = new Main();
        Product p = mainObject.new Product();
        int result;
        double result2;
        result = p.product(10, 20);
        result = p.product(10, 20, 30);
        result2 = p.product(10.5, 20.5);
    }
}