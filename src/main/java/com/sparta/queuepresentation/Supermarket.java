package com.sparta.queuepresentation;

public class Supermarket implements Comparable<Supermarket>{

    private String name;
    private double distance;

    public Supermarket(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }

    @Override
    public int compareTo(Supermarket o) {
        if (distance < o.distance) {
            return -1;
        } else if (distance > o.distance) {
            return 1;
        }
        return 0;
    }
}
