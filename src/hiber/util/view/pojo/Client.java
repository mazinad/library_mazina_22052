package hiber.util.view.pojo;
// Generated May 13, 2020 12:45:42 AM by Hibernate Tools 4.3.1



/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private String regno;
     private String firstname;
     private String lastname;
     private String phonenumber;
     private String emailaddress;
     private String photo;
     private String category;

    public Client() {
    }

	
    public Client(String regno) {
        this.regno = regno;
    }
    public Client(String regno, String firstname, String lastname, String phonenumber, String emailaddress, String photo, String category) {
       this.regno = regno;
       this.firstname = firstname;
       this.lastname = lastname;
       this.phonenumber = phonenumber;
       this.emailaddress = emailaddress;
       this.photo = photo;
       this.category = category;
    }
   
    public String getRegno() {
        return this.regno;
    }
    
    public void setRegno(String regno) {
        this.regno = regno;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPhonenumber() {
        return this.phonenumber;
    }
    
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmailaddress() {
        return this.emailaddress;
    }
    
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }




}


