package com.lf.lfopen.webservices.domain.workoutresult.json;import com.fasterxml.jackson.annotation.JsonIgnore;import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */




/**
 * (no documentation provided)
 */
public class ProgressSummary implements java.io.Serializable {

  @JsonIgnore
  private java.lang.Long _caloriesThisMonth;
  @JsonIgnore
  private java.lang.Long _caloriesThisWeek;
  @JsonIgnore
  private java.lang.Long _caloriesThisYear;
  @JsonIgnore
  private java.lang.Double _distanceThisMonth;
  @JsonIgnore
  private java.lang.Double _distanceThisWeek;
  @JsonIgnore
  private java.lang.Double _distanceThisYear;
  @JsonIgnore
  private java.lang.Double _durationThisMonth;
  @JsonIgnore
  private java.lang.Double _durationThisWeek;
  @JsonIgnore
  private java.lang.Double _durationThisYear;
  @JsonIgnore
  private java.lang.Long _workoutDaysThisMonth;
  @JsonIgnore
  private java.lang.Long _workoutDaysThisWeek;
  @JsonIgnore
  private java.lang.Long _workoutDaysThisYear;
  @JsonIgnore
  private java.lang.Long _weightLiftedThisMonth;
  @JsonIgnore
  private java.lang.Long _weightLiftedThisWeek;
  @JsonIgnore
  private java.lang.Long _weightLiftedThisYear;
  @JsonIgnore
  private java.lang.Long _caloriesThisDay;
  @JsonIgnore
  private java.lang.Double _distanceThisDay;
  @JsonIgnore
  private java.lang.Double _durationThisDay;
  @JsonIgnore
  private java.lang.Long _workoutDaysThisDay;
  @JsonIgnore
  private java.lang.Long _weightLiftedThisDay;
  @JsonIgnore
  private java.util.Date _dateToday;
  @JsonIgnore
  private java.util.Date _weekDateFrom;
  @JsonIgnore
  private java.util.Date _monthDateFrom;
  @JsonIgnore
  private java.util.Date _yearDateFrom;
  @JsonIgnore
  private java.util.Date _weekDateTo;
  @JsonIgnore
  private java.util.Date _monthDateTo;
  @JsonIgnore
  private java.util.Date _yearDateTo;

  /**
   * Sum of workout calories for this month. Default value is 0 (zero).
   */
  @JsonProperty("caloriesThisMonth")
  public java.lang.Long getCaloriesThisMonth() {
    return this._caloriesThisMonth;
  }

  /**
   * Sum of workout calories for this month. Default value is 0 (zero).
   */
  @JsonProperty("caloriesThisMonth")
  public void setCaloriesThisMonth(java.lang.Long _caloriesThisMonth) {
    this._caloriesThisMonth = _caloriesThisMonth;
  }

  /**
   * Sum of workout calories for this week. Default value is 0 (zero).
   */
  @JsonProperty("caloriesThisWeek")
  public java.lang.Long getCaloriesThisWeek() {
    return this._caloriesThisWeek;
  }

  /**
   * Sum of workout calories for this week. Default value is 0 (zero).
   */
  @JsonProperty("caloriesThisWeek")
  public void setCaloriesThisWeek(java.lang.Long _caloriesThisWeek) {
    this._caloriesThisWeek = _caloriesThisWeek;
  }

  /**
   * Sum of workout calories for this year. Default value is 0 (zero).
   */
  @JsonProperty("caloriesThisYear")
  public java.lang.Long getCaloriesThisYear() {
    return this._caloriesThisYear;
  }

  /**
   * Sum of workout calories for this year. Default value is 0 (zero).
   */
  @JsonProperty("caloriesThisYear")
  public void setCaloriesThisYear(java.lang.Long _caloriesThisYear) {
    this._caloriesThisYear = _caloriesThisYear;
  }

  /**
   * Sum of workout distance for this month. Default value is 0 (zero).
   */
  @JsonProperty("distanceThisMonth")
  public java.lang.Double getDistanceThisMonth() {
    return this._distanceThisMonth;
  }

  /**
   * Sum of workout distance for this month. Default value is 0 (zero).
   */
  @JsonProperty("distanceThisMonth")
  public void setDistanceThisMonth(java.lang.Double _distanceThisMonth) {
    this._distanceThisMonth = _distanceThisMonth;
  }

  /**
   * Sum of workout distance for this week. Default value is 0 (zero).
   */
  @JsonProperty("distanceThisWeek")
  public java.lang.Double getDistanceThisWeek() {
    return this._distanceThisWeek;
  }

  /**
   * Sum of workout distance for this week. Default value is 0 (zero).
   */
  @JsonProperty("distanceThisWeek")
  public void setDistanceThisWeek(java.lang.Double _distanceThisWeek) {
    this._distanceThisWeek = _distanceThisWeek;
  }

