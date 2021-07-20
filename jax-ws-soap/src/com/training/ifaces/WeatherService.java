package com.training.ifaces;

import java.util.Map;
import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style=Style.RPC)
public interface WeatherService {
	@WebMethod(operationName="Get Weather")
	public String getWeather(@WebParam(name="city") String city);
	
	
}

