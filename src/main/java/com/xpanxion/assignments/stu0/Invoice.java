package com.xpanxion.assignments.stu0;

import java.util.ArrayList;

public class Invoice extends Base {
//    private int id;
    private ArrayList<Product> products = new ArrayList<Product>();
    public Invoice(int id)
    {
        this.id = id;
    }
    public void addProduct(Product product)
    {
        products.add(product);
    }
    public double getTotalCost()
    {
        double sum = 0;
        for (Product product : products)
        {
            sum += product.getCost();
        }
        return sum;
    }
}
