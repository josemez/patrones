
package org.example.patters.abstractFactory.factories;

import org.example.patters.abstractFactory.button.Button;
import org.example.patters.abstractFactory.button.WindowsButton;
import org.example.patters.abstractFactory.check.Checkbox;
import org.example.patters.abstractFactory.check.WindowsCheckbox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
