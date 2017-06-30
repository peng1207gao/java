package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcUnitCode的POJO类
 *
 * @author  Administrator  [Fri Mar 14 15:42:25 CST 2014]
 * 
 */
public class SjjcUnitCode implements Serializable{

    /** 
     * 属性code
     */
    private String code;
	
    /** 
     * 属性name
     */
    private String name;
	
    /**
     * SjjcUnitCode构造函数
     */
    public SjjcUnitCode() {
        super();
    }  
	
    /**
     * SjjcUnitCode完整的构造函数
     */  
    public SjjcUnitCode(String code){
        this.code = code;
    }
 
    /**
     * 属性 code 的get方法
     * @return String
     */
    public String getCode(){
        return code;
    }
	
    /**
     * 属性 code 的set方法
     * @return
     */
    public void setCode(String code){
        if(code != null && code.trim().length() == 0){
            this.code = null;
        }else{
            this.code = code;
        }
    } 
	
    /**
     * 属性 name 的get方法
     * @return String
     */
    public String getName(){
        return name;
    }
	
    /**
     * 属性 name 的set方法
     * @return
     */
    public void setName(String name){
        this.name = name;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcUnitCode))
	        return false; 
			
        if(getCode() == null) 
	        return false;

        SjjcUnitCode other = (SjjcUnitCode) o;	        
	    return new EqualsBuilder()
            .append(this.getCode(), other.getCode())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("code"+":"+getCode())
            .append("name"+":"+getName())
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