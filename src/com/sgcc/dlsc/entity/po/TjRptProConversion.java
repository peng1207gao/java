package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjRptProConversion的POJO类
 *
 * @author  admin  [Wed Jul 23 15:54:55 CST 2014]
 * 
 */
public class TjRptProConversion implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性ttype
     */
    private String ttype;
	
    /** 
     * 属性tdesc
     */
    private String tdesc;
	
    /** 
     * 属性tsql
     */
    private String tsql;
	
    /** 
     * 属性moduleid
     */
    private String moduleid;
	
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
     * TjRptProConversion构造函数
     */
    public TjRptProConversion() {
        super();
    }  
	
    /**
     * TjRptProConversion完整的构造函数
     */  
    public TjRptProConversion(String guid,String ttype){
        this.guid = guid;
        this.ttype = ttype;
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
     * 属性 ttype 的get方法
     * @return String
     */
    public String getTtype(){
        return ttype;
    }
	
    /**
     * 属性 ttype 的set方法
     * @return
     */
    public void setTtype(String ttype){
        this.ttype = ttype;
    } 
	
    /**
     * 属性 tdesc 的get方法
     * @return String
     */
    public String getTdesc(){
        return tdesc;
    }
	
    /**
     * 属性 tdesc 的set方法
     * @return
     */
    public void setTdesc(String tdesc){
        this.tdesc = tdesc;
    } 
	
    /**
     * 属性 tsql 的get方法
     * @return String
     */
    public String getTsql(){
        return tsql;
    }
	
    /**
     * 属性 tsql 的set方法
     * @return
     */
    public void setTsql(String tsql){
        this.tsql = tsql;
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
		
        if (o == null || !(o instanceof TjRptProConversion))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjRptProConversion other = (TjRptProConversion) o;	        
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
            .append("ttype"+":"+getTtype())
            .append("tdesc"+":"+getTdesc())
            .append("tsql"+":"+getTsql())
            .append("moduleid"+":"+getModuleid())
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