package ru.quasar.edu.bss.web.screens.competitorproduct;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.CompetitorProduct;

@UiController("bss_CompetitorProduct.edit")
@UiDescriptor("competitor-product-edit.xml")
@EditedEntityContainer("competitorProductDc")
@LoadDataBeforeShow
public class CompetitorProductEdit extends StandardEditor<CompetitorProduct> {
}