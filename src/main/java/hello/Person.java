package hello;

/**
 * Created by octavio on 3/30/17.
 */
public class Person {

        String address;
        String education;
        String email;
        int id;
        String name;

        public Person(){

        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "address='" + address + '\'' +
                    ", education=" + education + '\'' +
                    ", email=" + email + '\'' +
                    ", id=" + id + '\'' +
                    ", name=" + name +
                    '}';
        }
    }





