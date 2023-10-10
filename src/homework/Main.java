package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserReport userReport = new UserReport(user);
        userReport.report();
        SaveUser saveUser = new SaveUser(user);
        saveUser.save();
    }
}