package ru.quasar.edu.bss.web.screens.competitorproduct;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.CompetitorProduct;

@UiController("bss_CompetitorProduct.browse")
@UiDescriptor("competitor-product-browse.xml")
@LookupComponent("competitorProductsTable")
@LoadDataBeforeShow
public class CompetitorProductBrowse extends StandardLookup<CompetitorProduct> {
}