package com.itlibrium.bigjet.reservations.domain;

import java.util.Set;

public class Dog {

	private static final Set<String> ALLOWED_ORDERS = Set.of("DO_A_BARREL_ROLL");

    public void takeOrder(String order) {
        if(ALLOWED_ORDERS.contains(order)) {
            //roll the barrel
            return;
        }
        throw new UnsupportedOperationException();
    }
}
