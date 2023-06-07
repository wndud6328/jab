package com.kh.practice2.model;

import java.util.Objects;

import com.kh.set.model.Person;

public class Lotto {

	private int Lotto;

	public Lotto() {}

	@Override
	public int hashCode() {
		return Objects.hash(Lotto);
	}


	public int getLotto() {
		return Lotto;
	}

	public void setLotto(int lotto) {
		Lotto = lotto;
	}
	@Override
	public String toString() {
		return "Lotto [Lotto=" + Lotto + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lotto other = (Lotto) obj;
		return Lotto == other.Lotto;
	}

	public int compareTo(Lotto o) {
		return (this.Lotto - o.Lotto) * -1;
	
	}
	
}
