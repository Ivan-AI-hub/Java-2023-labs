package my.client;

import my.ws.ICalculateWebService;

import java.net.URL;
import java.net.MalformedURLException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
    public static void main(String[] args) throws MalformedURLException {

        int a = 30;
        int b = 6;

        URL url = new URL("http://localhost:26317/ws/calculate/");
        QName qname = new QName("http://ws.my/", "CalculateWebServiceService");

        Service service = Service.create(url, qname);
        ICalculateWebService ws = service.getPort(ICalculateWebService.class);

        System.out.println("Initial numbers: " + a + ", " + b);
        System.out.println("sum) " + ws.sum(a, b));
        System.out.println("subtraction) " + ws.subtraction(a, b));
        System.out.println("multiply) " + ws.multiply(a, b));
        System.out.println("division) " + ws.division(a, b));
        System.out.println("greatestCommonDivisor) " + ws.greatestCommonDivisor(a, b));
    }
}
