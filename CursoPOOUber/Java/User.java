public class User extends Account{

    public User(Integer id, String name, String document, String email, String password){
        super(name, document, email, password);
    }

    @Override
    public String toString() {
        return "User []";
    }

    

}
