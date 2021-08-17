package ru.quasar.edu.bss.web.screens.marketsegment;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.MarketSegment;

@UiController("bss_MarketSegment.edit")
@UiDescriptor("market-segment-edit.xml")
@EditedEntityContainer("marketSegmentDc")
@LoadDataBeforeShow
public class MarketSegmentEdit extends StandardEditor<MarketSegment> {
}