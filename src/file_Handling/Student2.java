package file_Handling;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student2 implements Serializable {
    private int id;
    private String name;
    private String userName;
    transient private String passWord;
}
