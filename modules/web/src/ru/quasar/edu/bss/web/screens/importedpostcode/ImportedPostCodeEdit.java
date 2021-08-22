package ru.quasar.edu.bss.web.screens.importedpostcode;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.ImportedPostCode;

@UiController("bss_ImportedPostCode.edit")
@UiDescriptor("imported-post-code-edit.xml")
@EditedEntityContainer("importedPostCodeDc")
@LoadDataBeforeShow
public class ImportedPostCodeEdit extends StandardEditor<ImportedPostCode> {
}