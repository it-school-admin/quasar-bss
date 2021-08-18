package ru.quasar.edu.bss.web.screens.educationalorganizations;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.EducationalOrganizations;

@UiController("bss_EducationalOrganizations.edit")
@UiDescriptor("educational-organizations-edit.xml")
@EditedEntityContainer("educationalOrganizationsDc")
@LoadDataBeforeShow
public class EducationalOrganizationsEdit extends StandardEditor<EducationalOrganizations> {
}