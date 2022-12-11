package org.example.patters.abstractFactory.factories;

import org.example.patters.abstractFactory.button.Button;
import org.example.patters.abstractFactory.check.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
