package users;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Sender implements User{
    String status;
    int id;

    public Sender(){
        this.id = UserId.generate();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
