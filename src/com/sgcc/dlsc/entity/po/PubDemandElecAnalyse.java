package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubDemandElecAnalyse的POJO类
 *
 * @author  Administrator  [Mon Mar 10 10:01:32 GMT+08:00 2014]
 * 
 */
public class PubDemandElecAnalyse implements Serializable{

    /**
	 * 
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
     * 属性tyear
     */
    private Integer tyear;
	
    /** 
     * 属性tmonth
     */
    private Integer tmonth;
	
    /** 
     * 属性electricity1
     */
    private BigDecimal electricity1;
	
    /** 
     * 属性elecTb1
     */
    private BigDecimal elecTb1;
	
    /** 
     * 属性electricity2
     */
    private BigDecimal electricity2;
	
    /** 
     * 属性elecTb2
     */
    private BigDecimal elecTb2;
	
    /** 
     * 属性electricity3
     */
    private BigDecimal electricity3;
	
    /** 
     * 属性elecTb3
     */
    private BigDecimal elecTb3;
	
    /** 
     * 属性electricity4
     */
    private BigDecimal electricity4;
	
    /** 
     * 属性elecTb4
     */
    private BigDecimal elecTb4;
	
    /** 
     * 属性electricity5
     */
    private BigDecimal electricity5;
	
    /** 
     * 属性elecTb5
     */
    private BigDecimal elecTb5;
	
    /** 
     * 属性loadfactor
     */
    private BigDecimal loadfactor;
	
    /** 
     * 属性loadfactorTb
     */
    private BigDecimal loadfactorTb;
	
    /** 
     * 属性maxpowerload
     */
    private BigDecimal maxpowerload;
	
    /** 
     * 属性loadTime
     */
    private Date loadTime;
	
    /** 
     * 属性loadTb
     */
    private BigDecimal loadTb;
	
    /** 
     * 属性electricity6
     */
    private BigDecimal electricity6;
	
    /** 
     * 属性elecTime
     */
    private Date elecTime;
	
    /** 
     * 属性elecTb6
     */
    private BigDecimal elecTb6;
	
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
     * PubDemandElecAnalyse构造函数
     */
    public PubDemandElecAnalyse() {
        super();
    }  
	
    /**
     * PubDemandElecAnalyse完整的构造函数
     */  
    public PubDemandElecAnalyse(String guid,String marketid,Integer tyear,Integer tmonth,Integer state,String fillinman,Date fillintime){
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
     * 属性 tmonth 的get方法
     * @return Integer
     */
    public Integer getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(Integer tmonth){
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
     * 属性 elecTb1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecTb1(){
        return elecTb1;
    }
	
    /**
     * 属性 elecTb1 的set方法
     * @return
     */
    public void setElecTb1(BigDecimal elecTb1){
        this.elecTb1 = elecTb1;
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
     * 属性 elecTb2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecTb2(){
        return elecTb2;
    }
	
    /**
     * 属性 elecTb2 的set方法
     * @return
     */
    public void setElecTb2(BigDecimal elecTb2){
        this.elecTb2 = elecTb2;
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
     * 属性 elecTb3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecTb3(){
        return elecTb3;
    }
	
    /**
     * 属性 elecTb3 的set方法
     * @return
     */
    public void setElecTb3(BigDecimal elecTb3){
        this.elecTb3 = elecTb3;
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
     * 属性 elecTb4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecTb4(){
        return elecTb4;
    }
	
    /**
     * 属性 elecTb4 的set方法
     * @return
     */
    public void setElecTb4(BigDecimal elecTb4){
        this.elecTb4 = elecTb4;
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
     * 属性 elecTb5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecTb5(){
        return elecTb5;
    }
	
    /**
     * 属性 elecTb5 的set方法
     * @return
     */
    public void setElecTb5(BigDecimal elecTb5){
        this.elecTb5 = elecTb5;
    } 
	
    /**
     * 属性 loadfactor 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoadfactor(){
        return loadfactor;
    }
	
    /**
     * 属性 loadfactor 的set方法
     * @return
     */
    public void setLoadfactor(BigDecimal loadfactor){
        this.loadfactor = loadfactor;
    } 
	
    /**
     * 属性 loadfactorTb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoadfactorTb(){
        return loadfactorTb;
    }
	
    /**
     * 属性 loadfactorTb 的set方法
     * @return
     */
    public void setLoadfactorTb(BigDecimal loadfactorTb){
        this.loadfactorTb = loadfactorTb;
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
     * 属性 loadTime 的get方法
     * @return Date
     */
    public Date getLoadTime(){
        return loadTime;
    }
	
    /**
     * 属性 loadTime 的set方法
     * @return
     */
    public void setLoadTime(Date loadTime){
        this.loadTime = loadTime;
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
     * 属性 elecTime 的get方法
     * @return Date
     */
    public Date getElecTime(){
        return elecTime;
    }
	
    /**
     * 属性 elecTime 的set方法
     * @return
     */
    public void setElecTime(Date elecTime){
        this.elecTime = elecTime;
    } 
	
    /**
     * 属性 elecTb6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecTb6(){
        return elecTb6;
    }
	
    /**
     * 属性 elecTb6 的set方法
     * @return
     */
    public void setElecTb6(BigDecimal elecTb6){
        this.elecTb6 = elecTb6;
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
		
        if (o == null || !(o instanceof PubDemandElecAnalyse))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubDemandElecAnalyse other = (PubDemandElecAnalyse) o;	        
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
            .append("elecTb1"+":"+getElecTb1())
            .append("electricity2"+":"+getElectricity2())
            .append("elecTb2"+":"+getElecTb2())
            .append("electricity3"+":"+getElectricity3())
            .append("elecTb3"+":"+getElecTb3())
            .append("electricity4"+":"+getElectricity4())
            .append("elecTb4"+":"+getElecTb4())
            .append("electricity5"+":"+getElectricity5())
            .append("elecTb5"+":"+getElecTb5())
            .append("loadfactor"+":"+getLoadfactor())
            .append("loadfactorTb"+":"+getLoadfactorTb())
            .append("maxpowerload"+":"+getMaxpowerload())
            .append("loadTime"+":"+getLoadTime())
            .append("loadTb"+":"+getLoadTb())
            .append("electricity6"+":"+getElectricity6())
            .append("elecTime"+":"+getElecTime())
            .append("elecTb6"+":"+getElecTb6())
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