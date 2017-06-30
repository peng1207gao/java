package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxText的POJO类
 *
 * @author  sss  [Wed Nov 13 13:30:15 CST 2013]
 * 
 */
public class DocxText implements Serializable{

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
     * 属性text
     */
    private String text;
	
    /** 
     * 属性fonttype
     */
    private String fonttype;
	
    /** 
     * 属性fontsize
     */
    private String fontsize;
	
    /** 
     * 属性isblod
     */
    private BigDecimal isblod;
	
    /** 
     * 属性jce
     */
    private String jce;
	
    /**
     * DocxText构造函数
     */
    public DocxText() {
        super();
    }  
	
    /**
     * DocxText完整的构造函数
     */  
    public DocxText(String docid,String appid,BigDecimal indexnum,String fonttype,String fontsize,BigDecimal isblod,String jce){
        this.docid = docid;
        this.appid = appid;
        this.indexnum = indexnum;
        this.fonttype = fonttype;
        this.fontsize = fontsize;
        this.isblod = isblod;
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
     * 属性 text 的get方法
     * @return String
     */
    public String getText(){
        return text;
    }
	
    /**
     * 属性 text 的set方法
     * @return
     */
    public void setText(String text){
        this.text = text;
    } 
	
	
	
    /**
     * 属性 fonttype 的get方法
     * @return String
     */
    public String getFonttype(){
        return fonttype;
    }
	
    /**
     * 属性 fonttype 的set方法
     * @return
     */
    public void setFonttype(String fonttype){
        this.fonttype = fonttype;
    } 
	
	
	
    /**
     * 属性 fontsize 的get方法
     * @return String
     */
    public String getFontsize(){
        return fontsize;
    }
	
    /**
     * 属性 fontsize 的set方法
     * @return
     */
    public void setFontsize(String fontsize){
        this.fontsize = fontsize;
    } 
	
	
	
    /**
     * 属性 isblod 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsblod(){
        return isblod;
    }
	
    /**
     * 属性 isblod 的set方法
     * @return
     */
    public void setIsblod(BigDecimal isblod){
        this.isblod = isblod;
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
		
        if (o == null || !(o instanceof DocxText))
	        return false; 
			
        if(getAppid() == null) 
	        return false;

        DocxText other = (DocxText) o;	        
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
            .append("text"+":"+getText())
            .append("fonttype"+":"+getFonttype())
            .append("fontsize"+":"+getFontsize())
            .append("isblod"+":"+getIsblod())
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