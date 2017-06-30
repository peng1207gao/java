package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubMPowerNeed的POJO类
 *
 * @author  Administrator  [Sat Mar 08 11:39:02 CST 2014]
 * 
 */
public class PubMPowerNeed implements Serializable{

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
    private BigDecimal tyear;
	
    /** 
     * 属性tmonth
     */
    private BigDecimal tmonth;
	
    /** 
     * 属性maxbreach
     */
    private BigDecimal maxbreach;
	
    /** 
     * 属性maxbreachTb
     */
    private BigDecimal maxbreachTb;
	
    /** 
     * 属性stopnums
     */
    private BigDecimal stopnums;
	
    /** 
     * 属性stopnumsTb
     */
    private BigDecimal stopnumsTb;
	
    /** 
     * 属性elecmove
     */
    private BigDecimal elecmove;
	
    /** 
     * 属性elecmoveTb
     */
    private BigDecimal elecmoveTb;
	
    /** 
     * 属性loadmove
     */
    private BigDecimal loadmove;
	
    /** 
     * 属性loadmoveTb
     */
    private BigDecimal loadmoveTb;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
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
     * PubMPowerNeed构造函数
     */
    public PubMPowerNeed() {
        super();
    }  
	
    /**
     * PubMPowerNeed完整的构造函数
     */  
    public PubMPowerNeed(String guid,String marketid,BigDecimal tyear,BigDecimal tmonth,BigDecimal state,String fillinman,Date fillintime){
        this.guid = guid;
        this.marketid = marketid;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.state = state;
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
     * @return BigDecimal
     */
    public BigDecimal getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(BigDecimal tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tmonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(BigDecimal tmonth){
        this.tmonth = tmonth;
    } 
	
    /**
     * 属性 maxbreach 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxbreach(){
        return maxbreach;
    }
	
    /**
     * 属性 maxbreach 的set方法
     * @return
     */
    public void setMaxbreach(BigDecimal maxbreach){
        this.maxbreach = maxbreach;
    } 
	
    /**
     * 属性 maxbreachTb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxbreachTb(){
        return maxbreachTb;
    }
	
    /**
     * 属性 maxbreachTb 的set方法
     * @return
     */
    public void setMaxbreachTb(BigDecimal maxbreachTb){
        this.maxbreachTb = maxbreachTb;
    } 
	
    /**
     * 属性 stopnums 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStopnums(){
        return stopnums;
    }
	
    /**
     * 属性 stopnums 的set方法
     * @return
     */
    public void setStopnums(BigDecimal stopnums){
        this.stopnums = stopnums;
    } 
	
    /**
     * 属性 stopnumsTb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStopnumsTb(){
        return stopnumsTb;
    }
	
    /**
     * 属性 stopnumsTb 的set方法
     * @return
     */
    public void setStopnumsTb(BigDecimal stopnumsTb){
        this.stopnumsTb = stopnumsTb;
    } 
	
    /**
     * 属性 elecmove 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecmove(){
        return elecmove;
    }
	
    /**
     * 属性 elecmove 的set方法
     * @return
     */
    public void setElecmove(BigDecimal elecmove){
        this.elecmove = elecmove;
    } 
	
    /**
     * 属性 elecmoveTb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecmoveTb(){
        return elecmoveTb;
    }
	
    /**
     * 属性 elecmoveTb 的set方法
     * @return
     */
    public void setElecmoveTb(BigDecimal elecmoveTb){
        this.elecmoveTb = elecmoveTb;
    } 
	
    /**
     * 属性 loadmove 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoadmove(){
        return loadmove;
    }
	
    /**
     * 属性 loadmove 的set方法
     * @return
     */
    public void setLoadmove(BigDecimal loadmove){
        this.loadmove = loadmove;
    } 
	
    /**
     * 属性 loadmoveTb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoadmoveTb(){
        return loadmoveTb;
    }
	
    /**
     * 属性 loadmoveTb 的set方法
     * @return
     */
    public void setLoadmoveTb(BigDecimal loadmoveTb){
        this.loadmoveTb = loadmoveTb;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public BigDecimal getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(BigDecimal state){
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
		
        if (o == null || !(o instanceof PubMPowerNeed))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubMPowerNeed other = (PubMPowerNeed) o;	        
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
            .append("maxbreach"+":"+getMaxbreach())
            .append("maxbreachTb"+":"+getMaxbreachTb())
            .append("stopnums"+":"+getStopnums())
            .append("stopnumsTb"+":"+getStopnumsTb())
            .append("elecmove"+":"+getElecmove())
            .append("elecmoveTb"+":"+getElecmoveTb())
            .append("loadmove"+":"+getLoadmove())
            .append("loadmoveTb"+":"+getLoadmoveTb())
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