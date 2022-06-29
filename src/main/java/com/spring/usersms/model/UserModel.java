package com.spring.usersms.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Users")
public class UserModel {

        @Id
        private String id;

        private String firstName;
        private String lastName;
        private String email;
        private BigInteger phoneNumber;
        private String photo;
        private String type;
        
        
        public UserModel(String id, String firstName, String lastName, String email, BigInteger phoneNumber, String type) {
            super();
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.type = type;
        }


		public BigInteger getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(BigInteger phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhoto() {
			return photo;
		}


		public void setPhoto(String photo) {
			this.photo = photo;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}
}
