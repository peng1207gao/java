package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubMPowerForecast的POJO类
 *
 * @author  admin  [Sat Mar 08 11:32:38 CST 2014]
 * 
 */
public class PubMPowerForecast implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性tyear
     */
    private Integer tyear;
	
    /** 
     * 属性tmonth
     */
    private Integer tmonth;
	
    /** 
     * 属性facid
     */
    private String facid;
	
    /** 
     * 属性facname
     */
    private String facname;
	
    /** 
     * 属性volume1
     */
    private BigDecimal volume1;
	
    /** 
     * 属性volume2
     */
    private BigDecimal volume2;
	
    /** 
     * 属性volume3
     */
    private BigDecimal volume3;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /** 
     * 属性state
     */
    private Integer state;
	
    /** 
     * 属性subjectguid
     */
    private String subjectguid;
	
    /** 
     * 属性fillinman
     */
    private String fillinman;
	
    /** 
     * 属性fillintime
     */
    private Date fillintime;
	
    /** 
     * 属性bak1
     */
    private BigDecimal bak1;
	
    /** 
     * 属性bak2
     */
    private BigDecimal bak2;
	
    /** 
     * 属性bak3
     */
    private BigDecimal bak3;
	
    /** 
     * 属性bak4
     */
    private BigDecimal bak4;
	
    /** 
     * 属性bak5
     */
    private String bak5;
	
    /** 
     * 属性bak6
     */
    private String bak6;
	
    /**
     * PubMPowerForecast构造函数
     */
    public PubMPowerForecast() {
        super();
    }  
	
    /**
     * PubMPowerForecast完整的构造函数
     */  
    public PubMPowerForecast(String guid,String marketid,Integer tyear,Integer tmonth,String remark,String fillinman,Date fillintime){
        this.guid = guid;
        this.marketid = marketid;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.remark = remark;
        this.fillinman = fillinman;
        this.fillintime = fillintime;
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
     * 属性 tyear 的get方法
     * @return Integer
     */
    public Integer getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(Integer tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tmonth 的get方法
     * @return Integer
     */
    public Integer getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(Integer tmonth){
        this.tmonth = tmonth;
    } 
	
    /**
     * 属性 facid 的get方法
     * @return String
     */
    public String getFacid(){
        return facid;
    }
	
    /**
     * 属性 facid 的set方法
     * @return
     */
    public void setFacid(String facid){
        this.facid = facid;
    } 
	
    /**
     * 属性 facname 的get方法
     * @return String
     */
    public String getFacname(){
        return facname;
    }
	
    /**
     * 属性 facname 的set方法
     * @return
     */
    public void setFacname(String facname){
        this.facname = facname;
    } 
	
    /**
     * 属性 volume1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVolume1(){
        return volume1;
    }
	
    /**
     * 属性 volume1 的set方法
     * @return
     */
    public void setVolume1(BigDecimal volume1){
        this.volume1 = volume1;
    } 
	
    /**
     * 属性 volume2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVolume2(){
        return volume2;
    }
	
    /**
     * 属性 volume2 的set方法
     * @return
     */
    public void setVolume2(BigDecimal volume2){
        this.volume2 = volume2;
    } 
	
    /**
     * 属性 volume3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVolume3(){
        return volume3;
    }
	
    /**
     * 属性 volume3 的set方法
     * @return
     */
    public void setVolume3(BigDecimal volume3){
        this.volume3 = volume3;
    } 
	
    /**
     * 属性 remark 的get方法
     * @return String
     */
    public String getRemark(){
        return remark;
    }
	
    /**
     * 属性 remark 的set方法
     * @return
     */
    public void setRemark(String remark){
        this.remark = remark;
    } 
	
    /**
     * 属性 state 的get方法
     * @return Integer
     */
    public Integer getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(Integer state){
        this.state = state;
    } 
	
    /**
     * 属性 subjectguid 的get方法
     * @return String
     */
    public String getSubjectguid(){
        return subjectguid;
    }
	
    /**
     * 属性 subjectguid 的set方法
     * @return
     */
    public void setSubjectguid(String subjectguid){
        this.subjectguid = subjectguid;
    } 
	
    /**
     * 属性 fillinman 的get方法
     * @return String
     */
    public String getFillinman(){
        return fillinman;
    }
	
    /**
     * 属性 fillinman 的set方法
     * @return
     */
    public void setFillinman(String fillinman){
        this.fillinman = fillinman;
    } 
	
    /**
     * 属性 fillintime 的get方法
     * @return Date
     */
    public Date getFillintime(){
        return fillintime;
    }
	
    /**
     * 属性 fillintime 的set方法
     * @return
     */
    public void setFillintime(Date fillintime){
        this.fillintime = fillintime;
    } 
	
    /**
     * 属性 bak1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(BigDecimal bak1){
        this.bak1 = bak1;
    } 
	
    /**
     * 属性 bak2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(BigDecimal bak2){
        this.bak2 = bak2;
    } 
	
    /**
     * 属性 bak3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(BigDecimal bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * 属性 bak4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(BigDecimal bak4){
        this.bak4 = bak4;
    } 
	
    /**
     * 属性 bak5 的get方法
     * @return String
     */
    public String getBak5(){
        return bak5;
    }
	
    /**
     * 属性 bak5 的set方法
     * @return
     */
    public void setBak5(String bak5){
        this.bak5 = bak5;
    } 
	
    /**
     * 属性 bak6 的get方法
     * @return String
     */
    public String getBak6(){
        return bak6;
    }
	
    /**
     * 属性 bak6 的set方法
     * @return
     */
    public void setBak6(String bak6){
        this.bak6 = bak6;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubMPowerForecast))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubMPowerForecast other = (PubMPowerForecast) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("tyear"+":"+getTyear())
            .append("tmonth"+":"+getTmonth())
            .append("facid"+":"+getFacid())
            .append("facname"+":"+getFacname())
            .append("volume1"+":"+getVolume1())
            .append("volume2"+":"+getVolume2())
            .append("volume3"+":"+getVolume3())
            .append("remark"+":"+getRemark())
            .append("state"+":"+getState())
            .append("subjectguid"+":"+getSubjectguid())
            .append("fillinman"+":"+getFillinman())
            .append("fillintime"+":"+getFillintime())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
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