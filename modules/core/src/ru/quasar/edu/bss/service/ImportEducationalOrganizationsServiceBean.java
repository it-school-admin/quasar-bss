package ru.quasar.edu.bss.service;

import com.haulmont.cuba.core.app.FileStorageAPI;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FileStorageException;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.InputStream;

@Service(ImportEducationalOrganizationsService.NAME)
public class ImportEducationalOrganizationsServiceBean implements ImportEducationalOrganizationsService {

    @Inject
    private FileStorageAPI fileStorageAPI;
    @Inject
    private DataManager dataManager;

    @Override
    public void loadDataFromFile(FileDescriptor fileDescriptor) {

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

        try {
            InputStream inputStream = fileStorageAPI.openStream(fileDescriptor);
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(inputStream);
            parseLicenseXML(xmlEventReader, dataManager);

        } catch (FileStorageException | XMLStreamException e) {//TODO
            e.printStackTrace();
        }


    }

    private void parseLicenseXML(XMLEventReader xmlEventReader, DataManager dataManager) {

        while (xmlEventReader.hasNext())
        {
            try {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if(xmlEvent.isStartElement())
                {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("license"))
                    {
                       /* dataManager.load(Ec.class).id(bookId).view("book.edit").one()
                        dataManager.
*//*
                        EduOrgFromLicXML eduOrgFromLicXML = dataManager.create(Edu.class);
                        UUID.fromString("");
*/

                    }
                }


            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }

    }
}