package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubSupplyCoalusehour的POJO类
 *
 * @author  Administrator  [Sat Mar 01 10:44:06 CST 2014]
 * 
 */
public class PubSupplyCoalusehour implements Serializable{

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
     * 属性tmonth
     */
    private BigDecimal tmonth;
	
    /** 
     * 属性electricity1
     */
    private BigDecimal electricity1;
	
    /** 
     * 属性aveHours1
     */
    private BigDecimal aveHours1;
	
    /** 
     * 属性electricity2
     */
    private BigDecimal electricity2;
	
    /** 
     * 属性aveHours2
     */
    private BigDecimal aveHours2;
	
    /** 
     * 属性electricity3
     */
    private BigDecimal electricity3;
	
    /** 
     * 属性aveHours3
     */
    private BigDecimal aveHours3;
	
    /** 
     * 属性electricity4
     */
    private BigDecimal electricity4;
	
    /** 
     * 属性aveHours4
     */
    private BigDecimal aveHours4;
	
    /** 
     * 属性electricity5
     */
    private BigDecimal electricity5;
	
    /** 
     * 属性aveHours5
     */
    private BigDecimal aveHours5;
	
    /** 
     * 属性electricity6
     */
    private BigDecimal electricity6;
	
    /** 
     * 属性aveHours6
     */
    private BigDecimal aveHours6;
	
    /** 
     * 属性electricity7
     */
    private BigDecimal electricity7;
	
    /** 
     * 属性aveHours7
     */
    private BigDecimal aveHours7;
	
    /** 
     * 属性electricity8
     */
    private BigDecimal electricity8;
	
    /** 
     * 属性aveHours8
     */
    private BigDecimal aveHours8;
	
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
     * PubSupplyCoalusehour构造函数
     */
    public PubSupplyCoalusehour() {
        super();
    }  
	
    /**
     * PubSupplyCoalusehour完整的构造函数
     */  
    public PubSupplyCoalusehour(String guid,String marketid,BigDecimal tyear,BigDecimal tmonth,BigDecimal state,String fillinman,Date fillintime){
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
     * 属性 tmonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(BigDecimal tmonth){
        this.tmonth = tmonth;
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
     * 属性 aveHours1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAveHours1(){
        return aveHours1;
    }
	
    /**
     * 属性 aveHours1 的set方法
     * @return
     */
    public void setAveHours1(BigDecimal aveHours1){
        this.aveHours1 = aveHours1;
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
     * 属性 aveHours2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAveHours2(){
        return aveHours2;
    }
	
    /**
     * 属性 aveHours2 的set方法
     * @return
     */
    public void setAveHours2(BigDecimal aveHours2){
        this.aveHours2 = aveHours2;
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
     * 属性 aveHours3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAveHours3(){
        return aveHours3;
    }
	
    /**
     * 属性 aveHours3 的set方法
     * @return
     */
    public void setAveHours3(BigDecimal aveHours3){
        this.aveHours3 = aveHours3;
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
     * 属性 aveHours4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAveHours4(){
        return aveHours4;
    }
	
    /**
     * 属性 aveHours4 的set方法
     * @return
     */
    public void setAveHours4(BigDecimal aveHours4){
        this.aveHours4 = aveHours4;
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
     * 属性 aveHours5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAveHours5(){
        return aveHours5;
    }
	
    /**
     * 属性 aveHours5 的set方法
     * @return
     */
    public void setAveHours5(BigDecimal aveHours5){
        this.aveHours5 = aveHours5;
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
     * 属性 aveHours6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAveHours6(){
        return aveHours6;
    }
	
    /**
     * 属性 aveHours6 的set方法
     * @return
     */
    public void setAveHours6(BigDecimal aveHours6){
        this.aveHours6 = aveHours6;
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
     * 属性 aveHours7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAveHours7(){
        return aveHours7;
    }
	
    /**
     * 属性 aveHours7 的set方法
     * @return
     */
    public void setAveHours7(BigDecimal aveHours7){
        this.aveHours7 = aveHours7;
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
     * 属性 aveHours8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAveHours8(){
        return aveHours8;
    }
	
    /**
     * 属性 aveHours8 的set方法
     * @return
     */
    public void setAveHours8(BigDecimal aveHours8){
        this.aveHours8 = aveHours8;
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
		
        if (o == null || !(o instanceof PubSupplyCoalusehour))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubSupplyCoalusehour other = (PubSupplyCoalusehour) o;	        
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
            .append("electricity1"+":"+getElectricity1())
            .append("aveHours1"+":"+getAveHours1())
            .append("electricity2"+":"+getElectricity2())
            .append("aveHours2"+":"+getAveHours2())
            .append("electricity3"+":"+getElectricity3())
            .append("aveHours3"+":"+getAveHours3())
            .append("electricity4"+":"+getElectricity4())
            .append("aveHours4"+":"+getAveHours4())
            .append("electricity5"+":"+getElectricity5())
            .append("aveHours5"+":"+getAveHours5())
            .append("electricity6"+":"+getElectricity6())
            .append("aveHours6"+":"+getAveHours6())
            .append("electricity7"+":"+getElectricity7())
            .append("aveHours7"+":"+getAveHours7())
            .append("electricity8"+":"+getElectricity8())
            .append("aveHours8"+":"+getAveHours8())
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