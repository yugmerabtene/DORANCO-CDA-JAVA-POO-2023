package corba;

import HelloWorld.HelloPOA;

public class HelloImpl extends HelloPOA {
    public String sayHello() {
        return "Hello, CORBA World!";
    }
}
