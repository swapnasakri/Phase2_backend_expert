package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="eproduct_6712")
public class EProduct5 {

	@Id
	@GeneratedValue
	@Column(name="eproduct5_id")
	private int id;

	@Column(name="eproduct5_name")
	private String name;

	@Column(name="eproduct5_price")
	private Double price;

	// ALT +S+R
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

}