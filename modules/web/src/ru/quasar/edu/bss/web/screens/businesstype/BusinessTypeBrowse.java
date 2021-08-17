package ru.quasar.edu.bss.web.screens.businesstype;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.BusinessType;

@UiController("bss_BusinessType.browse")
@UiDescriptor("business-type-browse.xml")
@LookupComponent("businessTypesTable")
@LoadDataBeforeShow
public class BusinessTypeBrowse extends StandardLookup<BusinessType> {
}