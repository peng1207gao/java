package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxModecontent的POJO类
 *
 * @author  sss  [Fri Nov 15 15:50:45 CST 2013]
 * 
 */
public class DocxModecontent implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性docmodeid
     */
    private String docmodeid;
	
    /** 
     * 属性indexnum
     */
    private BigDecimal indexnum;
	
    /** 
     * 属性ftype
     */
    private BigDecimal ftype;
	
    /** 
     * 属性picture
     */
    private byte[] picture;
	
    /** 
     * 属性jce
     */
    private String jce;
	
    /** 
     * 属性stype
     */
    private String stype;
	
    /** 
     * 属性titledata
     */
    private String titledata;
	
    /** 
     * 属性contentdata
     */
    private String contentdata;
	
    /** 
     * 属性fonttypetable
     */
    private String fonttypetable;
	
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
     * 属性tablesql
     */
    private String tablesql;
	
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
     * DocxModecontent构造函数
     */
    public DocxModecontent() {
        super();
    }  
	
    /**
     * DocxModecontent完整的构造函数
     */  
    public DocxModecontent(String guid,String docmodeid,BigDecimal indexnum){
        this.guid = guid;
        this.docmodeid = docmodeid;
        this.indexnum = indexnum;
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
     * 属性 docmodeid 的get方法
     * @return String
     */
    public String getDocmodeid(){
        return docmodeid;
    }
	
    /**
     * 属性 docmodeid 的set方法
     * @return
     */
    public void setDocmodeid(String docmodeid){
        this.docmodeid = docmodeid;
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
     * 属性 ftype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFtype(){
        return ftype;
    }
	
    /**
     * 属性 ftype 的set方法
     * @return
     */
    public void setFtype(BigDecimal ftype){
        this.ftype = ftype;
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
     * 属性 fonttypetable 的get方法
     * @return String
     */
    public String getFonttypetable(){
        return fonttypetable;
    }
	
    /**
     * 属性 fonttypetable 的set方法
     * @return
     */
    public void setFonttypetable(String fonttypetable){
        this.fonttypetable = fonttypetable;
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
     * 属性 tablesql 的get方法
     * @return String
     */
    public String getTablesql(){
        return tablesql;
    }
	
    /**
     * 属性 tablesql 的set方法
     * @return
     */
    public void setTablesql(String tablesql){
        this.tablesql = tablesql;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DocxModecontent))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DocxModecontent other = (DocxModecontent) o;	        
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
            .append("docmodeid"+":"+getDocmodeid())
            .append("indexnum"+":"+getIndexnum())
            .append("ftype"+":"+getFtype())
            .append("picture"+":"+getPicture())
            .append("jce"+":"+getJce())
            .append("stype"+":"+getStype())
            .append("titledata"+":"+getTitledata())
            .append("contentdata"+":"+getContentdata())
            .append("fonttypetable"+":"+getFonttypetable())
            .append("rowcount"+":"+getRowcount())
            .append("colcount"+":"+getColcount())
            .append("colwidth"+":"+getColwidth())
            .append("tablesql"+":"+getTablesql())
            .append("text"+":"+getText())
            .append("fonttype"+":"+getFonttype())
            .append("fontsize"+":"+getFontsize())
            .append("isblod"+":"+getIsblod())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
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