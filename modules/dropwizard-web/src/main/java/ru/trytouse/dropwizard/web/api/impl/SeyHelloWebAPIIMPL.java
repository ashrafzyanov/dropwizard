package ru.trytouse.dropwizard.web.api.impl;

import ru.trytouse.dropwizard.api.representation.HelloWorld;
import ru.trytouse.dropwizard.api.usecase.SeyHelloApi;
import ru.trytouse.dropwizard.web.api.SeyHelloWebAPI;

public class SeyHelloWebAPIIMPL implements SeyHelloWebAPI {

    private SeyHelloApi seyHelloApi;

    public SeyHelloWebAPIIMPL(SeyHelloApi seyHelloApi) {
        this.seyHelloApi = seyHelloApi;
    }

    public HelloWorld sey(String name) {
        return seyHelloApi.sey();
    }

}
