package data;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Quote implements Serializable {
    private long id;
    private String content;
    private Author author;


}
