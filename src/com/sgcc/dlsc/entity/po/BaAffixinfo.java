package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaAffixinfo的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:25:42 CST 2013]
 * 
 */
public class BaAffixinfo implements Serializable{

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
     * 属性baid
     */
    private String baid;
	
    /** 
     * 属性affixno
     */
    private BigDecimal affixno;
	
    /** 
     * 属性affixname
     */
    private String affixname;
	
    /** 
     * 属性paperfile
     */
    private byte[] paperfile;
	
    /** 
     * 属性uploadperson
     */
    private String uploadperson;
	
    /** 
     * 属性uploadtime
     */
    private Date uploadtime;
	
    /**
     * BaAffixinfo构造函数
     */
    public BaAffixinfo() {
        super();
    }  
	
    /**
     * BaAffixinfo完整的构造函数
     */  
    public BaAffixinfo(String guid,String marketid,String baid,BigDecimal affixno,String affixname){
        this.guid = guid;
        this.marketid = marketid;
        this.baid = baid;
        this.affixno = affixno;
        this.affixname = affixname;
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
     * 属性 baid 的get方法
     * @return String
     */
    public String getBaid(){
        return baid;
    }
	
    /**
     * 属性 baid 的set方法
     * @return
     */
    public void setBaid(String baid){
        this.baid = baid;
    } 
	
    /**
     * 属性 affixno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAffixno(){
        return affixno;
    }
	
    /**
     * 属性 affixno 的set方法
     * @return
     */
    public void setAffixno(BigDecimal affixno){
        this.affixno = affixno;
    } 
	
    /**
     * 属性 affixname 的get方法
     * @return String
     */
    public String getAffixname(){
        return affixname;
    }
	
    /**
     * 属性 affixname 的set方法
     * @return
     */
    public void setAffixname(String affixname){
        this.affixname = affixname;
    } 
	
    /**
     * 属性 paperfile 的get方法
     * @return byte[]
     */
    public byte[] getPaperfile(){
        return paperfile;
    }
	
    /**
     * 属性 paperfile 的set方法
     * @return
     */
    public void setPaperfile(byte[] paperfile){
        this.paperfile = paperfile;
    } 
	
    /**
     * 属性 uploadperson 的get方法
     * @return String
     */
    public String getUploadperson(){
        return uploadperson;
    }
	
    /**
     * 属性 uploadperson 的set方法
     * @return
     */
    public void setUploadperson(String uploadperson){
        this.uploadperson = uploadperson;
    } 
	
    /**
     * 属性 uploadtime 的get方法
     * @return Date
     */
    public Date getUploadtime(){
        return uploadtime;
    }
	
    /**
     * 属性 uploadtime 的set方法
     * @return
     */
    public void setUploadtime(Date uploadtime){
        this.uploadtime = uploadtime;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaAffixinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaAffixinfo other = (BaAffixinfo) o;	        
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
            .append("baid"+":"+getBaid())
            .append("affixno"+":"+getAffixno())
            .append("affixname"+":"+getAffixname())
            .append("paperfile"+":"+getPaperfile())
            .append("uploadperson"+":"+getUploadperson())
            .append("uploadtime"+":"+getUploadtime())
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