package Project.Part5;
import java.io.Serializable;
public class Payload implements Serializable {
    //read https://www.baeldung.com/java-serial-version-uid
    private static final long serialVersionUID = 1L;//change this if the class changes
    

/**
 * Determines how to process the data on the receiver's side
 */
private PayloadType payloadType;

// Getter for payload type
public PayloadType getPayloadType() {
    return payloadType;
}

// Setter for payload type
public void setPayloadType(PayloadType payloadType) {
    this.payloadType = payloadType;
}

/**
 * Who the payload is from
 */
private String clientName;

// Getter for client name
public String getClientName() {
    return clientName;
}

// Setter for client name
public void setClientName(String clientName) {
    this.clientName = clientName;
}

/**
 * Generic text-based message
 */
private String message;

// Getter for message
public String getMessage() {
    return message;
}

// Setter for message
public void setMessage(String message) {
    this.message = message;
}

/**
 * Generic number for example sake
 */
private int number;

// Getter for number
public int getNumber() {
    return number;
}

// Setter for number
public void setNumber(int number) {
    this.number = number;
}

// Overridden toString() method to represent the object as a formatted string
@Override
public String toString() {
    return String.format("Type[%s], Number[%s], Message[%s]", getPayloadType().toString(), getNumber(),
        getMessage());
}

}
