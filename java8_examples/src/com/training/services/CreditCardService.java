package com.training.services;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import com.training.model.CreditCard;
import static java.util.stream.Collectors.*;
public class CreditCardService {
	private List<CreditCard> cards;

	public CreditCardService(List<CreditCard> cards) {
		super();
		this.cards = cards;
	}

	public List<CreditCard> getCards() {
		return cards;
	}
	public void usingFilterAndMap() {
		List<CreditCard> creditLimitMoreThan5Lakh=
				this.cards.stream().filter((card)->card.getCreditLimit()>500000).collect(toList());
		creditLimitMoreThan5Lakh.forEach(System.out::println);
	
		List<String>namesOfMoreThan5Lakh=
				this.cards.stream().filter(card->card.getCreditLimit()<500000).
				map(card->card.getCardHolderName()).collect(toList());
				namesOfMoreThan5Lakh.forEach(System.out::println);

	}
	public void collectingToUtilMap() {
		Map<String,Long> teleCallingList=
				this.cards.stream()
				.filter(card->card.getCreditLimit()<500000)
				.collect(toMap(CreditCard::getCardHolderName,CreditCard::getPhoneNumber));
		
		
		
	}
	//finding min credit limit
	public void findMinimumCreditLimit() {
		this.cards.stream()
.sorted(Comparator.comparing(CreditCard::getCredti))	}
	
	
	
	
	
	
}
