package ru.trytouse.dropwizard.core.api.impl;

import ru.trytouse.dropwizard.api.representation.HelloWorld;
import ru.trytouse.dropwizard.api.usecase.SeyHelloApi;

public class SeyHelloApiImpl implements SeyHelloApi {

    public HelloWorld sey() {
        return new HelloWorld(1L, "Hellllo", "B World!");
    }
}
