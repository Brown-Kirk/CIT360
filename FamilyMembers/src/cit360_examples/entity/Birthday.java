package cit360_examples.entity;
// Generated Oct 19, 2017 8:02:19 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Birthday generated by hbm2java
 */
public class Birthday  implements java.io.Serializable {


     private Integer birthdayId;
     private People people;
     private Date birthdayDate;

    public Birthday() {
    }

    public Birthday(People people, Date birthdayDate) {
       this.people = people;
       this.birthdayDate = birthdayDate;
    }
   
    public Integer getBirthdayId() {
        return this.birthdayId;
    }
    
    public void setBirthdayId(Integer birthdayId) {
        this.birthdayId = birthdayId;
    }
    public People getPeople() {
        return this.people;
    }
    
    public void setPeople(People people) {
        this.people = people;
    }
    public Date getBirthdayDate() {
        return this.birthdayDate;
    }
    
    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }




}


