package ru.quasar.edu.bss.web.screens.quasarproduct;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.QuasarProduct;

@UiController("bss_QuasarProduct.browse")
@UiDescriptor("quasar-product-browse.xml")
@LookupComponent("quasarProductsTable")
@LoadDataBeforeShow
public class QuasarProductBrowse extends StandardLookup<QuasarProduct> {
}