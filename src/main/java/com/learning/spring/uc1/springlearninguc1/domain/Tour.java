/**
 * 
 */
package com.learning.spring.uc1.springlearninguc1.domain;

import javax.persistence.*;


/**
 * @author Saritha
 *
 */
@Entity
public class Tour {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String title;
	
	@Column(length=2000)
	private String description;
	
	@Column(length=2000)
	private String blurb;
	
	@Column
	private Integer price;
	
	@Column 
	private String duration;
	
	@Column(length=2000)
	private String bullets;
	
	@Column
	private String keyWords;
	
	@ManyToOne
	private TourPackage tourPackage;
	
	@Column
	@Enumerated
	private Difficulty difficulty;
	
	@Column
	@Enumerated
	private Region region;
	
	public Tour(String title, String description, String blurb, Integer price, String duration, String bullets, String keyWords, TourPackage tourPackage, Difficulty diffculty, Region region)
	{
		  	this.title = title;
	        this.description = description;
	        this.blurb = blurb;
	        this.price = price;
	        this.duration = duration;
	        this.bullets = bullets;
	        this.keyWords = keyWords;
	        this.tourPackage = tourPackage;
	        this.difficulty = diffculty;
	        this.region = region;
	}
	
	protected Tour() {
		
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the blurb
	 */
	public String getBlurb() {
		return blurb;
	}

	/**
	 * @param blurb the blurb to set
	 */
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}

	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return the bullets
	 */
	public String getBullets() {
		return bullets;
	}

	/**
	 * @param bullets the bullets to set
	 */
	public void setBullets(String bullets) {
		this.bullets = bullets;
	}

	/**
	 * @return the keyWords
	 */
	public String getKeyWords() {
		return keyWords;
	}

	/**
	 * @param keyWords the keyWords to set
	 */
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	/**
	 * @return the tourPackage
	 */
	public TourPackage getTourPackage() {
		return tourPackage;
	}

	/**
	 * @param tourPackage the tourPackage to set
	 */
	public void setTourPackage(TourPackage tourPackage) {
		this.tourPackage = tourPackage;
	}

	/**
	 * @return the difficulty
	 */
	public Difficulty getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}
}
