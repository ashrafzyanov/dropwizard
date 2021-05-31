package ru.trytouse.dropwizard.web;

import io.dropwizard.setup.Environment;
import ru.trytouse.dropwizard.api.usecase.SeyHelloApi;
import ru.trytouse.dropwizard.core.api.impl.SeyHelloApiImpl;
import ru.trytouse.dropwizard.web.api.SeyHelloWebAPI;
import ru.trytouse.dropwizard.web.api.impl.SeyHelloWebAPIIMPL;

public class Application extends io.dropwizard.Application<Configuration> {

    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }

    public void run(Configuration configuration, Environment environment) throws Exception {
        final SeyHelloApi seyHelloApi = new SeyHelloApiImpl();
        final SeyHelloWebAPI seyHelloWebAPI = new SeyHelloWebAPIIMPL(seyHelloApi);


        environment.jersey().register(seyHelloWebAPI);
    }
}
