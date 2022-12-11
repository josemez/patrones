package org.example.patters.abstractFactory.button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Creando un boton Windows");
    }
}
