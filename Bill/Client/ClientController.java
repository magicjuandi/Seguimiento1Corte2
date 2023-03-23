package com.Bill.Client;

public class ClientController {
    private Client model;
    private ClientView view;

    public ClientController(Client model, ClientView view) {
        this.model = model;
        this.view = view;
    }

    public String getClientName(){
        return model.getClientName();
    }

    public void setClientName(String ClientName){
        model.setClientName(ClientName);
    }

    public String getClientId(){
        return model.getClientId();
    }

    public void setClientId(String ClientId){
        model.setClientId(ClientId);
    }

    public String getClientPhone(){
        return model.getClientPhone();
    }

    public void setClientPhone(String ClientPhone){
        model.setClientPhone(ClientPhone);
    }
    
    public void updateView(){
        view.printClientDetails(getClientName(), getClientId(), getClientPhone());
    }
}
