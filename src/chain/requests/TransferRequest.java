package chain.requests;

import java.util.Date;

/**
 * Created by Karolina_2 on 2015-04-01.
 */
public class TransferRequest extends Request {

    public TransferRequest(String title, Date date){
        this.title = title;
        this.date = date;
    }
}
