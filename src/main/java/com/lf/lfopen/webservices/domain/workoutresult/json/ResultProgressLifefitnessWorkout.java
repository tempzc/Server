package com.lf.lfopen.webservices.domain.workoutresult.json;import com.fasterxml.jackson.annotation.JsonIgnore;import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */




/**
 * (no documentation provided)
 */
public class ResultProgressLifefitnessWorkout implements java.io.Serializable {

  @JsonIgnore
  private java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressLifefitnessWorkoutData> _resultWorkoutData;

  /**
   * (no documentation provided)
   */
  @JsonProperty("resultWorkoutData")
  public java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressLifefitnessWorkoutData> getResultWorkoutData() {
    return this._resultWorkoutData;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("resultWorkoutData")
  public void setResultWorkoutData(java.util.List<com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressLifefitnessWorkoutData> _resultWorkoutData) {
    this._resultWorkoutData = _resultWorkoutData;
  }
}
