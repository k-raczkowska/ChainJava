package chain.employees;

import chain.requests.Request;

/**
 * Created by Karolina_2 on 2015-04-01.
 */
public class ClubPresident extends Employee {

    public ClubPresident(){

    }

    @Override
    public void receiveARequest(Request request){
        if(isAllowedToReceive(request, "ContractRequest")){
            System.out.println("Club president has received " + request.getClass().getSimpleName());
        }
        else{
            super.receiveARequest(request);
        }
    }
}
