package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaInterfaceconfig的POJO类
 *
 * @author  开发部  [Sat Jan 25 16:47:59 CST 2014]
 * 
 */
public class BaInterfaceconfig implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性interfaceid
     */
    private String interfaceid;
	
    /** 
     * 属性interfacename
     */
    private String interfacename;
	
    /** 
     * 属性displayitemname
     */
    private String displayitemname;
	
    /** 
     * 属性isdisplay
     */
    private BigDecimal isdisplay;
	
    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性displayitemid
     */
    private String displayitemid;
	
    /** 
     * 属性cotype
     */
    private String cotype;
	
    /** 
     * 属性grade
     */
    private BigDecimal grade;
	
    /**
     * BaInterfaceconfig构造函数
     */
    public BaInterfaceconfig() {
        super();
    }  
	
    /**
     * BaInterfaceconfig完整的构造函数
     */  
    public BaInterfaceconfig(String sheetid){
        this.sheetid = sheetid;
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
     * 属性 interfaceid 的get方法
     * @return String
     */
    public String getInterfaceid(){
        return interfaceid;
    }
	
    /**
     * 属性 interfaceid 的set方法
     * @return
     */
    public void setInterfaceid(String interfaceid){
        this.interfaceid = interfaceid;
    } 
	
    /**
     * 属性 interfacename 的get方法
     * @return String
     */
    public String getInterfacename(){
        return interfacename;
    }
	
    /**
     * 属性 interfacename 的set方法
     * @return
     */
    public void setInterfacename(String interfacename){
        this.interfacename = interfacename;
    } 
	
    /**
     * 属性 displayitemname 的get方法
     * @return String
     */
    public String getDisplayitemname(){
        return displayitemname;
    }
	
    /**
     * 属性 displayitemname 的set方法
     * @return
     */
    public void setDisplayitemname(String displayitemname){
        this.displayitemname = displayitemname;
    } 
	
    /**
     * 属性 isdisplay 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdisplay(){
        return isdisplay;
    }
	
    /**
     * 属性 isdisplay 的set方法
     * @return
     */
    public void setIsdisplay(BigDecimal isdisplay){
        this.isdisplay = isdisplay;
    } 
	
    /**
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
    /**
     * 属性 displayitemid 的get方法
     * @return String
     */
    public String getDisplayitemid(){
        return displayitemid;
    }
	
    /**
     * 属性 displayitemid 的set方法
     * @return
     */
    public void setDisplayitemid(String displayitemid){
        this.displayitemid = displayitemid;
    } 
	
    /**
     * 属性 cotype 的get方法
     * @return String
     */
    public String getCotype(){
        return cotype;
    }
	
    /**
     * 属性 cotype 的set方法
     * @return
     */
    public void setCotype(String cotype){
        this.cotype = cotype;
    } 
	
    /**
     * 属性 grade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrade(){
        return grade;
    }
	
    /**
     * 属性 grade 的set方法
     * @return
     */
    public void setGrade(BigDecimal grade){
        this.grade = grade;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaInterfaceconfig))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        BaInterfaceconfig other = (BaInterfaceconfig) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("marketid"+":"+getMarketid())
            .append("interfaceid"+":"+getInterfaceid())
            .append("interfacename"+":"+getInterfacename())
            .append("displayitemname"+":"+getDisplayitemname())
            .append("isdisplay"+":"+getIsdisplay())
            .append("sheetid"+":"+getSheetid())
            .append("displayitemid"+":"+getDisplayitemid())
            .append("cotype"+":"+getCotype())
            .append("grade"+":"+getGrade())
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