/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package com.lf.lfopen.webservices.domain.workoutpreset.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * (no documentation provided)
 */
public class WOSegment implements java.io.Serializable {

  @JsonIgnore
  private java.lang.String _workoutName;
  @JsonIgnore
  private java.lang.String _workoutDays;
  @JsonIgnore
  private java.lang.String _equipment;
  @JsonIgnore
  private java.lang.String _unit;
  @JsonIgnore
  private java.lang.Double _time;
  @JsonIgnore
  private java.lang.Double _distance;
  @JsonIgnore
  private java.lang.Double _calories;
  @JsonIgnore
  private java.lang.Double _incline;
  @JsonIgnore
  private java.lang.Double _level;
  @JsonIgnore
  private java.lang.Double _heartRate;
  @JsonIgnore
  private java.lang.Double _distanceClimbed;
  @JsonIgnore
  private java.lang.Double _pace;
  @JsonIgnore
  private java.lang.Double _initialSpeed;
  @JsonIgnore
  private java.lang.String _goal;
  @JsonIgnore
  private java.lang.String _status;
  @JsonIgnore
  private java.lang.Long _changeTimeStamp;
  @JsonIgnore
  private java.util.List<com.lf.lfopen.webservices.domain.workoutpreset.json.WOParam> _workoutParams;

  /**
   * Workout Name e.g. Weight Loss- Beginner Wks 1-4.
   */
  @JsonProperty("workoutName")
  public java.lang.String getWorkoutName() {
    return this._workoutName;
  }

  /**
   * Workout Name e.g. Weight Loss- Beginner Wks 1-4.
   */
  @JsonProperty("workoutName")
  public void setWorkoutName(java.lang.String _workoutName) {
    this._workoutName = _workoutName;
  }

  /**
   * Workout Days. Consist of number of days in comma separated.
   * Format : 1 is Sun, 2 is Mon .. 7 is Sat.
   * e.g : 2,5,7 is Monday, Thursday and Saturday.
   */
  @JsonProperty("workoutDays")
  public java.lang.String getWorkoutDays() {
    return this._workoutDays;
  }

  /**
   * Workout Days. Consist of number of days in comma separated.
   * Format : 1 is Sun, 2 is Mon .. 7 is Sat.
   * e.g : 2,5,7 is Monday, Thursday and Saturday.
   */
  @JsonProperty("workoutDays")
  public void setWorkoutDays(java.lang.String _workoutDays) {
    this._workoutDays = _workoutDays;
  }

  /**
   * Equipment Name e.g. CrossTrainer.
   */
  @JsonProperty("equipment")
  public java.lang.String getEquipment() {
    return this._equipment;
  }

  /**
   * Equipment Name e.g. CrossTrainer.
   */
  @JsonProperty("equipment")
  public void setEquipment(java.lang.String _equipment) {
    this._equipment = _equipment;
  }

  /**
   * Unit. I for imperial and M for metric.
   */
  @JsonProperty("unit")
  public java.lang.String getUnit() {
    return this._unit;
  }

  /**
   * Unit. I for imperial and M for metric.
   */
  @JsonProperty("unit")
  public void setUnit(java.lang.String _unit) {
    this._unit = _unit;
  }

  /**
   * Workout duration in minute.
   */
  @JsonProperty("time")
  public java.lang.Double getTime() {
    return this._time;
  }

  /**
   * Workout duration in minute.
   */
  @JsonProperty("time")
  public void setTime(java.lang.Double _time) {
    this._time = _time;
  }

  /**
   * Workout Distance.
   */
  @JsonProperty("distance")
  public java.lang.Double getDistance() {
    return this._distance;
  }

  /**
   * Workout Distance.
   */
  @JsonProperty("distance")
  public void setDistance(java.lang.Double _distance) {
    this._distance = _distance;
  }

  /**
   * Workout Calories.
   */
  @JsonProperty("calories")
  public java.lang.Double getCalories() {
    return this._calories;
  }

