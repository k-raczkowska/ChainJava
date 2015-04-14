package chain.employees;

import chain.requests.Request;

/**
 * Created by Karolina_2 on 2015-04-01.
 */
public class Employee {

    private Employee receiver;

    public void receiveARequest(Request request){
        if(getReceiver() != null){
            getReceiver().receiveARequest(request);
        }
        else{
            System.out.println("None of employees could receive " + request.getClass().getSimpleName());
        }
    }

    boolean isAllowedToReceive(Request request, String requestType){
        return (request == null) || request.getClass().getSimpleName().equals(requestType);
    }

    public Employee getReceiver() {
        return receiver;
    }

    public void setReceiver(Employee receiver) {
        this.receiver = receiver;
    }
}
