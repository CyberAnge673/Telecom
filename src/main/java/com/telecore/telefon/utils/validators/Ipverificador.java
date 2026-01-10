package com.telecore.telefon.utils.validators;

@FunctionalInterface
public interface Ipverificador <T> {
    public boolean validar(T ip);
}
