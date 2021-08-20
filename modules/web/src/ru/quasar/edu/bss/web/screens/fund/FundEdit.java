package ru.quasar.edu.bss.web.screens.fund;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Fund;

@UiController("bss_Fund.edit")
@UiDescriptor("fund-edit.xml")
@EditedEntityContainer("fundDc")
@LoadDataBeforeShow
public class FundEdit extends StandardEditor<Fund> {
}