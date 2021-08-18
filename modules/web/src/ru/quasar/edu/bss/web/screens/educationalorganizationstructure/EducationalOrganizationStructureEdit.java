package ru.quasar.edu.bss.web.screens.educationalorganizationstructure;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.EducationalOrganizationStructure;

@UiController("bss_EducationalOrganizationStructure.edit")
@UiDescriptor("educational-organization-structure-edit.xml")
@EditedEntityContainer("educationalOrganizationStructureDc")
@LoadDataBeforeShow
public class EducationalOrganizationStructureEdit extends StandardEditor<EducationalOrganizationStructure> {
}