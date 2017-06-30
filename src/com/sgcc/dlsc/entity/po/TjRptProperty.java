package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjRptProperty的POJO类
 *
 * @author  admin  [Thu Jul 24 15:30:09 CST 2014]
 * 
 */
public class TjRptProperty implements Serializable{

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
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性procode
     */
    private String procode;
	
    /** 
     * 属性proname
     */
    private String proname;
	
    /** 
     * 属性dtype
     */
    private String dtype;
	
    /** 
     * 属性dlength
     */
    private BigDecimal dlength;
	
    /** 
     * 属性declength
     */
    private BigDecimal declength;
	
    /** 
     * 属性conversion
     */
    private String conversion;
	
    /** 
     * 属性iscount
     */
    private BigDecimal iscount;
	
    /** 
     * 属性isuse
     */
    private BigDecimal isuse;
	
    /** 
     * 属性isdate
     */
    private BigDecimal isdate;
	
    /** 
     * 属性dunit
     */
    private String dunit;
	
    /** 
     * 属性hlimit
     */
    private BigDecimal hlimit;
	
    /** 
     * 属性llimit
     */
    private BigDecimal llimit;
	
    /** 
     * 属性rptsheet
     */
    private String rptsheet;
	
    /** 
     * 属性rptrow
     */
    private String rptrow;
	
    /** 
     * 属性rptcol
     */
    private String rptcol;
	
    /** 
     * 属性fonttype
     */
    private String fonttype;
	
    /** 
     * 属性fontvol
     */
    private String fontvol;
	
    /** 
     * 属性fontcol
     */
    private String fontcol;
	
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
    private String bak7;
	
    /** 
     * 属性bak8
     */
    private String bak8;
	
    /**
     * TjRptProperty构造函数
     */
    public TjRptProperty() {
        super();
    }  
	
