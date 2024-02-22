package ru.sberbank.jd.model;

public enum Type {
    ACCOUNT("ACCOUNT"),
    DEPOSIT("DEPOSIT");

    private final String typeString;

    Type(String statusString) {
        this.typeString = statusString;
    }

    @Override
    public String toString() {
        return typeString;
    }
}
