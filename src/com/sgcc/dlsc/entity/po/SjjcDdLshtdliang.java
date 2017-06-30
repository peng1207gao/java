package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdLshtdliang的POJO类
 *
 * @author  Administrator  [Mon Mar 17 10:17:14 CST 2014]
 * 
 */
public class SjjcDdLshtdliang implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性companyname
     */
    private String companyname;
	
    /** 
     * 属性companyid
     */
    private String companyid;
	
    /** 
     * 属性contractname
     */
    private String contractname;
	
    /** 
     * 属性sellername
     */
    private String sellername;
	
    /** 
     * 属性purchasername
     */
    private String purchasername;
	
    /** 
     * 属性transmissionname
     */
    private String transmissionname;
	
    /** 
     * 属性contractquantity
     */
    private BigDecimal contractquantity;
	
    /** 
     * 属性contractstarttime
     */
    private String contractstarttime;
	
    /** 
     * 属性contractendtime
     */
    private String contractendtime;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    
	
    /**
     * SjjcDdLshtdliang构造函数
     */
    public SjjcDdLshtdliang() {
        super();
    }  
	
    /**
     * SjjcDdLshtdliang完整的构造函数
     */  
    public SjjcDdLshtdliang(String objId,String companyname,String companyid,String contractname){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.contractname = contractname;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 companyname 的get方法
     * @return String
     */
    public String getCompanyname(){
        return companyname;
    }
	
    /**
     * 属性 companyname 的set方法
     * @return
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    } 
	
    /**
     * 属性 companyid 的get方法
     * @return String
     */
    public String getCompanyid(){
        return companyid;
    }
	
    /**
     * 属性 companyid 的set方法
     * @return
     */
    public void setCompanyid(String companyid){
        this.companyid = companyid;
    } 
	
    /**
     * 属性 contractname 的get方法
     * @return String
     */
    public String getContractname(){
        return contractname;
    }
	
    /**
     * 属性 contractname 的set方法
     * @return
     */
    public void setContractname(String contractname){
        this.contractname = contractname;
    } 
	
    /**
     * 属性 sellername 的get方法
     * @return String
     */
    public String getSellername(){
        return sellername;
    }
	
    /**
     * 属性 sellername 的set方法
     * @return
     */
    public void setSellername(String sellername){
        this.sellername = sellername;
    } 
	
    /**
     * 属性 purchasername 的get方法
     * @return String
     */
    public String getPurchasername(){
        return purchasername;
    }
	
    /**
     * 属性 purchasername 的set方法
     * @return
     */
    public void setPurchasername(String purchasername){
        this.purchasername = purchasername;
    } 
	
    /**
     * 属性 transmissionname 的get方法
     * @return String
     */
    public String getTransmissionname(){
        return transmissionname;
    }
	
    /**
     * 属性 transmissionname 的set方法
     * @return
     */
    public void setTransmissionname(String transmissionname){
        this.transmissionname = transmissionname;
    } 
	
    /**
     * 属性 contractquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractquantity(){
        return contractquantity;
    }
	
    /**
     * 属性 contractquantity 的set方法
     * @return
     */
    public void setContractquantity(BigDecimal contractquantity){
        this.contractquantity = contractquantity;
    } 
	
    /**
     * 属性 contractstarttime 的get方法
     * @return String
     */
    public String getContractstarttime(){
        return contractstarttime;
    }
	
    /**
     * 属性 contractstarttime 的set方法
     * @return
     */
    public void setContractstarttime(String contractstarttime){
        this.contractstarttime = contractstarttime;
    } 
	
    /**
     * 属性 contractendtime 的get方法
     * @return String
     */
    public String getContractendtime(){
        return contractendtime;
    }
	
    /**
     * 属性 contractendtime 的set方法
     * @return
     */
    public void setContractendtime(String contractendtime){
        this.contractendtime = contractendtime;
    } 
	
    /**
     * 属性 dispatchcompanyname 的get方法
     * @return String
     */
    public String getDispatchcompanyname(){
        return dispatchcompanyname;
    }
	
    /**
     * 属性 dispatchcompanyname 的set方法
     * @return
     */
    public void setDispatchcompanyname(String dispatchcompanyname){
        this.dispatchcompanyname = dispatchcompanyname;
    } 
	
    
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcDdLshtdliang))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdLshtdliang other = (SjjcDdLshtdliang) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("companyname"+":"+getCompanyname())
            .append("companyid"+":"+getCompanyid())
            .append("contractname"+":"+getContractname())
            .append("sellername"+":"+getSellername())
            .append("purchasername"+":"+getPurchasername())
            .append("transmissionname"+":"+getTransmissionname())
            .append("contractquantity"+":"+getContractquantity())
            .append("contractstarttime"+":"+getContractstarttime())
            .append("contractendtime"+":"+getContractendtime())
            .append("dispatchcompanyname"+":"+getDispatchcompanyname())
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