  /**
   * Workout Calories.
   */
  @JsonProperty("calories")
  public void setCalories(java.lang.Double _calories) {
    this._calories = _calories;
  }

  /**
   * Workout incline.
   */
  @JsonProperty("incline")
  public java.lang.Double getIncline() {
    return this._incline;
  }

  /**
   * Workout incline.
   */
  @JsonProperty("incline")
  public void setIncline(java.lang.Double _incline) {
    this._incline = _incline;
  }

  /**
   * Workout level.
   */
  @JsonProperty("level")
  public java.lang.Double getLevel() {
    return this._level;
  }

  /**
   * Workout level.
   */
  @JsonProperty("level")
  public void setLevel(java.lang.Double _level) {
    this._level = _level;
  }

  /**
   * Workout heart rate.
   */
  @JsonProperty("heartRate")
  public java.lang.Double getHeartRate() {
    return this._heartRate;
  }

  /**
   * Workout heart rate.
   */
  @JsonProperty("heartRate")
  public void setHeartRate(java.lang.Double _heartRate) {
    this._heartRate = _heartRate;
  }

  /**
   * Workout distance climbed.
   */
  @JsonProperty("distanceClimbed")
  public java.lang.Double getDistanceClimbed() {
    return this._distanceClimbed;
  }

  /**
   * Workout distance climbed.
   */
  @JsonProperty("distanceClimbed")
  public void setDistanceClimbed(java.lang.Double _distanceClimbed) {
    this._distanceClimbed = _distanceClimbed;
  }

  /**
   * Workout pace.
   */
  @JsonProperty("pace")
  public java.lang.Double getPace() {
    return this._pace;
  }

  /**
   * Workout pace.
   */
  @JsonProperty("pace")
  public void setPace(java.lang.Double _pace) {
    this._pace = _pace;
  }

  /**
   * Workout initial speed.
   */
  @JsonProperty("initialSpeed")
  public java.lang.Double getInitialSpeed() {
    return this._initialSpeed;
  }

  /**
   * Workout initial speed.
   */
  @JsonProperty("initialSpeed")
  public void setInitialSpeed(java.lang.Double _initialSpeed) {
    this._initialSpeed = _initialSpeed;
  }

  /**
   * indicate which parameter is the goal.
   * id 1 - distance
   * id 2 - calories
   * id 3 - pace
   * id 4 - time
   * id 5 - distance climbed
   */
  @JsonProperty("goal")
  public java.lang.String getGoal() {
    return this._goal;
  }

  /**
   * indicate which parameter is the goal.
   * id 1 - distance
   * id 2 - calories
   * id 3 - pace
   * id 4 - time
   * id 5 - distance climbed
   */
  @JsonProperty("goal")
  public void setGoal(java.lang.String _goal) {
    this._goal = _goal;
  }

  /**
   * Status of the Workout Segment. Possible values:
   * N - New
   * H - Hidden / Deleted
   * U - Updated
   * X - Not Existing in Workout Library
   */
  @JsonProperty("status")
  public java.lang.String getStatus() {
    return this._status;
  }

  /**
   * Status of the Workout Segment. Possible values:
   * N - New
   * H - Hidden / Deleted
   * U - Updated
   * X - Not Existing in Workout Library
   */
  @JsonProperty("status")
  public void setStatus(java.lang.String _status) {
    this._status = _status;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("changeTimeStamp")
  public java.lang.Long getChangeTimeStamp() {
    return this._changeTimeStamp;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("changeTimeStamp")
  public void setChangeTimeStamp(java.lang.Long _changeTimeStamp) {
    this._changeTimeStamp = _changeTimeStamp;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("workoutParams")
  public java.util.List<com.lf.lfopen.webservices.domain.workoutpreset.json.WOParam> getWorkoutParams() {
    return this._workoutParams;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("workoutParams")
  public void setWorkoutParams(java.util.List<com.lf.lfopen.webservices.domain.workoutpreset.json.WOParam> _workoutParams) {
    this._workoutParams = _workoutParams;
  }
}
