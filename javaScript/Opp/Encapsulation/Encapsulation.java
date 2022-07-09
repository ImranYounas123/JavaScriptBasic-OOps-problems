package Opp.Encapsulation;

import javax.smartcardio.Card;

public class Encapsulation {
    private String password = "Imran@123";
    private String CNIC;
    private String CARD;
    public String getPassword(){
        return password;
    }
    public void setCnic(String setvalue){
        CNIC = setvalue;
    }
    public void setCCard(String setValue){
        CARD = setValue;
    }
    public String getCCard(){
        return CARD;
    }
    public String getCnic(){
       return CNIC;
    }
}
