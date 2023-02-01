package my.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ICalculateWebService {
    @WebMethod
    public int sum(int a, int b);

    @WebMethod
    public int subtraction(int a, int b);

    @WebMethod
    public int multiply(int a, int b);
    @WebMethod
    public int greatestCommonDivisor(int a, int b);
    @WebMethod
    public int division(int a, int b);
}
