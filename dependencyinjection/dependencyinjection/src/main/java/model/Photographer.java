package model;

import jakarta.annotation.PreDestroy;

public class Photographer {
    private String id;
    private String name;
    private String genre;
    private Camera camera;

    public Photographer() {
        System.out.println("Default constructor called - Photographer");
    }

    public Photographer(String id, String name, String genre, Camera camera) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.camera = camera;
        System.out.println("Parameterized constructor called - Photographer");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @PreDestroy
    public void destory() {
        System.out.println("Photography object destroyed");
    }
}
