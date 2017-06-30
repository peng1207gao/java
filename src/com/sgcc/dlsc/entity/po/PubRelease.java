package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubRelease的POJO类
 *
 * @author  zndw1  [Wed Jan 22 15:43:38 CST 2014]
 * 
 */
public class PubRelease implements Serializable{

    /** 
     * 属性subjectid
     */
    private String subjectid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性subjectname
     */
    private String subjectname;
	
    /** 
     * 属性description
     */
    private String description;
	
    /** 
     * 属性isvalid
     */
    private BigDecimal isvalid;
	
    /** 
     * 属性bak1
     */
    private String bak1;
	
    /** 
     * 属性bak2
     */
    private String bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /** 
     * 属性bak4
     */
    private String bak4;
	
    /** 
     * 属性subjecttype
     */
    private String subjecttype;
	
    /**
     * PubRelease构造函数
     */
    public PubRelease() {
        super();
    }  
	
    /**
     * PubRelease完整的构造函数
     */  
    public PubRelease(String subjectid,String marketid,String subjectname,BigDecimal isvalid){
        this.subjectid = subjectid;
        this.marketid = marketid;
        this.subjectname = subjectname;
        this.isvalid = isvalid;
    }
 
    /**
     * 属性 subjectid 的get方法
     * @return String
     */
    public String getSubjectid(){
        return subjectid;
    }
	
    /**
     * 属性 subjectid 的set方法
     * @return
     */
    public void setSubjectid(String subjectid){
        if(subjectid != null && subjectid.trim().length() == 0){
            this.subjectid = null;
        }else{
            this.subjectid = subjectid;
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
     * 属性 subjectname 的get方法
     * @return String
     */
    public String getSubjectname(){
        return subjectname;
    }
	
    /**
     * 属性 subjectname 的set方法
     * @return
     */
    public void setSubjectname(String subjectname){
        this.subjectname = subjectname;
    } 
	
    /**
     * 属性 description 的get方法
     * @return String
     */
    public String getDescription(){
        return description;
    }
	
    /**
     * 属性 description 的set方法
     * @return
     */
    public void setDescription(String description){
        this.description = description;
    } 
	
    /**
     * 属性 isvalid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsvalid(){
        return isvalid;
    }
	
    /**
     * 属性 isvalid 的set方法
     * @return
     */
    public void setIsvalid(BigDecimal isvalid){
        this.isvalid = isvalid;
    } 
	
    /**
     * 属性 bak1 的get方法
     * @return String
     */
    public String getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(String bak1){
        this.bak1 = bak1;
    } 
	
    /**
     * 属性 bak2 的get方法
     * @return String
     */
    public String getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(String bak2){
        this.bak2 = bak2;
    } 
	
    /**
     * 属性 bak3 的get方法
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * 属性 bak4 的get方法
     * @return String
     */
    public String getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(String bak4){
        this.bak4 = bak4;
    } 
	
    /**
     * 属性 subjecttype 的get方法
     * @return String
     */
    public String getSubjecttype(){
        return subjecttype;
    }
	
    /**
     * 属性 subjecttype 的set方法
     * @return
     */
    public void setSubjecttype(String subjecttype){
        this.subjecttype = subjecttype;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubRelease))
	        return false; 
			
        if(getSubjectid() == null) 
	        return false;

        PubRelease other = (PubRelease) o;	        
	    return new EqualsBuilder()
            .append(this.getSubjectid(), other.getSubjectid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("subjectid"+":"+getSubjectid())
            .append("marketid"+":"+getMarketid())
            .append("subjectname"+":"+getSubjectname())
            .append("description"+":"+getDescription())
            .append("isvalid"+":"+getIsvalid())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("subjecttype"+":"+getSubjecttype())
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