  /**
   * Sum of workout distance for this year. Default value is 0 (zero).
   */
  @JsonProperty("distanceThisYear")
  public java.lang.Double getDistanceThisYear() {
    return this._distanceThisYear;
  }

  /**
   * Sum of workout distance for this year. Default value is 0 (zero).
   */
  @JsonProperty("distanceThisYear")
  public void setDistanceThisYear(java.lang.Double _distanceThisYear) {
    this._distanceThisYear = _distanceThisYear;
  }

  /**
   * Sum of workout duration for this year. Default value is 0 (zero).
   */
  @JsonProperty("durationThisMonth")
  public java.lang.Double getDurationThisMonth() {
    return this._durationThisMonth;
  }

  /**
   * Sum of workout duration for this year. Default value is 0 (zero).
   */
  @JsonProperty("durationThisMonth")
  public void setDurationThisMonth(java.lang.Double _durationThisMonth) {
    this._durationThisMonth = _durationThisMonth;
  }

  /**
   * Sum of workout duration for this week. Default value is 0 (zero).
   */
  @JsonProperty("durationThisWeek")
  public java.lang.Double getDurationThisWeek() {
    return this._durationThisWeek;
  }

  /**
   * Sum of workout duration for this week. Default value is 0 (zero).
   */
  @JsonProperty("durationThisWeek")
  public void setDurationThisWeek(java.lang.Double _durationThisWeek) {
    this._durationThisWeek = _durationThisWeek;
  }

  /**
   * Sum of workout duration for this year. Default value is 0 (zero).
   */
  @JsonProperty("durationThisYear")
  public java.lang.Double getDurationThisYear() {
    return this._durationThisYear;
  }

  /**
   * Sum of workout duration for this year. Default value is 0 (zero).
   */
  @JsonProperty("durationThisYear")
  public void setDurationThisYear(java.lang.Double _durationThisYear) {
    this._durationThisYear = _durationThisYear;
  }

  /**
   * Sum of workout days for this month. Default value is 0 (zero).
   */
  @JsonProperty("workoutDaysThisMonth")
  public java.lang.Long getWorkoutDaysThisMonth() {
    return this._workoutDaysThisMonth;
  }

  /**
   * Sum of workout days for this month. Default value is 0 (zero).
   */
  @JsonProperty("workoutDaysThisMonth")
  public void setWorkoutDaysThisMonth(java.lang.Long _workoutDaysThisMonth) {
    this._workoutDaysThisMonth = _workoutDaysThisMonth;
  }

  /**
   * Sum of workout days for this week. Default value is 0 (zero).
   */
  @JsonProperty("workoutDaysThisWeek")
  public java.lang.Long getWorkoutDaysThisWeek() {
    return this._workoutDaysThisWeek;
  }

  /**
   * Sum of workout days for this week. Default value is 0 (zero).
   */
  @JsonProperty("workoutDaysThisWeek")
  public void setWorkoutDaysThisWeek(java.lang.Long _workoutDaysThisWeek) {
    this._workoutDaysThisWeek = _workoutDaysThisWeek;
  }

  /**
   * Sum of workout days for this year. Default value is 0 (zero).
   */
  @JsonProperty("workoutDaysThisYear")
  public java.lang.Long getWorkoutDaysThisYear() {
    return this._workoutDaysThisYear;
  }

  /**
   * Sum of workout days for this year. Default value is 0 (zero).
   */
  @JsonProperty("workoutDaysThisYear")
  public void setWorkoutDaysThisYear(java.lang.Long _workoutDaysThisYear) {
    this._workoutDaysThisYear = _workoutDaysThisYear;
  }

  /**
   * Sum of weight lifted for this year. Default value is 0 (zero).
   */
  @JsonProperty("weightLiftedThisMonth")
  public java.lang.Long getWeightLiftedThisMonth() {
    return this._weightLiftedThisMonth;
  }

  /**
   * Sum of weight lifted for this year. Default value is 0 (zero).
   */
  @JsonProperty("weightLiftedThisMonth")
  public void setWeightLiftedThisMonth(java.lang.Long _weightLiftedThisMonth) {
    this._weightLiftedThisMonth = _weightLiftedThisMonth;
  }

  /**
   * Sum of weight lifted for this year. Default value is 0 (zero).
   */
  @JsonProperty("weightLiftedThisWeek")
  public java.lang.Long getWeightLiftedThisWeek() {
    return this._weightLiftedThisWeek;
  }

  /**
   * Sum of weight lifted for this year. Default value is 0 (zero).
   */
  @JsonProperty("weightLiftedThisWeek")
  public void setWeightLiftedThisWeek(java.lang.Long _weightLiftedThisWeek) {
    this._weightLiftedThisWeek = _weightLiftedThisWeek;
  }

