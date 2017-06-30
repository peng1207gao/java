package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrParams的POJO类
 *
 * @author  Administrator  [Thu Aug 08 14:03:29 CST 2013]
 * 
 */
public class TrParams implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性paramTypeCode
     */
    private String paramTypeCode;
	
    /** 
     * 属性paramId
     */
    private BigDecimal paramId;
	
    /** 
     * 属性paramCode
     */
    private String paramCode;
	
    /** 
     * 属性paramName
     */
    private String paramName;
	
    /** 
     * 属性paramTypeName
     */
    private String paramTypeName;
	
    /**
     * TrParams构造函数
     */
    public TrParams() {
        super();
    }  
	
    /**
     * TrParams完整的构造函数
     */  
    public TrParams(String id,String paramTypeCode,BigDecimal paramId,String paramCode,String paramName,String paramTypeName){
        this.id = id;
        this.paramTypeCode = paramTypeCode;
        this.paramId = paramId;
        this.paramCode = paramCode;
        this.paramName = paramName;
        this.paramTypeName = paramTypeName;
    }
 
    /**
     * 属性 id 的get方法
     * @return String
     */
    public String getId(){
        return id;
    }
	
    /**
     * 属性 id 的set方法
     * @return
     */
    public void setId(String id){
        if(id != null && id.trim().length() == 0){
            this.id = null;
        }else{
            this.id = id;
        }
    } 
	
    /**
     * 属性 paramTypeCode 的get方法
     * @return String
     */
    public String getParamTypeCode(){
        return paramTypeCode;
    }
	
    /**
     * 属性 paramTypeCode 的set方法
     * @return
     */
    public void setParamTypeCode(String paramTypeCode){
        this.paramTypeCode = paramTypeCode;
    } 
	
    /**
     * 属性 paramId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getParamId(){
        return paramId;
    }
	
    /**
     * 属性 paramId 的set方法
     * @return
     */
    public void setParamId(BigDecimal paramId){
        this.paramId = paramId;
    } 
	
    /**
     * 属性 paramCode 的get方法
     * @return String
     */
    public String getParamCode(){
        return paramCode;
    }
	
    /**
     * 属性 paramCode 的set方法
     * @return
     */
    public void setParamCode(String paramCode){
        this.paramCode = paramCode;
    } 
	
    /**
     * 属性 paramName 的get方法
     * @return String
     */
    public String getParamName(){
        return paramName;
    }
	
    /**
     * 属性 paramName 的set方法
     * @return
     */
    public void setParamName(String paramName){
        this.paramName = paramName;
    } 
	
    /**
     * 属性 paramTypeName 的get方法
     * @return String
     */
    public String getParamTypeName(){
        return paramTypeName;
    }
	
    /**
     * 属性 paramTypeName 的set方法
     * @return
     */
    public void setParamTypeName(String paramTypeName){
        this.paramTypeName = paramTypeName;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrParams))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrParams other = (TrParams) o;	        
	    return new EqualsBuilder()
            .append(this.getId(), other.getId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("id"+":"+getId())
            .append("paramTypeCode"+":"+getParamTypeCode())
            .append("paramId"+":"+getParamId())
            .append("paramCode"+":"+getParamCode())
            .append("paramName"+":"+getParamName())
            .append("paramTypeName"+":"+getParamTypeName())
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