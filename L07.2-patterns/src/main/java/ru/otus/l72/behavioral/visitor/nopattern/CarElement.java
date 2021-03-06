package ru.otus.l72.behavioral.visitor.nopattern;

/**
 * Created by tully.
 * <p>
 * Element in the Visitor patter.
 */
public interface CarElement {
    String getName();

    void doWash();

    void doRepair();
}
