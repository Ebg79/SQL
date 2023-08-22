package data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SQLHelper {
    private String id;
    private String login;
    private String password;
    private String status;
}