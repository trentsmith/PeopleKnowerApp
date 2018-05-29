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
@Table(name="EternaData")
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
	
	@Column(name="PuzzleSequence")
	private String PuzzleSequence;
	
	@Column(name="Answer")
	private String Answer;
	public Integer getData_id() {
		return data_id;
	}

	public void setData_id(Integer data_id) {
		this.data_id = data_id;
	}

	public String getPuzzleSequence() {
		return PuzzleSequence;
	}

	public void setPuzzleSequence(String puzzleSequence) {
		PuzzleSequence = puzzleSequence;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}


	

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}


	
}
