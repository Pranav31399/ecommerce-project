package com.pranav.ecommerce.service;

import com.pranav.ecommerce.dto.Purchase;
import com.pranav.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
