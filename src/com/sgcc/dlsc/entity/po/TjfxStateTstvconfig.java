package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxStateTstvconfig的POJO类
 *
 * @author  dlsc  [Mon Oct 28 17:59:42 CST 2013]
 * 
 */
public class TjfxStateTstvconfig implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性mktMonth
     */
    private Date mktMonth;
	
    /** 
     * 属性tjxh
     */
    private BigDecimal tjxh;
	
    /** 
     * 属性tjname
     */
    private String tjname;
	
    /** 
     * 属性purchaser
     */
    private String purchaser;
	
    /** 
     * 属性seller
     */
    private String seller;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * TjfxStateTstvconfig构造函数
     */
    public TjfxStateTstvconfig() {
        super();
    }  
	
    /**
     * TjfxStateTstvconfig完整的构造函数
     */  
    public TjfxStateTstvconfig(String guid,BigDecimal tjxh,String tjname,String marketid){
        this.guid = guid;
        this.tjxh = tjxh;
        this.tjname = tjname;
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
     * 属性 mktMonth 的get方法
     * @return Date
     */
    public Date getMktMonth(){
        return mktMonth;
    }
	
    /**
     * 属性 mktMonth 的set方法
     * @return
     */
    public void setMktMonth(Date mktMonth){
        this.mktMonth = mktMonth;
    } 
	
    /**
     * 属性 tjxh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTjxh(){
        return tjxh;
    }
	
    /**
     * 属性 tjxh 的set方法
     * @return
     */
    public void setTjxh(BigDecimal tjxh){
        this.tjxh = tjxh;
    } 
	
    /**
     * 属性 tjname 的get方法
     * @return String
     */
    public String getTjname(){
        return tjname;
    }
	
    /**
     * 属性 tjname 的set方法
     * @return
     */
    public void setTjname(String tjname){
        this.tjname = tjname;
    } 
	
    /**
     * 属性 purchaser 的get方法
     * @return String
     */
    public String getPurchaser(){
        return purchaser;
    }
	
    /**
     * 属性 purchaser 的set方法
     * @return
     */
    public void setPurchaser(String purchaser){
        this.purchaser = purchaser;
    } 
	
    /**
     * 属性 seller 的get方法
     * @return String
     */
    public String getSeller(){
        return seller;
    }
	
    /**
     * 属性 seller 的set方法
     * @return
     */
    public void setSeller(String seller){
        this.seller = seller;
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
		
        if (o == null || !(o instanceof TjfxStateTstvconfig))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxStateTstvconfig other = (TjfxStateTstvconfig) o;	        
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
            .append("mktMonth"+":"+getMktMonth())
            .append("tjxh"+":"+getTjxh())
            .append("tjname"+":"+getTjname())
            .append("purchaser"+":"+getPurchaser())
            .append("seller"+":"+getSeller())
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