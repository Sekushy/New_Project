package com.company;

public class Mug {
    private int volume;
    private int dimension;
    private int maxVolume;
    private String color;
    private String content;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getDimension() {
        return this.dimension;
    }

    public String getColor() {
        return this.color;
    }

    public String getContent() {
        return this.content;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void drink(int volume){
        setVolume(getVolume() - volume);
    }

    public void fill(int volume) {
        
        setVolume(getVolume() + volume);
    }

}
