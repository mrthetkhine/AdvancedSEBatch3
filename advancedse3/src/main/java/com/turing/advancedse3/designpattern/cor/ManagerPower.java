package com.turing.advancedse3.designpattern.cor;

public class ManagerPower extends PurchasePower{

    static final int ALLOW = BASE * 10;
    @Override
    void handleRequest(Command command) {
        if(command.amount <= ALLOW )
        {
            System.out.println("Sale handled by Manager");
        }
        else
        {
            if(this.getSuccessor()!=null)
            {
                successor.handleRequest(command);
            }
            
        }
    }
    
}
