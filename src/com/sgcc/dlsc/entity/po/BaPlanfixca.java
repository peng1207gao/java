package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaPlanfixca的POJO类
 *
 * @author  Administrator  [Thu Jul 18 12:01:59 CST 2013]
 * 
 */
public class BaPlanfixca implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性dateType
     */
    private BigDecimal dateType;
	
    /** 
     * 属性datetime
     */
    private Date datetime;
	
    /** 
     * 属性maintenanceplanclass
     */
    private BigDecimal maintenanceplanclass;
	
    /** 
     * 属性maintenanceequipmentclass
     */
    private BigDecimal maintenanceequipmentclass;
	
    /** 
     * 属性unitlinename
     */
    private String unitlinename;
	
    /** 
     * 属性unitlineid
     */
    private String unitlineid;
	
    /** 
     * 属性starttime
     */
    private Date starttime;
	
    /** 
     * 属性endtime
     */
    private Date endtime;
	
    /** 
     * 属性maintenancecapacity
     */
    private BigDecimal maintenancecapacity;
	
    /** 
     * 属性maintenancereason
     */
    private String maintenancereason;
	
    /**
     * BaPlanfixca构造函数
     */
    public BaPlanfixca() {
        super();
    }  
	
    /**
     * BaPlanfixca完整的构造函数
     */  
    public BaPlanfixca(String guid,String marketcode,BigDecimal dateType,Date datetime,BigDecimal maintenanceplanclass,BigDecimal maintenanceequipmentclass,String unitlinename,Date starttime,Date endtime,BigDecimal maintenancecapacity){
        this.guid = guid;
        this.marketcode = marketcode;
        this.dateType = dateType;
        this.datetime = datetime;
        this.maintenanceplanclass = maintenanceplanclass;
        this.maintenanceequipmentclass = maintenanceequipmentclass;
        this.unitlinename = unitlinename;
        this.starttime = starttime;
        this.endtime = endtime;
        this.maintenancecapacity = maintenancecapacity;
    }
 
    /**
     * 属性 guid 的get方法
     * @return String
     */
    public String getGuid(){
        return guid;
    }
	
    /**
     * 属性 guid 的set方法
     * @return
     */
    public void setGuid(String guid){
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
    } 
	
    /**
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
    } 
	
    /**
     * 属性 dateType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDateType(){
        return dateType;
    }
	
    /**
     * 属性 dateType 的set方法
     * @return
     */
    public void setDateType(BigDecimal dateType){
        this.dateType = dateType;
    } 
	
    /**
     * 属性 datetime 的get方法
     * @return Date
     */
    public Date getDatetime(){
        return datetime;
    }
	
    /**
     * 属性 datetime 的set方法
     * @return
     */
    public void setDatetime(Date datetime){
        this.datetime = datetime;
    } 
	
    /**
     * 属性 maintenanceplanclass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaintenanceplanclass(){
        return maintenanceplanclass;
    }
	
    /**
     * 属性 maintenanceplanclass 的set方法
     * @return
     */
    public void setMaintenanceplanclass(BigDecimal maintenanceplanclass){
        this.maintenanceplanclass = maintenanceplanclass;
    } 
	
    /**
     * 属性 maintenanceequipmentclass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaintenanceequipmentclass(){
        return maintenanceequipmentclass;
    }
	
    /**
     * 属性 maintenanceequipmentclass 的set方法
     * @return
     */
    public void setMaintenanceequipmentclass(BigDecimal maintenanceequipmentclass){
        this.maintenanceequipmentclass = maintenanceequipmentclass;
    } 
	
    /**
     * 属性 unitlinename 的get方法
     * @return String
     */
    public String getUnitlinename(){
        return unitlinename;
    }
	
    /**
     * 属性 unitlinename 的set方法
     * @return
     */
    public void setUnitlinename(String unitlinename){
        this.unitlinename = unitlinename;
    } 
	
    /**
     * 属性 unitlineid 的get方法
     * @return String
     */
    public String getUnitlineid(){
        return unitlineid;
    }
	
    /**
     * 属性 unitlineid 的set方法
     * @return
     */
    public void setUnitlineid(String unitlineid){
        this.unitlineid = unitlineid;
    } 
	
    /**
     * 属性 starttime 的get方法
     * @return Date
     */
    public Date getStarttime(){
        return starttime;
    }
	
    /**
     * 属性 starttime 的set方法
     * @return
     */
    public void setStarttime(Date starttime){
        this.starttime = starttime;
    } 
	
    /**
     * 属性 endtime 的get方法
     * @return Date
     */
    public Date getEndtime(){
        return endtime;
    }
	
    /**
     * 属性 endtime 的set方法
     * @return
     */
    public void setEndtime(Date endtime){
        this.endtime = endtime;
    } 
	
    /**
     * 属性 maintenancecapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaintenancecapacity(){
        return maintenancecapacity;
    }
	
    /**
     * 属性 maintenancecapacity 的set方法
     * @return
     */
    public void setMaintenancecapacity(BigDecimal maintenancecapacity){
        this.maintenancecapacity = maintenancecapacity;
    } 
	
    /**
     * 属性 maintenancereason 的get方法
     * @return String
     */
    public String getMaintenancereason(){
        return maintenancereason;
    }
	
    /**
     * 属性 maintenancereason 的set方法
     * @return
     */
    public void setMaintenancereason(String maintenancereason){
        this.maintenancereason = maintenancereason;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaPlanfixca))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaPlanfixca other = (BaPlanfixca) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("marketcode"+":"+getMarketcode())
            .append("dateType"+":"+getDateType())
            .append("datetime"+":"+getDatetime())
            .append("maintenanceplanclass"+":"+getMaintenanceplanclass())
            .append("maintenanceequipmentclass"+":"+getMaintenanceequipmentclass())
            .append("unitlinename"+":"+getUnitlinename())
            .append("unitlineid"+":"+getUnitlineid())
            .append("starttime"+":"+getStarttime())
            .append("endtime"+":"+getEndtime())
            .append("maintenancecapacity"+":"+getMaintenancecapacity())
            .append("maintenancereason"+":"+getMaintenancereason())
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