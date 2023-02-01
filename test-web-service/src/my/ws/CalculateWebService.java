package my.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "my.ws.IMyWebService")
public class CalculateWebService implements ICalculateWebService
{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
    @Override
    public int division(int a, int b) {
        return a / b;
    }
    @Override
    public int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }
}
