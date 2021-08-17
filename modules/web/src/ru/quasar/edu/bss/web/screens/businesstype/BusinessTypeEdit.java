package ru.quasar.edu.bss.web.screens.businesstype;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.BusinessType;

@UiController("bss_BusinessType.edit")
@UiDescriptor("business-type-edit.xml")
@EditedEntityContainer("businessTypeDc")
@LoadDataBeforeShow
public class BusinessTypeEdit extends StandardEditor<BusinessType> {
}