package com.lf.lfopen.webservices.domain.workoutresult.json;import com.fasterxml.jackson.annotation.JsonIgnore;import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */




/**
 * (no documentation provided)
 */
public class StrengthResultSet implements java.io.Serializable {

  @JsonIgnore
  private java.lang.Integer _repetitionsCount;
  @JsonIgnore
  private java.lang.Double _resistanceWeight;
  @JsonIgnore
  private java.lang.Integer _setNumber;

  /**
   * Repetition count.
   */
  @JsonProperty("repetitionsCount")
  public java.lang.Integer getRepetitionsCount() {
    return this._repetitionsCount;
  }

  /**
   * Repetition count.
   */
  @JsonProperty("repetitionsCount")
  public void setRepetitionsCount(java.lang.Integer _repetitionsCount) {
    this._repetitionsCount = _repetitionsCount;
  }

  /**
   * Weight lifted.
   */
  @JsonProperty("resistanceWeight")
  public java.lang.Double getResistanceWeight() {
    return this._resistanceWeight;
  }

  /**
   * Weight lifted.
   */
  @JsonProperty("resistanceWeight")
  public void setResistanceWeight(java.lang.Double _resistanceWeight) {
    this._resistanceWeight = _resistanceWeight;
  }

  /**
   * Set Number.
   */
  @JsonProperty("setNumber")
  public java.lang.Integer getSetNumber() {
    return this._setNumber;
  }

  /**
   * Set Number.
   */
  @JsonProperty("setNumber")
  public void setSetNumber(java.lang.Integer _setNumber) {
    this._setNumber = _setNumber;
  }
}
