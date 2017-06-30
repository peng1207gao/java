package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxDjxxJszz的POJO类
 *
 * @author  ASUS  [Sat Mar 15 15:48:24 CST 2014]
 * 
 */
public class SjjcYxDjxxJszz implements Serializable{

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
     * 属性provincename
     */
    private String provincename;
	
    /** 
     * 属性provinceid
     */
    private String provinceid;
	
    /** 
     * 属性addedPrcId
     */
    private BigDecimal addedPrcId;
	
    /** 
     * 属性detId
     */
    private BigDecimal detId;
	
    /** 
     * 属性plCode
     */
    private String plCode;
	
    /** 
     * 属性plAbbr
     */
    private String plAbbr;
	
    /** 
     * 属性plName
     */
    private String plName;
	
    /** 
     * 属性plPrc
     */
    private BigDecimal plPrc;
	
    /** 
     * 属性prcIoFlag
     */
    private String prcIoFlag;
	
    /** 
     * 属性dispSn
     */
    private BigDecimal dispSn;
	
    /** 
     * 属性iduFlag
     */
    private String iduFlag;
	
    /**
     * SjjcYxDjxxJszz构造函数
     */
    public SjjcYxDjxxJszz() {
        super();
    }  
	
    /**
     * SjjcYxDjxxJszz完整的构造函数
     */  
    public SjjcYxDjxxJszz(String objId,String companyname,String companyid,String provincename,String provinceid,BigDecimal addedPrcId,BigDecimal detId,String plName,BigDecimal plPrc){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.addedPrcId = addedPrcId;
        this.detId = detId;
        this.plName = plName;
        this.plPrc = plPrc;
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
     * 属性 provincename 的get方法
     * @return String
     */
    public String getProvincename(){
        return provincename;
    }
	
    /**
     * 属性 provincename 的set方法
     * @return
     */
    public void setProvincename(String provincename){
        this.provincename = provincename;
    } 
	
    /**
     * 属性 provinceid 的get方法
     * @return String
     */
    public String getProvinceid(){
        return provinceid;
    }
	
    /**
     * 属性 provinceid 的set方法
     * @return
     */
    public void setProvinceid(String provinceid){
        this.provinceid = provinceid;
    } 
	
    /**
     * 属性 addedPrcId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAddedPrcId(){
        return addedPrcId;
    }
	
    /**
     * 属性 addedPrcId 的set方法
     * @return
     */
    public void setAddedPrcId(BigDecimal addedPrcId){
        this.addedPrcId = addedPrcId;
    } 
	
    /**
     * 属性 detId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDetId(){
        return detId;
    }
	
    /**
     * 属性 detId 的set方法
     * @return
     */
    public void setDetId(BigDecimal detId){
        this.detId = detId;
    } 
	
    /**
     * 属性 plCode 的get方法
     * @return String
     */
    public String getPlCode(){
        return plCode;
    }
	
    /**
     * 属性 plCode 的set方法
     * @return
     */
    public void setPlCode(String plCode){
        this.plCode = plCode;
    } 
	
    /**
     * 属性 plAbbr 的get方法
     * @return String
     */
    public String getPlAbbr(){
        return plAbbr;
    }
	
    /**
     * 属性 plAbbr 的set方法
     * @return
     */
    public void setPlAbbr(String plAbbr){
        this.plAbbr = plAbbr;
    } 
	
    /**
     * 属性 plName 的get方法
     * @return String
     */
    public String getPlName(){
        return plName;
    }
	
    /**
     * 属性 plName 的set方法
     * @return
     */
    public void setPlName(String plName){
        this.plName = plName;
    } 
	
    /**
     * 属性 plPrc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlPrc(){
        return plPrc;
    }
	
    /**
     * 属性 plPrc 的set方法
     * @return
     */
    public void setPlPrc(BigDecimal plPrc){
        this.plPrc = plPrc;
    } 
	
    /**
     * 属性 prcIoFlag 的get方法
     * @return String
     */
    public String getPrcIoFlag(){
        return prcIoFlag;
    }
	
    /**
     * 属性 prcIoFlag 的set方法
     * @return
     */
    public void setPrcIoFlag(String prcIoFlag){
        this.prcIoFlag = prcIoFlag;
    } 
	
    /**
     * 属性 dispSn 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDispSn(){
        return dispSn;
    }
	
    /**
     * 属性 dispSn 的set方法
     * @return
     */
    public void setDispSn(BigDecimal dispSn){
        this.dispSn = dispSn;
    } 
	
    /**
     * 属性 iduFlag 的get方法
     * @return String
     */
    public String getIduFlag(){
        return iduFlag;
    }
	
    /**
     * 属性 iduFlag 的set方法
     * @return
     */
    public void setIduFlag(String iduFlag){
        this.iduFlag = iduFlag;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxDjxxJszz))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxDjxxJszz other = (SjjcYxDjxxJszz) o;	        
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
            .append("provincename"+":"+getProvincename())
            .append("provinceid"+":"+getProvinceid())
            .append("addedPrcId"+":"+getAddedPrcId())
            .append("detId"+":"+getDetId())
            .append("plCode"+":"+getPlCode())
            .append("plAbbr"+":"+getPlAbbr())
            .append("plName"+":"+getPlName())
            .append("plPrc"+":"+getPlPrc())
            .append("prcIoFlag"+":"+getPrcIoFlag())
            .append("dispSn"+":"+getDispSn())
            .append("iduFlag"+":"+getIduFlag())
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