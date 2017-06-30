package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaMapping的POJO类
 *
 * @author  Administrator  [Thu Jul 04 10:35:28 CST 2013]
 * 
 */
public class BaMapping implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性plantid
     */
    private String plantid;
	
    /** 
     * 属性hxsjid
     */
    private String hxsjid;
	
    /** 
     * 属性busiunitid
     */
    private String busiunitid;
	
    /** 
     * 属性elecid
     */
    private String elecid;
	
    /** 
     * 属性hxsjtype
     */
    private BigDecimal hxsjtype;
	
    /**
     * BaMapping构造函数
     */
    public BaMapping() {
        super();
    }  
	
    /**
     * BaMapping完整的构造函数
     */  
    public BaMapping(String guid,String marketcode){
        this.guid = guid;
        this.marketcode = marketcode;
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
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
    } 
	
    /**
     * 属性 plantid 的get方法
     * @return String
     */
    public String getPlantid(){
        return plantid;
    }
	
    /**
     * 属性 plantid 的set方法
     * @return
     */
    public void setPlantid(String plantid){
        this.plantid = plantid;
    } 
	
    /**
     * 属性 hxsjid 的get方法
     * @return String
     */
    public String getHxsjid(){
        return hxsjid;
    }
	
    /**
     * 属性 hxsjid 的set方法
     * @return
     */
    public void setHxsjid(String hxsjid){
        this.hxsjid = hxsjid;
    } 
	
    /**
     * 属性 busiunitid 的get方法
     * @return String
     */
    public String getBusiunitid(){
        return busiunitid;
    }
	
    /**
     * 属性 busiunitid 的set方法
     * @return
     */
    public void setBusiunitid(String busiunitid){
        this.busiunitid = busiunitid;
    } 
	
    /**
     * 属性 elecid 的get方法
     * @return String
     */
    public String getElecid(){
        return elecid;
    }
	
    /**
     * 属性 elecid 的set方法
     * @return
     */
    public void setElecid(String elecid){
        this.elecid = elecid;
    } 
	
    /**
     * 属性 hxsjtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHxsjtype(){
        return hxsjtype;
    }
	
    /**
     * 属性 hxsjtype 的set方法
     * @return
     */
    public void setHxsjtype(BigDecimal hxsjtype){
        this.hxsjtype = hxsjtype;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaMapping))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaMapping other = (BaMapping) o;	        
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
            .append("marketcode"+":"+getMarketcode())
            .append("plantid"+":"+getPlantid())
            .append("hxsjid"+":"+getHxsjid())
            .append("busiunitid"+":"+getBusiunitid())
            .append("elecid"+":"+getElecid())
            .append("hxsjtype"+":"+getHxsjtype())
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