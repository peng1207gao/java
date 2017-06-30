package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DeMappingTemp1的POJO类
 *
 * @author  Administrator  [Wed Apr 16 10:26:22 CST 2014]
 * 
 */
public class DeMappingTemp1 implements Serializable{

    /** 
     * 属性showorder
     */
    private String showorder;
	
    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性fsheetid
     */
    private String fsheetid;
	
    /** 
     * 属性ysgxblx
     */
    private String ysgxblx;
	
    /** 
     * 属性keyvalue
     */
    private String keyvalue;
	
    /** 
     * 属性keyname
     */
    private String keyname;
	
    /** 
     * 属性bxzzt
     */
    private String bxzzt;
	
    /** 
     * 属性ylzd1
     */
    private String ylzd1;
	
    /** 
     * 属性ylzd2
     */
    private String ylzd2;
	
    /** 
     * 属性ylzd3
     */
    private String ylzd3;
	
    /**
     * DeMappingTemp1构造函数
     */
    public DeMappingTemp1() {
        super();
    }  
	
    /**
     * DeMappingTemp1完整的构造函数
     */  
    public DeMappingTemp1(String sheetid){
        this.sheetid = sheetid;
    }
 
    /**
     * 属性 showorder 的get方法
     * @return BigDecimal
     */
    public String getShoworder(){
        return showorder;
    }
	
    /**
     * 属性 showorder 的set方法
     * @return
     */
    public void setShoworder(String showorder){
        this.showorder = showorder;
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
     * 属性 fsheetid 的get方法
     * @return String
     */
    public String getFsheetid(){
        return fsheetid;
    }
	
    /**
     * 属性 fsheetid 的set方法
     * @return
     */
    public void setFsheetid(String fsheetid){
        this.fsheetid = fsheetid;
    } 
	
    /**
     * 属性 ysgxblx 的get方法
     * @return String
     */
    public String getYsgxblx(){
        return ysgxblx;
    }
	
    /**
     * 属性 ysgxblx 的set方法
     * @return
     */
    public void setYsgxblx(String ysgxblx){
        this.ysgxblx = ysgxblx;
    } 
	
    /**
     * 属性 keyvalue 的get方法
     * @return String
     */
    public String getKeyvalue(){
        return keyvalue;
    }
	
    /**
     * 属性 keyvalue 的set方法
     * @return
     */
    public void setKeyvalue(String keyvalue){
        this.keyvalue = keyvalue;
    } 
	
    /**
     * 属性 keyname 的get方法
     * @return String
     */
    public String getKeyname(){
        return keyname;
    }
	
    /**
     * 属性 keyname 的set方法
     * @return
     */
    public void setKeyname(String keyname){
        this.keyname = keyname;
    } 
	
    /**
     * 属性 bxzzt 的get方法
     * @return String
     */
    public String getBxzzt(){
        return bxzzt;
    }
	
    /**
     * 属性 bxzzt 的set方法
     * @return
     */
    public void setBxzzt(String bxzzt){
        this.bxzzt = bxzzt;
    } 
	
    /**
     * 属性 ylzd1 的get方法
     * @return String
     */
    public String getYlzd1(){
        return ylzd1;
    }
	
    /**
     * 属性 ylzd1 的set方法
     * @return
     */
    public void setYlzd1(String ylzd1){
        this.ylzd1 = ylzd1;
    } 
	
    /**
     * 属性 ylzd2 的get方法
     * @return String
     */
    public String getYlzd2(){
        return ylzd2;
    }
	
    /**
     * 属性 ylzd2 的set方法
     * @return
     */
    public void setYlzd2(String ylzd2){
        this.ylzd2 = ylzd2;
    } 
	
    /**
     * 属性 ylzd3 的get方法
     * @return String
     */
    public String getYlzd3(){
        return ylzd3;
    }
	
    /**
     * 属性 ylzd3 的set方法
     * @return
     */
    public void setYlzd3(String ylzd3){
        this.ylzd3 = ylzd3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DeMappingTemp1))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        DeMappingTemp1 other = (DeMappingTemp1) o;	        
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
            .append("showorder"+":"+getShoworder())
            .append("sheetid"+":"+getSheetid())
            .append("fsheetid"+":"+getFsheetid())
            .append("ysgxblx"+":"+getYsgxblx())
            .append("keyvalue"+":"+getKeyvalue())
            .append("keyname"+":"+getKeyname())
            .append("bxzzt"+":"+getBxzzt())
            .append("ylzd1"+":"+getYlzd1())
            .append("ylzd2"+":"+getYlzd2())
            .append("ylzd3"+":"+getYlzd3())
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