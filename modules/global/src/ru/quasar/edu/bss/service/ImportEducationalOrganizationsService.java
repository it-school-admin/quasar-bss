package ru.quasar.edu.bss.service;

import com.haulmont.cuba.core.entity.FileDescriptor;

public interface ImportEducationalOrganizationsService {
    String NAME = "bss_ImportEducationalOrganizationsService";

    void loadDataFromFile(FileDescriptor fileDescriptor);
}