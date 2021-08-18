package ru.quasar.edu.bss.web.screens.educationalorganizationstructure;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.EducationalOrganizationStructure;

@UiController("bss_EducationalOrganizationStructure.browse")
@UiDescriptor("educational-organization-structure-browse.xml")
@LookupComponent("educationalOrganizationStructuresTable")
@LoadDataBeforeShow
public class EducationalOrganizationStructureBrowse extends StandardLookup<EducationalOrganizationStructure> {
}