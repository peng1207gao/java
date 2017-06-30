package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * FuDailyfuelinfo的POJO类
 *
 * @author  Administrator  [Thu Jul 25 16:00:24 CST 2013]
 * 
 */
public class FuDailyfuelinfo implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性dailyid
     */
    private String dailyid;
	
    /** 
     * 属性datatime
     */
    private Date datatime;
	
    /** 
     * 属性unitid
     */
    private String unitid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性ormarketid
     */
    private String ormarketid;
	
    /** 
     * 属性appdate
     */
    private Date appdate;
	
    /** 
     * 属性userid
     */
    private String userid;
	
    /** 
     * 属性daysupply
     */
    private BigDecimal daysupply;
	
    /** 
     * 属性dayconsume
     */
    private BigDecimal dayconsume;
	
    /** 
     * 属性daystock
     */
    private BigDecimal daystock;
	
    /** 
     * 属性sameperioddaystock
     */
    private BigDecimal sameperioddaystock;
	
    /** 
     * 属性availabledays
     */
    private BigDecimal availabledays;
	
    /** 
     * 属性haltunitnum
     */
    private BigDecimal haltunitnum;
	
    /** 
     * 属性haltcapacity
     */
    private BigDecimal haltcapacity;
	
    /** 
     * 属性expectsupply
     */
    private String expectsupply;
	
    /** 
     * 属性dayconsumratio
     */
    private BigDecimal dayconsumratio;
	
    /** 
     * 属性provincecoal
     */
    private BigDecimal provincecoal;
	
    /** 
     * 属性foreigncoal
     */
    private BigDecimal foreigncoal;
	
    /** 
     * 属性highwaycoal
     */
    private BigDecimal highwaycoal;
	
    /** 
     * 属性railwaycoal
     */
    private BigDecimal railwaycoal;
	
    /** 
     * 属性waterway
     */
    private BigDecimal waterway;
	
    /** 
     * 属性mixcoal
     */
    private BigDecimal mixcoal;
	
    /** 
     * 属性stationid
     */
    private String stationid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性resourcetype
     */
    private String resourcetype;
	
    /** 
     * 属性fuelprovidemode
     */
    private String fuelprovidemode;
	
    /** 
     * 属性ordermode
     */
    private String ordermode;
	
    /** 
     * 属性capacity
     */
    private BigDecimal capacity;
	
    /** 
     * 属性daygeneration
     */
    private BigDecimal daygeneration;
	
    /** 
     * 属性description
     */
    private String description;
	
    /** 
     * 属性sendmarketid
     */
    private String sendmarketid;
	
    /** 
     * 属性receiveid
     */
    private String receiveid;
	
    /** 
     * 属性updatetime
     */
    private String updatetime;
	
    /**
     * FuDailyfuelinfo构造函数
     */
    public FuDailyfuelinfo() {
        super();
    }  
	
    /**
     * FuDailyfuelinfo完整的构造函数
     */  
    public FuDailyfuelinfo(String dailyid,Date datatime,String marketid,String ormarketid){
        this.dailyid = dailyid;
        this.datatime = datatime;
        this.marketid = marketid;
        this.ormarketid = ormarketid;
    }
 
    /**
     * 属性 dailyid 的get方法
     * @return String
     */
    public String getDailyid(){
        return dailyid;
    }
	
    /**
     * 属性 dailyid 的set方法
     * @return
     */
    public void setDailyid(String dailyid){
        if(dailyid != null && dailyid.trim().length() == 0){
            this.dailyid = null;
        }else{
            this.dailyid = dailyid;
        }
    } 
	
    /**
     * 属性 datatime 的get方法
     * @return Date
     */
    public Date getDatatime(){
        return datatime;
    }
	
    /**
     * 属性 datatime 的set方法
     * @return
     */
    public void setDatatime(Date datatime){
        this.datatime = datatime;
    } 
	
    /**
     * 属性 unitid 的get方法
     * @return String
     */
    public String getUnitid(){
        return unitid;
    }
	
    /**
     * 属性 unitid 的set方法
     * @return
     */
    public void setUnitid(String unitid){
        this.unitid = unitid;
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
     * 属性 ormarketid 的get方法
     * @return String
     */
    public String getOrmarketid(){
        return ormarketid;
    }
	
    /**
     * 属性 ormarketid 的set方法
     * @return
     */
    public void setOrmarketid(String ormarketid){
        this.ormarketid = ormarketid;
    } 
	
    /**
     * 属性 appdate 的get方法
     * @return Date
     */
    public Date getAppdate(){
        return appdate;
    }
	
    /**
     * 属性 appdate 的set方法
     * @return
     */
    public void setAppdate(Date appdate){
        this.appdate = appdate;
    } 
	
    /**
     * 属性 userid 的get方法
     * @return String
     */
    public String getUserid(){
        return userid;
    }
	
    /**
     * 属性 userid 的set方法
     * @return
     */
    public void setUserid(String userid){
        this.userid = userid;
    } 
	
    /**
     * 属性 daysupply 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDaysupply(){
        return daysupply;
    }
	
    /**
     * 属性 daysupply 的set方法
     * @return
     */
    public void setDaysupply(BigDecimal daysupply){
        this.daysupply = daysupply;
    } 
	
    /**
     * 属性 dayconsume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDayconsume(){
        return dayconsume;
    }
	
    /**
     * 属性 dayconsume 的set方法
     * @return
     */
    public void setDayconsume(BigDecimal dayconsume){
        this.dayconsume = dayconsume;
    } 
	
    /**
     * 属性 daystock 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDaystock(){
        return daystock;
    }
	
    /**
     * 属性 daystock 的set方法
     * @return
     */
    public void setDaystock(BigDecimal daystock){
        this.daystock = daystock;
    } 
	
    /**
     * 属性 sameperioddaystock 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSameperioddaystock(){
        return sameperioddaystock;
    }
	
    /**
     * 属性 sameperioddaystock 的set方法
     * @return
     */
    public void setSameperioddaystock(BigDecimal sameperioddaystock){
        this.sameperioddaystock = sameperioddaystock;
    } 
	
    /**
     * 属性 availabledays 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAvailabledays(){
        return availabledays;
    }
	
    /**
     * 属性 availabledays 的set方法
     * @return
     */
    public void setAvailabledays(BigDecimal availabledays){
        this.availabledays = availabledays;
    } 
	
    /**
     * 属性 haltunitnum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHaltunitnum(){
        return haltunitnum;
    }
	
    /**
     * 属性 haltunitnum 的set方法
     * @return
     */
    public void setHaltunitnum(BigDecimal haltunitnum){
        this.haltunitnum = haltunitnum;
    } 
	
    /**
     * 属性 haltcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHaltcapacity(){
        return haltcapacity;
    }
	
    /**
     * 属性 haltcapacity 的set方法
     * @return
     */
    public void setHaltcapacity(BigDecimal haltcapacity){
        this.haltcapacity = haltcapacity;
    } 
	
    /**
     * 属性 expectsupply 的get方法
     * @return String
     */
    public String getExpectsupply(){
        return expectsupply;
    }
	
    /**
     * 属性 expectsupply 的set方法
     * @return
     */
    public void setExpectsupply(String expectsupply){
        this.expectsupply = expectsupply;
    } 
	
    /**
     * 属性 dayconsumratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDayconsumratio(){
        return dayconsumratio;
    }
	
    /**
     * 属性 dayconsumratio 的set方法
     * @return
     */
    public void setDayconsumratio(BigDecimal dayconsumratio){
        this.dayconsumratio = dayconsumratio;
    } 
	
    /**
     * 属性 provincecoal 的get方法
     * @return BigDecimal
     */
    public BigDecimal getProvincecoal(){
        return provincecoal;
    }
	
    /**
     * 属性 provincecoal 的set方法
     * @return
     */
    public void setProvincecoal(BigDecimal provincecoal){
        this.provincecoal = provincecoal;
    } 
	
    /**
     * 属性 foreigncoal 的get方法
     * @return BigDecimal
     */
    public BigDecimal getForeigncoal(){
        return foreigncoal;
    }
	
    /**
     * 属性 foreigncoal 的set方法
     * @return
     */
    public void setForeigncoal(BigDecimal foreigncoal){
        this.foreigncoal = foreigncoal;
    } 
	
    /**
     * 属性 highwaycoal 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHighwaycoal(){
        return highwaycoal;
    }
	
    /**
     * 属性 highwaycoal 的set方法
     * @return
     */
    public void setHighwaycoal(BigDecimal highwaycoal){
        this.highwaycoal = highwaycoal;
    } 
	
    /**
     * 属性 railwaycoal 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRailwaycoal(){
        return railwaycoal;
    }
	
    /**
     * 属性 railwaycoal 的set方法
     * @return
     */
    public void setRailwaycoal(BigDecimal railwaycoal){
        this.railwaycoal = railwaycoal;
    } 
	
    /**
     * 属性 waterway 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWaterway(){
        return waterway;
    }
	
    /**
     * 属性 waterway 的set方法
     * @return
     */
    public void setWaterway(BigDecimal waterway){
        this.waterway = waterway;
    } 
	
    /**
     * 属性 mixcoal 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMixcoal(){
        return mixcoal;
    }
	
    /**
     * 属性 mixcoal 的set方法
     * @return
     */
    public void setMixcoal(BigDecimal mixcoal){
        this.mixcoal = mixcoal;
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
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
    } 
	
    /**
     * 属性 resourcetype 的get方法
     * @return String
     */
    public String getResourcetype(){
        return resourcetype;
    }
	
    /**
     * 属性 resourcetype 的set方法
     * @return
     */
    public void setResourcetype(String resourcetype){
        this.resourcetype = resourcetype;
    } 
	
    /**
     * 属性 fuelprovidemode 的get方法
     * @return String
     */
    public String getFuelprovidemode(){
        return fuelprovidemode;
    }
	
    /**
     * 属性 fuelprovidemode 的set方法
     * @return
     */
    public void setFuelprovidemode(String fuelprovidemode){
        this.fuelprovidemode = fuelprovidemode;
    } 
	
    /**
     * 属性 ordermode 的get方法
     * @return String
     */
    public String getOrdermode(){
        return ordermode;
    }
	
    /**
     * 属性 ordermode 的set方法
     * @return
     */
    public void setOrdermode(String ordermode){
        this.ordermode = ordermode;
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
     * 属性 daygeneration 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDaygeneration(){
        return daygeneration;
    }
	
    /**
     * 属性 daygeneration 的set方法
     * @return
     */
    public void setDaygeneration(BigDecimal daygeneration){
        this.daygeneration = daygeneration;
    } 
	
    /**
     * 属性 description 的get方法
     * @return String
     */
    public String getDescription(){
        return description;
    }
	
    /**
     * 属性 description 的set方法
     * @return
     */
    public void setDescription(String description){
        this.description = description;
    } 
	
    /**
     * 属性 sendmarketid 的get方法
     * @return String
     */
    public String getSendmarketid(){
        return sendmarketid;
    }
	
    /**
     * 属性 sendmarketid 的set方法
     * @return
     */
    public void setSendmarketid(String sendmarketid){
        this.sendmarketid = sendmarketid;
    } 
	
    /**
     * 属性 receiveid 的get方法
     * @return String
     */
    public String getReceiveid(){
        return receiveid;
    }
	
    /**
     * 属性 receiveid 的set方法
     * @return
     */
    public void setReceiveid(String receiveid){
        this.receiveid = receiveid;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return String
     */
    public String getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(String updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof FuDailyfuelinfo))
	        return false; 
			
        if(getDailyid() == null) 
	        return false;

        FuDailyfuelinfo other = (FuDailyfuelinfo) o;	        
	    return new EqualsBuilder()
            .append(this.getDailyid(), other.getDailyid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("dailyid"+":"+getDailyid())
            .append("datatime"+":"+getDatatime())
            .append("unitid"+":"+getUnitid())
            .append("marketid"+":"+getMarketid())
            .append("ormarketid"+":"+getOrmarketid())
            .append("appdate"+":"+getAppdate())
            .append("userid"+":"+getUserid())
            .append("daysupply"+":"+getDaysupply())
            .append("dayconsume"+":"+getDayconsume())
            .append("daystock"+":"+getDaystock())
            .append("sameperioddaystock"+":"+getSameperioddaystock())
            .append("availabledays"+":"+getAvailabledays())
            .append("haltunitnum"+":"+getHaltunitnum())
            .append("haltcapacity"+":"+getHaltcapacity())
            .append("expectsupply"+":"+getExpectsupply())
            .append("dayconsumratio"+":"+getDayconsumratio())
            .append("provincecoal"+":"+getProvincecoal())
            .append("foreigncoal"+":"+getForeigncoal())
            .append("highwaycoal"+":"+getHighwaycoal())
            .append("railwaycoal"+":"+getRailwaycoal())
            .append("waterway"+":"+getWaterway())
            .append("mixcoal"+":"+getMixcoal())
            .append("stationid"+":"+getStationid())
            .append("participantid"+":"+getParticipantid())
            .append("resourcetype"+":"+getResourcetype())
            .append("fuelprovidemode"+":"+getFuelprovidemode())
            .append("ordermode"+":"+getOrdermode())
            .append("capacity"+":"+getCapacity())
            .append("daygeneration"+":"+getDaygeneration())
            .append("description"+":"+getDescription())
            .append("sendmarketid"+":"+getSendmarketid())
            .append("receiveid"+":"+getReceiveid())
            .append("updatetime"+":"+getUpdatetime())
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