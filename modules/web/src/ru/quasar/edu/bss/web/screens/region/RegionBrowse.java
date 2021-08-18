package ru.quasar.edu.bss.web.screens.region;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Region;

@UiController("bss_Region.browse")
@UiDescriptor("region-browse.xml")
@LookupComponent("regionsTable")
@LoadDataBeforeShow
public class RegionBrowse extends StandardLookup<Region> {
}