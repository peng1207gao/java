package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaImportaffixinfo的POJO类
 *
 * @author  longshine  [Thu Jun 05 15:15:37 CST 2014]
 * 
 */
public class BaImportaffixinfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性affixname
     */
    private String affixname;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性affixfile
     */
    private byte[] affixfile;
	
    /**
     * BaImportaffixinfo构造函数
     */
    public BaImportaffixinfo() {
        super();
    }  
	
    /**
     * BaImportaffixinfo完整的构造函数
     */  
    public BaImportaffixinfo(String guid){
        this.guid = guid;
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
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
    } 
	
	
	
    /**
     * 属性 affixfile 的get方法
     * @return byte[]
     */
    public byte[] getAffixfile(){
        return affixfile;
    }
	
    /**
     * 属性 affixfile 的set方法
     * @return
     */
    public void setAffixfile(byte[] affixfile){
        this.affixfile = affixfile;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaImportaffixinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaImportaffixinfo other = (BaImportaffixinfo) o;	        
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
            .append("affixname"+":"+getAffixname())
            .append("participantid"+":"+getParticipantid())
            .append("affixfile"+":"+getAffixfile())
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