package ru.quasar.edu.bss.web.screens.contacts;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Contacts;

@UiController("bss_Contacts.edit")
@UiDescriptor("contacts-edit.xml")
@EditedEntityContainer("contactsDc")
@LoadDataBeforeShow
public class ContactsEdit extends StandardEditor<Contacts> {
}