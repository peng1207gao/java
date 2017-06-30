package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * StTdfdjh的POJO类
 *
 * @author  lenovo  [Fri Feb 07 17:02:45 CST 2014]
 * 
 */
public class StTdfdjh implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性jdjhfdl
     */
    private BigDecimal jdjhfdl;
	
    /** 
     * 属性jdjhfdlzf
     */
    private BigDecimal jdjhfdlzf;
	
    /** 
     * 属性jdjhhdfdl
     */
    private BigDecimal jdjhhdfdl;
	
    /** 
     * 属性jdjhhdfdlzf
     */
    private BigDecimal jdjhhdfdlzf;
	
    /** 
     * 属性jdjhsdfdl
     */
    private BigDecimal jdjhsdfdl;
	
    /** 
     * 属性jdjhsdfdlzf
     */
    private BigDecimal jdjhsdfdlzf;
	
    /** 
     * 属性dyjhfdl
     */
    private BigDecimal dyjhfdl;
	
    /** 
     * 属性dyjhfdlzf
     */
    private BigDecimal dyjhfdlzf;
	
    /** 
     * 属性dyjhhdfdl
     */
    private BigDecimal dyjhhdfdl;
	
    /** 
     * 属性dyjhhdfdlzf
     */
    private BigDecimal dyjhhdfdlzf;
	
    /** 
     * 属性dyjhsdfdl
     */
    private BigDecimal dyjhsdfdl;
	
    /** 
     * 属性dyjhsdfdlzf
     */
    private BigDecimal dyjhsdfdlzf;
	
    /** 
     * 属性yjlyxs
     */
    private BigDecimal yjlyxs;
	
    /** 
     * 属性hdlyxs
     */
    private BigDecimal hdlyxs;
	
    /** 
     * 属性sdlyxs
     */
    private BigDecimal sdlyxs;
	
    /** 
     * 属性sbzt
     */
    private String sbzt;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /**
     * StTdfdjh构造函数
     */
    public StTdfdjh() {
        super();
    }  
	
    /**
     * StTdfdjh完整的构造函数
     */  
    public StTdfdjh(String guid){
        this.guid = guid;
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
     * 属性 jdjhfdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdjhfdl(){
        return jdjhfdl;
    }
	
    /**
     * 属性 jdjhfdl 的set方法
     * @return
     */
    public void setJdjhfdl(BigDecimal jdjhfdl){
        this.jdjhfdl = jdjhfdl;
    } 
	
    /**
     * 属性 jdjhfdlzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdjhfdlzf(){
        return jdjhfdlzf;
    }
	
    /**
     * 属性 jdjhfdlzf 的set方法
     * @return
     */
    public void setJdjhfdlzf(BigDecimal jdjhfdlzf){
        this.jdjhfdlzf = jdjhfdlzf;
    } 
	
    /**
     * 属性 jdjhhdfdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdjhhdfdl(){
        return jdjhhdfdl;
    }
	
    /**
     * 属性 jdjhhdfdl 的set方法
     * @return
     */
    public void setJdjhhdfdl(BigDecimal jdjhhdfdl){
        this.jdjhhdfdl = jdjhhdfdl;
    } 
	
    /**
     * 属性 jdjhhdfdlzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdjhhdfdlzf(){
        return jdjhhdfdlzf;
    }
	
    /**
     * 属性 jdjhhdfdlzf 的set方法
     * @return
     */
    public void setJdjhhdfdlzf(BigDecimal jdjhhdfdlzf){
        this.jdjhhdfdlzf = jdjhhdfdlzf;
    } 
	
    /**
     * 属性 jdjhsdfdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdjhsdfdl(){
        return jdjhsdfdl;
    }
	
    /**
     * 属性 jdjhsdfdl 的set方法
     * @return
     */
    public void setJdjhsdfdl(BigDecimal jdjhsdfdl){
        this.jdjhsdfdl = jdjhsdfdl;
    } 
	
    /**
     * 属性 jdjhsdfdlzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdjhsdfdlzf(){
        return jdjhsdfdlzf;
    }
	
    /**
     * 属性 jdjhsdfdlzf 的set方法
     * @return
     */
    public void setJdjhsdfdlzf(BigDecimal jdjhsdfdlzf){
        this.jdjhsdfdlzf = jdjhsdfdlzf;
    } 
	
    /**
     * 属性 dyjhfdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjhfdl(){
        return dyjhfdl;
    }
	
    /**
     * 属性 dyjhfdl 的set方法
     * @return
     */
    public void setDyjhfdl(BigDecimal dyjhfdl){
        this.dyjhfdl = dyjhfdl;
    } 
	
    /**
     * 属性 dyjhfdlzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjhfdlzf(){
        return dyjhfdlzf;
    }
	
    /**
     * 属性 dyjhfdlzf 的set方法
     * @return
     */
    public void setDyjhfdlzf(BigDecimal dyjhfdlzf){
        this.dyjhfdlzf = dyjhfdlzf;
    } 
	
    /**
     * 属性 dyjhhdfdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjhhdfdl(){
        return dyjhhdfdl;
    }
	
    /**
     * 属性 dyjhhdfdl 的set方法
     * @return
     */
    public void setDyjhhdfdl(BigDecimal dyjhhdfdl){
        this.dyjhhdfdl = dyjhhdfdl;
    } 
	
    /**
     * 属性 dyjhhdfdlzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjhhdfdlzf(){
        return dyjhhdfdlzf;
    }
	
    /**
     * 属性 dyjhhdfdlzf 的set方法
     * @return
     */
    public void setDyjhhdfdlzf(BigDecimal dyjhhdfdlzf){
        this.dyjhhdfdlzf = dyjhhdfdlzf;
    } 
	
    /**
     * 属性 dyjhsdfdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjhsdfdl(){
        return dyjhsdfdl;
    }
	
    /**
     * 属性 dyjhsdfdl 的set方法
     * @return
     */
    public void setDyjhsdfdl(BigDecimal dyjhsdfdl){
        this.dyjhsdfdl = dyjhsdfdl;
    } 
	
    /**
     * 属性 dyjhsdfdlzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjhsdfdlzf(){
        return dyjhsdfdlzf;
    }
	
    /**
     * 属性 dyjhsdfdlzf 的set方法
     * @return
     */
    public void setDyjhsdfdlzf(BigDecimal dyjhsdfdlzf){
        this.dyjhsdfdlzf = dyjhsdfdlzf;
    } 
	
    /**
     * 属性 yjlyxs 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYjlyxs(){
        return yjlyxs;
    }
	
    /**
     * 属性 yjlyxs 的set方法
     * @return
     */
    public void setYjlyxs(BigDecimal yjlyxs){
        this.yjlyxs = yjlyxs;
    } 
	
    /**
     * 属性 hdlyxs 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHdlyxs(){
        return hdlyxs;
    }
	
    /**
     * 属性 hdlyxs 的set方法
     * @return
     */
    public void setHdlyxs(BigDecimal hdlyxs){
        this.hdlyxs = hdlyxs;
    } 
	
    /**
     * 属性 sdlyxs 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSdlyxs(){
        return sdlyxs;
    }
	
    /**
     * 属性 sdlyxs 的set方法
     * @return
     */
    public void setSdlyxs(BigDecimal sdlyxs){
        this.sdlyxs = sdlyxs;
    } 
	
    /**
     * 属性 sbzt 的get方法
     * @return String
     */
    public String getSbzt(){
        return sbzt;
    }
	
    /**
     * 属性 sbzt 的set方法
     * @return
     */
    public void setSbzt(String sbzt){
        this.sbzt = sbzt;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof StTdfdjh))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        StTdfdjh other = (StTdfdjh) o;	        
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
            .append("jdjhfdl"+":"+getJdjhfdl())
            .append("jdjhfdlzf"+":"+getJdjhfdlzf())
            .append("jdjhhdfdl"+":"+getJdjhhdfdl())
            .append("jdjhhdfdlzf"+":"+getJdjhhdfdlzf())
            .append("jdjhsdfdl"+":"+getJdjhsdfdl())
            .append("jdjhsdfdlzf"+":"+getJdjhsdfdlzf())
            .append("dyjhfdl"+":"+getDyjhfdl())
            .append("dyjhfdlzf"+":"+getDyjhfdlzf())
            .append("dyjhhdfdl"+":"+getDyjhhdfdl())
            .append("dyjhhdfdlzf"+":"+getDyjhhdfdlzf())
            .append("dyjhsdfdl"+":"+getDyjhsdfdl())
            .append("dyjhsdfdlzf"+":"+getDyjhsdfdlzf())
            .append("yjlyxs"+":"+getYjlyxs())
            .append("hdlyxs"+":"+getHdlyxs())
            .append("sdlyxs"+":"+getSdlyxs())
            .append("sbzt"+":"+getSbzt())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
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