package ru.quasar.edu.bss.web.screens.importedpostcode;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.ImportedPostCode;

@UiController("bss_ImportedPostCode.browse")
@UiDescriptor("imported-post-code-browse.xml")
@LookupComponent("importedPostCodesTable")
@LoadDataBeforeShow
public class ImportedPostCodeBrowse extends StandardLookup<ImportedPostCode> {
}