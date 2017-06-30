package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjReport的POJO类
 *
 * @author  admin  [Thu Jul 17 11:04:06 CST 2014]
 * 
 */
public class TjReport implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性rptid
     */
    private String rptid;
	
    /** 
     * 属性rptname
     */
    private String rptname;
	
    /** 
     * 属性tabname
     */
    private String tabname;
	
    /** 
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性timetype
     */
    private BigDecimal timetype;
	
    /** 
     * 属性tmodel
     */
    private BigDecimal tmodel;
	
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
     * 属性bak7
     */
    private BigDecimal bak7;
	
    /** 
     * 属性bak8
     */
    private BigDecimal bak8;
	
    /** 
     * 属性bak9
     */
    private String bak9;
	
    /** 
     * 属性bak10
     */
    private String bak10;
	
    /** 
     * 属性bak11
     */
    private String bak11;
	
    /** 
     * 属性bak12
     */
    private String bak12;
	
    /**
     * TjReport构造函数
     */
    public TjReport() {
        super();
    }  
	
    /**
     * TjReport完整的构造函数
     */  
    public TjReport(String guid,String marketid){
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
     * 属性 rptid 的get方法
     * @return String
     */
    public String getRptid(){
        return rptid;
    }
	
    /**
     * 属性 rptid 的set方法
     * @return
     */
    public void setRptid(String rptid){
        this.rptid = rptid;
    } 
	
    /**
     * 属性 rptname 的get方法
     * @return String
     */
    public String getRptname(){
        return rptname;
    }
	
    /**
     * 属性 rptname 的set方法
     * @return
     */
    public void setRptname(String rptname){
        this.rptname = rptname;
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
     * @return BigDecimal
     */
    public BigDecimal getXh(){
        return xh;
    }
	
    /**
     * 属性 xh 的set方法
     * @return
     */
    public void setXh(BigDecimal xh){
        this.xh = xh;
    } 
	
    /**
     * 属性 timetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTimetype(){
        return timetype;
    }
	
    /**
     * 属性 timetype 的set方法
     * @return
     */
    public void setTimetype(BigDecimal timetype){
        this.timetype = timetype;
    } 
	
    /**
     * 属性 tmodel 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTmodel(){
        return tmodel;
    }
	
    /**
     * 属性 tmodel 的set方法
     * @return
     */
    public void setTmodel(BigDecimal tmodel){
        this.tmodel = tmodel;
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
     * 属性 bak7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak7(){
        return bak7;
    }
	
    /**
     * 属性 bak7 的set方法
     * @return
     */
    public void setBak7(BigDecimal bak7){
        this.bak7 = bak7;
    } 
	
    /**
     * 属性 bak8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak8(){
        return bak8;
    }
	
    /**
     * 属性 bak8 的set方法
     * @return
     */
    public void setBak8(BigDecimal bak8){
        this.bak8 = bak8;
    } 
	
    /**
     * 属性 bak9 的get方法
     * @return String
     */
    public String getBak9(){
        return bak9;
    }
	
    /**
     * 属性 bak9 的set方法
     * @return
     */
    public void setBak9(String bak9){
        this.bak9 = bak9;
    } 
	
    /**
     * 属性 bak10 的get方法
     * @return String
     */
    public String getBak10(){
        return bak10;
    }
	
    /**
     * 属性 bak10 的set方法
     * @return
     */
    public void setBak10(String bak10){
        this.bak10 = bak10;
    } 
	
    /**
     * 属性 bak11 的get方法
     * @return String
     */
    public String getBak11(){
        return bak11;
    }
	
    /**
     * 属性 bak11 的set方法
     * @return
     */
    public void setBak11(String bak11){
        this.bak11 = bak11;
    } 
	
    /**
     * 属性 bak12 的get方法
     * @return String
     */
    public String getBak12(){
        return bak12;
    }
	
    /**
     * 属性 bak12 的set方法
     * @return
     */
    public void setBak12(String bak12){
        this.bak12 = bak12;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjReport))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjReport other = (TjReport) o;	        
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
            .append("rptid"+":"+getRptid())
            .append("rptname"+":"+getRptname())
            .append("tabname"+":"+getTabname())
            .append("xh"+":"+getXh())
            .append("timetype"+":"+getTimetype())
            .append("tmodel"+":"+getTmodel())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("bak7"+":"+getBak7())
            .append("bak8"+":"+getBak8())
            .append("bak9"+":"+getBak9())
            .append("bak10"+":"+getBak10())
            .append("bak11"+":"+getBak11())
            .append("bak12"+":"+getBak12())
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