package ru.quasar.edu.bss.web.screens.competitor;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Competitor;

@UiController("bss_Competitor.edit")
@UiDescriptor("competitor-edit.xml")
@EditedEntityContainer("competitorDc")
@LoadDataBeforeShow
public class CompetitorEdit extends StandardEditor<Competitor> {
}