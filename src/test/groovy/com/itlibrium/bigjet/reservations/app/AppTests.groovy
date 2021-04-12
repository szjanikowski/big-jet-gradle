package com.itlibrium.bigjet.reservations.app

import spock.lang.Specification

class AppTests extends Specification {

    def _someHandler = new SomeHandler()

    def "Order a dog to fly"() {
        when:
        orderedDogTo("FLY")
        then:
        thrown UnsupportedOperationException
    }

    def "Order a dog to do a barrel roll"() {
        when:
        orderedDogTo("DO_A_BARREL_ROLL")
        then:
        orderAccepted()
    }

    def orderAccepted = { return true }

    def orderedDogTo = { order -> _someHandler.handle(new SomeCommand(order)) }


}
