package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * StKstjyb的POJO类
 *
 * @author  lenovo  [Wed Feb 19 09:48:06 CST 2014]
 * 
 */
public class StKstjyb implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性jyfxmc
     */
    private String jyfxmc;
	
    /** 
     * 属性dyjh
     */
    private BigDecimal dyjh;
	
    /** 
     * 属性sjwc
     */
    private BigDecimal sjwc;
	
    /** 
     * 属性tb
     */
    private BigDecimal tb;
	
    /** 
     * 属性dyjhwcl
     */
    private BigDecimal dyjhwcl;
	
    /** 
     * 属性ljsjwc
     */
    private BigDecimal ljsjwc;
	
    /** 
     * 属性ljtb
     */
    private BigDecimal ljtb;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性version
     */
    private String version;
	
    /**
     * StKstjyb构造函数
     */
    public StKstjyb() {
        super();
    }  
	
    /**
     * StKstjyb完整的构造函数
     */  
    public StKstjyb(String guid,BigDecimal theyear,BigDecimal themonth,String marketid){
        this.guid = guid;
        this.theyear = theyear;
        this.themonth = themonth;
        this.marketid = marketid;
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
     * 属性 jyfxmc 的get方法
     * @return String
     */
    public String getJyfxmc(){
        return jyfxmc;
    }
	
    /**
     * 属性 jyfxmc 的set方法
     * @return
     */
    public void setJyfxmc(String jyfxmc){
        this.jyfxmc = jyfxmc;
    } 
	
    /**
     * 属性 dyjh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjh(){
        return dyjh;
    }
	
    /**
     * 属性 dyjh 的set方法
     * @return
     */
    public void setDyjh(BigDecimal dyjh){
        this.dyjh = dyjh;
    } 
	
    /**
     * 属性 sjwc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSjwc(){
        return sjwc;
    }
	
    /**
     * 属性 sjwc 的set方法
     * @return
     */
    public void setSjwc(BigDecimal sjwc){
        this.sjwc = sjwc;
    } 
	
    /**
     * 属性 tb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTb(){
        return tb;
    }
	
    /**
     * 属性 tb 的set方法
     * @return
     */
    public void setTb(BigDecimal tb){
        this.tb = tb;
    } 
	
    /**
     * 属性 dyjhwcl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjhwcl(){
        return dyjhwcl;
    }
	
    /**
     * 属性 dyjhwcl 的set方法
     * @return
     */
    public void setDyjhwcl(BigDecimal dyjhwcl){
        this.dyjhwcl = dyjhwcl;
    } 
	
    /**
     * 属性 ljsjwc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjsjwc(){
        return ljsjwc;
    }
	
    /**
     * 属性 ljsjwc 的set方法
     * @return
     */
    public void setLjsjwc(BigDecimal ljsjwc){
        this.ljsjwc = ljsjwc;
    } 
	
    /**
     * 属性 ljtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjtb(){
        return ljtb;
    }
	
    /**
     * 属性 ljtb 的set方法
     * @return
     */
    public void setLjtb(BigDecimal ljtb){
        this.ljtb = ljtb;
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
     * 属性 version 的get方法
     * @return String
     */
    public String getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(String version){
        this.version = version;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof StKstjyb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        StKstjyb other = (StKstjyb) o;	        
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
            .append("jyfxmc"+":"+getJyfxmc())
            .append("dyjh"+":"+getDyjh())
            .append("sjwc"+":"+getSjwc())
            .append("tb"+":"+getTb())
            .append("dyjhwcl"+":"+getDyjhwcl())
            .append("ljsjwc"+":"+getLjsjwc())
            .append("ljtb"+":"+getLjtb())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("marketid"+":"+getMarketid())
            .append("version"+":"+getVersion())
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