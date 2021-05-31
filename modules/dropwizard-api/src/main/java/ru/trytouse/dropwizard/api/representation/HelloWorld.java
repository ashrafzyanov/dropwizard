package ru.trytouse.dropwizard.api.representation;

public class HelloWorld {

    private long id;

    private String hello;

    private String world;

    public HelloWorld(long id, String hello, String world) {
        this.id = id;
        this.hello = hello;
        this.world = world;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
