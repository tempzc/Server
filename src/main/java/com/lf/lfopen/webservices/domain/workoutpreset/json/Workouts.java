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
public class Workouts implements java.io.Serializable {

  @JsonIgnore
  private java.util.Collection<com.lf.lfopen.webservices.domain.workoutpreset.json.WOSegment> _workoutSegments;

  /**
   * List of User Workouts.
   */
  @JsonProperty("workoutSegments")
  public java.util.Collection<com.lf.lfopen.webservices.domain.workoutpreset.json.WOSegment> getWorkoutSegments() {
    return this._workoutSegments;
  }

  /**
   * List of User Workouts.
   */
  @JsonProperty("workoutSegments")
  public void setWorkoutSegments(java.util.Collection<com.lf.lfopen.webservices.domain.workoutpreset.json.WOSegment> _workoutSegments) {
    this._workoutSegments = _workoutSegments;
  }
}
