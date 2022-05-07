class Request {
    private String value;
    private String description;

    public Request(String description, String value) {
        this.description = description;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}

abstract class Handler {
    protected Handler m_successor;

    public void setSuccessor(Handler successor) {
        m_successor = successor;
    }

    public abstract void handleRequest(Request request);
}

class ETC extends Handler {
    public void handleRequest(Request request) {
        if (request.getValue().equals("ETC")) { // if request is eligible handle it
            System.out.println(" handled by ETC:");
            System.out.println("\tRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            m_successor.handleRequest(request);
        }
    }
}

class CSE extends Handler {
    public void handleRequest(Request request) {
        if (request.getValue().equals("CSE")) { // if request is eligible handle it
            System.out.println(" handled by CSE:");
            System.out.println("\tRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            m_successor.handleRequest(request);
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Request r1=new Request("For CSE DEPT","CSE");
        Handler h1=new ETC();
        Handler h2=new CSE();
        h1.setSuccessor(h2);
        h1.handleRequest(r1);
    }

}
