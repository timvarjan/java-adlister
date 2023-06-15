package data;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Serializable {
    private long id;
    private String firstName;
    private String lastName;


}
