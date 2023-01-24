package com.sha.backendProject.repostory.projection;

import java.time.LocalDateTime;

public interface PurchaseBusiness {
    String getName();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
