
package com.example.springclient.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.springclient.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SaveStudent_QNAME = new QName("http://service.demospringservice.example.com/", "saveStudent");
    private final static QName _GetList_QNAME = new QName("http://service.demospringservice.example.com/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://service.demospringservice.example.com/", "getListResponse");
    private final static QName _SaveStudentResponse_QNAME = new QName("http://service.demospringservice.example.com/", "saveStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.springclient.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveStudentResponse }
     * 
     */
    public SaveStudentResponse createSaveStudentResponse() {
        return new SaveStudentResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link SaveStudent }
     * 
     */
    public SaveStudent createSaveStudent() {
        return new SaveStudent();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demospringservice.example.com/", name = "saveStudent")
    public JAXBElement<SaveStudent> createSaveStudent(SaveStudent value) {
        return new JAXBElement<SaveStudent>(_SaveStudent_QNAME, SaveStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demospringservice.example.com/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demospringservice.example.com/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demospringservice.example.com/", name = "saveStudentResponse")
    public JAXBElement<SaveStudentResponse> createSaveStudentResponse(SaveStudentResponse value) {
        return new JAXBElement<SaveStudentResponse>(_SaveStudentResponse_QNAME, SaveStudentResponse.class, null, value);
    }

}
