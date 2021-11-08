package users;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Receiver implements User{
    String status;
    int id;

    public Receiver(){
        this.id = UserId.generate();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
