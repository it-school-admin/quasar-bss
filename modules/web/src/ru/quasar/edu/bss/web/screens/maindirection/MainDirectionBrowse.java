package ru.quasar.edu.bss.web.screens.maindirection;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.MainDirection;

@UiController("bss_MainDirection.browse")
@UiDescriptor("main-direction-browse.xml")
@LookupComponent("mainDirectionsTable")
@LoadDataBeforeShow
public class MainDirectionBrowse extends StandardLookup<MainDirection> {
}