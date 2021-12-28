package com.POC1.Week4.RestPOC1.entitys;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CountriesCurrencies implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String countriCourrenciesId;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Currencies currencies;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Countries countries;

	public String getCountriCourrenciesId() {
		return countriCourrenciesId;
	}

	public void setCountriCourrenciesId(String countriCourrenciesId) {
		this.countriCourrenciesId = countriCourrenciesId;
	}

	public Currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countriCourrenciesId, countries, currencies);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountriesCurrencies other = (CountriesCurrencies) obj;
		return Objects.equals(countriCourrenciesId, other.countriCourrenciesId)
				&& Objects.equals(countries, other.countries) && Objects.equals(currencies, other.currencies);
	}

	@Override
	public String toString() {
		return "CountriesCurrencies [countriCourrenciesId=" + countriCourrenciesId + ", currencies=" + currencies
				+ ", countries=" + countries + "]";
	}

	
	
	

}
