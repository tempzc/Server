package com.lf.lfopen.webservices.domain.workoutresult.json;import java.util.Date;




/**
 * (no documentation provided)
 */
//@JsonAutoDetect()
public class CardioWorkoutProgress implements java.io.Serializable {

  private java.lang.Double distance;
  private java.lang.Double duration;
  private java.lang.Double calorie;
  private java.lang.String workoutName;
  private java.lang.String dateString;
  private java.util.Date date;
  private java.lang.String source;
  
  public java.lang.String getDateString() {
	return date.toLocaleString();
}

public void setDateString(java.lang.String dateString) {
	this.dateString = dateString;
}

/**
   * 
   */
  public java.lang.Double getDistance() {
    return this.distance;
  }

  /**
   * 
   */
  public void setDistance(java.lang.Double distance) {
    this.distance = distance;
  }

  /**
   * 
   */
  public java.lang.Double getDuration() {
    return this.duration;
  }

  /**
   * 
   */
  public void setDuration(java.lang.Double duration) {
    this.duration = duration;
  }

  /**
   * 
   */
  public java.lang.Double getCalorie() {
    return this.calorie;
  }

  /**
   * 
   */
  public void setCalorie(java.lang.Double calorie) {
    this.calorie = calorie;
  }

  /**
   * (no documentation provided)
   */
  public java.lang.String getWorkoutName() {
    return this.workoutName;
  }

  /**
   * (no documentation provided)
   */
  public void setWorkoutName(java.lang.String workoutName) {
    this.workoutName = workoutName;
  }

  /**
   * (no documentation provided)
   */
  public java.util.Date getDate() {
    return this.date;
  }

  /**
   * (no documentation provided)
   */
  public void setDate(java.util.Date date) {
    this.date = date;
  }

  /**
   * 
   */
  public java.lang.String getSource() {
    return this.source;
  }

  /**
   * 
   */
  public void setSource(java.lang.String source) {
    this.source = source;
  }
}
