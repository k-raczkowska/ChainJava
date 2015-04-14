package chain.employees;

import chain.requests.Request;

/**
 * Created by Karolina_2 on 2015-04-01.
 */
public class SportingDirector extends Employee {

    public SportingDirector(Employee employee){
        this.setReceiver(employee);
    }

    @Override
    public void receiveARequest(Request request){
        if(isAllowedToReceive(request, "TransferRequest")){
            System.out.println("Sporting director has received " + request.getClass().getSimpleName());
        }
        else{
            super.receiveARequest(request);
        }
    }
}
