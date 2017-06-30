package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CognosReportQueryindex的POJO类
 *
 * @author  Administrator  [Wed Jun 26 16:51:51 CST 2013]
 * 
 */
public class CognosReportQueryindex implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性querydate
     */
    private Date querydate;
	
    /** 
     * 属性fuctionid
     */
    private String fuctionid;
	
    /** 
     * 属性fuctionname
     */
    private String fuctionname;
	
    /** 
     * 属性typeid
     */
    private String typeid;
	
    /** 
     * 属性typename
     */
    private String typename;
	
    /** 
     * 属性typevalue
     */
    private String typevalue;
	
    /** 
     * 属性backStr1
     */
    private String backStr1;
	
    /** 
     * 属性backStr2
     */
    private String backStr2;
	
    /** 
     * 属性backStr3
     */
    private String backStr3;
	
    /** 
     * 属性backStr4
     */
    private String backStr4;
	
    /** 
     * 属性backStr5
     */
    private String backStr5;
	
    /** 
     * 属性backInt1
     */
    private BigDecimal backInt1;
	
    /** 
     * 属性backInt2
     */
    private BigDecimal backInt2;
	
    /** 
     * 属性backInt3
     */
    private BigDecimal backInt3;
	
    /** 
     * 属性backInt4
     */
    private BigDecimal backInt4;
	
    /** 
     * 属性backInt5
     */
    private BigDecimal backInt5;
	
    /** 
     * 属性backDouble1
     */
    private BigDecimal backDouble1;
	
    /** 
     * 属性backDouble2
     */
    private BigDecimal backDouble2;
	
    /** 
     * 属性backDouble3
     */
    private BigDecimal backDouble3;
	
    /** 
     * 属性backDouble4
     */
    private BigDecimal backDouble4;
	
    /** 
     * 属性backDouble5
     */
    private BigDecimal backDouble5;
	
    /** 
     * 属性backDouble6
     */
    private BigDecimal backDouble6;
	
    /** 
     * 属性backDouble7
     */
    private BigDecimal backDouble7;
	
    /** 
     * 属性backDouble8
     */
    private BigDecimal backDouble8;
	
    /** 
     * 属性backDate1
     */
    private Date backDate1;
	
    /** 
     * 属性backDate2
     */
    private Date backDate2;
	
    /** 
     * 属性backDate3
     */
    private Date backDate3;
	
    /**
     * CognosReportQueryindex构造函数
     */
    public CognosReportQueryindex() {
        super();
    }  
	
    /**
     * CognosReportQueryindex完整的构造函数
     */  
    public CognosReportQueryindex(String guid){
        this.guid = guid;
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
     * 属性 querydate 的get方法
     * @return Date
     */
    public Date getQuerydate(){
        return querydate;
    }
	
    /**
     * 属性 querydate 的set方法
     * @return
     */
    public void setQuerydate(Date querydate){
        this.querydate = querydate;
    } 
	
    /**
     * 属性 fuctionid 的get方法
     * @return String
     */
    public String getFuctionid(){
        return fuctionid;
    }
	
    /**
     * 属性 fuctionid 的set方法
     * @return
     */
    public void setFuctionid(String fuctionid){
        this.fuctionid = fuctionid;
    } 
	
    /**
     * 属性 fuctionname 的get方法
     * @return String
     */
    public String getFuctionname(){
        return fuctionname;
    }
	
    /**
     * 属性 fuctionname 的set方法
     * @return
     */
    public void setFuctionname(String fuctionname){
        this.fuctionname = fuctionname;
    } 
	
    /**
     * 属性 typeid 的get方法
     * @return String
     */
    public String getTypeid(){
        return typeid;
    }
	
    /**
     * 属性 typeid 的set方法
     * @return
     */
    public void setTypeid(String typeid){
        this.typeid = typeid;
    } 
	
    /**
     * 属性 typename 的get方法
     * @return String
     */
    public String getTypename(){
        return typename;
    }
	
    /**
     * 属性 typename 的set方法
     * @return
     */
    public void setTypename(String typename){
        this.typename = typename;
    } 
	
    /**
     * 属性 typevalue 的get方法
     * @return String
     */
    public String getTypevalue(){
        return typevalue;
    }
	
    /**
     * 属性 typevalue 的set方法
     * @return
     */
    public void setTypevalue(String typevalue){
        this.typevalue = typevalue;
    } 
	
    /**
     * 属性 backStr1 的get方法
     * @return String
     */
    public String getBackStr1(){
        return backStr1;
    }
	
    /**
     * 属性 backStr1 的set方法
     * @return
     */
    public void setBackStr1(String backStr1){
        this.backStr1 = backStr1;
    } 
	
    /**
     * 属性 backStr2 的get方法
     * @return String
     */
    public String getBackStr2(){
        return backStr2;
    }
	
    /**
     * 属性 backStr2 的set方法
     * @return
     */
    public void setBackStr2(String backStr2){
        this.backStr2 = backStr2;
    } 
	
    /**
     * 属性 backStr3 的get方法
     * @return String
     */
    public String getBackStr3(){
        return backStr3;
    }
	
    /**
     * 属性 backStr3 的set方法
     * @return
     */
    public void setBackStr3(String backStr3){
        this.backStr3 = backStr3;
    } 
	
    /**
     * 属性 backStr4 的get方法
     * @return String
     */
    public String getBackStr4(){
        return backStr4;
    }
	
    /**
     * 属性 backStr4 的set方法
     * @return
     */
    public void setBackStr4(String backStr4){
        this.backStr4 = backStr4;
    } 
	
    /**
     * 属性 backStr5 的get方法
     * @return String
     */
    public String getBackStr5(){
        return backStr5;
    }
	
    /**
     * 属性 backStr5 的set方法
     * @return
     */
    public void setBackStr5(String backStr5){
        this.backStr5 = backStr5;
    } 
	
    /**
     * 属性 backInt1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt1(){
        return backInt1;
    }
	
    /**
     * 属性 backInt1 的set方法
     * @return
     */
    public void setBackInt1(BigDecimal backInt1){
        this.backInt1 = backInt1;
    } 
	
    /**
     * 属性 backInt2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt2(){
        return backInt2;
    }
	
    /**
     * 属性 backInt2 的set方法
     * @return
     */
    public void setBackInt2(BigDecimal backInt2){
        this.backInt2 = backInt2;
    } 
	
    /**
     * 属性 backInt3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt3(){
        return backInt3;
    }
	
    /**
     * 属性 backInt3 的set方法
     * @return
     */
    public void setBackInt3(BigDecimal backInt3){
        this.backInt3 = backInt3;
    } 
	
    /**
     * 属性 backInt4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt4(){
        return backInt4;
    }
	
    /**
     * 属性 backInt4 的set方法
     * @return
     */
    public void setBackInt4(BigDecimal backInt4){
        this.backInt4 = backInt4;
    } 
	
    /**
     * 属性 backInt5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt5(){
        return backInt5;
    }
	
    /**
     * 属性 backInt5 的set方法
     * @return
     */
    public void setBackInt5(BigDecimal backInt5){
        this.backInt5 = backInt5;
    } 
	
    /**
     * 属性 backDouble1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble1(){
        return backDouble1;
    }
	
    /**
     * 属性 backDouble1 的set方法
     * @return
     */
    public void setBackDouble1(BigDecimal backDouble1){
        this.backDouble1 = backDouble1;
    } 
	
    /**
     * 属性 backDouble2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble2(){
        return backDouble2;
    }
	
    /**
     * 属性 backDouble2 的set方法
     * @return
     */
    public void setBackDouble2(BigDecimal backDouble2){
        this.backDouble2 = backDouble2;
    } 
	
    /**
     * 属性 backDouble3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble3(){
        return backDouble3;
    }
	
    /**
     * 属性 backDouble3 的set方法
     * @return
     */
    public void setBackDouble3(BigDecimal backDouble3){
        this.backDouble3 = backDouble3;
    } 
	
    /**
     * 属性 backDouble4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble4(){
        return backDouble4;
    }
	
    /**
     * 属性 backDouble4 的set方法
     * @return
     */
    public void setBackDouble4(BigDecimal backDouble4){
        this.backDouble4 = backDouble4;
    } 
	
    /**
     * 属性 backDouble5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble5(){
        return backDouble5;
    }
	
    /**
     * 属性 backDouble5 的set方法
     * @return
     */
    public void setBackDouble5(BigDecimal backDouble5){
        this.backDouble5 = backDouble5;
    } 
	
    /**
     * 属性 backDouble6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble6(){
        return backDouble6;
    }
	
    /**
     * 属性 backDouble6 的set方法
     * @return
     */
    public void setBackDouble6(BigDecimal backDouble6){
        this.backDouble6 = backDouble6;
    } 
	
    /**
     * 属性 backDouble7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble7(){
        return backDouble7;
    }
	
    /**
     * 属性 backDouble7 的set方法
     * @return
     */
    public void setBackDouble7(BigDecimal backDouble7){
        this.backDouble7 = backDouble7;
    } 
	
    /**
     * 属性 backDouble8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble8(){
        return backDouble8;
    }
	
    /**
     * 属性 backDouble8 的set方法
     * @return
     */
    public void setBackDouble8(BigDecimal backDouble8){
        this.backDouble8 = backDouble8;
    } 
	
    /**
     * 属性 backDate1 的get方法
     * @return Date
     */
    public Date getBackDate1(){
        return backDate1;
    }
	
    /**
     * 属性 backDate1 的set方法
     * @return
     */
    public void setBackDate1(Date backDate1){
        this.backDate1 = backDate1;
    } 
	
    /**
     * 属性 backDate2 的get方法
     * @return Date
     */
    public Date getBackDate2(){
        return backDate2;
    }
	
    /**
     * 属性 backDate2 的set方法
     * @return
     */
    public void setBackDate2(Date backDate2){
        this.backDate2 = backDate2;
    } 
	
    /**
     * 属性 backDate3 的get方法
     * @return Date
     */
    public Date getBackDate3(){
        return backDate3;
    }
	
    /**
     * 属性 backDate3 的set方法
     * @return
     */
    public void setBackDate3(Date backDate3){
        this.backDate3 = backDate3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CognosReportQueryindex))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CognosReportQueryindex other = (CognosReportQueryindex) o;	        
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
            .append("querydate"+":"+getQuerydate())
            .append("fuctionid"+":"+getFuctionid())
            .append("fuctionname"+":"+getFuctionname())
            .append("typeid"+":"+getTypeid())
            .append("typename"+":"+getTypename())
            .append("typevalue"+":"+getTypevalue())
            .append("backStr1"+":"+getBackStr1())
            .append("backStr2"+":"+getBackStr2())
            .append("backStr3"+":"+getBackStr3())
            .append("backStr4"+":"+getBackStr4())
            .append("backStr5"+":"+getBackStr5())
            .append("backInt1"+":"+getBackInt1())
            .append("backInt2"+":"+getBackInt2())
            .append("backInt3"+":"+getBackInt3())
            .append("backInt4"+":"+getBackInt4())
            .append("backInt5"+":"+getBackInt5())
            .append("backDouble1"+":"+getBackDouble1())
            .append("backDouble2"+":"+getBackDouble2())
            .append("backDouble3"+":"+getBackDouble3())
            .append("backDouble4"+":"+getBackDouble4())
            .append("backDouble5"+":"+getBackDouble5())
            .append("backDouble6"+":"+getBackDouble6())
            .append("backDouble7"+":"+getBackDouble7())
            .append("backDouble8"+":"+getBackDouble8())
            .append("backDate1"+":"+getBackDate1())
            .append("backDate2"+":"+getBackDate2())
            .append("backDate3"+":"+getBackDate3())
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