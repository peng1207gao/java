package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractparamdic的POJO类
 *
 * @author  xiabaike  [Mon May 26 10:14:09 CST 2014]
 * 
 */
public class CoContractparamdic implements Serializable{

    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性dicName
     */
    private String dicName;
	
    /** 
     * 属性dicValue
     */
    private String dicValue;
	
    /** 
     * 属性dicContent
     */
    private String dicContent;
	
    /** 
     * 属性operateUser
     */
    private String operateUser;
	
    /** 
     * 属性operateDate
     */
    private Date operateDate;
	
    /** 
     * 属性updateUser
     */
    private String updateUser;
	
    /** 
     * 属性updateDate
     */
    private Date updateDate;
	
    /** 
     * 属性orderNo
     */
    private BigDecimal orderNo;
	
    /**
     * CoContractparamdic构造函数
     */
    public CoContractparamdic() {
        super();
    }  
	
    /**
     * CoContractparamdic完整的构造函数
     */  
    public CoContractparamdic(String sheetid){
        this.sheetid = sheetid;
    }
 
    /**
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
    /**
     * 属性 dicName 的get方法
     * @return String
     */
    public String getDicName(){
        return dicName;
    }
	
    /**
     * 属性 dicName 的set方法
     * @return
     */
    public void setDicName(String dicName){
        this.dicName = dicName;
    } 
	
    /**
     * 属性 dicValue 的get方法
     * @return String
     */
    public String getDicValue(){
        return dicValue;
    }
	
    /**
     * 属性 dicValue 的set方法
     * @return
     */
    public void setDicValue(String dicValue){
        this.dicValue = dicValue;
    } 
	
    /**
     * 属性 dicContent 的get方法
     * @return String
     */
    public String getDicContent(){
        return dicContent;
    }
	
    /**
     * 属性 dicContent 的set方法
     * @return
     */
    public void setDicContent(String dicContent){
        this.dicContent = dicContent;
    } 
	
    /**
     * 属性 operateUser 的get方法
     * @return String
     */
    public String getOperateUser(){
        return operateUser;
    }
	
    /**
     * 属性 operateUser 的set方法
     * @return
     */
    public void setOperateUser(String operateUser){
        this.operateUser = operateUser;
    } 
	
    /**
     * 属性 operateDate 的get方法
     * @return Date
     */
    public Date getOperateDate(){
        return operateDate;
    }
	
    /**
     * 属性 operateDate 的set方法
     * @return
     */
    public void setOperateDate(Date operateDate){
        this.operateDate = operateDate;
    } 
	
    /**
     * 属性 updateUser 的get方法
     * @return String
     */
    public String getUpdateUser(){
        return updateUser;
    }
	
    /**
     * 属性 updateUser 的set方法
     * @return
     */
    public void setUpdateUser(String updateUser){
        this.updateUser = updateUser;
    } 
	
    /**
     * 属性 updateDate 的get方法
     * @return Date
     */
    public Date getUpdateDate(){
        return updateDate;
    }
	
    /**
     * 属性 updateDate 的set方法
     * @return
     */
    public void setUpdateDate(Date updateDate){
        this.updateDate = updateDate;
    } 
	
    /**
     * 属性 orderNo 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrderNo(){
        return orderNo;
    }
	
    /**
     * 属性 orderNo 的set方法
     * @return
     */
    public void setOrderNo(BigDecimal orderNo){
        this.orderNo = orderNo;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractparamdic))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        CoContractparamdic other = (CoContractparamdic) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("sheetid"+":"+getSheetid())
            .append("dicName"+":"+getDicName())
            .append("dicValue"+":"+getDicValue())
            .append("dicContent"+":"+getDicContent())
            .append("operateUser"+":"+getOperateUser())
            .append("operateDate"+":"+getOperateDate())
            .append("updateUser"+":"+getUpdateUser())
            .append("updateDate"+":"+getUpdateDate())
            .append("orderNo"+":"+getOrderNo())
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