    /**
     * TjRptProperty完整的构造函数
     */  
    public TjRptProperty(String guid,String marketid,String rptid){
        this.guid = guid;
        this.marketid = marketid;
        this.rptid = rptid;
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
     * 属性 procode 的get方法
     * @return String
     */
    public String getProcode(){
        return procode;
    }
	
    /**
     * 属性 procode 的set方法
     * @return
     */
    public void setProcode(String procode){
        this.procode = procode;
    } 
	
    /**
     * 属性 proname 的get方法
     * @return String
     */
    public String getProname(){
        return proname;
    }
	
    /**
     * 属性 proname 的set方法
     * @return
     */
    public void setProname(String proname){
        this.proname = proname;
    } 
	
    /**
     * 属性 dtype 的get方法
     * @return String
     */
    public String getDtype(){
        return dtype;
    }
	
    /**
     * 属性 dtype 的set方法
     * @return
     */
    public void setDtype(String dtype){
        this.dtype = dtype;
    } 
	
    /**
     * 属性 dlength 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDlength(){
        return dlength;
    }
	
    /**
     * 属性 dlength 的set方法
     * @return
     */
    public void setDlength(BigDecimal dlength){
        this.dlength = dlength;
    } 
	
    /**
     * 属性 declength 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDeclength(){
        return declength;
    }
	
    /**
     * 属性 declength 的set方法
     * @return
     */
    public void setDeclength(BigDecimal declength){
        this.declength = declength;
    } 
	
    /**
     * 属性 conversion 的get方法
     * @return String
     */
    public String getConversion(){
        return conversion;
    }
	
    /**
     * 属性 conversion 的set方法
     * @return
     */
    public void setConversion(String conversion){
        this.conversion = conversion;
    } 
	
    /**
     * 属性 iscount 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIscount(){
        return iscount;
    }
	
    /**
     * 属性 iscount 的set方法
     * @return
     */
    public void setIscount(BigDecimal iscount){
        this.iscount = iscount;
    } 
	
    /**
     * 属性 isuse 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsuse(){
        return isuse;
    }
	
    /**
     * 属性 isuse 的set方法
     * @return
     */
    public void setIsuse(BigDecimal isuse){
        this.isuse = isuse;
    } 
	
    /**
     * 属性 isdate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdate(){
        return isdate;
    }
	
    /**
     * 属性 isdate 的set方法
     * @return
     */
    public void setIsdate(BigDecimal isdate){
        this.isdate = isdate;
    } 
	
    /**
     * 属性 dunit 的get方法
     * @return String
     */
    public String getDunit(){
        return dunit;
    }
	
    /**
     * 属性 dunit 的set方法
     * @return
     */
    public void setDunit(String dunit){
        this.dunit = dunit;
    } 
	
    /**
     * 属性 hlimit 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHlimit(){
        return hlimit;
    }
	
    /**
     * 属性 hlimit 的set方法
     * @return
     */
    public void setHlimit(BigDecimal hlimit){
        this.hlimit = hlimit;
    } 
	
    /**
     * 属性 llimit 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLlimit(){
        return llimit;
    }
	
    /**
     * 属性 llimit 的set方法
     * @return
     */
    public void setLlimit(BigDecimal llimit){
        this.llimit = llimit;
    } 
	
    /**
     * 属性 rptsheet 的get方法
     * @return String
     */
    public String getRptsheet(){
        return rptsheet;
    }
	
    /**
     * 属性 rptsheet 的set方法
     * @return
     */
    public void setRptsheet(String rptsheet){
        this.rptsheet = rptsheet;
    } 
	
    /**
     * 属性 rptrow 的get方法
     * @return String
     */
    public String getRptrow(){
        return rptrow;
    }
	
    /**
     * 属性 rptrow 的set方法
     * @return
     */
    public void setRptrow(String rptrow){
        this.rptrow = rptrow;
    } 
	
    /**
     * 属性 rptcol 的get方法
     * @return String
     */
    public String getRptcol(){
        return rptcol;
    }
	
    /**
     * 属性 rptcol 的set方法
     * @return
     */
    public void setRptcol(String rptcol){
        this.rptcol = rptcol;
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
     * 属性 fontvol 的get方法
     * @return String
     */
    public String getFontvol(){
        return fontvol;
    }
	
    /**
     * 属性 fontvol 的set方法
     * @return
     */
    public void setFontvol(String fontvol){
        this.fontvol = fontvol;
    } 
	
    /**
     * 属性 fontcol 的get方法
     * @return String
     */
    public String getFontcol(){
        return fontcol;
    }
	
    /**
     * 属性 fontcol 的set方法
     * @return
     */
    public void setFontcol(String fontcol){
        this.fontcol = fontcol;
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
     * @return String
     */
    public String getBak7(){
        return bak7;
    }
	
    /**
     * 属性 bak7 的set方法
     * @return
     */
    public void setBak7(String bak7){
        this.bak7 = bak7;
    } 
	
    /**
     * 属性 bak8 的get方法
     * @return String
     */
    public String getBak8(){
        return bak8;
    }
	
    /**
     * 属性 bak8 的set方法
     * @return
     */
    public void setBak8(String bak8){
        this.bak8 = bak8;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjRptProperty))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjRptProperty other = (TjRptProperty) o;	        
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
            .append("xh"+":"+getXh())
            .append("procode"+":"+getProcode())
            .append("proname"+":"+getProname())
            .append("dtype"+":"+getDtype())
            .append("dlength"+":"+getDlength())
            .append("declength"+":"+getDeclength())
            .append("conversion"+":"+getConversion())
            .append("iscount"+":"+getIscount())
            .append("isuse"+":"+getIsuse())
            .append("isdate"+":"+getIsdate())
            .append("dunit"+":"+getDunit())
            .append("hlimit"+":"+getHlimit())
            .append("llimit"+":"+getLlimit())
            .append("rptsheet"+":"+getRptsheet())
            .append("rptrow"+":"+getRptrow())
            .append("rptcol"+":"+getRptcol())
            .append("fonttype"+":"+getFonttype())
            .append("fontvol"+":"+getFontvol())
            .append("fontcol"+":"+getFontcol())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("bak7"+":"+getBak7())
            .append("bak8"+":"+getBak8())
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