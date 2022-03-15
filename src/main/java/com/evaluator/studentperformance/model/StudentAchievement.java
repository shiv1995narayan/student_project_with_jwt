package com.evaluator.studentperformance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentAchievementTable")
public class StudentAchievement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(unique=true)
	private Integer rollNo;
	private Integer volleyball;
	private Integer cricket;
	private Integer football;
	private Integer chess;
	private Integer athletics;
	private Integer dance;
	private Integer music;
	private Integer art;
	private Integer debate;
	private Integer olympiads;
	
	public StudentAchievement(Long id, Integer rollNo, Integer volleyball, Integer cricket, Integer football,
			Integer chess, Integer athletics, Integer dance, Integer music, Integer art, Integer debate,
			Integer olympiads) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.volleyball = volleyball;
		this.cricket = cricket;
		this.football = football;
		this.chess = chess;
		this.athletics = athletics;
		this.dance = dance;
		this.music = music;
		this.art = art;
		this.debate = debate;
		this.olympiads = olympiads;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public Integer getVolleyball() {
		return volleyball;
	}

	public void setVolleyball(Integer volleyball) {
		this.volleyball = volleyball;
	}

	public Integer getCricket() {
		return cricket;
	}

	public void setCricket(Integer cricket) {
		this.cricket = cricket;
	}

	public Integer getFootball() {
		return football;
	}

	public void setFootball(Integer football) {
		this.football = football;
	}

	public Integer getChess() {
		return chess;
	}

	public void setChess(Integer chess) {
		this.chess = chess;
	}

	public Integer getAthletics() {
		return athletics;
	}

	public void setAthletics(Integer athletics) {
		this.athletics = athletics;
	}

	public Integer getDance() {
		return dance;
	}

	public void setDance(Integer dance) {
		this.dance = dance;
	}

	public Integer getMusic() {
		return music;
	}

	public void setMusic(Integer music) {
		this.music = music;
	}

	public Integer getArt() {
		return art;
	}

	public void setArt(Integer art) {
		this.art = art;
	}

	public Integer getDebate() {
		return debate;
	}

	public void setDebate(Integer debate) {
		this.debate = debate;
	}

	public Integer getOlympiads() {
		return olympiads;
	}

	public void setOlympiads(Integer olympiads) {
		this.olympiads = olympiads;
	}

	@Override
	public String toString() {
		return "StudentAchievement [id=" + id + ", rollNo=" + rollNo + ", volleyball=" + volleyball + ", cricket="
				+ cricket + ", football=" + football + ", chess=" + chess + ", athletics=" + athletics + ", dance="
				+ dance + ", music=" + music + ", art=" + art + ", debate=" + debate + ", olympiads=" + olympiads
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
