package ru.quasar.edu.bss.web.screens.competitor;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.Competitor;

@UiController("bss_Competitor.browse")
@UiDescriptor("competitor-browse.xml")
@LookupComponent("competitorsTable")
@LoadDataBeforeShow
public class CompetitorBrowse extends StandardLookup<Competitor> {
}