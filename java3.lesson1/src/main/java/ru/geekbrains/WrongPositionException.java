package ru.geekbrains;

public class WrongPositionException extends Exception {
    public WrongPositionException(String message) {
        super(message);
    }
}