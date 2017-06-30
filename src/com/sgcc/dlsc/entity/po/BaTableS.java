package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaTableS的POJO类
 *
 * @author  lenovo  [Tue Jul 02 15:06:57 CST 2013]
 * 
 */
public class BaTableS implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性baUnitId
     */
    private String baUnitId;
	
    /** 
     * 属性detail
     */
    private String detail;
	
    /** 
     * 属性formula
     */
    private String formula;
	
    /** 
     * 属性datasource
     */
    private BigDecimal datasource;
	
    /** 
     * 属性precision
     */
    private BigDecimal precision;
	
    /**
     * BaTableS构造函数
     */
    public BaTableS() {
        super();
    }  
	
    /**
     * BaTableS完整的构造函数
     */  
    public BaTableS(String guid,String baUnitId){
        this.guid = guid;
        this.baUnitId = baUnitId;
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
     * 属性 baUnitId 的get方法
     * @return String
     */
    public String getBaUnitId(){
        return baUnitId;
    }
	
    /**
     * 属性 baUnitId 的set方法
     * @return
     */
    public void setBaUnitId(String baUnitId){
        this.baUnitId = baUnitId;
    } 
	
    /**
     * 属性 detail 的get方法
     * @return String
     */
    public String getDetail(){
        return detail;
    }
	
    /**
     * 属性 detail 的set方法
     * @return
     */
    public void setDetail(String detail){
        this.detail = detail;
    } 
	
    /**
     * 属性 formula 的get方法
     * @return String
     */
    public String getFormula(){
        return formula;
    }
	
    /**
     * 属性 formula 的set方法
     * @return
     */
    public void setFormula(String formula){
        this.formula = formula;
    } 
	
    /**
     * 属性 datasource 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatasource(){
        return datasource;
    }
	
    /**
     * 属性 datasource 的set方法
     * @return
     */
    public void setDatasource(BigDecimal datasource){
        this.datasource = datasource;
    } 
	
    /**
     * 属性 precision 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrecision(){
        return precision;
    }
	
    /**
     * 属性 precision 的set方法
     * @return
     */
    public void setPrecision(BigDecimal precision){
        this.precision = precision;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaTableS))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaTableS other = (BaTableS) o;	        
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
            .append("baUnitId"+":"+getBaUnitId())
            .append("detail"+":"+getDetail())
            .append("formula"+":"+getFormula())
            .append("datasource"+":"+getDatasource())
            .append("precision"+":"+getPrecision())
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