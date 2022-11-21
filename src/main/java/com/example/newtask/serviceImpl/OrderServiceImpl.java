package com.example.newtask.serviceImpl;

import com.example.newtask.model.*;
import com.example.newtask.repository.*;
import com.example.newtask.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    ProductRepo productRepo;

    @Autowired
    OrderProductRepo orderProductRepo;

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    InvoiceRepo invoiceRepo;
    @Autowired
    ShoppingCartRepo shoppingCartRepo;

    @Autowired
    AddressRepo addressRepo;
    @Override
    public Orders createOrders(List<ShoppingCart> shoppingCarts,Integer customerId) {


        Optional<Customer> customer=this.customerRepo.findById(customerId);

        Address address=customer.get().getAddress();


        if(customer.get().getAddress()==null)
        {
            throw  new RuntimeException("Please Fill up Address");
        }

        float grandTotal=0;
        Orders orders=new Orders();
        orders=this.orderRepo.save(orders);


        for(ShoppingCart shoppingCart:shoppingCarts)
        {
            grandTotal+=shoppingCart.getPrice()*shoppingCart.getQuantity();
            OrdersProduct ordersProduct=new OrdersProduct();
            ordersProduct.setOrderId(orders.getId());
            ordersProduct.setProduct(shoppingCart.getProduct());
            ordersProduct.setProductQuantity(shoppingCart.getQuantity());
            this.orderProductRepo.save(ordersProduct);
            this.shoppingCartRepo.delete(shoppingCart);
        }
        orders.setGrandTotal(grandTotal);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        orders.setDate(dtf.format(now));

        Invoice invoice=new Invoice();

        invoice.setOrder(orders);
        invoice.setAddress(address);
        invoice.setCustomer(customer.get());

        this.invoiceRepo.save(invoice);

        return this.orderRepo.save(orders);
    }

    @Override
    public List<OrdersProduct> getOrderProduct(Integer customerId) {

        Integer orderId=this.invoiceRepo.findByCustomerId(customerId).getOrder().getId();
        return this.orderProductRepo.findByOrderId(orderId);
    }
}
