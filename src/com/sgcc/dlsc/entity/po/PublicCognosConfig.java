package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PublicCognosConfig的POJO类
 *
 * @author  yangguang  [Tue Jun 10 15:19:28 CST 2014]
 * 
 */
public class PublicCognosConfig implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性moduleid
     */
    private String moduleid;
	
    /** 
     * 属性url
     */
    private String url;
	
    /** 
     * 属性spname
     */
    private String spname;
	
    /** 
     * 属性isresult
     */
    private BigDecimal isresult;
	
    /** 
     * 属性bak1
     */
    private BigDecimal bak1;
	
    /** 
     * 属性bak2
     */
    private BigDecimal bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /** 
     * 属性bak4
     */
    private String bak4;
	
    /** 
     * 属性bak5
     */
    private String bak5;
	
    /** 
     * 属性bak6
     */
    private String bak6;
	
    /**
     * PublicCognosConfig构造函数
     */
    public PublicCognosConfig() {
        super();
    }  
	
    /**
     * PublicCognosConfig完整的构造函数
     */  
    public PublicCognosConfig(String guid){
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
     * 属性 moduleid 的get方法
     * @return String
     */
    public String getModuleid(){
        return moduleid;
    }
	
    /**
     * 属性 moduleid 的set方法
     * @return
     */
    public void setModuleid(String moduleid){
        this.moduleid = moduleid;
    } 
	
    /**
     * 属性 url 的get方法
     * @return String
     */
    public String getUrl(){
        return url;
    }
	
    /**
     * 属性 url 的set方法
     * @return
     */
    public void setUrl(String url){
        this.url = url;
    } 
	
    /**
     * 属性 spname 的get方法
     * @return String
     */
    public String getSpname(){
        return spname;
    }
	
    /**
     * 属性 spname 的set方法
     * @return
     */
    public void setSpname(String spname){
        this.spname = spname;
    } 
	
    /**
     * 属性 isresult 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsresult(){
        return isresult;
    }
	
    /**
     * 属性 isresult 的set方法
     * @return
     */
    public void setIsresult(BigDecimal isresult){
        this.isresult = isresult;
    } 
	
    /**
     * 属性 bak1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(BigDecimal bak1){
        this.bak1 = bak1;
    } 
	
    /**
     * 属性 bak2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(BigDecimal bak2){
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
     * 属性 bak5 的get方法
     * @return String
     */
    public String getBak5(){
        return bak5;
    }
	
    /**
     * 属性 bak5 的set方法
     * @return
     */
    public void setBak5(String bak5){
        this.bak5 = bak5;
    } 
	
    /**
     * 属性 bak6 的get方法
     * @return String
     */
    public String getBak6(){
        return bak6;
    }
	
    /**
     * 属性 bak6 的set方法
     * @return
     */
    public void setBak6(String bak6){
        this.bak6 = bak6;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PublicCognosConfig))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PublicCognosConfig other = (PublicCognosConfig) o;	        
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
            .append("moduleid"+":"+getModuleid())
            .append("url"+":"+getUrl())
            .append("spname"+":"+getSpname())
            .append("isresult"+":"+getIsresult())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
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