package org.example.patters.abstractFactory;

import org.example.patters.abstractFactory.button.Button;
import org.example.patters.abstractFactory.check.Checkbox;
import org.example.patters.abstractFactory.factories.GuiFactory;

public class RunFactory {
    private Button button;
    private Checkbox checkbox;

    public RunFactory(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
