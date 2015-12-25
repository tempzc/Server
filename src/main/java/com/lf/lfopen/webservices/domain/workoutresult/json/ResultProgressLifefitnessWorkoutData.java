package com.lf.lfopen.webservices.domain.workoutresult.json;import com.fasterxml.jackson.annotation.JsonIgnore;import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */




/**
 * (no documentation provided)
 */
public class ResultProgressLifefitnessWorkoutData implements java.io.Serializable {

  @JsonIgnore
  private java.lang.Double _distance;
  @JsonIgnore
  private java.lang.Double _duration;
  @JsonIgnore
  private java.lang.Double _calorie;
  @JsonIgnore
  private java.lang.Long _equipmentId;
  @JsonIgnore
  private java.lang.String _equipmentName;
  @JsonIgnore
  private java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.CardioLifefitnessProgress> _cardioDataDetails;
  @JsonIgnore
  private java.lang.String _unit;

  /**
   * Total distance of the workout
   */
  @JsonProperty("distance")
  public java.lang.Double getDistance() {
    return this._distance;
  }

  /**
   * Total distance of the workout
   */
  @JsonProperty("distance")
  public void setDistance(java.lang.Double _distance) {
    this._distance = _distance;
  }

  /**
   * Total duration of the workout
   */
  @JsonProperty("duration")
  public java.lang.Double getDuration() {
    return this._duration;
  }

  /**
   * Total duration of the workout
   */
  @JsonProperty("duration")
  public void setDuration(java.lang.Double _duration) {
    this._duration = _duration;
  }

  /**
   * Total calorie of the workout
   */
  @JsonProperty("calorie")
  public java.lang.Double getCalorie() {
    return this._calorie;
  }

  /**
   * Total calorie of the workout
   */
  @JsonProperty("calorie")
  public void setCalorie(java.lang.Double _calorie) {
    this._calorie = _calorie;
  }

  /**
   * Lfconnect equipment ID
   */
  @JsonProperty("equipmentId")
  public java.lang.Long getEquipmentId() {
    return this._equipmentId;
  }

  /**
   * Lfconnect equipment ID
   */
  @JsonProperty("equipmentId")
  public void setEquipmentId(java.lang.Long _equipmentId) {
    this._equipmentId = _equipmentId;
  }

  /**
   * Equipment name (Treadmill/Upright Bike)
   */
  @JsonProperty("equipmentName")
  public java.lang.String getEquipmentName() {
    return this._equipmentName;
  }

  /**
   * Equipment name (Treadmill/Upright Bike)
   */
  @JsonProperty("equipmentName")
  public void setEquipmentName(java.lang.String _equipmentName) {
    this._equipmentName = _equipmentName;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("cardioDataDetails")
  public java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.CardioLifefitnessProgress> getCardioDataDetails() {
    return this._cardioDataDetails;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("cardioDataDetails")
  public void setCardioDataDetails(java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.CardioLifefitnessProgress> _cardioDataDetails) {
    this._cardioDataDetails = _cardioDataDetails;
  }

  /**
   * 
   */
  @JsonProperty("unit")
  public java.lang.String getUnit() {
    return this._unit;
  }

  /**
   * 
   */
  @JsonProperty("unit")
  public void setUnit(java.lang.String _unit) {
    this._unit = _unit;
  }
}
