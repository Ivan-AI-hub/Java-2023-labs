package my.endpoint;

import my.ws.CalculateWebService;
import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:26317/ws/calculate/", new CalculateWebService());
    }
}
