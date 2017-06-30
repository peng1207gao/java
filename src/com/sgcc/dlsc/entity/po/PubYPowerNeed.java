package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubYPowerNeed的POJO类
 *
 * @author  admin  [Fri Mar 28 16:39:14 CST 2014]
 * 
 */
public class PubYPowerNeed implements Serializable{

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
     * 属性electricity1
     */
    private BigDecimal electricity1;
	
    /** 
     * 属性elecTb
     */
    private BigDecimal elecTb;
	
    /** 
     * 属性maxpowerload
     */
    private BigDecimal maxpowerload;
	
    /** 
     * 属性loadTb
     */
    private BigDecimal loadTb;
	
    /** 
     * 属性maxpowerload1
     */
    private BigDecimal maxpowerload1;
	
    /** 
     * 属性maxpowerload2
     */
    private BigDecimal maxpowerload2;
	
    /** 
     * 属性maxpowerload3
     */
    private BigDecimal maxpowerload3;
	
    /** 
     * 属性maxpowerload4
     */
    private BigDecimal maxpowerload4;
	
    /** 
     * 属性maxpowerload5
     */
    private BigDecimal maxpowerload5;
	
    /** 
     * 属性maxpowerload6
     */
    private BigDecimal maxpowerload6;
	
    /** 
     * 属性maxpowerload7
     */
    private BigDecimal maxpowerload7;
	
    /** 
     * 属性maxpowerload8
     */
    private BigDecimal maxpowerload8;
	
    /** 
     * 属性maxpowerload9
     */
    private BigDecimal maxpowerload9;
	
    /** 
     * 属性maxpowerload10
     */
    private BigDecimal maxpowerload10;
	
    /** 
     * 属性maxpowerload11
     */
    private BigDecimal maxpowerload11;
	
    /** 
     * 属性maxpowerload12
     */
    private BigDecimal maxpowerload12;
	
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
     * PubYPowerNeed构造函数
     */
    public PubYPowerNeed() {
        super();
    }  
	
