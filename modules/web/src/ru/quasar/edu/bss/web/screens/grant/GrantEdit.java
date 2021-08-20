package ru.quasar.edu.bss.web.screens.grant;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Grant;

@UiController("bss_Grant.edit")
@UiDescriptor("grant-edit.xml")
@EditedEntityContainer("grantDc")
@LoadDataBeforeShow
public class GrantEdit extends StandardEditor<Grant> {
}