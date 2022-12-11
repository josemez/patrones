package org.example.patters.abstractFactory.button;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Creando un boton Mac Os");
    }
}
