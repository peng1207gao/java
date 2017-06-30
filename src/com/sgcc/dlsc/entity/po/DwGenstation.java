package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwGenstation的POJO类
 *
 * @author  Administrator  [Tue Mar 11 19:24:08 CST 2014]
 * 
 */
public class DwGenstation implements Serializable{

    /** 
     * 属性stationid
     */
    private String stationid;
	
    /** 
     * 属性stationname
     */
    private String stationname;
	
    /** 
     * 属性stationdescr
     */
    private String stationdescr;
	
    /** 
     * 属性geogrregionid
     */
    private String geogrregionid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性gengroupid
     */
    private String gengroupid;
	
    /** 
     * 属性registerdate
     */
    private Date registerdate;
	
    /** 
     * 属性dispatchtype
     */
    private BigDecimal dispatchtype;
	
    /** 
     * 属性isarea
     */
    private BigDecimal isarea;
	
    /** 
     * 属性isdircpurchase
     */
    private BigDecimal isdircpurchase;
	
    /**
     * DwGenstation构造函数
     */
    public DwGenstation() {
        super();
    }  
	
    /**
     * DwGenstation完整的构造函数
     */  
    public DwGenstation(String stationid,String stationname){
        this.stationid = stationid;
        this.stationname = stationname;
    }
 
    /**
     * 属性 stationid 的get方法
     * @return String
     */
    public String getStationid(){
        return stationid;
    }
	
    /**
     * 属性 stationid 的set方法
     * @return
     */
    public void setStationid(String stationid){
        if(stationid != null && stationid.trim().length() == 0){
            this.stationid = null;
        }else{
            this.stationid = stationid;
        }
    } 
	
    /**
     * 属性 stationname 的get方法
     * @return String
     */
    public String getStationname(){
        return stationname;
    }
	
    /**
     * 属性 stationname 的set方法
     * @return
     */
    public void setStationname(String stationname){
        this.stationname = stationname;
    } 
	
    /**
     * 属性 stationdescr 的get方法
     * @return String
     */
    public String getStationdescr(){
        return stationdescr;
    }
	
    /**
     * 属性 stationdescr 的set方法
     * @return
     */
    public void setStationdescr(String stationdescr){
        this.stationdescr = stationdescr;
    } 
	
    /**
     * 属性 geogrregionid 的get方法
     * @return String
     */
    public String getGeogrregionid(){
        return geogrregionid;
    }
	
    /**
     * 属性 geogrregionid 的set方法
     * @return
     */
    public void setGeogrregionid(String geogrregionid){
        this.geogrregionid = geogrregionid;
    } 
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 gengroupid 的get方法
     * @return String
     */
    public String getGengroupid(){
        return gengroupid;
    }
	
    /**
     * 属性 gengroupid 的set方法
     * @return
     */
    public void setGengroupid(String gengroupid){
        this.gengroupid = gengroupid;
    } 
	
    /**
     * 属性 registerdate 的get方法
     * @return Date
     */
    public Date getRegisterdate(){
        return registerdate;
    }
	
    /**
     * 属性 registerdate 的set方法
     * @return
     */
    public void setRegisterdate(Date registerdate){
        this.registerdate = registerdate;
    } 
	
    /**
     * 属性 dispatchtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDispatchtype(){
        return dispatchtype;
    }
	
    /**
     * 属性 dispatchtype 的set方法
     * @return
     */
    public void setDispatchtype(BigDecimal dispatchtype){
        this.dispatchtype = dispatchtype;
    } 
	
    /**
     * 属性 isarea 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsarea(){
        return isarea;
    }
	
    /**
     * 属性 isarea 的set方法
     * @return
     */
    public void setIsarea(BigDecimal isarea){
        this.isarea = isarea;
    } 
	
    /**
     * 属性 isdircpurchase 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdircpurchase(){
        return isdircpurchase;
    }
	
    /**
     * 属性 isdircpurchase 的set方法
     * @return
     */
    public void setIsdircpurchase(BigDecimal isdircpurchase){
        this.isdircpurchase = isdircpurchase;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwGenstation))
	        return false; 
			
        if(getStationid() == null) 
	        return false;

        DwGenstation other = (DwGenstation) o;	        
	    return new EqualsBuilder()
            .append(this.getStationid(), other.getStationid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("stationid"+":"+getStationid())
            .append("stationname"+":"+getStationname())
            .append("stationdescr"+":"+getStationdescr())
            .append("geogrregionid"+":"+getGeogrregionid())
            .append("marketid"+":"+getMarketid())
            .append("gengroupid"+":"+getGengroupid())
            .append("registerdate"+":"+getRegisterdate())
            .append("dispatchtype"+":"+getDispatchtype())
            .append("isarea"+":"+getIsarea())
            .append("isdircpurchase"+":"+getIsdircpurchase())
            .toString(); 
			
    } 
   

    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}

}