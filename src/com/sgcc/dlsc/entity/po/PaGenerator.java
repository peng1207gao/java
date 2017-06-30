package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PaGenerator的POJO类
 *
 * @author  Administrator  [Sat Jun 15 14:49:08 CST 2013]
 * 
 */
public class PaGenerator implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性generatorid
     */
    private String generatorid;
	
    /** 
     * 属性generatorname
     */
    private String generatorname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性plantid
     */
    private String plantid;
	
    /** 
     * 属性generatortype
     */
    private BigDecimal generatortype;
	
    /** 
     * 属性generatortypesub
     */
    private BigDecimal generatortypesub;
	
    /** 
     * 属性commercialtype
     */
    private BigDecimal commercialtype;
	
    /** 
     * 属性dispatchtype
     */
    private BigDecimal dispatchtype;
	
    /** 
     * 属性generatorratedcap
     */
    private BigDecimal generatorratedcap;
	
    /** 
     * 属性addcapacity
     */
    private BigDecimal addcapacity;
	
    /** 
     * 属性generatorratednetcap
     */
    private BigDecimal generatorratednetcap;
	
    /** 
     * 属性maxtecpower
     */
    private BigDecimal maxtecpower;
	
    /** 
     * 属性mintecpower
     */
    private BigDecimal mintecpower;
	
    /** 
     * 属性emermaxnetpower
     */
    private BigDecimal emermaxnetpower;
	
    /** 
     * 属性generatorvoltage
     */
    private BigDecimal generatorvoltage;
	
    /** 
     * 属性coalconsumeratio
     */
    private BigDecimal coalconsumeratio;
	
    /** 
     * 属性opbegindate
     */
    private Date opbegindate;
	
    /** 
     * 属性opstopdate
     */
    private Date opstopdate;
	
    /** 
     * 属性commercialbegindate
     */
    private Date commercialbegindate;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性connectvoltage
     */
    private BigDecimal connectvoltage;
	
    /** 
     * 属性desulfurateratio
     */
    private BigDecimal desulfurateratio;
	
    /** 
     * 属性denoxratio
     */
    private BigDecimal denoxratio;
	
    /** 
     * 属性desaltpetreratio
     */
    private BigDecimal desaltpetreratio;
	
    /** 
     * 属性co2ratio
     */
    private BigDecimal co2ratio;
	
    /** 
     * 属性dustratio
     */
    private BigDecimal dustratio;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
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
     * PaGenerator构造函数
     */
    public PaGenerator() {
        super();
    }  
	
    /**
     * PaGenerator完整的构造函数
     */  
    public PaGenerator(String generatorid,String generatorname,String plantid,BigDecimal generatortype,BigDecimal generatorratedcap,BigDecimal addcapacity,BigDecimal generatorratednetcap){
        this.generatorid = generatorid;
        this.generatorname = generatorname;
        this.plantid = plantid;
        this.generatortype = generatortype;
        this.generatorratedcap = generatorratedcap;
        this.addcapacity = addcapacity;
        this.generatorratednetcap = generatorratednetcap;
    }
 
    /**
     * 属性 generatorid 的get方法
     * @return String
     */
    public String getGeneratorid(){
        return generatorid;
    }
	
    /**
     * 属性 generatorid 的set方法
     * @return
     */
    public void setGeneratorid(String generatorid){
        if(generatorid != null && generatorid.trim().length() == 0){
            this.generatorid = null;
        }else{
            this.generatorid = generatorid;
        }
    } 
	
    /**
     * 属性 generatorname 的get方法
     * @return String
     */
    public String getGeneratorname(){
        return generatorname;
    }
	
    /**
     * 属性 generatorname 的set方法
     * @return
     */
    public void setGeneratorname(String generatorname){
        this.generatorname = generatorname;
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
        this.plantid = plantid;
    } 
	
    /**
     * 属性 generatortype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratortype(){
        return generatortype;
    }
	
    /**
     * 属性 generatortype 的set方法
     * @return
     */
    public void setGeneratortype(BigDecimal generatortype){
        this.generatortype = generatortype;
    } 
	
    /**
     * 属性 generatortypesub 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratortypesub(){
        return generatortypesub;
    }
	
    /**
     * 属性 generatortypesub 的set方法
     * @return
     */
    public void setGeneratortypesub(BigDecimal generatortypesub){
        this.generatortypesub = generatortypesub;
    } 
	
    /**
     * 属性 commercialtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCommercialtype(){
        return commercialtype;
    }
	
    /**
     * 属性 commercialtype 的set方法
     * @return
     */
    public void setCommercialtype(BigDecimal commercialtype){
        this.commercialtype = commercialtype;
    } 
	
    /**
     * 属性 dispatchtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDispatchtype(){
        return dispatchtype;
    }
	
    /**
     * 属性 dispatchtype 的set方法
     * @return
     */
    public void setDispatchtype(BigDecimal dispatchtype){
        this.dispatchtype = dispatchtype;
    } 
	
    /**
     * 属性 generatorratedcap 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratorratedcap(){
        return generatorratedcap;
    }
	
    /**
     * 属性 generatorratedcap 的set方法
     * @return
     */
    public void setGeneratorratedcap(BigDecimal generatorratedcap){
        this.generatorratedcap = generatorratedcap;
    } 
	
    /**
     * 属性 addcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAddcapacity(){
        return addcapacity;
    }
	
    /**
     * 属性 addcapacity 的set方法
     * @return
     */
    public void setAddcapacity(BigDecimal addcapacity){
        this.addcapacity = addcapacity;
    } 
	
    /**
     * 属性 generatorratednetcap 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratorratednetcap(){
        return generatorratednetcap;
    }
	
    /**
     * 属性 generatorratednetcap 的set方法
     * @return
     */
    public void setGeneratorratednetcap(BigDecimal generatorratednetcap){
        this.generatorratednetcap = generatorratednetcap;
    } 
	
    /**
     * 属性 maxtecpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxtecpower(){
        return maxtecpower;
    }
	
    /**
     * 属性 maxtecpower 的set方法
     * @return
     */
    public void setMaxtecpower(BigDecimal maxtecpower){
        this.maxtecpower = maxtecpower;
    } 
	
    /**
     * 属性 mintecpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMintecpower(){
        return mintecpower;
    }
	
    /**
     * 属性 mintecpower 的set方法
     * @return
     */
    public void setMintecpower(BigDecimal mintecpower){
        this.mintecpower = mintecpower;
    } 
	
    /**
     * 属性 emermaxnetpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEmermaxnetpower(){
        return emermaxnetpower;
    }
	
    /**
     * 属性 emermaxnetpower 的set方法
     * @return
     */
    public void setEmermaxnetpower(BigDecimal emermaxnetpower){
        this.emermaxnetpower = emermaxnetpower;
    } 
	
    /**
     * 属性 generatorvoltage 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratorvoltage(){
        return generatorvoltage;
    }
	
    /**
     * 属性 generatorvoltage 的set方法
     * @return
     */
    public void setGeneratorvoltage(BigDecimal generatorvoltage){
        this.generatorvoltage = generatorvoltage;
    } 
	
    /**
     * 属性 coalconsumeratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCoalconsumeratio(){
        return coalconsumeratio;
    }
	
    /**
     * 属性 coalconsumeratio 的set方法
     * @return
     */
    public void setCoalconsumeratio(BigDecimal coalconsumeratio){
        this.coalconsumeratio = coalconsumeratio;
    } 
	
    /**
     * 属性 opbegindate 的get方法
     * @return Date
     */
    public Date getOpbegindate(){
        return opbegindate;
    }
	
    /**
     * 属性 opbegindate 的set方法
     * @return
     */
    public void setOpbegindate(Date opbegindate){
        this.opbegindate = opbegindate;
    } 
	
    /**
     * 属性 opstopdate 的get方法
     * @return Date
     */
    public Date getOpstopdate(){
        return opstopdate;
    }
	
    /**
     * 属性 opstopdate 的set方法
     * @return
     */
    public void setOpstopdate(Date opstopdate){
        this.opstopdate = opstopdate;
    } 
	
    /**
     * 属性 commercialbegindate 的get方法
     * @return Date
     */
    public Date getCommercialbegindate(){
        return commercialbegindate;
    }
	
    /**
     * 属性 commercialbegindate 的set方法
     * @return
     */
    public void setCommercialbegindate(Date commercialbegindate){
        this.commercialbegindate = commercialbegindate;
    } 
	
    /**
     * 属性 starteffectivedate 的get方法
     * @return Date
     */
    public Date getStarteffectivedate(){
        return starteffectivedate;
    }
	
    /**
     * 属性 starteffectivedate 的set方法
     * @return
     */
    public void setStarteffectivedate(Date starteffectivedate){
        this.starteffectivedate = starteffectivedate;
    } 
	
    /**
     * 属性 endeffectivedate 的get方法
     * @return Date
     */
    public Date getEndeffectivedate(){
        return endeffectivedate;
    }
	
    /**
     * 属性 endeffectivedate 的set方法
     * @return
     */
    public void setEndeffectivedate(Date endeffectivedate){
        this.endeffectivedate = endeffectivedate;
    } 
	
    /**
     * 属性 connectvoltage 的get方法
     * @return BigDecimal
     */
    public BigDecimal getConnectvoltage(){
        return connectvoltage;
    }
	
    /**
     * 属性 connectvoltage 的set方法
     * @return
     */
    public void setConnectvoltage(BigDecimal connectvoltage){
        this.connectvoltage = connectvoltage;
    } 
	
    /**
     * 属性 desulfurateratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDesulfurateratio(){
        return desulfurateratio;
    }
	
    /**
     * 属性 desulfurateratio 的set方法
     * @return
     */
    public void setDesulfurateratio(BigDecimal desulfurateratio){
        this.desulfurateratio = desulfurateratio;
    } 
	
    /**
     * 属性 denoxratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDenoxratio(){
        return denoxratio;
    }
	
    /**
     * 属性 denoxratio 的set方法
     * @return
     */
    public void setDenoxratio(BigDecimal denoxratio){
        this.denoxratio = denoxratio;
    } 
	
    /**
     * 属性 desaltpetreratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDesaltpetreratio(){
        return desaltpetreratio;
    }
	
    /**
     * 属性 desaltpetreratio 的set方法
     * @return
     */
    public void setDesaltpetreratio(BigDecimal desaltpetreratio){
        this.desaltpetreratio = desaltpetreratio;
    } 
	
    /**
     * 属性 co2ratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCo2ratio(){
        return co2ratio;
    }
	
    /**
     * 属性 co2ratio 的set方法
     * @return
     */
    public void setCo2ratio(BigDecimal co2ratio){
        this.co2ratio = co2ratio;
    } 
	
    /**
     * 属性 dustratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDustratio(){
        return dustratio;
    }
	
    /**
     * 属性 dustratio 的set方法
     * @return
     */
    public void setDustratio(BigDecimal dustratio){
        this.dustratio = dustratio;
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
		
        if (o == null || !(o instanceof PaGenerator))
	        return false; 
			
        if(getGeneratorid() == null) 
	        return false;

        PaGenerator other = (PaGenerator) o;	        
	    return new EqualsBuilder()
            .append(this.getGeneratorid(), other.getGeneratorid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("generatorid"+":"+getGeneratorid())
            .append("generatorname"+":"+getGeneratorname())
            .append("aliasname"+":"+getAliasname())
            .append("plantid"+":"+getPlantid())
            .append("generatortype"+":"+getGeneratortype())
            .append("generatortypesub"+":"+getGeneratortypesub())
            .append("commercialtype"+":"+getCommercialtype())
            .append("dispatchtype"+":"+getDispatchtype())
            .append("generatorratedcap"+":"+getGeneratorratedcap())
            .append("addcapacity"+":"+getAddcapacity())
            .append("generatorratednetcap"+":"+getGeneratorratednetcap())
            .append("maxtecpower"+":"+getMaxtecpower())
            .append("mintecpower"+":"+getMintecpower())
            .append("emermaxnetpower"+":"+getEmermaxnetpower())
            .append("generatorvoltage"+":"+getGeneratorvoltage())
            .append("coalconsumeratio"+":"+getCoalconsumeratio())
            .append("opbegindate"+":"+getOpbegindate())
            .append("opstopdate"+":"+getOpstopdate())
            .append("commercialbegindate"+":"+getCommercialbegindate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("connectvoltage"+":"+getConnectvoltage())
            .append("desulfurateratio"+":"+getDesulfurateratio())
            .append("denoxratio"+":"+getDenoxratio())
            .append("desaltpetreratio"+":"+getDesaltpetreratio())
            .append("co2ratio"+":"+getCo2ratio())
            .append("dustratio"+":"+getDustratio())
            .append("updatetime"+":"+getUpdatetime())
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