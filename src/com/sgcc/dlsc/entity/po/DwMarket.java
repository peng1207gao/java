package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwMarket的POJO类
 *
 * @author  zndw0  [Wed Mar 12 11:36:36 CST 2014]
 * 
 */
public class DwMarket implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性marketname
     */
    private String marketname;
	
    /** 
     * 属性marketdescr
     */
    private String marketdescr;
	
    /** 
     * 属性parentmarketid
     */
    private String parentmarketid;
	
    /** 
     * 属性marketlevel
     */
    private BigDecimal marketlevel;
	
    /**
     * DwMarket构造函数
     */
    public DwMarket() {
        super();
    }  
	
    /**
     * DwMarket完整的构造函数
     */  
    public DwMarket(String marketid,String marketname,BigDecimal marketlevel){
        this.marketid = marketid;
        this.marketname = marketname;
        this.marketlevel = marketlevel;
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
        if(marketid != null && marketid.trim().length() == 0){
            this.marketid = null;
        }else{
            this.marketid = marketid;
        }
    } 
	
    /**
     * 属性 marketname 的get方法
     * @return String
     */
    public String getMarketname(){
        return marketname;
    }
	
    /**
     * 属性 marketname 的set方法
     * @return
     */
    public void setMarketname(String marketname){
        this.marketname = marketname;
    } 
	
    /**
     * 属性 marketdescr 的get方法
     * @return String
     */
    public String getMarketdescr(){
        return marketdescr;
    }
	
    /**
     * 属性 marketdescr 的set方法
     * @return
     */
    public void setMarketdescr(String marketdescr){
        this.marketdescr = marketdescr;
    } 
	
    /**
     * 属性 parentmarketid 的get方法
     * @return String
     */
    public String getParentmarketid(){
        return parentmarketid;
    }
	
    /**
     * 属性 parentmarketid 的set方法
     * @return
     */
    public void setParentmarketid(String parentmarketid){
        this.parentmarketid = parentmarketid;
    } 
	
    /**
     * 属性 marketlevel 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMarketlevel(){
        return marketlevel;
    }
	
    /**
     * 属性 marketlevel 的set方法
     * @return
     */
    public void setMarketlevel(BigDecimal marketlevel){
        this.marketlevel = marketlevel;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwMarket))
	        return false; 
			
        if(getMarketid() == null) 
	        return false;

        DwMarket other = (DwMarket) o;	        
	    return new EqualsBuilder()
            .append(this.getMarketid(), other.getMarketid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("marketid"+":"+getMarketid())
            .append("marketname"+":"+getMarketname())
            .append("marketdescr"+":"+getMarketdescr())
            .append("parentmarketid"+":"+getParentmarketid())
            .append("marketlevel"+":"+getMarketlevel())
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