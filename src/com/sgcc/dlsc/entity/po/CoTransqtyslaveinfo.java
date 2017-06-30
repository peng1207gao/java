package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoTransqtyslaveinfo的POJO类
 *
 * @author  mengke  [Tue Feb 11 09:49:46 CST 2014]
 * 
 */
public class CoTransqtyslaveinfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性transinfoid
     */
    private String transinfoid;
	
    /** 
     * 属性starttime
     */
    private String starttime;
	
    /** 
     * 属性endtime
     */
    private String endtime;
	
    /** 
     * 属性power
     */
    private BigDecimal power;
	
    /** 
     * 属性qtytype
     */
    private BigDecimal qtytype;
	
    /** 
     * 属性explanation
     */
    private String explanation;
    
    /** 
     * 属性explanation
     */
    private String bight;
    
    /** 
     * 属性explanation
     */
    private Date startdate;
    
    /** 
     * 属性explanation
     */
    private Date enddate;
	
    /**
     * CoTransqtyslaveinfo构造函数
     */
    public CoTransqtyslaveinfo() {
        super();
    }  
	
    /**
     * CoTransqtyslaveinfo完整的构造函数
     */  
    public CoTransqtyslaveinfo(String guid){
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
     * 属性 transinfoid 的get方法
     * @return String
     */
    public String getTransinfoid(){
        return transinfoid;
    }
	
    /**
     * 属性 transinfoid 的set方法
     * @return
     */
    public void setTransinfoid(String transinfoid){
        this.transinfoid = transinfoid;
    } 
	
    /**
     * 属性 starttime 的get方法
     * @return String
     */
    public String getStarttime(){
        return starttime;
    }
	
    /**
     * 属性 starttime 的set方法
     * @return
     */
    public void setStarttime(String starttime){
        this.starttime = starttime;
    } 
	
    /**
     * 属性 endtime 的get方法
     * @return String
     */
    public String getEndtime(){
        return endtime;
    }
	
    /**
     * 属性 endtime 的set方法
     * @return
     */
    public void setEndtime(String endtime){
        this.endtime = endtime;
    } 
	
    /**
     * 属性 power 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPower(){
        return power;
    }
	
    /**
     * 属性 power 的set方法
     * @return
     */
    public void setPower(BigDecimal power){
        this.power = power;
    } 
	
    /**
     * 属性 qtytype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getQtytype(){
        return qtytype;
    }
	
    /**
     * 属性 qtytype 的set方法
     * @return
     */
    public void setQtytype(BigDecimal qtytype){
        this.qtytype = qtytype;
    } 
	
    /**
     * 属性 explanation 的get方法
     * @return String
     */
    public String getExplanation(){
        return explanation;
    }
	
    /**
     * 属性 explanation 的set方法
     * @return
     */
    public void setExplanation(String explanation){
        this.explanation = explanation;
    } 
	
    
    public String getBight() {
		return bight;
	}

	public void setBight(String bight) {
		this.bight = bight;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	/**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoTransqtyslaveinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoTransqtyslaveinfo other = (CoTransqtyslaveinfo) o;	        
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
            .append("transinfoid"+":"+getTransinfoid())
            .append("starttime"+":"+getStarttime())
            .append("endtime"+":"+getEndtime())
            .append("power"+":"+getPower())
            .append("qtytype"+":"+getQtytype())
            .append("explanation"+":"+getExplanation())
            .append("bight"+":"+getBight())
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
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