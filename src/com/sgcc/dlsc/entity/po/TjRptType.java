package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjRptType的POJO类
 *
 * @author  admin  [Thu Jul 24 15:27:40 CST 2014]
 * 
 */
public class TjRptType implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性moduleid
     */
    private String moduleid;
	
    /** 
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性rptid
     */
    private String rptid;
	
    /** 
     * 属性rptname
     */
    private String rptname;
	
    /** 
     * 属性timetype
     */
    private String timetype;
	
    /** 
     * 属性isuse
     */
    private BigDecimal isuse;
	
    /** 
     * 属性tblname
     */
    private String tblname;
	
    /** 
     * 属性condition
     */
    private String condition;
	
    /** 
     * 属性isnation
     */
    private BigDecimal isnation;
	
    /** 
     * 属性actdate
     */
    private String actdate;
	
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
     * TjRptType构造函数
     */
    public TjRptType() {
        super();
    }  
	
    /**
     * TjRptType完整的构造函数
     */  
    public TjRptType(String guid,String marketid,String moduleid,String rptid,String rptname){
        this.guid = guid;
        this.marketid = marketid;
        this.moduleid = moduleid;
        this.rptid = rptid;
        this.rptname = rptname;
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
     * 属性 moduleid 的get方法
     * @return String
     */
    public String getModuleid(){
        return moduleid;
    }
	
    /**
     * 属性 moduleid 的set方法
     * @return
     */
    public void setModuleid(String moduleid){
        this.moduleid = moduleid;
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
     * 属性 timetype 的get方法
     * @return String
     */
    public String getTimetype(){
        return timetype;
    }
	
    /**
     * 属性 timetype 的set方法
     * @return
     */
    public void setTimetype(String timetype){
        this.timetype = timetype;
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
     * 属性 tblname 的get方法
     * @return String
     */
    public String getTblname(){
        return tblname;
    }
	
    /**
     * 属性 tblname 的set方法
     * @return
     */
    public void setTblname(String tblname){
        this.tblname = tblname;
    } 
	
    /**
     * 属性 condition 的get方法
     * @return String
     */
    public String getCondition(){
        return condition;
    }
	
    /**
     * 属性 condition 的set方法
     * @return
     */
    public void setCondition(String condition){
        this.condition = condition;
    } 
	
    /**
     * 属性 isnation 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsnation(){
        return isnation;
    }
	
    /**
     * 属性 isnation 的set方法
     * @return
     */
    public void setIsnation(BigDecimal isnation){
        this.isnation = isnation;
    } 
	
    /**
     * 属性 actdate 的get方法
     * @return String
     */
    public String getActdate(){
        return actdate;
    }
	
    /**
     * 属性 actdate 的set方法
     * @return
     */
    public void setActdate(String actdate){
        this.actdate = actdate;
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
		
        if (o == null || !(o instanceof TjRptType))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjRptType other = (TjRptType) o;	        
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
            .append("moduleid"+":"+getModuleid())
            .append("xh"+":"+getXh())
            .append("rptid"+":"+getRptid())
            .append("rptname"+":"+getRptname())
            .append("timetype"+":"+getTimetype())
            .append("isuse"+":"+getIsuse())
            .append("tblname"+":"+getTblname())
            .append("condition"+":"+getCondition())
            .append("isnation"+":"+getIsnation())
            .append("actdate"+":"+getActdate())
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