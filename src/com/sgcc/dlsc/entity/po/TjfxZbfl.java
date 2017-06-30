package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxZbfl的POJO类
 *
 * @author  wangqibin  [Wed Apr 02 19:12:35 CST 2014]
 * 
 */
public class TjfxZbfl implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性zbfl
     */
    private String zbfl;
	
    /** 
     * 属性ms
     */
    private String ms;
	
    /** 
     * 属性px
     */
    private BigDecimal px;
	
    /**
     * TjfxZbfl构造函数
     */
    public TjfxZbfl() {
        super();
    }  
	
    /**
     * TjfxZbfl完整的构造函数
     */  
    public TjfxZbfl(String guid){
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
     * 属性 zbfl 的get方法
     * @return String
     */
    public String getZbfl(){
        return zbfl;
    }
	
    /**
     * 属性 zbfl 的set方法
     * @return
     */
    public void setZbfl(String zbfl){
        this.zbfl = zbfl;
    } 
	
    /**
     * 属性 ms 的get方法
     * @return String
     */
    public String getMs(){
        return ms;
    }
	
    /**
     * 属性 ms 的set方法
     * @return
     */
    public void setMs(String ms){
        this.ms = ms;
    } 
	
    /**
     * 属性 px 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPx(){
        return px;
    }
	
    /**
     * 属性 px 的set方法
     * @return
     */
    public void setPx(BigDecimal px){
        this.px = px;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxZbfl))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxZbfl other = (TjfxZbfl) o;	        
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
            .append("zbfl"+":"+getZbfl())
            .append("ms"+":"+getMs())
            .append("px"+":"+getPx())
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