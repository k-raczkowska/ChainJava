package chain;

import chain.employees.ClubPresident;
import chain.employees.Coach;
import chain.employees.Employee;
import chain.employees.SportingDirector;
import chain.requests.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Karolina_2 on 2015-04-01.
 */
public class MainClass {

     public static void main(String [] args) {
        List<Request> listOfRequests = gatherRequests();

        Employee clubPresident = new ClubPresident();
        Employee sportingDirector = new SportingDirector(clubPresident);
        Employee coach = new Coach(sportingDirector);
        for(Request request : listOfRequests){
            coach.receiveARequest(request);
        }
    }

    private static List<Request> gatherRequests(){
        List<Request> requests = new ArrayList<Request>();
        requests.add(new ContractRequest("x", new Date(), new Date()));
        requests.add(new DressingRoomRepairRequest("y", new Date()));
        requests.add(new TransferRequest("z", new Date()));
        requests.add(new PersonalTrainingRequest("a", new Date()));
        requests.add(new TransferRequest("b", new Date()));
        return requests;
    }
}