  /**
   * Sum of weight lifted this year. Default value is 0 (zero).
   */
  @JsonProperty("weightLiftedThisYear")
  public java.lang.Long getWeightLiftedThisYear() {
    return this._weightLiftedThisYear;
  }

  /**
   * Sum of weight lifted this year. Default value is 0 (zero).
   */
  @JsonProperty("weightLiftedThisYear")
  public void setWeightLiftedThisYear(java.lang.Long _weightLiftedThisYear) {
    this._weightLiftedThisYear = _weightLiftedThisYear;
  }

  /**
   * 
   */
  @JsonProperty("caloriesThisDay")
  public java.lang.Long getCaloriesThisDay() {
    return this._caloriesThisDay;
  }

  /**
   * 
   */
  @JsonProperty("caloriesThisDay")
  public void setCaloriesThisDay(java.lang.Long _caloriesThisDay) {
    this._caloriesThisDay = _caloriesThisDay;
  }

  /**
   * 
   */
  @JsonProperty("distanceThisDay")
  public java.lang.Double getDistanceThisDay() {
    return this._distanceThisDay;
  }

  /**
   * 
   */
  @JsonProperty("distanceThisDay")
  public void setDistanceThisDay(java.lang.Double _distanceThisDay) {
    this._distanceThisDay = _distanceThisDay;
  }

  /**
   * 
   */
  @JsonProperty("durationThisDay")
  public java.lang.Double getDurationThisDay() {
    return this._durationThisDay;
  }

  /**
   * 
   */
  @JsonProperty("durationThisDay")
  public void setDurationThisDay(java.lang.Double _durationThisDay) {
    this._durationThisDay = _durationThisDay;
  }

  /**
   * 
   */
  @JsonProperty("workoutDaysThisDay")
  public java.lang.Long getWorkoutDaysThisDay() {
    return this._workoutDaysThisDay;
  }

  /**
   * 
   */
  @JsonProperty("workoutDaysThisDay")
  public void setWorkoutDaysThisDay(java.lang.Long _workoutDaysThisDay) {
    this._workoutDaysThisDay = _workoutDaysThisDay;
  }

  /**
   * 
   */
  @JsonProperty("weightLiftedThisDay")
  public java.lang.Long getWeightLiftedThisDay() {
    return this._weightLiftedThisDay;
  }

  /**
   * 
   */
  @JsonProperty("weightLiftedThisDay")
  public void setWeightLiftedThisDay(java.lang.Long _weightLiftedThisDay) {
    this._weightLiftedThisDay = _weightLiftedThisDay;
  }

  /**
   * 
   */
  @JsonProperty("dateToday")
  public java.util.Date getDateToday() {
    return this._dateToday;
  }

  /**
   * 
   */
  @JsonProperty("dateToday")
  public void setDateToday(java.util.Date _dateToday) {
    this._dateToday = _dateToday;
  }

  /**
   * 
   */
  @JsonProperty("weekDateFrom")
  public java.util.Date getWeekDateFrom() {
    return this._weekDateFrom;
  }

  /**
   * 
   */
  @JsonProperty("weekDateFrom")
  public void setWeekDateFrom(java.util.Date _weekDateFrom) {
    this._weekDateFrom = _weekDateFrom;
  }

  /**
   * 
   */
  @JsonProperty("monthDateFrom")
  public java.util.Date getMonthDateFrom() {
    return this._monthDateFrom;
  }

  /**
   * 
   */
  @JsonProperty("monthDateFrom")
  public void setMonthDateFrom(java.util.Date _monthDateFrom) {
    this._monthDateFrom = _monthDateFrom;
  }

  /**
   * 
   */
  @JsonProperty("yearDateFrom")
  public java.util.Date getYearDateFrom() {
    return this._yearDateFrom;
  }

  /**
   * 
   */
  @JsonProperty("yearDateFrom")
  public void setYearDateFrom(java.util.Date _yearDateFrom) {
    this._yearDateFrom = _yearDateFrom;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("weekDateTo")
  public java.util.Date getWeekDateTo() {
    return this._weekDateTo;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("weekDateTo")
  public void setWeekDateTo(java.util.Date _weekDateTo) {
    this._weekDateTo = _weekDateTo;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("monthDateTo")
  public java.util.Date getMonthDateTo() {
    return this._monthDateTo;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("monthDateTo")
  public void setMonthDateTo(java.util.Date _monthDateTo) {
    this._monthDateTo = _monthDateTo;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("yearDateTo")
  public java.util.Date getYearDateTo() {
    return this._yearDateTo;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("yearDateTo")
  public void setYearDateTo(java.util.Date _yearDateTo) {
    this._yearDateTo = _yearDateTo;
  }
}