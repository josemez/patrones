package org.example.patters.abstractFactory.factories;

import org.example.patters.abstractFactory.button.Button;
import org.example.patters.abstractFactory.check.Checkbox;
import org.example.patters.abstractFactory.button.MacOsButton;
import org.example.patters.abstractFactory.check.MacOsCheckbox;

public class MacOSFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
