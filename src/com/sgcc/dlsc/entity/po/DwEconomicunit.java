package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwEconomicunit的POJO类
 *
 * @author  djdeng  [Wed Mar 12 10:22:30 CST 2014]
 * 
 */
public class DwEconomicunit implements Serializable{

    /** 
     * 属性ecounitid
     */
    private String ecounitid;
	
    /** 
     * 属性generatorid
     */
    private String generatorid;
	
    /** 
     * 属性ecounitrname
     */
    private String ecounitrname;
	
    /** 
     * 属性stationid
     */
    private String stationid;
	
    /** 
     * 属性capacity
     */
    private BigDecimal capacity;
	
    /** 
     * 属性capacitylevel
     */
    private String capacitylevel;
	
    /** 
     * 属性voltagegrade
     */
    private BigDecimal voltagegrade;
	
    /** 
     * 属性generatortype
     */
    private BigDecimal generatortype;
	
    /** 
     * 属性opbegindate
     */
    private Date opbegindate;
	
    /** 
     * 属性gengroupid
     */
    private String gengroupid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性geogrregionid
     */
    private String geogrregionid;
	
    /**
     * DwEconomicunit构造函数
     */
    public DwEconomicunit() {
        super();
    }  
	
    /**
     * DwEconomicunit完整的构造函数
     */  
    public DwEconomicunit(String ecounitid,String generatorid,String ecounitrname,String stationid,String marketid){
        this.ecounitid = ecounitid;
        this.generatorid = generatorid;
        this.ecounitrname = ecounitrname;
        this.stationid = stationid;
        this.marketid = marketid;
    }
 
    /**
     * 属性 ecounitid 的get方法
     * @return String
     */
    public String getEcounitid(){
        return ecounitid;
    }
	
    /**
     * 属性 ecounitid 的set方法
     * @return
     */
    public void setEcounitid(String ecounitid){
        if(ecounitid != null && ecounitid.trim().length() == 0){
            this.ecounitid = null;
        }else{
            this.ecounitid = ecounitid;
        }
    } 
	
    /**
     * 属性 generatorid 的get方法
     * @return String
     */
    public String getGeneratorid(){
        return generatorid;
    }
	
    /**
     * 属性 generatorid 的set方法
     * @return
     */
    public void setGeneratorid(String generatorid){
        this.generatorid = generatorid;
    } 
	
    /**
     * 属性 ecounitrname 的get方法
     * @return String
     */
    public String getEcounitrname(){
        return ecounitrname;
    }
	
    /**
     * 属性 ecounitrname 的set方法
     * @return
     */
    public void setEcounitrname(String ecounitrname){
        this.ecounitrname = ecounitrname;
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
        this.stationid = stationid;
    } 
	
    /**
     * 属性 capacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacity(){
        return capacity;
    }
	
    /**
     * 属性 capacity 的set方法
     * @return
     */
    public void setCapacity(BigDecimal capacity){
        this.capacity = capacity;
    } 
	
    /**
     * 属性 capacitylevel 的get方法
     * @return String
     */
    public String getCapacitylevel(){
        return capacitylevel;
    }
	
    /**
     * 属性 capacitylevel 的set方法
     * @return
     */
    public void setCapacitylevel(String capacitylevel){
        this.capacitylevel = capacitylevel;
    } 
	
    /**
     * 属性 voltagegrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVoltagegrade(){
        return voltagegrade;
    }
	
    /**
     * 属性 voltagegrade 的set方法
     * @return
     */
    public void setVoltagegrade(BigDecimal voltagegrade){
        this.voltagegrade = voltagegrade;
    } 
	
    /**
     * 属性 generatortype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratortype(){
        return generatortype;
    }
	
    /**
     * 属性 generatortype 的set方法
     * @return
     */
    public void setGeneratortype(BigDecimal generatortype){
        this.generatortype = generatortype;
    } 
	
    /**
     * 属性 opbegindate 的get方法
     * @return Date
     */
    public Date getOpbegindate(){
        return opbegindate;
    }
	
    /**
     * 属性 opbegindate 的set方法
     * @return
     */
    public void setOpbegindate(Date opbegindate){
        this.opbegindate = opbegindate;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwEconomicunit))
	        return false; 
			
        if(getEcounitid() == null) 
	        return false;

        DwEconomicunit other = (DwEconomicunit) o;	        
	    return new EqualsBuilder()
            .append(this.getEcounitid(), other.getEcounitid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("ecounitid"+":"+getEcounitid())
            .append("generatorid"+":"+getGeneratorid())
            .append("ecounitrname"+":"+getEcounitrname())
            .append("stationid"+":"+getStationid())
            .append("capacity"+":"+getCapacity())
            .append("capacitylevel"+":"+getCapacitylevel())
            .append("voltagegrade"+":"+getVoltagegrade())
            .append("generatortype"+":"+getGeneratortype())
            .append("opbegindate"+":"+getOpbegindate())
            .append("gengroupid"+":"+getGengroupid())
            .append("marketid"+":"+getMarketid())
            .append("geogrregionid"+":"+getGeogrregionid())
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