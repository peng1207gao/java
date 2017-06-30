package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxDjxxMlmx的POJO类
 *
 * @author  ASUS  [Sat Mar 15 10:26:07 CST 2014]
 * 
 */
public class SjjcYxDjxxMlmx implements Serializable{

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
     * 属性detId
     */
    private BigDecimal detId;
	
    /** 
     * 属性catPrcId
     */
    private BigDecimal catPrcId;
	
    /** 
     * 属性rangeTypeCode
     */
    private String rangeTypeCode;
	
    /** 
     * 属性catKwhPrc
     */
    private BigDecimal catKwhPrc;
	
    /** 
     * 属性kwhPrc
     */
    private BigDecimal kwhPrc;
	
    /** 
     * 属性prcTiCode
     */
    private String prcTiCode;
	
    /** 
     * 属性refTsFlag
     */
    private String refTsFlag;
	
    /** 
     * 属性iduFlag
     */
    private String iduFlag;
	
    /**
     * SjjcYxDjxxMlmx构造函数
     */
    public SjjcYxDjxxMlmx() {
        super();
    }  
	
    /**
     * SjjcYxDjxxMlmx完整的构造函数
     */  
    public SjjcYxDjxxMlmx(String objId,String companyname,String companyid,String provincename,String provinceid,BigDecimal detId,BigDecimal catPrcId,BigDecimal catKwhPrc,BigDecimal kwhPrc,String prcTiCode,String refTsFlag){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.detId = detId;
        this.catPrcId = catPrcId;
        this.catKwhPrc = catKwhPrc;
        this.kwhPrc = kwhPrc;
        this.prcTiCode = prcTiCode;
        this.refTsFlag = refTsFlag;
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
     * 属性 catPrcId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCatPrcId(){
        return catPrcId;
    }
	
    /**
     * 属性 catPrcId 的set方法
     * @return
     */
    public void setCatPrcId(BigDecimal catPrcId){
        this.catPrcId = catPrcId;
    } 
	
    /**
     * 属性 rangeTypeCode 的get方法
     * @return String
     */
    public String getRangeTypeCode(){
        return rangeTypeCode;
    }
	
    /**
     * 属性 rangeTypeCode 的set方法
     * @return
     */
    public void setRangeTypeCode(String rangeTypeCode){
        this.rangeTypeCode = rangeTypeCode;
    } 
	
    /**
     * 属性 catKwhPrc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCatKwhPrc(){
        return catKwhPrc;
    }
	
    /**
     * 属性 catKwhPrc 的set方法
     * @return
     */
    public void setCatKwhPrc(BigDecimal catKwhPrc){
        this.catKwhPrc = catKwhPrc;
    } 
	
    /**
     * 属性 kwhPrc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getKwhPrc(){
        return kwhPrc;
    }
	
    /**
     * 属性 kwhPrc 的set方法
     * @return
     */
    public void setKwhPrc(BigDecimal kwhPrc){
        this.kwhPrc = kwhPrc;
    } 
	
    /**
     * 属性 prcTiCode 的get方法
     * @return String
     */
    public String getPrcTiCode(){
        return prcTiCode;
    }
	
    /**
     * 属性 prcTiCode 的set方法
     * @return
     */
    public void setPrcTiCode(String prcTiCode){
        this.prcTiCode = prcTiCode;
    } 
	
    /**
     * 属性 refTsFlag 的get方法
     * @return String
     */
    public String getRefTsFlag(){
        return refTsFlag;
    }
	
    /**
     * 属性 refTsFlag 的set方法
     * @return
     */
    public void setRefTsFlag(String refTsFlag){
        this.refTsFlag = refTsFlag;
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
		
        if (o == null || !(o instanceof SjjcYxDjxxMlmx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxDjxxMlmx other = (SjjcYxDjxxMlmx) o;	        
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
            .append("detId"+":"+getDetId())
            .append("catPrcId"+":"+getCatPrcId())
            .append("rangeTypeCode"+":"+getRangeTypeCode())
            .append("catKwhPrc"+":"+getCatKwhPrc())
            .append("kwhPrc"+":"+getKwhPrc())
            .append("prcTiCode"+":"+getPrcTiCode())
            .append("refTsFlag"+":"+getRefTsFlag())
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