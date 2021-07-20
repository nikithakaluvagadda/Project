package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class UsinbBuiltInFunctionalInterface {
	public void usingPredicate(){
		Predicate<Double> checkHousingLoanEligibility=
			(salaryPerMonth)->{
					boolean result=false;
		if(salaryPerMonth>30000) {
			result=true;
		}
		return result;
		};
		System.out.println("Ramesh  with salary 2000 is eligible:"+checkHousingLoanEligibility.test(2000.00));
		System.out.println("Surech with salary 80000 is eligible:"+checkHousingLoanEligibility.test(80000.00));
		
		}
	public void usingConsumer() {
		List<String> names=new ArrayList<>();
		names.add("anand");
		names.add("jr");
		names.add("jrji");
		names.add("jnfjgr");
		//Consumer<String>print=(name)->System.out.println(name);
		//names.forEach(print);
		names.forEach(System.out::println);
	}
	public void usingFunction() {
		Function<Double,Double> currencyConverter=(inr)->inr/70;
		System.out.println("inr to usd"+currencyConverter.apply(100.00));
	
	}
	public static void main(String[] args) {
		UsinbBuiltInFunctionalInterface obj=new UsinbBuiltInFunctionalInterface();
		obj.usingPredicate();
		obj.usingConsumer();
		obj.usingFunction();
	}
}
