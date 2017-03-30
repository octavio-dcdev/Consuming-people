package hello;

/**
 * Created by octavio on 3/30/17.
 */
public class User {

    String address;
    String email;
    String groups;
    int id;
    String username;

    public User() {

    }

    public User(String address, String email, String groups, int id, String username) {
        this.address = address;
        this.email = email;
        this.groups = groups;
        this.id = id;
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "address=" + address +
                ", email='" + email + '\'' +
                ", groups='" + groups + '\'' +
                ", id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }


}
