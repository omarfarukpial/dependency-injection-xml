package model;

import jakarta.annotation.PreDestroy;

public class Camera {
    private String brand;

    public Camera() {
        System.out.println("Default constructor called - Camera");
    }

    public Camera(String brand) {
        this.brand = brand;
        System.out.println("Parameterized constructor called - Camera");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @PreDestroy
    public void destory() {
        System.out.println("Camera object destroyed");
    }
}
