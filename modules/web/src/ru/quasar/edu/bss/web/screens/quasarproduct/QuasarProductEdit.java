package ru.quasar.edu.bss.web.screens.quasarproduct;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.QuasarProduct;

@UiController("bss_QuasarProduct.edit")
@UiDescriptor("quasar-product-edit.xml")
@EditedEntityContainer("quasarProductDc")
@LoadDataBeforeShow
public class QuasarProductEdit extends StandardEditor<QuasarProduct> {
}