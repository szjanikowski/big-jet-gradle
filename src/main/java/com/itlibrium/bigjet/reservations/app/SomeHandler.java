package com.itlibrium.bigjet.reservations.app;

import com.itlibrium.bigjet.reservations.domain.Dog;

public class SomeHandler
{
    public void handle(SomeCommand command)
    {
        Dog dog = new Dog();
        dog.takeOrder(command.getOrder());
    }
}
