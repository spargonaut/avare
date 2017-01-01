package com.ds.avare.touch;

/**
 * Created by pasniak on 12/4/2016.
 */
public class LongPressedDestination implements Comparable<LongPressedDestination> {
    private String name, type;

    public double getDistance() {
        return distance;
    }

    private double distance;

    public LongPressedDestination(String name, String type) {
        this.name = name;
        this.type = type;
        this.distance = 0.0;
    }

    public LongPressedDestination(String name, String type, double distance) {
        this.name = name;
        this.type = type;
        this.distance = distance;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String toJSON() {
        String json = "{";
        json += "\"name\":\"" + this.name + "\",";
        json += "\"type\":\"" + this.type + "\",";
        json += "\"distance\":\"" + this.distance + "\"";
        json += "}";
        return json;
    }

    public int compareTo(LongPressedDestination other) {
        if (this.distance < other.getDistance()) {
            return -1;
        } else {
            return 1;
        }
    }
}