package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Testfileupdate的POJO类
 *
 * @author  Administrator  [Tue Sep 03 10:09:47 CST 2013]
 * 
 */
public class Testfileupdate implements Serializable{

    /** 
     * 属性deptid
     */
    private String deptid;
	
    /** 
     * 属性deptname
     */
    private String deptname;
	
    /** 
     * 属性deptnum
     */
    private BigDecimal deptnum;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * Testfileupdate构造函数
     */
    public Testfileupdate() {
        super();
    }  
	
    /**
     * Testfileupdate完整的构造函数
     */  
    public Testfileupdate(String deptid){
        this.deptid = deptid;
    }
 
    /**
     * 属性 deptid 的get方法
     * @return String
     */
    public String getDeptid(){
        return deptid;
    }
	
    /**
     * 属性 deptid 的set方法
     * @return
     */
    public void setDeptid(String deptid){
        if(deptid != null && deptid.trim().length() == 0){
            this.deptid = null;
        }else{
            this.deptid = deptid;
        }
    } 
	
    /**
     * 属性 deptname 的get方法
     * @return String
     */
    public String getDeptname(){
        return deptname;
    }
	
    /**
     * 属性 deptname 的set方法
     * @return
     */
    public void setDeptname(String deptname){
        this.deptname = deptname;
    } 
	
    /**
     * 属性 deptnum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDeptnum(){
        return deptnum;
    }
	
    /**
     * 属性 deptnum 的set方法
     * @return
     */
    public void setDeptnum(BigDecimal deptnum){
        this.deptnum = deptnum;
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
		
        if (o == null || !(o instanceof Testfileupdate))
	        return false; 
			
        if(getDeptid() == null) 
	        return false;

        Testfileupdate other = (Testfileupdate) o;	        
	    return new EqualsBuilder()
            .append(this.getDeptid(), other.getDeptid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("deptid"+":"+getDeptid())
            .append("deptname"+":"+getDeptname())
            .append("deptnum"+":"+getDeptnum())
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