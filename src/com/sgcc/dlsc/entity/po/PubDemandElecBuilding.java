package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubDemandElecBuilding的POJO类
 *
 * @author  Administrator  [Mon Mar 10 09:37:16 CST 2014]
 * 
 */
public class PubDemandElecBuilding implements Serializable{

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
    private Integer tyear;
	
    /** 
     * 属性tquarter
     */
    private Integer tquarter;
	
    /** 
     * 属性voltage
     */
    private String voltage;
	
    /** 
     * 属性stationnums
     */
    private BigDecimal stationnums;
	
    /** 
     * 属性stationnumskg
     */
    private BigDecimal stationnumskg;
	
    /** 
     * 属性transformernums
     */
    private BigDecimal transformernums;
	
    /** 
     * 属性capacity
     */
    private BigDecimal capacity;
	
    /** 
     * 属性linenums
     */
    private BigDecimal linenums;
	
    /** 
     * 属性state
     */
    private Integer state;
	
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
     * PubDemandElecBuilding构造函数
     */
    public PubDemandElecBuilding() {
        super();
    }  
	
    /**
     * PubDemandElecBuilding完整的构造函数
     */  
    public PubDemandElecBuilding(String guid,String marketid,Integer tyear,Integer tquarter,Integer state,String fillinman,Date fillintime){
        this.guid = guid;
        this.marketid = marketid;
        this.tyear = tyear;
        this.tquarter = tquarter;
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
     * @return Integer
     */
    public Integer getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(Integer tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tquarter 的get方法
     * @return Integer
     */
    public Integer getTquarter(){
        return tquarter;
    }
	
    /**
     * 属性 tquarter 的set方法
     * @return
     */
    public void setTquarter(Integer tquarter){
        this.tquarter = tquarter;
    } 
	
    /**
     * 属性 voltage 的get方法
     * @return String
     */
    public String getVoltage(){
        return voltage;
    }
	
    /**
     * 属性 voltage 的set方法
     * @return
     */
    public void setVoltage(String voltage){
        this.voltage = voltage;
    } 
	
    /**
     * 属性 stationnums 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStationnums(){
        return stationnums;
    }
	
    /**
     * 属性 stationnums 的set方法
     * @return
     */
    public void setStationnums(BigDecimal stationnums){
        this.stationnums = stationnums;
    } 
	
    /**
     * 属性 stationnumskg 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStationnumskg(){
        return stationnumskg;
    }
	
    /**
     * 属性 stationnumskg 的set方法
     * @return
     */
    public void setStationnumskg(BigDecimal stationnumskg){
        this.stationnumskg = stationnumskg;
    } 
	
    /**
     * 属性 transformernums 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransformernums(){
        return transformernums;
    }
	
    /**
     * 属性 transformernums 的set方法
     * @return
     */
    public void setTransformernums(BigDecimal transformernums){
        this.transformernums = transformernums;
    } 
	
    /**
     * 属性 capacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacity(){
        return capacity;
    }
	
    /**
     * 属性 capacity 的set方法
     * @return
     */
    public void setCapacity(BigDecimal capacity){
        this.capacity = capacity;
    } 
	
    /**
     * 属性 linenums 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLinenums(){
        return linenums;
    }
	
    /**
     * 属性 linenums 的set方法
     * @return
     */
    public void setLinenums(BigDecimal linenums){
        this.linenums = linenums;
    } 
	
    /**
     * 属性 state 的get方法
     * @return Integer
     */
    public Integer getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(Integer state){
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubDemandElecBuilding))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubDemandElecBuilding other = (PubDemandElecBuilding) o;	        
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
            .append("tquarter"+":"+getTquarter())
            .append("voltage"+":"+getVoltage())
            .append("stationnums"+":"+getStationnums())
            .append("stationnumskg"+":"+getStationnumskg())
            .append("transformernums"+":"+getTransformernums())
            .append("capacity"+":"+getCapacity())
            .append("linenums"+":"+getLinenums())
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