package com.lf.lfopen.webservices.domain.workoutresult.json;import com.fasterxml.jackson.annotation.JsonIgnore;import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */




/**
 * (no documentation provided)
 */
public class CardioGPSProgress extends com.lf.lfopen.webservices.domain.workoutresult.json.CardioWorkoutProgress {

  @JsonIgnore
  private java.lang.Integer _workoutType;
  @JsonIgnore
  private java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.GPSResultCoordinate> _gpsCoordinates;

  /**
   * 
   */
  @JsonProperty("workoutType")
  public java.lang.Integer getWorkoutType() {
    return this._workoutType;
  }

  /**
   * 
   */
  @JsonProperty("workoutType")
  public void setWorkoutType(java.lang.Integer _workoutType) {
    this._workoutType = _workoutType;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("gpsCoordinates")
  public java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.GPSResultCoordinate> getGpsCoordinates() {
    return this._gpsCoordinates;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("gpsCoordinates")
  public void setGpsCoordinates(java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.GPSResultCoordinate> _gpsCoordinates) {
    this._gpsCoordinates = _gpsCoordinates;
  }
}