package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubBusiGenerateElec的POJO类
 *
 * @author  yangguang  [Wed Mar 05 20:46:08 CST 2014]
 * 
 */
public class PubBusiGenerateElec implements Serializable{

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
    private int tyear;
	
    /** 
     * 属性tmonth
     */
    private int tmonth;
    
    /** 
     * 属性busiunit
     */
    private String unitid;
    /** 
     * 属性busiunit
     */
    private String busiunit;
	
    /** 
     * 属性electricity1
     */
    private BigDecimal electricity1;
	
    /** 
     * 属性electricity2
     */
    private BigDecimal electricity2;
	
    /** 
     * 属性electricity3
     */
    private BigDecimal electricity3;
	
    /** 
     * 属性hours1
     */
    private BigDecimal hours1;
	
    /** 
     * 属性electricity4
     */
    private BigDecimal electricity4;
	
    /** 
     * 属性electricity5
     */
    private BigDecimal electricity5;
	
    /** 
     * 属性rate
     */
    private BigDecimal rate;
	
    /** 
     * 属性price1
     */
    private BigDecimal price1;
	
    /** 
     * 属性electricity6
     */
    private BigDecimal electricity6;
	
    /** 
     * 属性electricity7
     */
    private BigDecimal electricity7;
	
    /** 
     * 属性price2
     */
    private BigDecimal price2;
	
    /** 
     * 属性electricity8
     */
    private BigDecimal electricity8;
	
    /** 
     * 属性electricity9
     */
    private BigDecimal electricity9;
	
    /** 
     * 属性price3
     */
    private BigDecimal price3;
	
    /** 
     * 属性hours2
     */
    private BigDecimal hours2;
	
    /** 
     * 属性state
     */
    private int state;
	
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
    private BigDecimal bak3;
	
    /** 
     * 属性bak4
     */
    private BigDecimal bak4;
	
    /** 
     * 属性bak5
     */
    private String bak5;
	
    /** 
     * 属性bak6
     */
    private String bak6;
	
    /** 
     * 属性electricity12
     */
    private BigDecimal electricity12;
	
    /** 
     * 属性electricity13
     */
    private BigDecimal electricity13;
	
    /** 
     * 属性price5
     */
    private BigDecimal price5;
	
    /** 
     * 属性electricity14
     */
    private BigDecimal electricity14;
	
    /** 
     * 属性electricity15
     */
    private BigDecimal electricity15;
	
    /** 
     * 属性price6
     */
    private BigDecimal price6;
	
    /** 
     * 属性electricity16
     */
    private BigDecimal electricity16;
	
    /** 
     * 属性electricity17
     */
    private BigDecimal electricity17;
	
    /** 
     * 属性price7
     */
    private BigDecimal price7;
	
    /** 
     * 属性electricity10
     */
    private BigDecimal electricity10;
	
    /** 
     * 属性electricity11
     */
    private BigDecimal electricity11;
	
    /** 
     * 属性price4
     */
    private BigDecimal price4;
	
    /**
     * PubBusiGenerateElec构造函数
     */
    public PubBusiGenerateElec() {
        super();
    }  
	
