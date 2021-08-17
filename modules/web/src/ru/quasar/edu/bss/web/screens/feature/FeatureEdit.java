package ru.quasar.edu.bss.web.screens.feature;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Feature;

@UiController("bss_Feature.edit")
@UiDescriptor("feature-edit.xml")
@EditedEntityContainer("featureDc")
@LoadDataBeforeShow
public class FeatureEdit extends StandardEditor<Feature> {
}