package me.longerian.spring.impl;

import me.longerian.spring.Hello;

import java.util.List;
import java.util.Properties;

/**
 * Created by huifeng.hxl on 2014/7/24.
 */
public class HelloBean implements Hello {
    @Override
    public void sayHello() {
        System.out.println("hello spring world, pi = " + pi + " random = " + random + " target = " + target);
    }

    private float pi;

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    private float random;

    public float getRandom() {
        return random;
    }

    public void setRandom(float random) {
        this.random = random;
    }

    private String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    private Properties settings;

    public Properties getSettings() {
        return settings;
    }

    public void setSettings(Properties settings) {
        this.settings = settings;
    }

    private City chosenCity;

    public City getChosenCity() {
        return chosenCity;
    }

    public void setChosenCity(City chosenCity) {
        this.chosenCity = chosenCity;
    }

    private List<City> cities;

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
