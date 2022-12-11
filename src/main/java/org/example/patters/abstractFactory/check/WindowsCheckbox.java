package org.example.patters.abstractFactory.check;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Creando un check Windows");
    }
}
