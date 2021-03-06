package com.lf.lfopen.webservices.domain.workoutresult.json;import com.fasterxml.jackson.annotation.JsonIgnore;import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */




/**
 * (no documentation provided)
 */
public class GPSWorkoutResult extends com.lf.lfopen.webservices.domain.workoutresult.json.WorkoutResultOpen {

  @JsonIgnore
  private java.lang.Double _distance;
  @JsonIgnore
  private java.lang.String _distanceUnit;
  @JsonIgnore
  private java.lang.Double _time;
  @JsonIgnore
  private java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.GPSResultCoordinate> _coordinates;
  @JsonIgnore
  private java.lang.Long _offSetMin;
  @JsonIgnore
  private java.lang.Double _calories;

  /**
   * Total distance of the GPS workout.
   */
  @JsonProperty("distance")
  public java.lang.Double getDistance() {
    return this._distance;
  }

  /**
   * Total distance of the GPS workout.
   */
  @JsonProperty("distance")
  public void setDistance(java.lang.Double _distance) {
    this._distance = _distance;
  }

  /**
   * Unit used for the GPS workout. Possible values: I - Imperial unit (in
   * feet) M - Metric unit (in meters)
   */
  @JsonProperty("distanceUnit")
  public java.lang.String getDistanceUnit() {
    return this._distanceUnit;
  }

  /**
   * Unit used for the GPS workout. Possible values: I - Imperial unit (in
   * feet) M - Metric unit (in meters)
   */
  @JsonProperty("distanceUnit")
  public void setDistanceUnit(java.lang.String _distanceUnit) {
    this._distanceUnit = _distanceUnit;
  }

  /**
   * Total time for the GPS workout (in seconds).
   */
  @JsonProperty("time")
  public java.lang.Double getTime() {
    return this._time;
  }

  /**
   * Total time for the GPS workout (in seconds).
   */
  @JsonProperty("time")
  public void setTime(java.lang.Double _time) {
    this._time = _time;
  }

  /**
   * List of GPS coordinates and data for the GPS workout.
   */
  @JsonProperty("coordinates")
  public java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.GPSResultCoordinate> getCoordinates() {
    return this._coordinates;
  }

  /**
   * List of GPS coordinates and data for the GPS workout.
   */
  @JsonProperty("coordinates")
  public void setCoordinates(java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.GPSResultCoordinate> _coordinates) {
    this._coordinates = _coordinates;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("offSetMin")
  public java.lang.Long getOffSetMin() {
    return this._offSetMin;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("offSetMin")
  public void setOffSetMin(java.lang.Long _offSetMin) {
    this._offSetMin = _offSetMin;
  }

  /**
   * Calories for the GPS workout.Default value for empty should be 0 (zero).
   */
  @JsonProperty("calories")
  public java.lang.Double getCalories() {
    return this._calories;
  }

  /**
   * Calories for the GPS workout.Default value for empty should be 0 (zero).
   */
  @JsonProperty("calories")
  public void setCalories(java.lang.Double _calories) {
    this._calories = _calories;
  }
}
