package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubSupplyDevputin的POJO类
 *
 * @author  yangguang  [Mon Mar 10 15:32:41 CST 2014]
 * 
 */
public class PubSupplyDevputin implements Serializable{

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
     * 属性mode
     */
    private String tmode;
	
    /** 
     * 属性devtype
     */
    private String devtype;
	
    /** 
     * 属性devname
     */
    private String devname;
	
    /** 
     * 属性voltage
     */
    private String voltage;
	
    /** 
     * 属性intime
     */
    private Date intime;
	
    /** 
     * 属性capacity
     */
    private BigDecimal capacity;
	
    /** 
     * 属性units
     */
    private String units;
	
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
     * PubSupplyDevputin构造函数
     */
    public PubSupplyDevputin() {
        super();
    }  
	
    /**
     * PubSupplyDevputin完整的构造函数
     */  
    public PubSupplyDevputin(String guid,String marketid,int tyear,int tmonth,int state,String fillinman,Date fillintime){
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
	
  
	
    public String getTmode() {
		return tmode;
	}

	public void setTmode(String tmode) {
		this.tmode = tmode;
	}

	/**
     * 属性 devtype 的get方法
     * @return String
     */
    public String getDevtype(){
        return devtype;
    }
	
    /**
     * 属性 devtype 的set方法
     * @return
     */
    public void setDevtype(String devtype){
        this.devtype = devtype;
    } 
	
    /**
     * 属性 devname 的get方法
     * @return String
     */
    public String getDevname(){
        return devname;
    }
	
    /**
     * 属性 devname 的set方法
     * @return
     */
    public void setDevname(String devname){
        this.devname = devname;
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
     * 属性 intime 的get方法
     * @return Date
     */
    public Date getIntime(){
        return intime;
    }
	
    /**
     * 属性 intime 的set方法
     * @return
     */
    public void setIntime(Date intime){
        this.intime = intime;
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
     * 属性 units 的get方法
     * @return String
     */
    public String getUnits(){
        return units;
    }
	
    /**
     * 属性 units 的set方法
     * @return
     */
    public void setUnits(String units){
        this.units = units;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubSupplyDevputin))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubSupplyDevputin other = (PubSupplyDevputin) o;	        
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
            .append("mode"+":"+getTmode())
            .append("devtype"+":"+getDevtype())
            .append("devname"+":"+getDevname())
            .append("voltage"+":"+getVoltage())
            .append("intime"+":"+getIntime())
            .append("capacity"+":"+getCapacity())
            .append("units"+":"+getUnits())
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