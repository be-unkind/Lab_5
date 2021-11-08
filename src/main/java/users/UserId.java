package users;

public class UserId {
    static int id;

    public static int generate(){
        id += 1;
        return id;
    }
}
