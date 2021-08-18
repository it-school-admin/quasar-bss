package ru.quasar.edu.bss.web.screens.contactkind;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.ContactKind;

@UiController("bss_ContactKind.browse")
@UiDescriptor("contact-kind-browse.xml")
@LookupComponent("contactKindsTable")
@LoadDataBeforeShow
public class ContactKindBrowse extends StandardLookup<ContactKind> {
}