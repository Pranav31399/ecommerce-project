package com.pranav.ecommerce.dto;

import com.pranav.ecommerce.entity.Address;
import com.pranav.ecommerce.entity.Customer;
import com.pranav.ecommerce.entity.Order;
import com.pranav.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
