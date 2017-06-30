package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxPicture的POJO类
 *
 * @author  sss  [Wed Nov 13 13:30:15 CST 2013]
 * 
 */
public class DocxPicture implements Serializable{

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
     * 属性picture
     */
    private byte[] picture;
	
    /** 
     * 属性jce
     */
    private String jce;
	
    /**
     * DocxPicture构造函数
     */
    public DocxPicture() {
        super();
    }  
	
    /**
     * DocxPicture完整的构造函数
     */  
    public DocxPicture(String docid,String appid,BigDecimal indexnum,String jce){
        this.docid = docid;
        this.appid = appid;
        this.indexnum = indexnum;
        this.jce = jce;
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
     * 属性 picture 的get方法
     * @return byte[]
     */
    public byte[] getPicture(){
        return picture;
    }
	
    /**
     * 属性 picture 的set方法
     * @return
     */
    public void setPicture(byte[] picture){
        this.picture = picture;
    } 
	
	
	
    /**
     * 属性 jce 的get方法
     * @return String
     */
    public String getJce(){
        return jce;
    }
	
    /**
     * 属性 jce 的set方法
     * @return
     */
    public void setJce(String jce){
        this.jce = jce;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DocxPicture))
	        return false; 
			
        if(getAppid() == null) 
	        return false;

        DocxPicture other = (DocxPicture) o;	        
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
            .append("picture"+":"+getPicture())
            .append("jce"+":"+getJce())
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