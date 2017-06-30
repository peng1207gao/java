package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcGhFdlyxss的POJO类
 *
 * @author  Administrator  [Sat Mar 15 19:24:01 CST 2014]
 * 
 */
public class SjjcGhFdlyxss implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性companyname
     */
    private String companyname;
	
    /** 
     * 属性companyid
     */
    private String companyid;
	
    /** 
     * 属性provincename
     */
    private String provincename;
	
    /** 
     * 属性provinceid
     */
    private String provinceid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性statisticalcalibre
     */
    private BigDecimal statisticalcalibre;
	
    /** 
     * 属性hour
     */
    private BigDecimal hour;
	
    /** 
     * 属性hourrate
     */
    private BigDecimal hourrate;
	
    /** 
     * 属性hydropowerhour
     */
    private BigDecimal hydropowerhour;
	
    /** 
     * 属性hydropowerhourrate
     */
    private BigDecimal hydropowerhourrate;
	
    /** 
     * 属性thermalhour
     */
    private BigDecimal thermalhour;
	
    /** 
     * 属性thermalhourrate
     */
    private BigDecimal thermalhourrate;
	
    /** 
     * 属性nuclearhour
     */
    private BigDecimal nuclearhour;
	
    /** 
     * 属性nuclearhourrate
     */
    private BigDecimal nuclearhourrate;
	
    /** 
     * 属性windhour
     */
    private BigDecimal windhour;
	
    /** 
     * 属性windhourrate
     */
    private BigDecimal windhourrate;
	
    /** 
     * 属性otherhour
     */
    private BigDecimal otherhour;
	
    /** 
     * 属性otherhourrate
     */
    private BigDecimal otherhourrate;
	
    /**
     * SjjcGhFdlyxss构造函数
     */
    public SjjcGhFdlyxss() {
        super();
    }  
	
    /**
     * SjjcGhFdlyxss完整的构造函数
     */  
    public SjjcGhFdlyxss(String objId,String companyname,String companyid,String provincename,String provinceid){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 companyname 的get方法
     * @return String
     */
    public String getCompanyname(){
        return companyname;
    }
	
    /**
     * 属性 companyname 的set方法
     * @return
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    } 
	
    /**
     * 属性 companyid 的get方法
     * @return String
     */
    public String getCompanyid(){
        return companyid;
    }
	
    /**
     * 属性 companyid 的set方法
     * @return
     */
    public void setCompanyid(String companyid){
        this.companyid = companyid;
    } 
	
    /**
     * 属性 provincename 的get方法
     * @return String
     */
    public String getProvincename(){
        return provincename;
    }
	
    /**
     * 属性 provincename 的set方法
     * @return
     */
    public void setProvincename(String provincename){
        this.provincename = provincename;
    } 
	
    /**
     * 属性 provinceid 的get方法
     * @return String
     */
    public String getProvinceid(){
        return provinceid;
    }
	
    /**
     * 属性 provinceid 的set方法
     * @return
     */
    public void setProvinceid(String provinceid){
        this.provinceid = provinceid;
    } 
	
    /**
     * 属性 theyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(BigDecimal theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(BigDecimal themonth){
        this.themonth = themonth;
    } 
	
    /**
     * 属性 statisticalcalibre 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStatisticalcalibre(){
        return statisticalcalibre;
    }
	
    /**
     * 属性 statisticalcalibre 的set方法
     * @return
     */
    public void setStatisticalcalibre(BigDecimal statisticalcalibre){
        this.statisticalcalibre = statisticalcalibre;
    } 
	
    /**
     * 属性 hour 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHour(){
        return hour;
    }
	
    /**
     * 属性 hour 的set方法
     * @return
     */
    public void setHour(BigDecimal hour){
        this.hour = hour;
    } 
	
    /**
     * 属性 hourrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHourrate(){
        return hourrate;
    }
	
    /**
     * 属性 hourrate 的set方法
     * @return
     */
    public void setHourrate(BigDecimal hourrate){
        this.hourrate = hourrate;
    } 
	
    /**
     * 属性 hydropowerhour 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHydropowerhour(){
        return hydropowerhour;
    }
	
    /**
     * 属性 hydropowerhour 的set方法
     * @return
     */
    public void setHydropowerhour(BigDecimal hydropowerhour){
        this.hydropowerhour = hydropowerhour;
    } 
	
    /**
     * 属性 hydropowerhourrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHydropowerhourrate(){
        return hydropowerhourrate;
    }
	
    /**
     * 属性 hydropowerhourrate 的set方法
     * @return
     */
    public void setHydropowerhourrate(BigDecimal hydropowerhourrate){
        this.hydropowerhourrate = hydropowerhourrate;
    } 
	
    /**
     * 属性 thermalhour 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThermalhour(){
        return thermalhour;
    }
	
    /**
     * 属性 thermalhour 的set方法
     * @return
     */
    public void setThermalhour(BigDecimal thermalhour){
        this.thermalhour = thermalhour;
    } 
	
    /**
     * 属性 thermalhourrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThermalhourrate(){
        return thermalhourrate;
    }
	
    /**
     * 属性 thermalhourrate 的set方法
     * @return
     */
    public void setThermalhourrate(BigDecimal thermalhourrate){
        this.thermalhourrate = thermalhourrate;
    } 
	
    /**
     * 属性 nuclearhour 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNuclearhour(){
        return nuclearhour;
    }
	
    /**
     * 属性 nuclearhour 的set方法
     * @return
     */
    public void setNuclearhour(BigDecimal nuclearhour){
        this.nuclearhour = nuclearhour;
    } 
	
    /**
     * 属性 nuclearhourrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNuclearhourrate(){
        return nuclearhourrate;
    }
	
    /**
     * 属性 nuclearhourrate 的set方法
     * @return
     */
    public void setNuclearhourrate(BigDecimal nuclearhourrate){
        this.nuclearhourrate = nuclearhourrate;
    } 
	
    /**
     * 属性 windhour 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWindhour(){
        return windhour;
    }
	
    /**
     * 属性 windhour 的set方法
     * @return
     */
    public void setWindhour(BigDecimal windhour){
        this.windhour = windhour;
    } 
	
    /**
     * 属性 windhourrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWindhourrate(){
        return windhourrate;
    }
	
    /**
     * 属性 windhourrate 的set方法
     * @return
     */
    public void setWindhourrate(BigDecimal windhourrate){
        this.windhourrate = windhourrate;
    } 
	
    /**
     * 属性 otherhour 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOtherhour(){
        return otherhour;
    }
	
    /**
     * 属性 otherhour 的set方法
     * @return
     */
    public void setOtherhour(BigDecimal otherhour){
        this.otherhour = otherhour;
    } 
	
    /**
     * 属性 otherhourrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOtherhourrate(){
        return otherhourrate;
    }
	
    /**
     * 属性 otherhourrate 的set方法
     * @return
     */
    public void setOtherhourrate(BigDecimal otherhourrate){
        this.otherhourrate = otherhourrate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcGhFdlyxss))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcGhFdlyxss other = (SjjcGhFdlyxss) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("companyname"+":"+getCompanyname())
            .append("companyid"+":"+getCompanyid())
            .append("provincename"+":"+getProvincename())
            .append("provinceid"+":"+getProvinceid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("statisticalcalibre"+":"+getStatisticalcalibre())
            .append("hour"+":"+getHour())
            .append("hourrate"+":"+getHourrate())
            .append("hydropowerhour"+":"+getHydropowerhour())
            .append("hydropowerhourrate"+":"+getHydropowerhourrate())
            .append("thermalhour"+":"+getThermalhour())
            .append("thermalhourrate"+":"+getThermalhourrate())
            .append("nuclearhour"+":"+getNuclearhour())
            .append("nuclearhourrate"+":"+getNuclearhourrate())
            .append("windhour"+":"+getWindhour())
            .append("windhourrate"+":"+getWindhourrate())
            .append("otherhour"+":"+getOtherhour())
            .append("otherhourrate"+":"+getOtherhourrate())
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