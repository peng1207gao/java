package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaWithparam的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:37:46 CST 2013]
 * 
 */
public class BaWithparam implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

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
     * 属性batemplatecode
     */
    private String batemplatecode;
	
    /** 
     * 属性batemplatename
     */
    private String batemplatename;
	
    /** 
     * 属性batemplatefile
     */
    private byte[] batemplatefile;
	
    /** 
     * 属性version
     */
    private BigDecimal version;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性isshare
     */
    private BigDecimal isshare;
	
    /** 
     * 属性descreption
     */
    private String descreption;
	
    /**
     * BaWithparam构造函数
     */
    public BaWithparam() {
        super();
    }  
	
    /**
     * BaWithparam完整的构造函数
     */  
    public BaWithparam(String guid,String marketid,String batemplatecode){
        this.guid = guid;
        this.marketid = marketid;
        this.batemplatecode = batemplatecode;
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
     * 属性 batemplatefile 的get方法
     * @return byte[]
     */
    public byte[] getBatemplatefile(){
        return batemplatefile;
    }
	
    /**
     * 属性 batemplatefile 的set方法
     * @return
     */
    public void setBatemplatefile(byte[] batemplatefile){
        this.batemplatefile = batemplatefile;
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
     * 属性 isshare 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsshare(){
        return isshare;
    }
	
    /**
     * 属性 isshare 的set方法
     * @return
     */
    public void setIsshare(BigDecimal isshare){
        this.isshare = isshare;
    } 
	
    /**
     * 属性 descreption 的get方法
     * @return String
     */
    public String getDescreption(){
        return descreption;
    }
	
    /**
     * 属性 descreption 的set方法
     * @return
     */
    public void setDescreption(String descreption){
        this.descreption = descreption;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaWithparam))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaWithparam other = (BaWithparam) o;	        
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
            .append("batemplatecode"+":"+getBatemplatecode())
            .append("batemplatename"+":"+getBatemplatename())
            .append("batemplatefile"+":"+getBatemplatefile())
            .append("version"+":"+getVersion())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("isshare"+":"+getIsshare())
            .append("descreption"+":"+getDescreption())
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