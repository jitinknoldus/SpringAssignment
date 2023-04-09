package com.knoldus;

public class MessagePrinter {

    private MessageService service;

    public MessageService getService() {
        return service;
    }

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println("Message : " + this.getService().getMessage());
    }

}
