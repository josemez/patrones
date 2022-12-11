package org.example.patters.abstractFactory.check;

public class MacOsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Creando un check Mac Os");
    }
}
