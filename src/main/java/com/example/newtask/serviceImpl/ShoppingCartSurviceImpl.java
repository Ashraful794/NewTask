package com.example.newtask.serviceImpl;

import com.example.newtask.model.Customer;
import com.example.newtask.model.Product;
import com.example.newtask.model.ShoppingCart;
import com.example.newtask.repository.CustomerRepo;
import com.example.newtask.repository.ProductRepo;
import com.example.newtask.repository.ShoppingCartRepo;
import com.example.newtask.service.ShoppingCartSurvice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartSurviceImpl implements ShoppingCartSurvice {
    @Autowired
    ShoppingCartRepo shoppingCartRepo;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    ProductRepo productRepo;

    @Override
    public ShoppingCart createCarts(ShoppingCart shoppingCart,Integer customerId,Integer productId) {

        Optional<Product> product=this.productRepo.findById(productId);
        Optional<Customer> customer=this.customerRepo.findById(customerId);

        if(product==null)
        {
            throw new RuntimeException("Product Not Found");
        }
        if (customer==null)
        {
            throw new RuntimeException("Customer Not Found");
        }

        if(shoppingCart.getQuantity()>product.get().getAvailableQuantity())
        {
            throw new RuntimeException("Short of Quantity") ;
        }

        if(this.shoppingCartRepo.findByCustomerIdAndProductId(customerId,productId)!=null)
        {
            throw new RuntimeException("Product already exits") ;
        }

        product.get().setAvailableQuantity(product.get().getAvailableQuantity()-shoppingCart.getQuantity());

        shoppingCart.setPrice(product.get().getPrice());
        shoppingCart.setCustomer(customer.get());
        shoppingCart.setProduct(product.get());

        return this.shoppingCartRepo.save(shoppingCart);
    }

    @Override
    public List<ShoppingCart> getCarts(Integer customerId) {
        return this.shoppingCartRepo.findByCustomerId(customerId);
    }

    @Override
    public String deleteCarts(Integer customerId, Integer productId) {
        ShoppingCart shoppingCart=this.shoppingCartRepo.findByCustomerIdAndProductId(customerId,productId);

        if(shoppingCart==null)
        {
            throw new RuntimeException("Item Not Found");
        }

        this.shoppingCartRepo.delete(shoppingCart);
        return "Deleted";

    }
}
