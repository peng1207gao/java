package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxMbFjmj的POJO类
 *
 * @author  ASUS  [Sun Mar 16 10:45:23 CST 2014]
 * 
 */
public class SjjcYxMbFjmj implements Serializable{

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
     * 属性codeId
     */
    private BigDecimal codeId;
	
    /** 
     * 属性codeSortId
     */
    private BigDecimal codeSortId;
	
    /** 
     * 属性pcode
     */
    private String pcode;
	
    /** 
     * 属性codeType
     */
    private String codeType;
	
    /** 
     * 属性orgNo
     */
    private String orgNo;
	
    /** 
     * 属性value
     */
    private String value;
	
    /** 
     * 属性name
     */
    private String name;
	
    /** 
     * 属性dispSn
     */
    private BigDecimal dispSn;
	
    /** 
     * 属性content1
     */
    private String content1;
	
    /** 
     * 属性content2
     */
    private String content2;
	
    /** 
     * 属性content3
     */
    private String content3;
	
    /** 
     * 属性content4
     */
    private String content4;
	
    /** 
     * 属性content5
     */
    private String content5;
	
    /**
     * SjjcYxMbFjmj构造函数
     */
    public SjjcYxMbFjmj() {
        super();
    }  
	
    /**
     * SjjcYxMbFjmj完整的构造函数
     */  
    public SjjcYxMbFjmj(String objId,String companyname,String companyid,String provincename,String provinceid,BigDecimal codeId,BigDecimal codeSortId){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.codeId = codeId;
        this.codeSortId = codeSortId;
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
     * 属性 codeId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCodeId(){
        return codeId;
    }
	
    /**
     * 属性 codeId 的set方法
     * @return
     */
    public void setCodeId(BigDecimal codeId){
        this.codeId = codeId;
    } 
	
    /**
     * 属性 codeSortId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCodeSortId(){
        return codeSortId;
    }
	
    /**
     * 属性 codeSortId 的set方法
     * @return
     */
    public void setCodeSortId(BigDecimal codeSortId){
        this.codeSortId = codeSortId;
    } 
	
    /**
     * 属性 pcode 的get方法
     * @return String
     */
    public String getPcode(){
        return pcode;
    }
	
    /**
     * 属性 pcode 的set方法
     * @return
     */
    public void setPcode(String pcode){
        this.pcode = pcode;
    } 
	
    /**
     * 属性 codeType 的get方法
     * @return String
     */
    public String getCodeType(){
        return codeType;
    }
	
    /**
     * 属性 codeType 的set方法
     * @return
     */
    public void setCodeType(String codeType){
        this.codeType = codeType;
    } 
	
    /**
     * 属性 orgNo 的get方法
     * @return String
     */
    public String getOrgNo(){
        return orgNo;
    }
	
    /**
     * 属性 orgNo 的set方法
     * @return
     */
    public void setOrgNo(String orgNo){
        this.orgNo = orgNo;
    } 
	
    /**
     * 属性 value 的get方法
     * @return String
     */
    public String getValue(){
        return value;
    }
	
    /**
     * 属性 value 的set方法
     * @return
     */
    public void setValue(String value){
        this.value = value;
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
     * 属性 content1 的get方法
     * @return String
     */
    public String getContent1(){
        return content1;
    }
	
    /**
     * 属性 content1 的set方法
     * @return
     */
    public void setContent1(String content1){
        this.content1 = content1;
    } 
	
    /**
     * 属性 content2 的get方法
     * @return String
     */
    public String getContent2(){
        return content2;
    }
	
    /**
     * 属性 content2 的set方法
     * @return
     */
    public void setContent2(String content2){
        this.content2 = content2;
    } 
	
    /**
     * 属性 content3 的get方法
     * @return String
     */
    public String getContent3(){
        return content3;
    }
	
    /**
     * 属性 content3 的set方法
     * @return
     */
    public void setContent3(String content3){
        this.content3 = content3;
    } 
	
    /**
     * 属性 content4 的get方法
     * @return String
     */
    public String getContent4(){
        return content4;
    }
	
    /**
     * 属性 content4 的set方法
     * @return
     */
    public void setContent4(String content4){
        this.content4 = content4;
    } 
	
    /**
     * 属性 content5 的get方法
     * @return String
     */
    public String getContent5(){
        return content5;
    }
	
    /**
     * 属性 content5 的set方法
     * @return
     */
    public void setContent5(String content5){
        this.content5 = content5;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxMbFjmj))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxMbFjmj other = (SjjcYxMbFjmj) o;	        
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
            .append("codeId"+":"+getCodeId())
            .append("codeSortId"+":"+getCodeSortId())
            .append("pcode"+":"+getPcode())
            .append("codeType"+":"+getCodeType())
            .append("orgNo"+":"+getOrgNo())
            .append("value"+":"+getValue())
            .append("name"+":"+getName())
            .append("dispSn"+":"+getDispSn())
            .append("content1"+":"+getContent1())
            .append("content2"+":"+getContent2())
            .append("content3"+":"+getContent3())
            .append("content4"+":"+getContent4())
            .append("content5"+":"+getContent5())
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