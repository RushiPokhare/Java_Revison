package file_Handling;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Serializable {
    private int id;
    private String name;
    private String userName;
    private String passWord;
}
