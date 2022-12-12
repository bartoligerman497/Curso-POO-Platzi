public class Driver extends Account{

    public Driver(String name, String document, String email, String password) {
        super(name, document, email, password);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Driver []";
    }

    void printDataDriver(){
        System.out.println(
            "Document driver: " + document + "\n" +
            "Name Driver: " + name);
    }
}
