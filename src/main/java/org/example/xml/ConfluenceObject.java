package org.example.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "object")

public class ConfluenceObject {

    @XmlElement(name = "id")
    private String id;

    @XmlAttribute(name = "class")
    private String class_;

    @XmlElement(name = "property")
    private List<Property> properties;

    public String getId() {
        return id;
    }

    public void setId(String datetime) {
        this.id = datetime;
    }

    public String getClass_() {
        return class_;
    }
     public void setClass_(String class_) {
        this.class_ = class_;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
