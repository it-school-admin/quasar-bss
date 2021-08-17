package ru.quasar.edu.bss.web.screens.quasarproject;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.QuasarProject;

@UiController("bss_QuasarProject.browse")
@UiDescriptor("quasar-project-browse.xml")
@LookupComponent("quasarProjectsTable")
@LoadDataBeforeShow
public class QuasarProjectBrowse extends StandardLookup<QuasarProject> {
}