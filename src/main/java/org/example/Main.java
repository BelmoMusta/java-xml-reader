package org.example;

import org.example.xml.ConfluenceExport;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        JAXBContext jaxbContext = JAXBContext.newInstance(ConfluenceExport.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        ConfluenceExport export = (ConfluenceExport) jaxbUnmarshaller.unmarshal(
                new File("entities.xml"));
      export.getObjects().stream()
              .filter(object -> "BodyContent".equals(object.getClass_()))
              .flatMap(page -> page.getProperties().stream())
              .filter(property -> "body".equals(property.getName()))
              .forEach(property -> System.out.println(property.getValue()));
    }
}