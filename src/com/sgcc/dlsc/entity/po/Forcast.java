package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Datetype的POJO类
 *
 * @author  sss  [Wed Nov 20 14:21:26 CST 2013]
 * 
 */
public class Forcast implements Serializable{

    /** 
     * 属性sdate
     */
    private String sdate;
	
    /** 
     * 属性sid
     */
    private String sid;
    /** 
     * 属性mwh
     */
    private BigDecimal mwh;
    /** 
     * 属性maxMw
     */
    private BigDecimal maxMw;
	
    /**
     * Datetype构造函数
     */
    public Forcast() {
        super();
    }  
	
    /**
     * Datetype完整的构造函数
     */  
    public Forcast(String sdate,String sid){
        this.sdate = sdate;
        this.sid = sid;
    }
 
	
	
 


	/**
     * 属性 sdate 的set方法
     * @return
     */
    public void setSdate(String sdate){
        if(sdate != null && sdate.trim().length() == 0){
            this.sdate = null;
        }else{
            this.sdate = sdate;
        }
    } 
	
    /**
     * 属性 sdate 的get方法
     * @return String
     */
 
	
    public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		if(sid != null && sid.trim().length() == 0){
            this.sid = null;
        }else{
            this.sid = sid;
        }
	}

	public BigDecimal getMwh() {
		return mwh;
	}

	public void setMwh(BigDecimal mwh) {
		this.mwh = mwh;
	}

	public BigDecimal getMaxMw() {
		return maxMw;
	}

	public void setMaxMw(BigDecimal maxMw) {
		this.maxMw = maxMw;
	}

	public String getSdate() {
		return sdate;
	}

 
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    @Override
	public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof Forcast))
	        return false; 
			
        if(getSdate() == null) 
	        return false;
        if(getSid() == null) 
	        return false;
        Forcast other = (Forcast) o;	        
	    return new EqualsBuilder()
            .append(this.getSdate(), other.getSdate())
            .append(this.getSid(), other.getSid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	@Override
	public String toString(){

		  return new StringBuffer()
            .append("sdate"+":"+getSdate())
            .append("sid"+":"+getSid())
            .append("mwh"+":"+getMwh())
            .append("maxMw"+":"+getMaxMw())
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