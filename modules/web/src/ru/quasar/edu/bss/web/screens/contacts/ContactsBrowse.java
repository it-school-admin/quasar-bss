package ru.quasar.edu.bss.web.screens.contacts;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Contacts;

@UiController("bss_Contacts.browse")
@UiDescriptor("contacts-browse.xml")
@LookupComponent("contactsesTable")
@LoadDataBeforeShow
public class ContactsBrowse extends StandardLookup<Contacts> {
}