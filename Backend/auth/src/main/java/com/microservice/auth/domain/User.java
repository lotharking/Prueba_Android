/**ORM for model users */

package com.microservice.auth.domain;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    UUID id;
    private String first_name;    
    private String last_name;    
    private String username;    
    private String password;
    private String token;
    private UUID wish;

}
