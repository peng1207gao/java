package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwPowerconsumer的POJO类
 *
 * @author  zhangpei  [Tue Mar 11 19:31:27 CST 2014]
 * 
 */
public class DwPowerconsumer implements Serializable{

    /** 
     * 属性consumerid
     */
    private String consumerid;
	
    /** 
     * 属性consumername
     */
    private String consumername;
	
    /** 
     * 属性consumerdescr
     */
    private String consumerdescr;
	
    /** 
     * 属性geogrregionid
     */
    private String geogrregionid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性voltagegrade
     */
    private BigDecimal voltagegrade;
	
    /** 
     * 属性registerdate
     */
    private Date registerdate;
	
    /** 
     * 属性isapprovalprice
     */
    private BigDecimal isapprovalprice;
	
    /** 
     * 属性operationalcapacity
     */
    private BigDecimal operationalcapacity;
	
    /** 
     * 属性reportcapacity
     */
    private BigDecimal reportcapacity;
	
    /**
     * DwPowerconsumer构造函数
     */
    public DwPowerconsumer() {
        super();
    }  
	
    /**
     * DwPowerconsumer完整的构造函数
     */  
    public DwPowerconsumer(String consumerid,String consumername,String marketid){
        this.consumerid = consumerid;
        this.consumername = consumername;
        this.marketid = marketid;
    }
 
    /**
     * 属性 consumerid 的get方法
     * @return String
     */
    public String getConsumerid(){
        return consumerid;
    }
	
    /**
     * 属性 consumerid 的set方法
     * @return
     */
    public void setConsumerid(String consumerid){
        if(consumerid != null && consumerid.trim().length() == 0){
            this.consumerid = null;
        }else{
            this.consumerid = consumerid;
        }
    } 
	
    /**
     * 属性 consumername 的get方法
     * @return String
     */
    public String getConsumername(){
        return consumername;
    }
	
    /**
     * 属性 consumername 的set方法
     * @return
     */
    public void setConsumername(String consumername){
        this.consumername = consumername;
    } 
	
    /**
     * 属性 consumerdescr 的get方法
     * @return String
     */
    public String getConsumerdescr(){
        return consumerdescr;
    }
	
    /**
     * 属性 consumerdescr 的set方法
     * @return
     */
    public void setConsumerdescr(String consumerdescr){
        this.consumerdescr = consumerdescr;
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
     * 属性 isapprovalprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsapprovalprice(){
        return isapprovalprice;
    }
	
    /**
     * 属性 isapprovalprice 的set方法
     * @return
     */
    public void setIsapprovalprice(BigDecimal isapprovalprice){
        this.isapprovalprice = isapprovalprice;
    } 
	
    /**
     * 属性 operationalcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOperationalcapacity(){
        return operationalcapacity;
    }
	
    /**
     * 属性 operationalcapacity 的set方法
     * @return
     */
    public void setOperationalcapacity(BigDecimal operationalcapacity){
        this.operationalcapacity = operationalcapacity;
    } 
	
    /**
     * 属性 reportcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReportcapacity(){
        return reportcapacity;
    }
	
    /**
     * 属性 reportcapacity 的set方法
     * @return
     */
    public void setReportcapacity(BigDecimal reportcapacity){
        this.reportcapacity = reportcapacity;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwPowerconsumer))
	        return false; 
			
        if(getConsumerid() == null) 
	        return false;

        DwPowerconsumer other = (DwPowerconsumer) o;	        
	    return new EqualsBuilder()
            .append(this.getConsumerid(), other.getConsumerid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("consumerid"+":"+getConsumerid())
            .append("consumername"+":"+getConsumername())
            .append("consumerdescr"+":"+getConsumerdescr())
            .append("geogrregionid"+":"+getGeogrregionid())
            .append("marketid"+":"+getMarketid())
            .append("voltagegrade"+":"+getVoltagegrade())
            .append("registerdate"+":"+getRegisterdate())
            .append("isapprovalprice"+":"+getIsapprovalprice())
            .append("operationalcapacity"+":"+getOperationalcapacity())
            .append("reportcapacity"+":"+getReportcapacity())
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