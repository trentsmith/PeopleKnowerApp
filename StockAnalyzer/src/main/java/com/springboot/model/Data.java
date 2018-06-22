package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="StockAnalyzer")
public class Data 
{

	/**
	 * @return the data_id
	 */
	@Id
	@Column(name="data_id")
	@SequenceGenerator(allocationSize=1,name="DataSeq",sequenceName="DATA_SEQ")
	@GeneratedValue(generator="DataSeq",strategy=GenerationType.SEQUENCE)
	private Integer data_id;

	@Column(name="Notes")
	private String Notes;
	
	public String getSequence() {
		return Sequence;
	}

	public void setSequence(String sequence) {
		Sequence = sequence;
	}

	public int getProb() {
		return prob;
	}

	public void setProb(int prob) {
		this.prob = prob;
	}

	@Column(name="Sequence")
	private String Sequence;
	
	@Column(name="Prob")
	private int prob;
	public Integer getData_id() {
		return data_id;
	}

	public void setData_id(Integer data_id) {
		this.data_id = data_id;
	}


	

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}


	
}
