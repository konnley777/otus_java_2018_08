package ru.otus.l72.structural.adapter;

/**
 * Created by tully.
 * <p>
 * Client in the Adapter pattern.
 */
public class Main {
    public static void main(String[] args) {
        PolarPlotter adapter = new Polar2CartesianAdapter(new CartesianPoint());

        adapter.setPoint(0, 42);
        adapter.setPoint(1, Math.PI / 2);
        adapter.setPoint(2, Math.PI);
    }
}
