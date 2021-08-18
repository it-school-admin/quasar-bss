package ru.quasar.edu.bss.web.screens.contactkind;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.ContactKind;

@UiController("bss_ContactKind.edit")
@UiDescriptor("contact-kind-edit.xml")
@EditedEntityContainer("contactKindDc")
@LoadDataBeforeShow
public class ContactKindEdit extends StandardEditor<ContactKind> {
}