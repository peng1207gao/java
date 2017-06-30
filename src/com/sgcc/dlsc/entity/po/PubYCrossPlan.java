package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubYCrossPlan的POJO类
 *
 * @author  Administrator  [Sat Mar 29 16:54:42 CST 2014]
 * 
 */
public class PubYCrossPlan implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性tyear
     */
    private BigDecimal tyear;
	
    /** 
     * 属性businessmode
     */
    private String businessmode;
	
    /** 
     * 属性businessname
     */
    private String businessname;
	
    /** 
     * 属性businesstype
     */
    private String businesstype;
	
    /** 
     * 属性objmarketid
     */
    private String objmarketid;
	
    /** 
     * 属性electricity1
     */
    private BigDecimal electricity1;
	
    /** 
     * 属性price1
     */
    private BigDecimal price1;
	
    /** 
     * 属性electricity2
     */
    private BigDecimal electricity2;
	
    /** 
     * 属性price2
     */
    private BigDecimal price2;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
    /** 
     * 属性subjectguid
     */
    private String subjectguid;
	
    /** 
     * 属性fillinman
     */
    private String fillinman;
	
    /** 
     * 属性fillintime
     */
    private Date fillintime;
	
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
     * PubYCrossPlan构造函数
     */
    public PubYCrossPlan() {
        super();
    }  
	
    /**
     * PubYCrossPlan完整的构造函数
     */  
    public PubYCrossPlan(String guid,String marketid,BigDecimal tyear,BigDecimal state,String fillinman,Date fillintime){
        this.guid = guid;
        this.marketid = marketid;
        this.tyear = tyear;
        this.state = state;
        this.fillinman = fillinman;
        this.fillintime = fillintime;
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
     * 属性 tyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(BigDecimal tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 businessmode 的get方法
     * @return String
     */
    public String getBusinessmode(){
        return businessmode;
    }
	
    /**
     * 属性 businessmode 的set方法
     * @return
     */
    public void setBusinessmode(String businessmode){
        this.businessmode = businessmode;
    } 
	
    /**
     * 属性 businessname 的get方法
     * @return String
     */
    public String getBusinessname(){
        return businessname;
    }
	
    /**
     * 属性 businessname 的set方法
     * @return
     */
    public void setBusinessname(String businessname){
        this.businessname = businessname;
    } 
	
    /**
     * 属性 businesstype 的get方法
     * @return String
     */
    public String getBusinesstype(){
        return businesstype;
    }
	
    /**
     * 属性 businesstype 的set方法
     * @return
     */
    public void setBusinesstype(String businesstype){
        this.businesstype = businesstype;
    } 
	
    /**
     * 属性 objmarketid 的get方法
     * @return String
     */
    public String getObjmarketid(){
        return objmarketid;
    }
	
    /**
     * 属性 objmarketid 的set方法
     * @return
     */
    public void setObjmarketid(String objmarketid){
        this.objmarketid = objmarketid;
    } 
	
    /**
     * 属性 electricity1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity1(){
        return electricity1;
    }
	
    /**
     * 属性 electricity1 的set方法
     * @return
     */
    public void setElectricity1(BigDecimal electricity1){
        this.electricity1 = electricity1;
    } 
	
    /**
     * 属性 price1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice1(){
        return price1;
    }
	
    /**
     * 属性 price1 的set方法
     * @return
     */
    public void setPrice1(BigDecimal price1){
        this.price1 = price1;
    } 
	
    /**
     * 属性 electricity2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity2(){
        return electricity2;
    }
	
    /**
     * 属性 electricity2 的set方法
     * @return
     */
    public void setElectricity2(BigDecimal electricity2){
        this.electricity2 = electricity2;
    } 
	
    /**
     * 属性 price2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice2(){
        return price2;
    }
	
    /**
     * 属性 price2 的set方法
     * @return
     */
    public void setPrice2(BigDecimal price2){
        this.price2 = price2;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public BigDecimal getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(BigDecimal state){
        this.state = state;
    } 
	
    /**
     * 属性 subjectguid 的get方法
     * @return String
     */
    public String getSubjectguid(){
        return subjectguid;
    }
	
    /**
     * 属性 subjectguid 的set方法
     * @return
     */
    public void setSubjectguid(String subjectguid){
        this.subjectguid = subjectguid;
    } 
	
    /**
     * 属性 fillinman 的get方法
     * @return String
     */
    public String getFillinman(){
        return fillinman;
    }
	
    /**
     * 属性 fillinman 的set方法
     * @return
     */
    public void setFillinman(String fillinman){
        this.fillinman = fillinman;
    } 
	
    /**
     * 属性 fillintime 的get方法
     * @return Date
     */
    public Date getFillintime(){
        return fillintime;
    }
	
    /**
     * 属性 fillintime 的set方法
     * @return
     */
    public void setFillintime(Date fillintime){
        this.fillintime = fillintime;
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
		
        if (o == null || !(o instanceof PubYCrossPlan))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubYCrossPlan other = (PubYCrossPlan) o;	        
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
            .append("tyear"+":"+getTyear())
            .append("businessmode"+":"+getBusinessmode())
            .append("businessname"+":"+getBusinessname())
            .append("businesstype"+":"+getBusinesstype())
            .append("objmarketid"+":"+getObjmarketid())
            .append("electricity1"+":"+getElectricity1())
            .append("price1"+":"+getPrice1())
            .append("electricity2"+":"+getElectricity2())
            .append("price2"+":"+getPrice2())
            .append("state"+":"+getState())
            .append("subjectguid"+":"+getSubjectguid())
            .append("fillinman"+":"+getFillinman())
            .append("fillintime"+":"+getFillintime())
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