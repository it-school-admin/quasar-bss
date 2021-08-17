package ru.quasar.edu.bss.web.screens.quasarproject;

import com.haulmont.cuba.gui.screen.*;
import ru.quasar.edu.bss.entity.QuasarProject;

@UiController("bss_QuasarProject.edit")
@UiDescriptor("quasar-project-edit.xml")
@EditedEntityContainer("quasarProjectDc")
@LoadDataBeforeShow
public class QuasarProjectEdit extends StandardEditor<QuasarProject> {
}