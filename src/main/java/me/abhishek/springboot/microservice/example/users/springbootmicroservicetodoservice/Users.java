package me.abhishek.springboot.microservice.example.users.springbootmicroservicetodoservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="things_to_do")
public class Users {
	
	@Id
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="verified")
	private int verificationStatus;
	
	private String task;
	
	public Users() {
		
	}
	
	public Users(Long id, String name, int verificationStatus, String task) {
		super();
		this.id=id;
		this.name=name;
		this.verificationStatus=verificationStatus;
		this.task=task;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getVerificationStatus() {
		return verificationStatus;
	}
	
	public String getTask() {
		return task;
	}
	
	@Override
	public String toString() {
		return "Users{" + 
				"id=" + id + 
				", name='" + name + '\'' +
				", verificationStatus='" + verificationStatus + '\'' +
				'}';
	}
}