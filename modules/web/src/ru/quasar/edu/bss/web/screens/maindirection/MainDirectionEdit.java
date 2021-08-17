package ru.quasar.edu.bss.web.screens.maindirection;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.MainDirection;

@UiController("bss_MainDirection.edit")
@UiDescriptor("main-direction-edit.xml")
@EditedEntityContainer("mainDirectionDc")
@LoadDataBeforeShow
public class MainDirectionEdit extends StandardEditor<MainDirection> {
}