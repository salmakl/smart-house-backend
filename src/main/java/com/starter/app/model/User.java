package com.starter.app.model;

import com.starter.app.enums.UserRole;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

	@Id
	private String id;

	private String name;

	private String username;

	private String password;

	private String email;

	private UserRole userRole;

}