    /**
     * PubBusiGenerateElec完整的构造函数
     */  
    public PubBusiGenerateElec(String guid,String marketid,int tyear,int tmonth,int state,String fillinman,Date fillintime){
        this.guid = guid;
        this.marketid = marketid;
        this.tyear = tyear;
        this.tmonth = tmonth;
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
    public int getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(int tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tmonth 的get方法
     * @return BigDecimal
     */
    public int getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(int tmonth){
        this.tmonth = tmonth;
    } 
    
    
	
    public String getUnitid() {
		return unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	/**
     * 属性 busiunit 的get方法
     * @return String
     */
    public String getBusiunit(){
        return busiunit;
    }
	
    /**
     * 属性 busiunit 的set方法
     * @return
     */
    public void setBusiunit(String busiunit){
        this.busiunit = busiunit;
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
     * 属性 electricity3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity3(){
        return electricity3;
    }
	
    /**
     * 属性 electricity3 的set方法
     * @return
     */
    public void setElectricity3(BigDecimal electricity3){
        this.electricity3 = electricity3;
    } 
	
    /**
     * 属性 hours1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHours1(){
        return hours1;
    }
	
    /**
     * 属性 hours1 的set方法
     * @return
     */
    public void setHours1(BigDecimal hours1){
        this.hours1 = hours1;
    } 
	
    /**
     * 属性 electricity4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity4(){
        return electricity4;
    }
	
    /**
     * 属性 electricity4 的set方法
     * @return
     */
    public void setElectricity4(BigDecimal electricity4){
        this.electricity4 = electricity4;
    } 
	
    /**
     * 属性 electricity5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity5(){
        return electricity5;
    }
	
    /**
     * 属性 electricity5 的set方法
     * @return
     */
    public void setElectricity5(BigDecimal electricity5){
        this.electricity5 = electricity5;
    } 
	
    /**
     * 属性 rate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRate(){
        return rate;
    }
	
    /**
     * 属性 rate 的set方法
     * @return
     */
    public void setRate(BigDecimal rate){
        this.rate = rate;
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
     * 属性 electricity6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity6(){
        return electricity6;
    }
	
    /**
     * 属性 electricity6 的set方法
     * @return
     */
    public void setElectricity6(BigDecimal electricity6){
        this.electricity6 = electricity6;
    } 
	
    /**
     * 属性 electricity7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity7(){
        return electricity7;
    }
	
    /**
     * 属性 electricity7 的set方法
     * @return
     */
    public void setElectricity7(BigDecimal electricity7){
        this.electricity7 = electricity7;
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
     * 属性 electricity8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity8(){
        return electricity8;
    }
	
    /**
     * 属性 electricity8 的set方法
     * @return
     */
    public void setElectricity8(BigDecimal electricity8){
        this.electricity8 = electricity8;
    } 
	
    /**
     * 属性 electricity9 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity9(){
        return electricity9;
    }
	
    /**
     * 属性 electricity9 的set方法
     * @return
     */
    public void setElectricity9(BigDecimal electricity9){
        this.electricity9 = electricity9;
    } 
	
    /**
     * 属性 price3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice3(){
        return price3;
    }
	
    /**
     * 属性 price3 的set方法
     * @return
     */
    public void setPrice3(BigDecimal price3){
        this.price3 = price3;
    } 
	
    /**
     * 属性 hours2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHours2(){
        return hours2;
    }
	
    /**
     * 属性 hours2 的set方法
     * @return
     */
    public void setHours2(BigDecimal hours2){
        this.hours2 = hours2;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public int getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(int state){
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
     * @return BigDecimal
     */
    public BigDecimal getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(BigDecimal bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * 属性 bak4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(BigDecimal bak4){
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
     * 属性 electricity12 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity12(){
        return electricity12;
    }
	
    /**
     * 属性 electricity12 的set方法
     * @return
     */
    public void setElectricity12(BigDecimal electricity12){
        this.electricity12 = electricity12;
    } 
	
    /**
     * 属性 electricity13 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity13(){
        return electricity13;
    }
	
    /**
     * 属性 electricity13 的set方法
     * @return
     */
    public void setElectricity13(BigDecimal electricity13){
        this.electricity13 = electricity13;
    } 
	
    /**
     * 属性 price5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice5(){
        return price5;
    }
	
    /**
     * 属性 price5 的set方法
     * @return
     */
    public void setPrice5(BigDecimal price5){
        this.price5 = price5;
    } 
	
    /**
     * 属性 electricity14 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity14(){
        return electricity14;
    }
	
    /**
     * 属性 electricity14 的set方法
     * @return
     */
    public void setElectricity14(BigDecimal electricity14){
        this.electricity14 = electricity14;
    } 
	
    /**
     * 属性 electricity15 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity15(){
        return electricity15;
    }
	
    /**
     * 属性 electricity15 的set方法
     * @return
     */
    public void setElectricity15(BigDecimal electricity15){
        this.electricity15 = electricity15;
    } 
	
    /**
     * 属性 price6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice6(){
        return price6;
    }
	
    /**
     * 属性 price6 的set方法
     * @return
     */
    public void setPrice6(BigDecimal price6){
        this.price6 = price6;
    } 
	
    /**
     * 属性 electricity16 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity16(){
        return electricity16;
    }
	
    /**
     * 属性 electricity16 的set方法
     * @return
     */
    public void setElectricity16(BigDecimal electricity16){
        this.electricity16 = electricity16;
    } 
	
    /**
     * 属性 electricity17 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity17(){
        return electricity17;
    }
	
    /**
     * 属性 electricity17 的set方法
     * @return
     */
    public void setElectricity17(BigDecimal electricity17){
        this.electricity17 = electricity17;
    } 
	
    /**
     * 属性 price7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice7(){
        return price7;
    }
	
    /**
     * 属性 price7 的set方法
     * @return
     */
    public void setPrice7(BigDecimal price7){
        this.price7 = price7;
    } 
	
    /**
     * 属性 electricity10 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity10(){
        return electricity10;
    }
	
    /**
     * 属性 electricity10 的set方法
     * @return
     */
    public void setElectricity10(BigDecimal electricity10){
        this.electricity10 = electricity10;
    } 
	
    /**
     * 属性 electricity11 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity11(){
        return electricity11;
    }
	
    /**
     * 属性 electricity11 的set方法
     * @return
     */
    public void setElectricity11(BigDecimal electricity11){
        this.electricity11 = electricity11;
    } 
	
    /**
     * 属性 price4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice4(){
        return price4;
    }
	
    /**
     * 属性 price4 的set方法
     * @return
     */
    public void setPrice4(BigDecimal price4){
        this.price4 = price4;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubBusiGenerateElec))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubBusiGenerateElec other = (PubBusiGenerateElec) o;	        
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
            .append("tmonth"+":"+getTmonth())
            .append("unitid"+":"+getUnitid())
            .append("busiunit"+":"+getBusiunit())
            .append("electricity1"+":"+getElectricity1())
            .append("electricity2"+":"+getElectricity2())
            .append("electricity3"+":"+getElectricity3())
            .append("hours1"+":"+getHours1())
            .append("electricity4"+":"+getElectricity4())
            .append("electricity5"+":"+getElectricity5())
            .append("rate"+":"+getRate())
            .append("price1"+":"+getPrice1())
            .append("electricity6"+":"+getElectricity6())
            .append("electricity7"+":"+getElectricity7())
            .append("price2"+":"+getPrice2())
            .append("electricity8"+":"+getElectricity8())
            .append("electricity9"+":"+getElectricity9())
            .append("price3"+":"+getPrice3())
            .append("hours2"+":"+getHours2())
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
            .append("electricity12"+":"+getElectricity12())
            .append("electricity13"+":"+getElectricity13())
            .append("price5"+":"+getPrice5())
            .append("electricity14"+":"+getElectricity14())
            .append("electricity15"+":"+getElectricity15())
            .append("price6"+":"+getPrice6())
            .append("electricity16"+":"+getElectricity16())
            .append("electricity17"+":"+getElectricity17())
            .append("price7"+":"+getPrice7())
            .append("electricity10"+":"+getElectricity10())
            .append("electricity11"+":"+getElectricity11())
            .append("price4"+":"+getPrice4())
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