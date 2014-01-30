/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.amnesty.webservice.person;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import nl.amnesty.crm.entity.Person;
import nl.amnesty.crm.persistence.EMPerson;
import nl.amnesty.crm.persistence.EntityManager;

/**
 *
 * @author ed
 * algemene webservices uitgezet uit beveiligingsoogpunt
 */
@WebService()
@Stateless()
public class PersonCRUD {

    /**
     * Web service operation
     
    @WebMethod(operationName = "dummy")
    public String dummy() {
        //TODO write your implementation code here:
        return null;
    }
    */
    
    /**
     * Web service operation
     
    @WebMethod(operationName = "create")
    public long create(
            @WebParam(name = "Title") String title,
            @WebParam(name = "Initials") String intials,
            @WebParam(name = "Forenames") String forenames,
            @WebParam(name = "Middle") String middle,
            @WebParam(name = "Surname") String surname,
            @WebParam(name = "Birth") Date birth,
            @WebParam(name = "Gender") String gender) {
        //TODO write your implementation code here:
        long personid = 123456789;
        return personid;
    }
    */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "read")
    public Person read(
            @WebParam(name = "Personid") long personid) {
        Person Person = new Person();
        try {
            EntityManager em = new EMPerson();
            Person = em.find(personid);
        } catch (Exception e) {
            Logger.getLogger(PersonCRUD.class.getName()).log(Level.SEVERE, null, e);
            return Person;
        }
        return Person;
    }
    

    /**
     * Web service operation
     
    @WebMethod(operationName = "update")
    public long update(
            @WebParam(name = "Personid") long personid,
            @WebParam(name = "Title") String title,
            @WebParam(name = "Initials") String intials,
            @WebParam(name = "Forenames") String forenames,
            @WebParam(name = "Middle") String middle,
            @WebParam(name = "Surname") String surname,
            @WebParam(name = "Birth") Date birth,
            @WebParam(name = "Gender") String gender) {
        //TODO write your implementation code here:
        return personid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "delete")
    public long delete(
            @WebParam(name = "Personid") long personid) {
        //TODO write your implementation code here:
        return personid;
    }
    */
    
}
