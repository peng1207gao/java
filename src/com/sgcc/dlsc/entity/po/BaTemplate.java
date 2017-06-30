package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaTemplate的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:36:13 CST 2013]
 * 
 */
public class BaTemplate implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 2641723017066109390L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性batype
     */
    private String batype;
	
    /** 
     * 属性batemplateid
     */
    private String batemplateid;
	
    /** 
     * 属性batemplatecode
     */
    private String batemplatecode;
	
    /** 
     * 属性batemplatename
     */
    private String batemplatename;
	
    /** 
     * 属性version
     */
    private BigDecimal version;
	
    /** 
     * 属性issueddate
     */
    private Date issueddate;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性effectiveflag
     */
    private BigDecimal effectiveflag;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /**
     * BaTemplate构造函数
     */
    public BaTemplate() {
        super();
    }  
	
    /**
     * BaTemplate完整的构造函数
     */  
    public BaTemplate(String guid,String marketid,String batemplateid){
        this.guid = guid;
        this.marketid = marketid;
        this.batemplateid = batemplateid;
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
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 batype 的get方法
     * @return String
     */
    public String getBatype(){
        return batype;
    }
	
    /**
     * 属性 batype 的set方法
     * @return
     */
    public void setBatype(String batype){
        this.batype = batype;
    } 
	
    /**
     * 属性 batemplateid 的get方法
     * @return String
     */
    public String getBatemplateid(){
        return batemplateid;
    }
	
    /**
     * 属性 batemplateid 的set方法
     * @return
     */
    public void setBatemplateid(String batemplateid){
        this.batemplateid = batemplateid;
    } 
	
    /**
     * 属性 batemplatecode 的get方法
     * @return String
     */
    public String getBatemplatecode(){
        return batemplatecode;
    }
	
    /**
     * 属性 batemplatecode 的set方法
     * @return
     */
    public void setBatemplatecode(String batemplatecode){
        this.batemplatecode = batemplatecode;
    } 
	
    /**
     * 属性 batemplatename 的get方法
     * @return String
     */
    public String getBatemplatename(){
        return batemplatename;
    }
	
    /**
     * 属性 batemplatename 的set方法
     * @return
     */
    public void setBatemplatename(String batemplatename){
        this.batemplatename = batemplatename;
    } 
	
    /**
     * 属性 version 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(BigDecimal version){
        this.version = version;
    } 
	
    /**
     * 属性 issueddate 的get方法
     * @return Date
     */
    public Date getIssueddate(){
        return issueddate;
    }
	
    /**
     * 属性 issueddate 的set方法
     * @return
     */
    public void setIssueddate(Date issueddate){
        this.issueddate = issueddate;
    } 
	
    /**
     * 属性 starteffectivedate 的get方法
     * @return Date
     */
    public Date getStarteffectivedate(){
        return starteffectivedate;
    }
	
    /**
     * 属性 starteffectivedate 的set方法
     * @return
     */
    public void setStarteffectivedate(Date starteffectivedate){
        this.starteffectivedate = starteffectivedate;
    } 
	
    /**
     * 属性 endeffectivedate 的get方法
     * @return Date
     */
    public Date getEndeffectivedate(){
        return endeffectivedate;
    }
	
    /**
     * 属性 endeffectivedate 的set方法
     * @return
     */
    public void setEndeffectivedate(Date endeffectivedate){
        this.endeffectivedate = endeffectivedate;
    } 
	
    /**
     * 属性 effectiveflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEffectiveflag(){
        return effectiveflag;
    }
	
    /**
     * 属性 effectiveflag 的set方法
     * @return
     */
    public void setEffectiveflag(BigDecimal effectiveflag){
        this.effectiveflag = effectiveflag;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaTemplate))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaTemplate other = (BaTemplate) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("batype"+":"+getBatype())
            .append("batemplateid"+":"+getBatemplateid())
            .append("batemplatecode"+":"+getBatemplatecode())
            .append("batemplatename"+":"+getBatemplatename())
            .append("version"+":"+getVersion())
            .append("issueddate"+":"+getIssueddate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("effectiveflag"+":"+getEffectiveflag())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
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