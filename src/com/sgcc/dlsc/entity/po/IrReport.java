package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * IrReport的POJO类
 *
 * @author  zhangyr  [Tue May 06 14:18:30 CST 2014]
 * 
 */
public class IrReport implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性rnqme
     */
    private String rnqme;
	
    /** 
     * 属性tabname
     */
    private String tabname;
	
    /** 
     * 属性xh
     */
    private Integer xh;
	
    /** 
     * 属性rtype
     */
    private Integer rtype;
	
    /** 
     * 属性ntype
     */
    private Integer ntype;
	
    /** 
     * 属性timetype
     */
    private Integer timetype;
	
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
     * 属性bak5
     */
    private BigDecimal bak5;
	
    /** 
     * 属性bak6
     */
    private BigDecimal bak6;
	
    /** 
     * 属性itemid
     */
    private String itemid;
	
    /**
     * IrReport构造函数
     */
    public IrReport() {
        super();
    }  
	
    /**
     * IrReport完整的构造函数
     */  
    public IrReport(String guid,String marketid){
        this.guid = guid;
        this.marketid = marketid;
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
     * 属性 rnqme 的get方法
     * @return String
     */
    public String getRnqme(){
        return rnqme;
    }
	
    /**
     * 属性 rnqme 的set方法
     * @return
     */
    public void setRnqme(String rnqme){
        this.rnqme = rnqme;
    } 
	
    /**
     * 属性 tabname 的get方法
     * @return String
     */
    public String getTabname(){
        return tabname;
    }
	
    /**
     * 属性 tabname 的set方法
     * @return
     */
    public void setTabname(String tabname){
        this.tabname = tabname;
    } 
	
    /**
     * 属性 xh 的get方法
     * @return Integer
     */
    public Integer getXh(){
        return xh;
    }
	
    /**
     * 属性 xh 的set方法
     * @return
     */
    public void setXh(Integer xh){
        this.xh = xh;
    } 
	
    /**
     * 属性 rtype 的get方法
     * @return Integer
     */
    public Integer getRtype(){
        return rtype;
    }
	
    /**
     * 属性 rtype 的set方法
     * @return
     */
    public void setRtype(Integer rtype){
        this.rtype = rtype;
    } 
	
    /**
     * 属性 ntype 的get方法
     * @return Integer
     */
    public Integer getNtype(){
        return ntype;
    }
	
    /**
     * 属性 ntype 的set方法
     * @return
     */
    public void setNtype(Integer ntype){
        this.ntype = ntype;
    } 
	
    /**
     * 属性 timetype 的get方法
     * @return Integer
     */
    public Integer getTimetype(){
        return timetype;
    }
	
    /**
     * 属性 timetype 的set方法
     * @return
     */
    public void setTimetype(Integer timetype){
        this.timetype = timetype;
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
     * 属性 bak5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak5(){
        return bak5;
    }
	
    /**
     * 属性 bak5 的set方法
     * @return
     */
    public void setBak5(BigDecimal bak5){
        this.bak5 = bak5;
    } 
	
    /**
     * 属性 bak6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak6(){
        return bak6;
    }
	
    /**
     * 属性 bak6 的set方法
     * @return
     */
    public void setBak6(BigDecimal bak6){
        this.bak6 = bak6;
    } 
	
    /**
     * 属性 itemid 的get方法
     * @return String
     */
    public String getItemid(){
        return itemid;
    }
	
    /**
     * 属性 itemid 的set方法
     * @return
     */
    public void setItemid(String itemid){
        this.itemid = itemid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof IrReport))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        IrReport other = (IrReport) o;	        
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
            .append("rnqme"+":"+getRnqme())
            .append("tabname"+":"+getTabname())
            .append("xh"+":"+getXh())
            .append("rtype"+":"+getRtype())
            .append("ntype"+":"+getNtype())
            .append("timetype"+":"+getTimetype())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("itemid"+":"+getItemid())
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