package chain.employees;

import chain.requests.Request;

/**
 * Created by Karolina_2 on 2015-04-01.
 */
public class Coach extends Employee {

    public Coach(Employee employee){
        this.setReceiver(employee);
    }

    @Override
    public void receiveARequest(Request request){
        if(isAllowedToReceive(request, "PersonalTrainingRequest")){
            System.out.println("Coach has received " + request.getClass().getSimpleName());
        }
        else{
            super.receiveARequest(request);
        }
    }
}
