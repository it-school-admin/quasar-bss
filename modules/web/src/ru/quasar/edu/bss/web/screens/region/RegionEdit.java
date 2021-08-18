package ru.quasar.edu.bss.web.screens.region;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Region;

@UiController("bss_Region.edit")
@UiDescriptor("region-edit.xml")
@EditedEntityContainer("regionDc")
@LoadDataBeforeShow
public class RegionEdit extends StandardEditor<Region> {
}