package Exercicios

import org.junit.Assert
import org.junit.Test

class ReverseStringTest() {

    // @Test - chama o JUnit para o teste de funçoes;

    @Test fun reverseUsingSB() {
        Assert.assertEquals("BSniltok", reverseUsingSB("kotlinSB"))

    }

    @Test fun reverseUsingLoop() {
        Assert.assertEquals("pooLniltok", reverseUsingLoop("kotlinLoop"))

    }
}