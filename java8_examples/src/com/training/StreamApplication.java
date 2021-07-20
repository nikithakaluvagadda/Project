package com.training;
import java.util.*;

import com.training.model.CreditCard;
import com.training.services.CreditCardService;
public class StreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CreditCard> cards=new ArrayList<CreditCard>();
		cards.add(new CreditCard(1021,"a",456,800));
		cards.add(new CreditCard(1028,"b",456,560000));
		cards.add(new CreditCard(1022,"c",456,70000));
		cards.add(new CreditCard(1023,"d",456,8000));
		cards.add(new CreditCard(1027,"e",456,900000));
		CreditCardService service=new CreditCardService(cards);
		service.usingFilterAndMap();
		
	}
	

}
