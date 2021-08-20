package ru.quasar.edu.bss.web.screens.grant;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Grant;

@UiController("bss_Grant.browse")
@UiDescriptor("grant-browse.xml")
@LookupComponent("grantsTable")
@LoadDataBeforeShow
public class GrantBrowse extends StandardLookup<Grant> {
}