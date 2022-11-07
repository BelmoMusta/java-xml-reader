package org.example.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "hibernate-generic")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfluenceExport {

    @XmlElement(name = "object")
    private List<ConfluenceObject> objects;


    @XmlAttribute(name = "datetime")
    private String datetime;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setObjects(List<ConfluenceObject> objects) {
        this.objects = objects;
    }

    public List<ConfluenceObject> getObjects() {
        return objects;
    }
}
