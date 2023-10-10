package homework;

public class SaveUser{
    private final User user;

    public SaveUser(User user){
        this.user = user;
    }
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
