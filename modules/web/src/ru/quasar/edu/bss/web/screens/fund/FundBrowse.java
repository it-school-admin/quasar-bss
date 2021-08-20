package ru.quasar.edu.bss.web.screens.fund;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Fund;

@UiController("bss_Fund.browse")
@UiDescriptor("fund-browse.xml")
@LookupComponent("fundsTable")
@LoadDataBeforeShow
public class FundBrowse extends StandardLookup<Fund> {
}