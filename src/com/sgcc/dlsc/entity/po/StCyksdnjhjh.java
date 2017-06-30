package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * StCyksdnjhjh的POJO类
 *
 * @author  Administrator  [Tue Feb 18 17:02:56 CST 2014]
 * 
 */
public class StCyksdnjhjh implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性qymc
     */
    private String qymc;
	
    /** 
     * 属性jyfx
     */
    private String jyfx;
	
    /** 
     * 属性dydl
     */
    private BigDecimal dydl;
	
    /** 
     * 属性tb
     */
    private BigDecimal tb;
	
    /** 
     * 属性ljdl
     */
    private BigDecimal ljdl;
	
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
     * StCyksdnjhjh构造函数
     */
    public StCyksdnjhjh() {
        super();
    }  
	
    /**
     * StCyksdnjhjh完整的构造函数
     */  
    public StCyksdnjhjh(String guid,BigDecimal theyear,BigDecimal themonth,String marketid){
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
     * 属性 qymc 的get方法
     * @return String
     */
    public String getQymc(){
        return qymc;
    }
	
    /**
     * 属性 qymc 的set方法
     * @return
     */
    public void setQymc(String qymc){
        this.qymc = qymc;
    } 
	
    /**
     * 属性 jyfx 的get方法
     * @return String
     */
    public String getJyfx(){
        return jyfx;
    }
	
    /**
     * 属性 jyfx 的set方法
     * @return
     */
    public void setJyfx(String jyfx){
        this.jyfx = jyfx;
    } 
	
    /**
     * 属性 dydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDydl(){
        return dydl;
    }
	
    /**
     * 属性 dydl 的set方法
     * @return
     */
    public void setDydl(BigDecimal dydl){
        this.dydl = dydl;
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
     * 属性 ljdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjdl(){
        return ljdl;
    }
	
    /**
     * 属性 ljdl 的set方法
     * @return
     */
    public void setLjdl(BigDecimal ljdl){
        this.ljdl = ljdl;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof StCyksdnjhjh))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        StCyksdnjhjh other = (StCyksdnjhjh) o;	        
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
            .append("qymc"+":"+getQymc())
            .append("jyfx"+":"+getJyfx())
            .append("dydl"+":"+getDydl())
            .append("tb"+":"+getTb())
            .append("ljdl"+":"+getLjdl())
            .append("ljtb"+":"+getLjtb())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("marketid"+":"+getMarketid())
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