    /**
     * PubYPowerNeed完整的构造函数
     */  
    public PubYPowerNeed(String guid,String marketid,BigDecimal tyear,BigDecimal state,String fillinman,Date fillintime){
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
     * 属性 elecTb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecTb(){
        return elecTb;
    }
	
    /**
     * 属性 elecTb 的set方法
     * @return
     */
    public void setElecTb(BigDecimal elecTb){
        this.elecTb = elecTb;
    } 
	
    /**
     * 属性 maxpowerload 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload(){
        return maxpowerload;
    }
	
    /**
     * 属性 maxpowerload 的set方法
     * @return
     */
    public void setMaxpowerload(BigDecimal maxpowerload){
        this.maxpowerload = maxpowerload;
    } 
	
    /**
     * 属性 loadTb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoadTb(){
        return loadTb;
    }
	
    /**
     * 属性 loadTb 的set方法
     * @return
     */
    public void setLoadTb(BigDecimal loadTb){
        this.loadTb = loadTb;
    } 
	
    /**
     * 属性 maxpowerload1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload1(){
        return maxpowerload1;
    }
	
    /**
     * 属性 maxpowerload1 的set方法
     * @return
     */
    public void setMaxpowerload1(BigDecimal maxpowerload1){
        this.maxpowerload1 = maxpowerload1;
    } 
	
    /**
     * 属性 maxpowerload2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload2(){
        return maxpowerload2;
    }
	
    /**
     * 属性 maxpowerload2 的set方法
     * @return
     */
    public void setMaxpowerload2(BigDecimal maxpowerload2){
        this.maxpowerload2 = maxpowerload2;
    } 
	
    /**
     * 属性 maxpowerload3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload3(){
        return maxpowerload3;
    }
	
    /**
     * 属性 maxpowerload3 的set方法
     * @return
     */
    public void setMaxpowerload3(BigDecimal maxpowerload3){
        this.maxpowerload3 = maxpowerload3;
    } 
	
    /**
     * 属性 maxpowerload4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload4(){
        return maxpowerload4;
    }
	
    /**
     * 属性 maxpowerload4 的set方法
     * @return
     */
    public void setMaxpowerload4(BigDecimal maxpowerload4){
        this.maxpowerload4 = maxpowerload4;
    } 
	
    /**
     * 属性 maxpowerload5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload5(){
        return maxpowerload5;
    }
	
    /**
     * 属性 maxpowerload5 的set方法
     * @return
     */
    public void setMaxpowerload5(BigDecimal maxpowerload5){
        this.maxpowerload5 = maxpowerload5;
    } 
	
    /**
     * 属性 maxpowerload6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload6(){
        return maxpowerload6;
    }
	
    /**
     * 属性 maxpowerload6 的set方法
     * @return
     */
    public void setMaxpowerload6(BigDecimal maxpowerload6){
        this.maxpowerload6 = maxpowerload6;
    } 
	
    /**
     * 属性 maxpowerload7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload7(){
        return maxpowerload7;
    }
	
    /**
     * 属性 maxpowerload7 的set方法
     * @return
     */
    public void setMaxpowerload7(BigDecimal maxpowerload7){
        this.maxpowerload7 = maxpowerload7;
    } 
	
    /**
     * 属性 maxpowerload8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload8(){
        return maxpowerload8;
    }
	
    /**
     * 属性 maxpowerload8 的set方法
     * @return
     */
    public void setMaxpowerload8(BigDecimal maxpowerload8){
        this.maxpowerload8 = maxpowerload8;
    } 
	
    /**
     * 属性 maxpowerload9 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload9(){
        return maxpowerload9;
    }
	
    /**
     * 属性 maxpowerload9 的set方法
     * @return
     */
    public void setMaxpowerload9(BigDecimal maxpowerload9){
        this.maxpowerload9 = maxpowerload9;
    } 
	
    /**
     * 属性 maxpowerload10 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload10(){
        return maxpowerload10;
    }
	
    /**
     * 属性 maxpowerload10 的set方法
     * @return
     */
    public void setMaxpowerload10(BigDecimal maxpowerload10){
        this.maxpowerload10 = maxpowerload10;
    } 
	
    /**
     * 属性 maxpowerload11 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload11(){
        return maxpowerload11;
    }
	
    /**
     * 属性 maxpowerload11 的set方法
     * @return
     */
    public void setMaxpowerload11(BigDecimal maxpowerload11){
        this.maxpowerload11 = maxpowerload11;
    } 
	
    /**
     * 属性 maxpowerload12 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpowerload12(){
        return maxpowerload12;
    }
	
    /**
     * 属性 maxpowerload12 的set方法
     * @return
     */
    public void setMaxpowerload12(BigDecimal maxpowerload12){
        this.maxpowerload12 = maxpowerload12;
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
		
        if (o == null || !(o instanceof PubYPowerNeed))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubYPowerNeed other = (PubYPowerNeed) o;	        
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
            .append("electricity1"+":"+getElectricity1())
            .append("elecTb"+":"+getElecTb())
            .append("maxpowerload"+":"+getMaxpowerload())
            .append("loadTb"+":"+getLoadTb())
            .append("maxpowerload1"+":"+getMaxpowerload1())
            .append("maxpowerload2"+":"+getMaxpowerload2())
            .append("maxpowerload3"+":"+getMaxpowerload3())
            .append("maxpowerload4"+":"+getMaxpowerload4())
            .append("maxpowerload5"+":"+getMaxpowerload5())
            .append("maxpowerload6"+":"+getMaxpowerload6())
            .append("maxpowerload7"+":"+getMaxpowerload7())
            .append("maxpowerload8"+":"+getMaxpowerload8())
            .append("maxpowerload9"+":"+getMaxpowerload9())
            .append("maxpowerload10"+":"+getMaxpowerload10())
            .append("maxpowerload11"+":"+getMaxpowerload11())
            .append("maxpowerload12"+":"+getMaxpowerload12())
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