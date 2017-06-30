package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxTable的POJO类
 *
 * @author  sss  [Wed Nov 13 13:30:15 CST 2013]
 * 
 */
public class DocxTable implements Serializable{

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
     * 属性titledata
     */
    private String titledata;
	
    /** 
     * 属性contentdata
     */
    private String contentdata;
	
    /** 
     * 属性rowcount
     */
    private BigDecimal rowcount;
	
    /** 
     * 属性colcount
     */
    private BigDecimal colcount;
	
    /** 
     * 属性colwidth
     */
    private BigDecimal colwidth;
	
    /**
     * DocxTable构造函数
     */
    public DocxTable() {
        super();
    }  
	
    /**
     * DocxTable完整的构造函数
     */  
    public DocxTable(String docid,String appid,BigDecimal indexnum,BigDecimal rowcount,BigDecimal colcount,BigDecimal colwidth){
        this.docid = docid;
        this.appid = appid;
        this.indexnum = indexnum;
        this.rowcount = rowcount;
        this.colcount = colcount;
        this.colwidth = colwidth;
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
     * 属性 titledata 的get方法
     * @return String
     */
    public String getTitledata(){
        return titledata;
    }
	
    /**
     * 属性 titledata 的set方法
     * @return
     */
    public void setTitledata(String titledata){
        this.titledata = titledata;
    } 
	
	
	
    /**
     * 属性 contentdata 的get方法
     * @return String
     */
    public String getContentdata(){
        return contentdata;
    }
	
    /**
     * 属性 contentdata 的set方法
     * @return
     */
    public void setContentdata(String contentdata){
        this.contentdata = contentdata;
    } 
	
	
	
    /**
     * 属性 rowcount 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRowcount(){
        return rowcount;
    }
	
    /**
     * 属性 rowcount 的set方法
     * @return
     */
    public void setRowcount(BigDecimal rowcount){
        this.rowcount = rowcount;
    } 
	
	
	
    /**
     * 属性 colcount 的get方法
     * @return BigDecimal
     */
    public BigDecimal getColcount(){
        return colcount;
    }
	
    /**
     * 属性 colcount 的set方法
     * @return
     */
    public void setColcount(BigDecimal colcount){
        this.colcount = colcount;
    } 
	
	
	
    /**
     * 属性 colwidth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getColwidth(){
        return colwidth;
    }
	
    /**
     * 属性 colwidth 的set方法
     * @return
     */
    public void setColwidth(BigDecimal colwidth){
        this.colwidth = colwidth;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DocxTable))
	        return false; 
			
        if(getAppid() == null) 
	        return false;

        DocxTable other = (DocxTable) o;	        
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
            .append("titledata"+":"+getTitledata())
            .append("contentdata"+":"+getContentdata())
            .append("rowcount"+":"+getRowcount())
            .append("colcount"+":"+getColcount())
            .append("colwidth"+":"+getColwidth())
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