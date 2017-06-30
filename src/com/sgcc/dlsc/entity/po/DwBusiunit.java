package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwBusiunit的POJO类
 *
 * @author  Administrator  [Tue Mar 11 19:50:42 CST 2014]
 * 
 */
public class DwBusiunit implements Serializable{

    /** 
     * 属性busiunitid
     */
    private String busiunitid;
	
    /** 
     * 属性busiunitname
     */
    private String busiunitname;
	
    /** 
     * 属性marketmemberid
     */
    private String marketmemberid;
	
    /** 
     * 属性unittype
     */
    private String unittype;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwBusiunit构造函数
     */
    public DwBusiunit() {
        super();
    }  
	
    /**
     * DwBusiunit完整的构造函数
     */  
    public DwBusiunit(String busiunitid){
        this.busiunitid = busiunitid;
    }
 
    /**
     * 属性 busiunitid 的get方法
     * @return String
     */
    public String getBusiunitid(){
        return busiunitid;
    }
	
    /**
     * 属性 busiunitid 的set方法
     * @return
     */
    public void setBusiunitid(String busiunitid){
        if(busiunitid != null && busiunitid.trim().length() == 0){
            this.busiunitid = null;
        }else{
            this.busiunitid = busiunitid;
        }
    } 
	
    /**
     * 属性 busiunitname 的get方法
     * @return String
     */
    public String getBusiunitname(){
        return busiunitname;
    }
	
    /**
     * 属性 busiunitname 的set方法
     * @return
     */
    public void setBusiunitname(String busiunitname){
        this.busiunitname = busiunitname;
    } 
	
    /**
     * 属性 marketmemberid 的get方法
     * @return String
     */
    public String getMarketmemberid(){
        return marketmemberid;
    }
	
    /**
     * 属性 marketmemberid 的set方法
     * @return
     */
    public void setMarketmemberid(String marketmemberid){
        this.marketmemberid = marketmemberid;
    } 
	
    /**
     * 属性 unittype 的get方法
     * @return String
     */
    public String getUnittype(){
        return unittype;
    }
	
    /**
     * 属性 unittype 的set方法
     * @return
     */
    public void setUnittype(String unittype){
        this.unittype = unittype;
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
		
        if (o == null || !(o instanceof DwBusiunit))
	        return false; 
			
        if(getBusiunitid() == null) 
	        return false;

        DwBusiunit other = (DwBusiunit) o;	        
	    return new EqualsBuilder()
            .append(this.getBusiunitid(), other.getBusiunitid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("busiunitid"+":"+getBusiunitid())
            .append("busiunitname"+":"+getBusiunitname())
            .append("marketmemberid"+":"+getMarketmemberid())
            .append("unittype"+":"+getUnittype())
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