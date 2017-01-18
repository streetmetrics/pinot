package com.linkedin.thirdeye.datalayer.entity;

public class DataCompletenessConfigIndex extends AbstractIndexEntity {

  String dataset;
  long dateToCheckInMS;
  String dateToCheckInSDF;
  boolean dataComplete;


  public String getDataset() {
    return dataset;
  }


  public void setDataset(String dataset) {
    this.dataset = dataset;
  }


  public long getDateToCheckInMS() {
    return dateToCheckInMS;
  }


  public void setDateToCheckInMS(long dateToCheckInMS) {
    this.dateToCheckInMS = dateToCheckInMS;
  }


  public String getDateToCheckInSDF() {
    return dateToCheckInSDF;
  }


  public void setDateToCheckInSDF(String dateToCheckInSDF) {
    this.dateToCheckInSDF = dateToCheckInSDF;
  }


  public boolean isDataComplete() {
    return dataComplete;
  }


  public void setDataComplete(boolean dataComplete) {
    this.dataComplete = dataComplete;
  }


  @Override
  public String toString() {
    return "DataCompletenessConfigIndex [dataset=" + dataset + ", dateToCheckInMS=" + dateToCheckInMS
        + ", dateToCheckInSDF=" + dateToCheckInSDF + ", dataComplete=" + dataComplete
        + ", version=" + version + ", baseId=" + baseId + ", id=" + id + ", createTime="
        + createTime + ", updateTime=" + updateTime + "]";
  }

}
