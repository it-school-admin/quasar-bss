package ru.quasar.edu.bss.web.screens.marketsegment;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.MarketSegment;

@UiController("bss_MarketSegment.browse")
@UiDescriptor("market-segment-browse.xml")
@LookupComponent("marketSegmentsTable")
@LoadDataBeforeShow
public class MarketSegmentBrowse extends StandardLookup<MarketSegment> {
}