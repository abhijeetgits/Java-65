package co.edureka.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account", schema = "java65")
public class Account {
 private String acno;
 private String name;
 private float bal;
 
public Account(String acno, String name, float bal) {
	super();
	this.acno = acno;
	this.name = name;
	this.bal = bal;
}
@Id
@Column(name="acno",length = 15,unique = true, nullable = false)
public String getAcno() {
	return acno;
}
public void setAcno(String acno) {
	this.acno = acno;
}

@Column(name="name",length = 25)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Column(name="balance",length = 10, precision = 2)
public float getBal() {
	return bal;
}
public void setBal(float bal) {
	this.bal = bal;
}
 
}
