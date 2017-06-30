package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaQpowerElec的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:35:02 CST 2013]
 * 
 */
public class BaQpowerElec implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性tabDate
     */
    private Date tabDate;
	
    /** 
     * 属性dataType
     */
    private BigDecimal dataType;
	
    /** 
     * 属性ymd
     */
    private String ymd;
	
    /** 
     * 属性capacity
     */
    private BigDecimal capacity;
	
    /** 
     * 属性planfixcapacity
     */
    private BigDecimal planfixcapacity;
	
    /** 
     * 属性tempfixcapacity
     */
    private BigDecimal tempfixcapacity;
	
    /** 
     * 属性blockcapacity
     */
    private BigDecimal blockcapacity;
	
    /** 
     * 属性blockcapacitynet
     */
    private BigDecimal blockcapacitynet;
	
    /** 
     * 属性blockcapacityfire
     */
    private BigDecimal blockcapacityfire;
	
    /** 
     * 属性blockcapacitywater
     */
    private BigDecimal blockcapacitywater;
	
    /** 
     * 属性blockcapacityorther
     */
    private BigDecimal blockcapacityorther;
	
    /** 
     * 属性adjustcapacity
     */
    private BigDecimal adjustcapacity;
	
    /** 
     * 属性acceptelecmax
     */
    private BigDecimal acceptelecmax;
	
    /** 
     * 属性acceptelecplan
     */
    private BigDecimal acceptelecplan;
	
    /** 
     * 属性acceptelecactuala
     */
    private BigDecimal acceptelecactuala;
	
    /** 
     * 属性iadjustcapacity
     */
    private BigDecimal iadjustcapacity;
	
    /** 
     * 属性backcapacity
     */
    private BigDecimal backcapacity;
	
    /** 
     * 属性maxusingload
     */
    private BigDecimal maxusingload;
	
    /** 
     * 属性maxpullpower
     */
    private BigDecimal maxpullpower;
	
    /** 
     * 属性maxlimitpower
     */
    private BigDecimal maxlimitpower;
	
    /** 
     * 属性pullelec
     */
    private BigDecimal pullelec;
	
    /** 
     * 属性limitelec
     */
    private BigDecimal limitelec;
	
    /** 
     * 属性version
     */
    private BigDecimal version;
	
    /** 
     * 属性newversion
     */
    private BigDecimal newversion;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性versiondesc
     */
    private String versiondesc;
	
    /** 
     * 属性issueddate
     */
    private Date issueddate;
	
    /**
     * BaQpowerElec构造函数
     */
    public BaQpowerElec() {
        super();
    }  
	
    /**
     * BaQpowerElec完整的构造函数
     */  
    public BaQpowerElec(String guid,String marketcode,Date tabDate,BigDecimal dataType){
        this.guid = guid;
        this.marketcode = marketcode;
        this.tabDate = tabDate;
        this.dataType = dataType;
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
     * 属性 tabDate 的get方法
     * @return Date
     */
    public Date getTabDate(){
        return tabDate;
    }
	
    /**
     * 属性 tabDate 的set方法
     * @return
     */
    public void setTabDate(Date tabDate){
        this.tabDate = tabDate;
    } 
	
    /**
     * 属性 dataType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDataType(){
        return dataType;
    }
	
    /**
     * 属性 dataType 的set方法
     * @return
     */
    public void setDataType(BigDecimal dataType){
        this.dataType = dataType;
    } 
	
    /**
     * 属性 ymd 的get方法
     * @return String
     */
    public String getYmd(){
        return ymd;
    }
	
    /**
     * 属性 ymd 的set方法
     * @return
     */
    public void setYmd(String ymd){
        this.ymd = ymd;
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
     * 属性 planfixcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacity(){
        return planfixcapacity;
    }
	
    /**
     * 属性 planfixcapacity 的set方法
     * @return
     */
    public void setPlanfixcapacity(BigDecimal planfixcapacity){
        this.planfixcapacity = planfixcapacity;
    } 
	
    /**
     * 属性 tempfixcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTempfixcapacity(){
        return tempfixcapacity;
    }
	
    /**
     * 属性 tempfixcapacity 的set方法
     * @return
     */
    public void setTempfixcapacity(BigDecimal tempfixcapacity){
        this.tempfixcapacity = tempfixcapacity;
    } 
	
    /**
     * 属性 blockcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacity(){
        return blockcapacity;
    }
	
    /**
     * 属性 blockcapacity 的set方法
     * @return
     */
    public void setBlockcapacity(BigDecimal blockcapacity){
        this.blockcapacity = blockcapacity;
    } 
	
    /**
     * 属性 blockcapacitynet 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacitynet(){
        return blockcapacitynet;
    }
	
    /**
     * 属性 blockcapacitynet 的set方法
     * @return
     */
    public void setBlockcapacitynet(BigDecimal blockcapacitynet){
        this.blockcapacitynet = blockcapacitynet;
    } 
	
    /**
     * 属性 blockcapacityfire 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityfire(){
        return blockcapacityfire;
    }
	
    /**
     * 属性 blockcapacityfire 的set方法
     * @return
     */
    public void setBlockcapacityfire(BigDecimal blockcapacityfire){
        this.blockcapacityfire = blockcapacityfire;
    } 
	
    /**
     * 属性 blockcapacitywater 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacitywater(){
        return blockcapacitywater;
    }
	
    /**
     * 属性 blockcapacitywater 的set方法
     * @return
     */
    public void setBlockcapacitywater(BigDecimal blockcapacitywater){
        this.blockcapacitywater = blockcapacitywater;
    } 
	
    /**
     * 属性 blockcapacityorther 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityorther(){
        return blockcapacityorther;
    }
	
    /**
     * 属性 blockcapacityorther 的set方法
     * @return
     */
    public void setBlockcapacityorther(BigDecimal blockcapacityorther){
        this.blockcapacityorther = blockcapacityorther;
    } 
	
    /**
     * 属性 adjustcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAdjustcapacity(){
        return adjustcapacity;
    }
	
    /**
     * 属性 adjustcapacity 的set方法
     * @return
     */
    public void setAdjustcapacity(BigDecimal adjustcapacity){
        this.adjustcapacity = adjustcapacity;
    } 
	
    /**
     * 属性 acceptelecmax 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAcceptelecmax(){
        return acceptelecmax;
    }
	
    /**
     * 属性 acceptelecmax 的set方法
     * @return
     */
    public void setAcceptelecmax(BigDecimal acceptelecmax){
        this.acceptelecmax = acceptelecmax;
    } 
	
    /**
     * 属性 acceptelecplan 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAcceptelecplan(){
        return acceptelecplan;
    }
	
    /**
     * 属性 acceptelecplan 的set方法
     * @return
     */
    public void setAcceptelecplan(BigDecimal acceptelecplan){
        this.acceptelecplan = acceptelecplan;
    } 
	
    /**
     * 属性 acceptelecactuala 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAcceptelecactuala(){
        return acceptelecactuala;
    }
	
    /**
     * 属性 acceptelecactuala 的set方法
     * @return
     */
    public void setAcceptelecactuala(BigDecimal acceptelecactuala){
        this.acceptelecactuala = acceptelecactuala;
    } 
	
    /**
     * 属性 iadjustcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIadjustcapacity(){
        return iadjustcapacity;
    }
	
    /**
     * 属性 iadjustcapacity 的set方法
     * @return
     */
    public void setIadjustcapacity(BigDecimal iadjustcapacity){
        this.iadjustcapacity = iadjustcapacity;
    } 
	
    /**
     * 属性 backcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackcapacity(){
        return backcapacity;
    }
	
    /**
     * 属性 backcapacity 的set方法
     * @return
     */
    public void setBackcapacity(BigDecimal backcapacity){
        this.backcapacity = backcapacity;
    } 
	
    /**
     * 属性 maxusingload 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxusingload(){
        return maxusingload;
    }
	
    /**
     * 属性 maxusingload 的set方法
     * @return
     */
    public void setMaxusingload(BigDecimal maxusingload){
        this.maxusingload = maxusingload;
    } 
	
    /**
     * 属性 maxpullpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpullpower(){
        return maxpullpower;
    }
	
    /**
     * 属性 maxpullpower 的set方法
     * @return
     */
    public void setMaxpullpower(BigDecimal maxpullpower){
        this.maxpullpower = maxpullpower;
    } 
	
    /**
     * 属性 maxlimitpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxlimitpower(){
        return maxlimitpower;
    }
	
    /**
     * 属性 maxlimitpower 的set方法
     * @return
     */
    public void setMaxlimitpower(BigDecimal maxlimitpower){
        this.maxlimitpower = maxlimitpower;
    } 
	
    /**
     * 属性 pullelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPullelec(){
        return pullelec;
    }
	
    /**
     * 属性 pullelec 的set方法
     * @return
     */
    public void setPullelec(BigDecimal pullelec){
        this.pullelec = pullelec;
    } 
	
    /**
     * 属性 limitelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLimitelec(){
        return limitelec;
    }
	
    /**
     * 属性 limitelec 的set方法
     * @return
     */
    public void setLimitelec(BigDecimal limitelec){
        this.limitelec = limitelec;
    } 
	
    /**
     * 属性 version 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(BigDecimal version){
        this.version = version;
    } 
	
    /**
     * 属性 newversion 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewversion(){
        return newversion;
    }
	
    /**
     * 属性 newversion 的set方法
     * @return
     */
    public void setNewversion(BigDecimal newversion){
        this.newversion = newversion;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 versiondesc 的get方法
     * @return String
     */
    public String getVersiondesc(){
        return versiondesc;
    }
	
    /**
     * 属性 versiondesc 的set方法
     * @return
     */
    public void setVersiondesc(String versiondesc){
        this.versiondesc = versiondesc;
    } 
	
    /**
     * 属性 issueddate 的get方法
     * @return Date
     */
    public Date getIssueddate(){
        return issueddate;
    }
	
    /**
     * 属性 issueddate 的set方法
     * @return
     */
    public void setIssueddate(Date issueddate){
        this.issueddate = issueddate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaQpowerElec))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaQpowerElec other = (BaQpowerElec) o;	        
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
            .append("tabDate"+":"+getTabDate())
            .append("dataType"+":"+getDataType())
            .append("ymd"+":"+getYmd())
            .append("capacity"+":"+getCapacity())
            .append("planfixcapacity"+":"+getPlanfixcapacity())
            .append("tempfixcapacity"+":"+getTempfixcapacity())
            .append("blockcapacity"+":"+getBlockcapacity())
            .append("blockcapacitynet"+":"+getBlockcapacitynet())
            .append("blockcapacityfire"+":"+getBlockcapacityfire())
            .append("blockcapacitywater"+":"+getBlockcapacitywater())
            .append("blockcapacityorther"+":"+getBlockcapacityorther())
            .append("adjustcapacity"+":"+getAdjustcapacity())
            .append("acceptelecmax"+":"+getAcceptelecmax())
            .append("acceptelecplan"+":"+getAcceptelecplan())
            .append("acceptelecactuala"+":"+getAcceptelecactuala())
            .append("iadjustcapacity"+":"+getIadjustcapacity())
            .append("backcapacity"+":"+getBackcapacity())
            .append("maxusingload"+":"+getMaxusingload())
            .append("maxpullpower"+":"+getMaxpullpower())
            .append("maxlimitpower"+":"+getMaxlimitpower())
            .append("pullelec"+":"+getPullelec())
            .append("limitelec"+":"+getLimitelec())
            .append("version"+":"+getVersion())
            .append("newversion"+":"+getNewversion())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("updatetime"+":"+getUpdatetime())
            .append("versiondesc"+":"+getVersiondesc())
            .append("issueddate"+":"+getIssueddate())
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