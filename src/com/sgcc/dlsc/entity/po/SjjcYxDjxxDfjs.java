package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxDjxxDfjs的POJO类
 *
 * @author  Administrator  [Sun Mar 16 16:33:03 CST 2014]
 * 
 */
public class SjjcYxDjxxDfjs implements Serializable{

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
     * 属性paraVn
     */
    private BigDecimal paraVn;
	
    /** 
     * 属性appNo
     */
    private String appNo;
	
    /** 
     * 属性parVerType
     */
    private String parVerType;
	
    /** 
     * 属性parBgnDate
     */
    private Date parBgnDate;
	
    /** 
     * 属性parEndDate
     */
    private Date parEndDate;
	
    /** 
     * 属性docNo
     */
    private String docNo;
	
    /** 
     * 属性brief
     */
    private String brief;
	
    /** 
     * 属性releaseFlag
     */
    private String releaseFlag;
	
    /** 
     * 属性releaseDate
     */
    private Date releaseDate;
	
    /**
     * SjjcYxDjxxDfjs构造函数
     */
    public SjjcYxDjxxDfjs() {
        super();
    }  
	
    /**
     * SjjcYxDjxxDfjs完整的构造函数
     */  
    public SjjcYxDjxxDfjs(String objId,String companyname,String companyid,String provincename,BigDecimal paraVn,String appNo){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.paraVn = paraVn;
        this.appNo = appNo;
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
     * 属性 paraVn 的get方法
     * @return BigDecimal
     */
    public BigDecimal getParaVn(){
        return paraVn;
    }
	
    /**
     * 属性 paraVn 的set方法
     * @return
     */
    public void setParaVn(BigDecimal paraVn){
        this.paraVn = paraVn;
    } 
	
    /**
     * 属性 appNo 的get方法
     * @return String
     */
    public String getAppNo(){
        return appNo;
    }
	
    /**
     * 属性 appNo 的set方法
     * @return
     */
    public void setAppNo(String appNo){
        this.appNo = appNo;
    } 
	
    /**
     * 属性 parVerType 的get方法
     * @return String
     */
    public String getParVerType(){
        return parVerType;
    }
	
    /**
     * 属性 parVerType 的set方法
     * @return
     */
    public void setParVerType(String parVerType){
        this.parVerType = parVerType;
    } 
	
    /**
     * 属性 parBgnDate 的get方法
     * @return Date
     */
    public Date getParBgnDate(){
        return parBgnDate;
    }
	
    /**
     * 属性 parBgnDate 的set方法
     * @return
     */
    public void setParBgnDate(Date parBgnDate){
        this.parBgnDate = parBgnDate;
    } 
	
    /**
     * 属性 parEndDate 的get方法
     * @return Date
     */
    public Date getParEndDate(){
        return parEndDate;
    }
	
    /**
     * 属性 parEndDate 的set方法
     * @return
     */
    public void setParEndDate(Date parEndDate){
        this.parEndDate = parEndDate;
    } 
	
    /**
     * 属性 docNo 的get方法
     * @return String
     */
    public String getDocNo(){
        return docNo;
    }
	
    /**
     * 属性 docNo 的set方法
     * @return
     */
    public void setDocNo(String docNo){
        this.docNo = docNo;
    } 
	
    /**
     * 属性 brief 的get方法
     * @return String
     */
    public String getBrief(){
        return brief;
    }
	
    /**
     * 属性 brief 的set方法
     * @return
     */
    public void setBrief(String brief){
        this.brief = brief;
    } 
	
    /**
     * 属性 releaseFlag 的get方法
     * @return String
     */
    public String getReleaseFlag(){
        return releaseFlag;
    }
	
    /**
     * 属性 releaseFlag 的set方法
     * @return
     */
    public void setReleaseFlag(String releaseFlag){
        this.releaseFlag = releaseFlag;
    } 
	
    /**
     * 属性 releaseDate 的get方法
     * @return Date
     */
    public Date getReleaseDate(){
        return releaseDate;
    }
	
    /**
     * 属性 releaseDate 的set方法
     * @return
     */
    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxDjxxDfjs))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxDjxxDfjs other = (SjjcYxDjxxDfjs) o;	        
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
            .append("paraVn"+":"+getParaVn())
            .append("appNo"+":"+getAppNo())
            .append("parVerType"+":"+getParVerType())
            .append("parBgnDate"+":"+getParBgnDate())
            .append("parEndDate"+":"+getParEndDate())
            .append("docNo"+":"+getDocNo())
            .append("brief"+":"+getBrief())
            .append("releaseFlag"+":"+getReleaseFlag())
            .append("releaseDate"+":"+getReleaseDate())
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