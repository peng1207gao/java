package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxSpecial的POJO类
 *
 * @author  sss  [Wed Nov 13 13:30:14 CST 2013]
 * 
 */
public class DocxSpecial implements Serializable{

    /** 
     * 属性docid
     */
    private String docid;
	
    /** 
     * 属性appid
     */
    private String appid;
	
    /** 
     * 属性indexnum
     */
    private BigDecimal indexnum;
	
    /** 
     * 属性stype
     */
    private String stype;
	
    /**
     * DocxSpecial构造函数
     */
    public DocxSpecial() {
        super();
    }  
	
    /**
     * DocxSpecial完整的构造函数
     */  
    public DocxSpecial(String docid,String appid,BigDecimal indexnum,String stype){
        this.docid = docid;
        this.appid = appid;
        this.indexnum = indexnum;
        this.stype = stype;
    }
 
	
	
    /**
     * 属性 docid 的get方法
     * @return String
     */
    public String getDocid(){
        return docid;
    }
	
    /**
     * 属性 docid 的set方法
     * @return
     */
    public void setDocid(String docid){
        this.docid = docid;
    } 
	
	
	
    /**
     * 属性 appid 的get方法
     * @return String
     */
    public String getAppid(){
        return appid;
    }
	
    /**
     * 属性 appid 的set方法
     * @return
     */
    public void setAppid(String appid){
        if(appid != null && appid.trim().length() == 0){
            this.appid = null;
        }else{
            this.appid = appid;
        }
    } 
	
	
	
    /**
     * 属性 indexnum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIndexnum(){
        return indexnum;
    }
	
    /**
     * 属性 indexnum 的set方法
     * @return
     */
    public void setIndexnum(BigDecimal indexnum){
        this.indexnum = indexnum;
    } 
	
	
	
    /**
     * 属性 stype 的get方法
     * @return String
     */
    public String getStype(){
        return stype;
    }
	
    /**
     * 属性 stype 的set方法
     * @return
     */
    public void setStype(String stype){
        this.stype = stype;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DocxSpecial))
	        return false; 
			
        if(getAppid() == null) 
	        return false;

        DocxSpecial other = (DocxSpecial) o;	        
	    return new EqualsBuilder()
            .append(this.getAppid(), other.getAppid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("docid"+":"+getDocid())
            .append("appid"+":"+getAppid())
            .append("indexnum"+":"+getIndexnum())
            .append("stype"+":"+getStype())
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