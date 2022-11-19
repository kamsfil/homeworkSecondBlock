package builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Human {
    private String name;
    private String firstName;
    private String Car;
    private Integer number;
    private String from;
    private Integer age;

    public static class Builder {
        private Human human;

        public Builder() {
            this.human = new Human();
        }

        public Builder name (String name) {
            this.human.setName(name);
            return this;
        }

        public Human build (){
            return this.human;
        }
    }

}
