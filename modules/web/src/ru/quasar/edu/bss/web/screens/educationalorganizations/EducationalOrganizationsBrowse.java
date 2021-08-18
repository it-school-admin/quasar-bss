package ru.quasar.edu.bss.web.screens.educationalorganizations;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.EducationalOrganizations;

@UiController("bss_EducationalOrganizations.browse")
@UiDescriptor("educational-organizations-browse.xml")
@LookupComponent("educationalOrganizationsesTable")
@LoadDataBeforeShow
public class EducationalOrganizationsBrowse extends StandardLookup<EducationalOrganizations> {
}