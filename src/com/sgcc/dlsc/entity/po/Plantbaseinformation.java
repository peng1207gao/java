package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Plantbaseinformation的POJO类
 *
 * @author  Administrator  [Sat Jun 15 14:49:02 CST 2013]
 * 
 */
public class Plantbaseinformation implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性plantid
     */
    private String plantid;
	
    /** 
     * 属性stationname
     */
    private String stationname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性linkarea
     */
    private String linkarea;
	
    /** 
     * 属性gentype
     */
    private BigDecimal gentype;
	
    /** 
     * 属性dispatchdepartment
     */
    private String dispatchdepartment;
	
    /** 
     * 属性usetype
     */
    private BigDecimal usetype;
	
    /** 
     * 属性voltagelevel
     */
    private BigDecimal voltagelevel;
	
    /** 
     * 属性totalcapacity
     */
    private BigDecimal totalcapacity;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性remarks
     */
    private String remarks;
	
    /** 
     * 属性bakStr1
     */
    private String bakStr1;
	
    /** 
     * 属性bakStr2
     */
    private String bakStr2;
	
    /** 
     * 属性bakStr3
     */
    private String bakStr3;
	
    /** 
     * 属性bakInt1
     */
    private BigDecimal bakInt1;
	
    /** 
     * 属性bakInt2
     */
    private BigDecimal bakInt2;
	
    /** 
     * 属性bakInt3
     */
    private BigDecimal bakInt3;
	
    /** 
     * 属性bakDouble1
     */
    private BigDecimal bakDouble1;
	
    /** 
     * 属性bakDouble2
     */
    private BigDecimal bakDouble2;
	
    /** 
     * 属性bakDouble3
     */
    private BigDecimal bakDouble3;
	
    /** 
     * 属性bakDate1
     */
    private Date bakDate1;
	
    /** 
     * 属性bakDate2
     */
    private Date bakDate2;
	
    /** 
     * 属性bakDate3
     */
    private Date bakDate3;
	
    /**
     * Plantbaseinformation构造函数
     */
    public Plantbaseinformation() {
        super();
    }  
	
    /**
     * Plantbaseinformation完整的构造函数
     */  
    public Plantbaseinformation(String plantid,String stationname,BigDecimal gentype,String dispatchdepartment,BigDecimal usetype){
        this.plantid = plantid;
        this.stationname = stationname;
        this.gentype = gentype;
        this.dispatchdepartment = dispatchdepartment;
        this.usetype = usetype;
    }
 
    /**
     * 属性 plantid 的get方法
     * @return String
     */
    public String getPlantid(){
        return plantid;
    }
	
    /**
     * 属性 plantid 的set方法
     * @return
     */
    public void setPlantid(String plantid){
        if(plantid != null && plantid.trim().length() == 0){
            this.plantid = null;
        }else{
            this.plantid = plantid;
        }
    } 
	
    /**
     * 属性 stationname 的get方法
     * @return String
     */
    public String getStationname(){
        return stationname;
    }
	
    /**
     * 属性 stationname 的set方法
     * @return
     */
    public void setStationname(String stationname){
        this.stationname = stationname;
    } 
	
    /**
     * 属性 aliasname 的get方法
     * @return String
     */
    public String getAliasname(){
        return aliasname;
    }
	
    /**
     * 属性 aliasname 的set方法
     * @return
     */
    public void setAliasname(String aliasname){
        this.aliasname = aliasname;
    } 
	
    /**
     * 属性 linkarea 的get方法
     * @return String
     */
    public String getLinkarea(){
        return linkarea;
    }
	
    /**
     * 属性 linkarea 的set方法
     * @return
     */
    public void setLinkarea(String linkarea){
        this.linkarea = linkarea;
    } 
	
    /**
     * 属性 gentype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGentype(){
        return gentype;
    }
	
    /**
     * 属性 gentype 的set方法
     * @return
     */
    public void setGentype(BigDecimal gentype){
        this.gentype = gentype;
    } 
	
    /**
     * 属性 dispatchdepartment 的get方法
     * @return String
     */
    public String getDispatchdepartment(){
        return dispatchdepartment;
    }
	
    /**
     * 属性 dispatchdepartment 的set方法
     * @return
     */
    public void setDispatchdepartment(String dispatchdepartment){
        this.dispatchdepartment = dispatchdepartment;
    } 
	
    /**
     * 属性 usetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUsetype(){
        return usetype;
    }
	
    /**
     * 属性 usetype 的set方法
     * @return
     */
    public void setUsetype(BigDecimal usetype){
        this.usetype = usetype;
    } 
	
    /**
     * 属性 voltagelevel 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVoltagelevel(){
        return voltagelevel;
    }
	
    /**
     * 属性 voltagelevel 的set方法
     * @return
     */
    public void setVoltagelevel(BigDecimal voltagelevel){
        this.voltagelevel = voltagelevel;
    } 
	
    /**
     * 属性 totalcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTotalcapacity(){
        return totalcapacity;
    }
	
    /**
     * 属性 totalcapacity 的set方法
     * @return
     */
    public void setTotalcapacity(BigDecimal totalcapacity){
        this.totalcapacity = totalcapacity;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 remarks 的get方法
     * @return String
     */
    public String getRemarks(){
        return remarks;
    }
	
    /**
     * 属性 remarks 的set方法
     * @return
     */
    public void setRemarks(String remarks){
        this.remarks = remarks;
    } 
	
    /**
     * 属性 bakStr1 的get方法
     * @return String
     */
    public String getBakStr1(){
        return bakStr1;
    }
	
    /**
     * 属性 bakStr1 的set方法
     * @return
     */
    public void setBakStr1(String bakStr1){
        this.bakStr1 = bakStr1;
    } 
	
    /**
     * 属性 bakStr2 的get方法
     * @return String
     */
    public String getBakStr2(){
        return bakStr2;
    }
	
    /**
     * 属性 bakStr2 的set方法
     * @return
     */
    public void setBakStr2(String bakStr2){
        this.bakStr2 = bakStr2;
    } 
	
    /**
     * 属性 bakStr3 的get方法
     * @return String
     */
    public String getBakStr3(){
        return bakStr3;
    }
	
    /**
     * 属性 bakStr3 的set方法
     * @return
     */
    public void setBakStr3(String bakStr3){
        this.bakStr3 = bakStr3;
    } 
	
    /**
     * 属性 bakInt1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt1(){
        return bakInt1;
    }
	
    /**
     * 属性 bakInt1 的set方法
     * @return
     */
    public void setBakInt1(BigDecimal bakInt1){
        this.bakInt1 = bakInt1;
    } 
	
    /**
     * 属性 bakInt2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt2(){
        return bakInt2;
    }
	
    /**
     * 属性 bakInt2 的set方法
     * @return
     */
    public void setBakInt2(BigDecimal bakInt2){
        this.bakInt2 = bakInt2;
    } 
	
    /**
     * 属性 bakInt3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt3(){
        return bakInt3;
    }
	
    /**
     * 属性 bakInt3 的set方法
     * @return
     */
    public void setBakInt3(BigDecimal bakInt3){
        this.bakInt3 = bakInt3;
    } 
	
    /**
     * 属性 bakDouble1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble1(){
        return bakDouble1;
    }
	
    /**
     * 属性 bakDouble1 的set方法
     * @return
     */
    public void setBakDouble1(BigDecimal bakDouble1){
        this.bakDouble1 = bakDouble1;
    } 
	
    /**
     * 属性 bakDouble2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble2(){
        return bakDouble2;
    }
	
    /**
     * 属性 bakDouble2 的set方法
     * @return
     */
    public void setBakDouble2(BigDecimal bakDouble2){
        this.bakDouble2 = bakDouble2;
    } 
	
    /**
     * 属性 bakDouble3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble3(){
        return bakDouble3;
    }
	
    /**
     * 属性 bakDouble3 的set方法
     * @return
     */
    public void setBakDouble3(BigDecimal bakDouble3){
        this.bakDouble3 = bakDouble3;
    } 
	
    /**
     * 属性 bakDate1 的get方法
     * @return Date
     */
    public Date getBakDate1(){
        return bakDate1;
    }
	
    /**
     * 属性 bakDate1 的set方法
     * @return
     */
    public void setBakDate1(Date bakDate1){
        this.bakDate1 = bakDate1;
    } 
	
    /**
     * 属性 bakDate2 的get方法
     * @return Date
     */
    public Date getBakDate2(){
        return bakDate2;
    }
	
    /**
     * 属性 bakDate2 的set方法
     * @return
     */
    public void setBakDate2(Date bakDate2){
        this.bakDate2 = bakDate2;
    } 
	
    /**
     * 属性 bakDate3 的get方法
     * @return Date
     */
    public Date getBakDate3(){
        return bakDate3;
    }
	
    /**
     * 属性 bakDate3 的set方法
     * @return
     */
    public void setBakDate3(Date bakDate3){
        this.bakDate3 = bakDate3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof Plantbaseinformation))
	        return false; 
			
        if(getPlantid() == null) 
	        return false;

        Plantbaseinformation other = (Plantbaseinformation) o;	        
	    return new EqualsBuilder()
            .append(this.getPlantid(), other.getPlantid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("plantid"+":"+getPlantid())
            .append("stationname"+":"+getStationname())
            .append("aliasname"+":"+getAliasname())
            .append("linkarea"+":"+getLinkarea())
            .append("gentype"+":"+getGentype())
            .append("dispatchdepartment"+":"+getDispatchdepartment())
            .append("usetype"+":"+getUsetype())
            .append("voltagelevel"+":"+getVoltagelevel())
            .append("totalcapacity"+":"+getTotalcapacity())
            .append("updatetime"+":"+getUpdatetime())
            .append("remarks"+":"+getRemarks())
            .append("bakStr1"+":"+getBakStr1())
            .append("bakStr2"+":"+getBakStr2())
            .append("bakStr3"+":"+getBakStr3())
            .append("bakInt1"+":"+getBakInt1())
            .append("bakInt2"+":"+getBakInt2())
            .append("bakInt3"+":"+getBakInt3())
            .append("bakDouble1"+":"+getBakDouble1())
            .append("bakDouble2"+":"+getBakDouble2())
            .append("bakDouble3"+":"+getBakDouble3())
            .append("bakDate1"+":"+getBakDate1())
            .append("bakDate2"+":"+getBakDate2())
            .append("bakDate3"+":"+getBakDate3())
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