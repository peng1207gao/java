package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxDjxxMldj的POJO类
 *
 * @author  ASUS  [Fri Mar 14 11:25:26 CST 2014]
 * 
 */
public class SjjcYxDjxxMldj implements Serializable{

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
     * 属性catPrcId
     */
    private BigDecimal catPrcId;
	
    /** 
     * 属性paraVn
     */
    private BigDecimal paraVn;
	
    /** 
     * 属性prcCode
     */
    private String prcCode;
	
    /** 
     * 属性orgNo
     */
    private String orgNo;
	
    /** 
     * 属性prcVoltCode
     */
    private String prcVoltCode;
	
    /** 
     * 属性discMode
     */
    private String discMode;
	
    /** 
     * 属性catPrcAbbr
     */
    private String catPrcAbbr;
	
    /** 
     * 属性catPrcName
     */
    private String catPrcName;
	
    /** 
     * 属性rangeFlag
     */
    private String rangeFlag;
	
    /** 
     * 属性tsNum
     */
    private BigDecimal tsNum;
	
    /** 
     * 属性elecTypeCode
     */
    private String elecTypeCode;
	
    /** 
     * 属性pfQtyFlag
     */
    private String pfQtyFlag;
	
    /** 
     * 属性pfaaFlag
     */
    private String pfaaFlag;
	
    /** 
     * 属性iduFlag
     */
    private String iduFlag;
	
    /** 
     * 属性maintModeCode
     */
    private String maintModeCode;
	
    /**
     * SjjcYxDjxxMldj构造函数
     */
    public SjjcYxDjxxMldj() {
        super();
    }  
	
    /**
     * SjjcYxDjxxMldj完整的构造函数
     */  
    public SjjcYxDjxxMldj(String objId,String companyname,String companyid,String provincename,BigDecimal catPrcId,BigDecimal paraVn,String prcCode,String orgNo,String prcVoltCode,String catPrcAbbr,String catPrcName,String rangeFlag,BigDecimal tsNum,String elecTypeCode,String pfQtyFlag,String pfaaFlag){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.catPrcId = catPrcId;
        this.paraVn = paraVn;
        this.prcCode = prcCode;
        this.orgNo = orgNo;
        this.prcVoltCode = prcVoltCode;
        this.catPrcAbbr = catPrcAbbr;
        this.catPrcName = catPrcName;
        this.rangeFlag = rangeFlag;
        this.tsNum = tsNum;
        this.elecTypeCode = elecTypeCode;
        this.pfQtyFlag = pfQtyFlag;
        this.pfaaFlag = pfaaFlag;
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
     * 属性 prcCode 的get方法
     * @return String
     */
    public String getPrcCode(){
        return prcCode;
    }
	
    /**
     * 属性 prcCode 的set方法
     * @return
     */
    public void setPrcCode(String prcCode){
        this.prcCode = prcCode;
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
     * 属性 prcVoltCode 的get方法
     * @return String
     */
    public String getPrcVoltCode(){
        return prcVoltCode;
    }
	
    /**
     * 属性 prcVoltCode 的set方法
     * @return
     */
    public void setPrcVoltCode(String prcVoltCode){
        this.prcVoltCode = prcVoltCode;
    } 
	
    /**
     * 属性 discMode 的get方法
     * @return String
     */
    public String getDiscMode(){
        return discMode;
    }
	
    /**
     * 属性 discMode 的set方法
     * @return
     */
    public void setDiscMode(String discMode){
        this.discMode = discMode;
    } 
	
    /**
     * 属性 catPrcAbbr 的get方法
     * @return String
     */
    public String getCatPrcAbbr(){
        return catPrcAbbr;
    }
	
    /**
     * 属性 catPrcAbbr 的set方法
     * @return
     */
    public void setCatPrcAbbr(String catPrcAbbr){
        this.catPrcAbbr = catPrcAbbr;
    } 
	
    /**
     * 属性 catPrcName 的get方法
     * @return String
     */
    public String getCatPrcName(){
        return catPrcName;
    }
	
    /**
     * 属性 catPrcName 的set方法
     * @return
     */
    public void setCatPrcName(String catPrcName){
        this.catPrcName = catPrcName;
    } 
	
    /**
     * 属性 rangeFlag 的get方法
     * @return String
     */
    public String getRangeFlag(){
        return rangeFlag;
    }
	
    /**
     * 属性 rangeFlag 的set方法
     * @return
     */
    public void setRangeFlag(String rangeFlag){
        this.rangeFlag = rangeFlag;
    } 
	
    /**
     * 属性 tsNum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTsNum(){
        return tsNum;
    }
	
    /**
     * 属性 tsNum 的set方法
     * @return
     */
    public void setTsNum(BigDecimal tsNum){
        this.tsNum = tsNum;
    } 
	
    /**
     * 属性 elecTypeCode 的get方法
     * @return String
     */
    public String getElecTypeCode(){
        return elecTypeCode;
    }
	
    /**
     * 属性 elecTypeCode 的set方法
     * @return
     */
    public void setElecTypeCode(String elecTypeCode){
        this.elecTypeCode = elecTypeCode;
    } 
	
    /**
     * 属性 pfQtyFlag 的get方法
     * @return String
     */
    public String getPfQtyFlag(){
        return pfQtyFlag;
    }
	
    /**
     * 属性 pfQtyFlag 的set方法
     * @return
     */
    public void setPfQtyFlag(String pfQtyFlag){
        this.pfQtyFlag = pfQtyFlag;
    } 
	
    /**
     * 属性 pfaaFlag 的get方法
     * @return String
     */
    public String getPfaaFlag(){
        return pfaaFlag;
    }
	
    /**
     * 属性 pfaaFlag 的set方法
     * @return
     */
    public void setPfaaFlag(String pfaaFlag){
        this.pfaaFlag = pfaaFlag;
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
     * 属性 maintModeCode 的get方法
     * @return String
     */
    public String getMaintModeCode(){
        return maintModeCode;
    }
	
    /**
     * 属性 maintModeCode 的set方法
     * @return
     */
    public void setMaintModeCode(String maintModeCode){
        this.maintModeCode = maintModeCode;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxDjxxMldj))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxDjxxMldj other = (SjjcYxDjxxMldj) o;	        
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
            .append("catPrcId"+":"+getCatPrcId())
            .append("paraVn"+":"+getParaVn())
            .append("prcCode"+":"+getPrcCode())
            .append("orgNo"+":"+getOrgNo())
            .append("prcVoltCode"+":"+getPrcVoltCode())
            .append("discMode"+":"+getDiscMode())
            .append("catPrcAbbr"+":"+getCatPrcAbbr())
            .append("catPrcName"+":"+getCatPrcName())
            .append("rangeFlag"+":"+getRangeFlag())
            .append("tsNum"+":"+getTsNum())
            .append("elecTypeCode"+":"+getElecTypeCode())
            .append("pfQtyFlag"+":"+getPfQtyFlag())
            .append("pfaaFlag"+":"+getPfaaFlag())
            .append("iduFlag"+":"+getIduFlag())
            .append("maintModeCode"+":"+getMaintModeCode())
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