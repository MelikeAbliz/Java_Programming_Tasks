package day18;

public class Contact {
    public String name,email;
    public long phoneNumber;

    public void setInfo(String name, String email, long phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void call(String name){
        this.name=name;
        System.out.println("Calling "+ name+" now");
    }
    public void sendMessage(long phoneNumber){
        this.phoneNumber=phoneNumber;
        System.out.println("sending a message to "+phoneNumber+" now");
    }
    public void sendEmail(String email){
        this.email=email;
        System.out.println("sending email to "+email+" now");
    }
}
/*
Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending a message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"


 */