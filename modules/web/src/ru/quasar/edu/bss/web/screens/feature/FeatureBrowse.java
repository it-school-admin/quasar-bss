package ru.quasar.edu.bss.web.screens.feature;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Feature;

@UiController("bss_Feature.browse")
@UiDescriptor("feature-browse.xml")
@LookupComponent("featuresTable")
@LoadDataBeforeShow
public class FeatureBrowse extends StandardLookup<Feature> {
}