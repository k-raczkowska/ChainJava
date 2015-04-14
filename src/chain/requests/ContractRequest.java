package chain.requests;

import java.util.Date;

/**
 * Created by Karolina_2 on 2015-04-01.
 */
public class ContractRequest extends Request {

    Date expiring;

    public ContractRequest(String title, Date date, Date expiring){
        this.title = title;
        this.date = date;
        this.expiring = expiring;
    }
}
