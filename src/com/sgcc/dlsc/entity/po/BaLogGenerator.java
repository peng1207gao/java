package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaLogGenerator的POJO类
 *
 * @author  longshine  [Tue Mar 18 20:38:45 CST 2014]
 * 
 */
public class BaLogGenerator implements Serializable{

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
     * 属性generatorcode
     */
    private String generatorcode;
	
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
     * 属性connectvoltage
     */
    private BigDecimal connectvoltage;
	
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
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性isagcflag
     */
    private BigDecimal isagcflag;
	
    /** 
     * 属性isadjustflag
     */
    private BigDecimal isadjustflag;
	
    /** 
     * 属性isdesulfurated
     */
    private BigDecimal isdesulfurated;
	
    /** 
     * 属性iscoldbyair
     */
    private BigDecimal iscoldbyair;
	
    /** 
     * 属性isheatsupply
     */
    private BigDecimal isheatsupply;
	
    /** 
     * 属性isdesalt
     */
    private BigDecimal isdesalt;
	
    /** 
     * 属性isbidtype
     */
    private BigDecimal isbidtype;
	
    /** 
     * 属性isenviron
     */
    private BigDecimal isenviron;
	
    /** 
     * 属性isccunitmode
     */
    private BigDecimal isccunitmode;
	
    /** 
     * 属性boilerpressure
     */
    private BigDecimal boilerpressure;
	
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
     * 属性gateid
     */
    private String gateid;
	
    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性cmd
     */
    private String cmd;
	
    /** 
     * 属性operator
     */
    private String operator;
	
    /** 
     * 属性operatingdescription
     */
    private String operatingdescription;
	
    /** 
     * 属性operatedate
     */
    private Timestamp operatedate;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性extend1
     */
    private String extend1;
	
    /** 
     * 属性extend2
     */
    private String extend2;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性npstype
     */
    private String npstype;
	
    /** 
     * 属性npsgrade
     */
    private String npsgrade;
	
    /** 
     * 属性npgunitreloadingsycle
     */
    private String npgunitreloadingsycle;
	
    /** 
     * 属性npgdesignuseyear
     */
    private String npgdesignuseyear;
	
    /** 
     * 属性npgmodel
     */
    private String npgmodel;
	
    /** 
     * 属性npgaddre
     */
    private String npgaddre;
	
    /** 
     * 属性wpgregulatemode
     */
    private String wpgregulatemode;
	
    /** 
     * 属性wptype
     */
    private String wptype;
	
    /** 
     * 属性wpgaddtype
     */
    private String wpgaddtype;
	
    /** 
     * 属性wpgshuitoufenlei
     */
    private String wpgshuitoufenlei;
	
    /** 
     * 属性wpgbasin
     */
    private String wpgbasin;
	
    /** 
     * 属性wpskurong
     */
    private String wpskurong;
	
    /** 
     * 属性csxndzskr
     */
    private String csxndzskr;
	
    /** 
     * 属性csxnjzcfzhl
     */
    private String csxnjzcfzhl;
	
    /** 
     * 属性csxnjzfdzcsyccgl
     */
    private String csxnjzfdzcsyccgl;
	
    /** 
     * 属性csxnjzcszfdyccgl
     */
    private String csxnjzcszfdyccgl;
	
    /** 
     * 属性csxnjzdjhdcsgkkcxsj
     */
    private String csxnjzdjhdcsgkkcxsj;
	
    /** 
     * 属性csxnjzdjhdfdgckcxsj
     */
    private String csxnjzdjhdfdgckcxsj;
	
    /** 
     * 属性csxnjzcsgkhdgl
     */
    private String csxnjzcsgkhdgl;
	
    /** 
     * 属性csxnjzfdgkhdgl
     */
    private String csxnjzfdgkhdgl;
	
    /** 
     * 属性csxnjzjszflx
     */
    private String csxnjzjszflx;
	
    /** 
     * 属性zlscsxnjznzlf
     */
    private String zlscsxnjznzlf;
	
    /** 
     * 属性zlscsxnjzzlfftbDwgs
     */
    private String zlscsxnjzzlfftbDwgs;
	
    /** 
     * 属性zlscsxnjzzlfftbFdqy
     */
    private String zlscsxnjzzlfftbFdqy;
	
    /** 
     * 属性zlscsxnjzzlfftbShyh
     */
    private String zlscsxnjzzlfftbShyh;
	
    /** 
     * 属性dcjz
     */
    private String dcjz;
	
    /** 
     * 属性dczedsc
     */
    private String dczedsc;
	
    /** 
     * 属性grjzlx
     */
    private String grjzlx;
	
    /** 
     * 属性jzgryl
     */
    private String jzgryl;
	
    /** 
     * 属性jzgzdgrllnl
     */
    private String jzgzdgrllnl;
	
    /** 
     * 属性pjgrll
     */
    private String pjgrll;
	
    /** 
     * 属性generatorModel
     */
    private String generatorModel;
	
    /** 
     * 属性cutinWindspeed
     */
    private String cutinWindspeed;
	
    /** 
     * 属性specifiedWindspeed
     */
    private String specifiedWindspeed;
	
    /** 
     * 属性cutoutWindspeed
     */
    private String cutoutWindspeed;
	
    /** 
     * 属性vaneDiameter
     */
    private String vaneDiameter;
	
    /** 
     * 属性windfieldType
     */
    private BigDecimal windfieldType;
	
    /** 
     * 属性inviteProject
     */
    private BigDecimal inviteProject;
	
    /** 
     * 属性generatorTowerNum
     */
    private BigDecimal generatorTowerNum;
	
    /** 
     * 属性standAlonePower
     */
    private BigDecimal standAlonePower;
	
    /** 
     * 属性generatorStatus
     */
    private BigDecimal generatorStatus;
	
    /** 
     * 属性registerDate
     */
    private Date registerDate;
	
    /** 
     * 属性testRunDate
     */
    private Date testRunDate;
	
    /** 
     * 属性tradeRunDate
     */
    private Date tradeRunDate;
	
    /** 
     * 属性closeRunDate
     */
    private Date closeRunDate;
	
    /** 
     * 属性exitMarketDate
     */
    private Date exitMarketDate;
	
    /** 
     * 属性generatorclass
     */
    private BigDecimal generatorclass;
	
    /** 
     * 属性timeConsumption
     */
    private String timeConsumption;
	
    /** 
     * 属性hotSpotProportion
     */
    private String hotSpotProportion;
	
    /** 
     * 属性buildingexaminecode
     */
    private String buildingexaminecode;
	
    /** 
     * 属性batchnumber
     */
    private String batchnumber;
	
    /** 
     * 属性firstcoupledate
     */
    private Date firstcoupledate;
	
    /** 
     * 属性generatormodel
     */
    private String generatormodel;
	
    /** 
     * 属性factor
     */
    private String factor;
	
    /** 
     * 属性connectvoltageorder
     */
    private String connectvoltageorder;
	
    /** 
     * 属性nominalpower
     */
    private String nominalpower;
	
    /** 
     * 属性settlement
     */
    private String settlement;
	
    /** 
     * 属性formula
     */
    private String formula;
	
    /** 
     * 属性currentprice
     */
    private BigDecimal currentprice;
	
    /** 
     * 属性assumptionprice
     */
    private BigDecimal assumptionprice;
	
    /** 
     * 属性efpricefectivedate
     */
    private Date efpricefectivedate;
	
    /** 
     * 属性currentcode
     */
    private String currentcode;
	
    /** 
     * 属性composite
     */
    private String composite;
	
    /** 
     * 属性iscomprehensive
     */
    private BigDecimal iscomprehensive;
	
    /** 
     * 属性avgaddspeed
     */
    private BigDecimal avgaddspeed;
	
    /** 
     * 属性avgremovespeed
     */
    private BigDecimal avgremovespeed;
	
    /** 
     * 属性coldstarttime
     */
    private BigDecimal coldstarttime;
	
    /** 
     * 属性hotstarttime
     */
    private BigDecimal hotstarttime;
	
    /** 
     * 属性warmstarttime
     */
    private BigDecimal warmstarttime;
	
    /** 
     * 属性opentostopspace
     */
    private BigDecimal opentostopspace;
	
    /** 
     * 属性stoptoopenspace
     */
    private BigDecimal stoptoopenspace;
	
    /** 
     * 属性summerpower
     */
    private BigDecimal summerpower;
	
    /** 
     * 属性winterpower
     */
    private BigDecimal winterpower;
	
    /** 
     * 属性leastpower
     */
    private BigDecimal leastpower;
	
    /** 
     * 属性largestpower
     */
    private BigDecimal largestpower;
	
    /** 
     * 属性largestpowerinleast
     */
    private BigDecimal largestpowerinleast;
	
    /** 
     * 属性ifoncefm
     */
    private BigDecimal ifoncefm;
	
    /** 
     * 属性ifagcfm
     */
    private BigDecimal ifagcfm;
	
    /** 
     * 属性oncefmtodeath
     */
    private String oncefmtodeath;
	
    /** 
     * 属性oncefmrate
     */
    private BigDecimal oncefmrate;
	
    /** 
     * 属性generatorclass1
     */
    private String generatorclass1;
	
    /** 
     * 属性generatorclass2
     */
    private BigDecimal generatorclass2;
	
    /** 
     * 属性licencecode
     */
    private String licencecode;
	
    /**
     * BaLogGenerator构造函数
     */
    public BaLogGenerator() {
        super();
    }  
	
    /**
     * BaLogGenerator完整的构造函数
     */  
    public BaLogGenerator(String generatorid,String generatorname,String plantid,Date starteffectivedate,String sheetid,String marketid){
        this.generatorid = generatorid;
        this.generatorname = generatorname;
        this.plantid = plantid;
        this.starteffectivedate = starteffectivedate;
        this.sheetid = sheetid;
        this.marketid = marketid;
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
        this.generatorid = generatorid;
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
     * 属性 generatorcode 的get方法
     * @return String
     */
    public String getGeneratorcode(){
        return generatorcode;
    }
	
    /**
     * 属性 generatorcode 的set方法
     * @return
     */
    public void setGeneratorcode(String generatorcode){
        this.generatorcode = generatorcode;
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
     * 属性 isagcflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsagcflag(){
        return isagcflag;
    }
	
    /**
     * 属性 isagcflag 的set方法
     * @return
     */
    public void setIsagcflag(BigDecimal isagcflag){
        this.isagcflag = isagcflag;
    } 
	
	
	
    /**
     * 属性 isadjustflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsadjustflag(){
        return isadjustflag;
    }
	
    /**
     * 属性 isadjustflag 的set方法
     * @return
     */
    public void setIsadjustflag(BigDecimal isadjustflag){
        this.isadjustflag = isadjustflag;
    } 
	
	
	
    /**
     * 属性 isdesulfurated 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdesulfurated(){
        return isdesulfurated;
    }
	
    /**
     * 属性 isdesulfurated 的set方法
     * @return
     */
    public void setIsdesulfurated(BigDecimal isdesulfurated){
        this.isdesulfurated = isdesulfurated;
    } 
	
	
	
    /**
     * 属性 iscoldbyair 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIscoldbyair(){
        return iscoldbyair;
    }
	
    /**
     * 属性 iscoldbyair 的set方法
     * @return
     */
    public void setIscoldbyair(BigDecimal iscoldbyair){
        this.iscoldbyair = iscoldbyair;
    } 
	
	
	
    /**
     * 属性 isheatsupply 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsheatsupply(){
        return isheatsupply;
    }
	
    /**
     * 属性 isheatsupply 的set方法
     * @return
     */
    public void setIsheatsupply(BigDecimal isheatsupply){
        this.isheatsupply = isheatsupply;
    } 
	
	
	
    /**
     * 属性 isdesalt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdesalt(){
        return isdesalt;
    }
	
    /**
     * 属性 isdesalt 的set方法
     * @return
     */
    public void setIsdesalt(BigDecimal isdesalt){
        this.isdesalt = isdesalt;
    } 
	
	
	
    /**
     * 属性 isbidtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsbidtype(){
        return isbidtype;
    }
	
    /**
     * 属性 isbidtype 的set方法
     * @return
     */
    public void setIsbidtype(BigDecimal isbidtype){
        this.isbidtype = isbidtype;
    } 
	
	
	
    /**
     * 属性 isenviron 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsenviron(){
        return isenviron;
    }
	
    /**
     * 属性 isenviron 的set方法
     * @return
     */
    public void setIsenviron(BigDecimal isenviron){
        this.isenviron = isenviron;
    } 
	
	
	
    /**
     * 属性 isccunitmode 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsccunitmode(){
        return isccunitmode;
    }
	
    /**
     * 属性 isccunitmode 的set方法
     * @return
     */
    public void setIsccunitmode(BigDecimal isccunitmode){
        this.isccunitmode = isccunitmode;
    } 
	
	
	
    /**
     * 属性 boilerpressure 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBoilerpressure(){
        return boilerpressure;
    }
	
    /**
     * 属性 boilerpressure 的set方法
     * @return
     */
    public void setBoilerpressure(BigDecimal boilerpressure){
        this.boilerpressure = boilerpressure;
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
     * 属性 gateid 的get方法
     * @return String
     */
    public String getGateid(){
        return gateid;
    }
	
    /**
     * 属性 gateid 的set方法
     * @return
     */
    public void setGateid(String gateid){
        this.gateid = gateid;
    } 
	
	
	
    /**
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
	
	
    /**
     * 属性 cmd 的get方法
     * @return String
     */
    public String getCmd(){
        return cmd;
    }
	
    /**
     * 属性 cmd 的set方法
     * @return
     */
    public void setCmd(String cmd){
        this.cmd = cmd;
    } 
	
	
	
    /**
     * 属性 operator 的get方法
     * @return String
     */
    public String getOperator(){
        return operator;
    }
	
    /**
     * 属性 operator 的set方法
     * @return
     */
    public void setOperator(String operator){
        this.operator = operator;
    } 
	
	
	
    /**
     * 属性 operatingdescription 的get方法
     * @return String
     */
    public String getOperatingdescription(){
        return operatingdescription;
    }
	
    /**
     * 属性 operatingdescription 的set方法
     * @return
     */
    public void setOperatingdescription(String operatingdescription){
        this.operatingdescription = operatingdescription;
    } 
	
	
	
    /**
     * 属性 operatedate 的get方法
     * @return Date
     */
    public Date getOperatedate(){
        return operatedate;
    }
	
    /**
     * 属性 operatedate 的set方法
     * @return
     */
    public void setOperatedate(Timestamp operatedate){
        this.operatedate = operatedate;
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
        this.guid = guid;
    } 
	
	
	
    /**
     * 属性 extend1 的get方法
     * @return String
     */
    public String getExtend1(){
        return extend1;
    }
	
    /**
     * 属性 extend1 的set方法
     * @return
     */
    public void setExtend1(String extend1){
        this.extend1 = extend1;
    } 
	
	
	
    /**
     * 属性 extend2 的get方法
     * @return String
     */
    public String getExtend2(){
        return extend2;
    }
	
    /**
     * 属性 extend2 的set方法
     * @return
     */
    public void setExtend2(String extend2){
        this.extend2 = extend2;
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
     * 属性 npstype 的get方法
     * @return String
     */
    public String getNpstype(){
        return npstype;
    }
	
    /**
     * 属性 npstype 的set方法
     * @return
     */
    public void setNpstype(String npstype){
        this.npstype = npstype;
    } 
	
	
	
    /**
     * 属性 npsgrade 的get方法
     * @return String
     */
    public String getNpsgrade(){
        return npsgrade;
    }
	
    /**
     * 属性 npsgrade 的set方法
     * @return
     */
    public void setNpsgrade(String npsgrade){
        this.npsgrade = npsgrade;
    } 
	
	
	
    /**
     * 属性 npgunitreloadingsycle 的get方法
     * @return String
     */
    public String getNpgunitreloadingsycle(){
        return npgunitreloadingsycle;
    }
	
    /**
     * 属性 npgunitreloadingsycle 的set方法
     * @return
     */
    public void setNpgunitreloadingsycle(String npgunitreloadingsycle){
        this.npgunitreloadingsycle = npgunitreloadingsycle;
    } 
	
	
	
    /**
     * 属性 npgdesignuseyear 的get方法
     * @return String
     */
    public String getNpgdesignuseyear(){
        return npgdesignuseyear;
    }
	
    /**
     * 属性 npgdesignuseyear 的set方法
     * @return
     */
    public void setNpgdesignuseyear(String npgdesignuseyear){
        this.npgdesignuseyear = npgdesignuseyear;
    } 
	
	
	
    /**
     * 属性 npgmodel 的get方法
     * @return String
     */
    public String getNpgmodel(){
        return npgmodel;
    }
	
    /**
     * 属性 npgmodel 的set方法
     * @return
     */
    public void setNpgmodel(String npgmodel){
        this.npgmodel = npgmodel;
    } 
	
	
	
    /**
     * 属性 npgaddre 的get方法
     * @return String
     */
    public String getNpgaddre(){
        return npgaddre;
    }
	
    /**
     * 属性 npgaddre 的set方法
     * @return
     */
    public void setNpgaddre(String npgaddre){
        this.npgaddre = npgaddre;
    } 
	
	
	
    /**
     * 属性 wpgregulatemode 的get方法
     * @return String
     */
    public String getWpgregulatemode(){
        return wpgregulatemode;
    }
	
    /**
     * 属性 wpgregulatemode 的set方法
     * @return
     */
    public void setWpgregulatemode(String wpgregulatemode){
        this.wpgregulatemode = wpgregulatemode;
    } 
	
	
	
    /**
     * 属性 wptype 的get方法
     * @return String
     */
    public String getWptype(){
        return wptype;
    }
	
    /**
     * 属性 wptype 的set方法
     * @return
     */
    public void setWptype(String wptype){
        this.wptype = wptype;
    } 
	
	
	
    /**
     * 属性 wpgaddtype 的get方法
     * @return String
     */
    public String getWpgaddtype(){
        return wpgaddtype;
    }
	
    /**
     * 属性 wpgaddtype 的set方法
     * @return
     */
    public void setWpgaddtype(String wpgaddtype){
        this.wpgaddtype = wpgaddtype;
    } 
	
	
	
    /**
     * 属性 wpgshuitoufenlei 的get方法
     * @return String
     */
    public String getWpgshuitoufenlei(){
        return wpgshuitoufenlei;
    }
	
    /**
     * 属性 wpgshuitoufenlei 的set方法
     * @return
     */
    public void setWpgshuitoufenlei(String wpgshuitoufenlei){
        this.wpgshuitoufenlei = wpgshuitoufenlei;
    } 
	
	
	
    /**
     * 属性 wpgbasin 的get方法
     * @return String
     */
    public String getWpgbasin(){
        return wpgbasin;
    }
	
    /**
     * 属性 wpgbasin 的set方法
     * @return
     */
    public void setWpgbasin(String wpgbasin){
        this.wpgbasin = wpgbasin;
    } 
	
	
	
    /**
     * 属性 wpskurong 的get方法
     * @return String
     */
    public String getWpskurong(){
        return wpskurong;
    }
	
    /**
     * 属性 wpskurong 的set方法
     * @return
     */
    public void setWpskurong(String wpskurong){
        this.wpskurong = wpskurong;
    } 
	
	
	
    /**
     * 属性 csxndzskr 的get方法
     * @return String
     */
    public String getCsxndzskr(){
        return csxndzskr;
    }
	
    /**
     * 属性 csxndzskr 的set方法
     * @return
     */
    public void setCsxndzskr(String csxndzskr){
        this.csxndzskr = csxndzskr;
    } 
	
	
	
    /**
     * 属性 csxnjzcfzhl 的get方法
     * @return String
     */
    public String getCsxnjzcfzhl(){
        return csxnjzcfzhl;
    }
	
    /**
     * 属性 csxnjzcfzhl 的set方法
     * @return
     */
    public void setCsxnjzcfzhl(String csxnjzcfzhl){
        this.csxnjzcfzhl = csxnjzcfzhl;
    } 
	
	
	
    /**
     * 属性 csxnjzfdzcsyccgl 的get方法
     * @return String
     */
    public String getCsxnjzfdzcsyccgl(){
        return csxnjzfdzcsyccgl;
    }
	
    /**
     * 属性 csxnjzfdzcsyccgl 的set方法
     * @return
     */
    public void setCsxnjzfdzcsyccgl(String csxnjzfdzcsyccgl){
        this.csxnjzfdzcsyccgl = csxnjzfdzcsyccgl;
    } 
	
	
	
    /**
     * 属性 csxnjzcszfdyccgl 的get方法
     * @return String
     */
    public String getCsxnjzcszfdyccgl(){
        return csxnjzcszfdyccgl;
    }
	
    /**
     * 属性 csxnjzcszfdyccgl 的set方法
     * @return
     */
    public void setCsxnjzcszfdyccgl(String csxnjzcszfdyccgl){
        this.csxnjzcszfdyccgl = csxnjzcszfdyccgl;
    } 
	
	
	
    /**
     * 属性 csxnjzdjhdcsgkkcxsj 的get方法
     * @return String
     */
    public String getCsxnjzdjhdcsgkkcxsj(){
        return csxnjzdjhdcsgkkcxsj;
    }
	
    /**
     * 属性 csxnjzdjhdcsgkkcxsj 的set方法
     * @return
     */
    public void setCsxnjzdjhdcsgkkcxsj(String csxnjzdjhdcsgkkcxsj){
        this.csxnjzdjhdcsgkkcxsj = csxnjzdjhdcsgkkcxsj;
    } 
	
	
	
    /**
     * 属性 csxnjzdjhdfdgckcxsj 的get方法
     * @return String
     */
    public String getCsxnjzdjhdfdgckcxsj(){
        return csxnjzdjhdfdgckcxsj;
    }
	
    /**
     * 属性 csxnjzdjhdfdgckcxsj 的set方法
     * @return
     */
    public void setCsxnjzdjhdfdgckcxsj(String csxnjzdjhdfdgckcxsj){
        this.csxnjzdjhdfdgckcxsj = csxnjzdjhdfdgckcxsj;
    } 
	
	
	
    /**
     * 属性 csxnjzcsgkhdgl 的get方法
     * @return String
     */
    public String getCsxnjzcsgkhdgl(){
        return csxnjzcsgkhdgl;
    }
	
    /**
     * 属性 csxnjzcsgkhdgl 的set方法
     * @return
     */
    public void setCsxnjzcsgkhdgl(String csxnjzcsgkhdgl){
        this.csxnjzcsgkhdgl = csxnjzcsgkhdgl;
    } 
	
	
	
    /**
     * 属性 csxnjzfdgkhdgl 的get方法
     * @return String
     */
    public String getCsxnjzfdgkhdgl(){
        return csxnjzfdgkhdgl;
    }
	
    /**
     * 属性 csxnjzfdgkhdgl 的set方法
     * @return
     */
    public void setCsxnjzfdgkhdgl(String csxnjzfdgkhdgl){
        this.csxnjzfdgkhdgl = csxnjzfdgkhdgl;
    } 
	
	
	
    /**
     * 属性 csxnjzjszflx 的get方法
     * @return String
     */
    public String getCsxnjzjszflx(){
        return csxnjzjszflx;
    }
	
    /**
     * 属性 csxnjzjszflx 的set方法
     * @return
     */
    public void setCsxnjzjszflx(String csxnjzjszflx){
        this.csxnjzjszflx = csxnjzjszflx;
    } 
	
	
	
    /**
     * 属性 zlscsxnjznzlf 的get方法
     * @return String
     */
    public String getZlscsxnjznzlf(){
        return zlscsxnjznzlf;
    }
	
    /**
     * 属性 zlscsxnjznzlf 的set方法
     * @return
     */
    public void setZlscsxnjznzlf(String zlscsxnjznzlf){
        this.zlscsxnjznzlf = zlscsxnjznzlf;
    } 
	
	
	
    /**
     * 属性 zlscsxnjzzlfftbDwgs 的get方法
     * @return String
     */
    public String getZlscsxnjzzlfftbDwgs(){
        return zlscsxnjzzlfftbDwgs;
    }
	
    /**
     * 属性 zlscsxnjzzlfftbDwgs 的set方法
     * @return
     */
    public void setZlscsxnjzzlfftbDwgs(String zlscsxnjzzlfftbDwgs){
        this.zlscsxnjzzlfftbDwgs = zlscsxnjzzlfftbDwgs;
    } 
	
	
	
    /**
     * 属性 zlscsxnjzzlfftbFdqy 的get方法
     * @return String
     */
    public String getZlscsxnjzzlfftbFdqy(){
        return zlscsxnjzzlfftbFdqy;
    }
	
    /**
     * 属性 zlscsxnjzzlfftbFdqy 的set方法
     * @return
     */
    public void setZlscsxnjzzlfftbFdqy(String zlscsxnjzzlfftbFdqy){
        this.zlscsxnjzzlfftbFdqy = zlscsxnjzzlfftbFdqy;
    } 
	
	
	
    /**
     * 属性 zlscsxnjzzlfftbShyh 的get方法
     * @return String
     */
    public String getZlscsxnjzzlfftbShyh(){
        return zlscsxnjzzlfftbShyh;
    }
	
    /**
     * 属性 zlscsxnjzzlfftbShyh 的set方法
     * @return
     */
    public void setZlscsxnjzzlfftbShyh(String zlscsxnjzzlfftbShyh){
        this.zlscsxnjzzlfftbShyh = zlscsxnjzzlfftbShyh;
    } 
	
	
	
    /**
     * 属性 dcjz 的get方法
     * @return String
     */
    public String getDcjz(){
        return dcjz;
    }
	
    /**
     * 属性 dcjz 的set方法
     * @return
     */
    public void setDcjz(String dcjz){
        this.dcjz = dcjz;
    } 
	
	
	
    /**
     * 属性 dczedsc 的get方法
     * @return String
     */
    public String getDczedsc(){
        return dczedsc;
    }
	
    /**
     * 属性 dczedsc 的set方法
     * @return
     */
    public void setDczedsc(String dczedsc){
        this.dczedsc = dczedsc;
    } 
	
	
	
    /**
     * 属性 grjzlx 的get方法
     * @return String
     */
    public String getGrjzlx(){
        return grjzlx;
    }
	
    /**
     * 属性 grjzlx 的set方法
     * @return
     */
    public void setGrjzlx(String grjzlx){
        this.grjzlx = grjzlx;
    } 
	
	
	
    /**
     * 属性 jzgryl 的get方法
     * @return String
     */
    public String getJzgryl(){
        return jzgryl;
    }
	
    /**
     * 属性 jzgryl 的set方法
     * @return
     */
    public void setJzgryl(String jzgryl){
        this.jzgryl = jzgryl;
    } 
	
	
	
    /**
     * 属性 jzgzdgrllnl 的get方法
     * @return String
     */
    public String getJzgzdgrllnl(){
        return jzgzdgrllnl;
    }
	
    /**
     * 属性 jzgzdgrllnl 的set方法
     * @return
     */
    public void setJzgzdgrllnl(String jzgzdgrllnl){
        this.jzgzdgrllnl = jzgzdgrllnl;
    } 
	
	
	
    /**
     * 属性 pjgrll 的get方法
     * @return String
     */
    public String getPjgrll(){
        return pjgrll;
    }
	
    /**
     * 属性 pjgrll 的set方法
     * @return
     */
    public void setPjgrll(String pjgrll){
        this.pjgrll = pjgrll;
    } 
	
	
	
    /**
     * 属性 generatorModel 的get方法
     * @return String
     */
    public String getGeneratorModel(){
        return generatorModel;
    }
	
    /**
     * 属性 generatorModel 的set方法
     * @return
     */
    public void setGeneratorModel(String generatorModel){
        this.generatorModel = generatorModel;
    } 
	
	
	
    /**
     * 属性 cutinWindspeed 的get方法
     * @return String
     */
    public String getCutinWindspeed(){
        return cutinWindspeed;
    }
	
    /**
     * 属性 cutinWindspeed 的set方法
     * @return
     */
    public void setCutinWindspeed(String cutinWindspeed){
        this.cutinWindspeed = cutinWindspeed;
    } 
	
	
	
    /**
     * 属性 specifiedWindspeed 的get方法
     * @return String
     */
    public String getSpecifiedWindspeed(){
        return specifiedWindspeed;
    }
	
    /**
     * 属性 specifiedWindspeed 的set方法
     * @return
     */
    public void setSpecifiedWindspeed(String specifiedWindspeed){
        this.specifiedWindspeed = specifiedWindspeed;
    } 
	
	
	
    /**
     * 属性 cutoutWindspeed 的get方法
     * @return String
     */
    public String getCutoutWindspeed(){
        return cutoutWindspeed;
    }
	
    /**
     * 属性 cutoutWindspeed 的set方法
     * @return
     */
    public void setCutoutWindspeed(String cutoutWindspeed){
        this.cutoutWindspeed = cutoutWindspeed;
    } 
	
	
	
    /**
     * 属性 vaneDiameter 的get方法
     * @return String
     */
    public String getVaneDiameter(){
        return vaneDiameter;
    }
	
    /**
     * 属性 vaneDiameter 的set方法
     * @return
     */
    public void setVaneDiameter(String vaneDiameter){
        this.vaneDiameter = vaneDiameter;
    } 
	
	
	
    /**
     * 属性 windfieldType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWindfieldType(){
        return windfieldType;
    }
	
    /**
     * 属性 windfieldType 的set方法
     * @return
     */
    public void setWindfieldType(BigDecimal windfieldType){
        this.windfieldType = windfieldType;
    } 
	
	
	
    /**
     * 属性 inviteProject 的get方法
     * @return BigDecimal
     */
    public BigDecimal getInviteProject(){
        return inviteProject;
    }
	
    /**
     * 属性 inviteProject 的set方法
     * @return
     */
    public void setInviteProject(BigDecimal inviteProject){
        this.inviteProject = inviteProject;
    } 
	
	
	
    /**
     * 属性 generatorTowerNum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratorTowerNum(){
        return generatorTowerNum;
    }
	
    /**
     * 属性 generatorTowerNum 的set方法
     * @return
     */
    public void setGeneratorTowerNum(BigDecimal generatorTowerNum){
        this.generatorTowerNum = generatorTowerNum;
    } 
	
	
	
    /**
     * 属性 standAlonePower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStandAlonePower(){
        return standAlonePower;
    }
	
    /**
     * 属性 standAlonePower 的set方法
     * @return
     */
    public void setStandAlonePower(BigDecimal standAlonePower){
        this.standAlonePower = standAlonePower;
    } 
	
	
	
    /**
     * 属性 generatorStatus 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratorStatus(){
        return generatorStatus;
    }
	
    /**
     * 属性 generatorStatus 的set方法
     * @return
     */
    public void setGeneratorStatus(BigDecimal generatorStatus){
        this.generatorStatus = generatorStatus;
    } 
	
	
	
    /**
     * 属性 registerDate 的get方法
     * @return Date
     */
    public Date getRegisterDate(){
        return registerDate;
    }
	
    /**
     * 属性 registerDate 的set方法
     * @return
     */
    public void setRegisterDate(Date registerDate){
        this.registerDate = registerDate;
    } 
	
	
	
    /**
     * 属性 testRunDate 的get方法
     * @return Date
     */
    public Date getTestRunDate(){
        return testRunDate;
    }
	
    /**
     * 属性 testRunDate 的set方法
     * @return
     */
    public void setTestRunDate(Date testRunDate){
        this.testRunDate = testRunDate;
    } 
	
	
	
    /**
     * 属性 tradeRunDate 的get方法
     * @return Date
     */
    public Date getTradeRunDate(){
        return tradeRunDate;
    }
	
    /**
     * 属性 tradeRunDate 的set方法
     * @return
     */
    public void setTradeRunDate(Date tradeRunDate){
        this.tradeRunDate = tradeRunDate;
    } 
	
	
	
    /**
     * 属性 closeRunDate 的get方法
     * @return Date
     */
    public Date getCloseRunDate(){
        return closeRunDate;
    }
	
    /**
     * 属性 closeRunDate 的set方法
     * @return
     */
    public void setCloseRunDate(Date closeRunDate){
        this.closeRunDate = closeRunDate;
    } 
	
	
	
    /**
     * 属性 exitMarketDate 的get方法
     * @return Date
     */
    public Date getExitMarketDate(){
        return exitMarketDate;
    }
	
    /**
     * 属性 exitMarketDate 的set方法
     * @return
     */
    public void setExitMarketDate(Date exitMarketDate){
        this.exitMarketDate = exitMarketDate;
    } 
	
	
	
    /**
     * 属性 generatorclass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratorclass(){
        return generatorclass;
    }
	
    /**
     * 属性 generatorclass 的set方法
     * @return
     */
    public void setGeneratorclass(BigDecimal generatorclass){
        this.generatorclass = generatorclass;
    } 
	
	
	
    /**
     * 属性 timeConsumption 的get方法
     * @return String
     */
    public String getTimeConsumption(){
        return timeConsumption;
    }
	
    /**
     * 属性 timeConsumption 的set方法
     * @return
     */
    public void setTimeConsumption(String timeConsumption){
        this.timeConsumption = timeConsumption;
    } 
	
	
	
    /**
     * 属性 hotSpotProportion 的get方法
     * @return String
     */
    public String getHotSpotProportion(){
        return hotSpotProportion;
    }
	
    /**
     * 属性 hotSpotProportion 的set方法
     * @return
     */
    public void setHotSpotProportion(String hotSpotProportion){
        this.hotSpotProportion = hotSpotProportion;
    } 
	
	
	
    /**
     * 属性 buildingexaminecode 的get方法
     * @return String
     */
    public String getBuildingexaminecode(){
        return buildingexaminecode;
    }
	
    /**
     * 属性 buildingexaminecode 的set方法
     * @return
     */
    public void setBuildingexaminecode(String buildingexaminecode){
        this.buildingexaminecode = buildingexaminecode;
    } 
	
	
	
    /**
     * 属性 batchnumber 的get方法
     * @return String
     */
    public String getBatchnumber(){
        return batchnumber;
    }
	
    /**
     * 属性 batchnumber 的set方法
     * @return
     */
    public void setBatchnumber(String batchnumber){
        this.batchnumber = batchnumber;
    } 
	
	
	
    /**
     * 属性 firstcoupledate 的get方法
     * @return Date
     */
    public Date getFirstcoupledate(){
        return firstcoupledate;
    }
	
    /**
     * 属性 firstcoupledate 的set方法
     * @return
     */
    public void setFirstcoupledate(Date firstcoupledate){
        this.firstcoupledate = firstcoupledate;
    } 
	
	
	
    /**
     * 属性 generatormodel 的get方法
     * @return String
     */
    public String getGeneratormodel(){
        return generatormodel;
    }
	
    /**
     * 属性 generatormodel 的set方法
     * @return
     */
    public void setGeneratormodel(String generatormodel){
        this.generatormodel = generatormodel;
    } 
	
	
	
    /**
     * 属性 factor 的get方法
     * @return String
     */
    public String getFactor(){
        return factor;
    }
	
    /**
     * 属性 factor 的set方法
     * @return
     */
    public void setFactor(String factor){
        this.factor = factor;
    } 
	
	
	
    /**
     * 属性 connectvoltageorder 的get方法
     * @return String
     */
    public String getConnectvoltageorder(){
        return connectvoltageorder;
    }
	
    /**
     * 属性 connectvoltageorder 的set方法
     * @return
     */
    public void setConnectvoltageorder(String connectvoltageorder){
        this.connectvoltageorder = connectvoltageorder;
    } 
	
	
	
    /**
     * 属性 nominalpower 的get方法
     * @return String
     */
    public String getNominalpower(){
        return nominalpower;
    }
	
    /**
     * 属性 nominalpower 的set方法
     * @return
     */
    public void setNominalpower(String nominalpower){
        this.nominalpower = nominalpower;
    } 
	
	
	
    /**
     * 属性 settlement 的get方法
     * @return String
     */
    public String getSettlement(){
        return settlement;
    }
	
    /**
     * 属性 settlement 的set方法
     * @return
     */
    public void setSettlement(String settlement){
        this.settlement = settlement;
    } 
	
	
	
    /**
     * 属性 formula 的get方法
     * @return String
     */
    public String getFormula(){
        return formula;
    }
	
    /**
     * 属性 formula 的set方法
     * @return
     */
    public void setFormula(String formula){
        this.formula = formula;
    } 
	
	
	
    /**
     * 属性 currentprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCurrentprice(){
        return currentprice;
    }
	
    /**
     * 属性 currentprice 的set方法
     * @return
     */
    public void setCurrentprice(BigDecimal currentprice){
        this.currentprice = currentprice;
    } 
	
	
	
    /**
     * 属性 assumptionprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAssumptionprice(){
        return assumptionprice;
    }
	
    /**
     * 属性 assumptionprice 的set方法
     * @return
     */
    public void setAssumptionprice(BigDecimal assumptionprice){
        this.assumptionprice = assumptionprice;
    } 
	
	
	
    /**
     * 属性 efpricefectivedate 的get方法
     * @return Date
     */
    public Date getEfpricefectivedate(){
        return efpricefectivedate;
    }
	
    /**
     * 属性 efpricefectivedate 的set方法
     * @return
     */
    public void setEfpricefectivedate(Date efpricefectivedate){
        this.efpricefectivedate = efpricefectivedate;
    } 
	
	
	
    /**
     * 属性 currentcode 的get方法
     * @return String
     */
    public String getCurrentcode(){
        return currentcode;
    }
	
    /**
     * 属性 currentcode 的set方法
     * @return
     */
    public void setCurrentcode(String currentcode){
        this.currentcode = currentcode;
    } 
	
	
	
    /**
     * 属性 composite 的get方法
     * @return String
     */
    public String getComposite(){
        return composite;
    }
	
    /**
     * 属性 composite 的set方法
     * @return
     */
    public void setComposite(String composite){
        this.composite = composite;
    } 
	
	
	
    /**
     * 属性 iscomprehensive 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIscomprehensive(){
        return iscomprehensive;
    }
	
    /**
     * 属性 iscomprehensive 的set方法
     * @return
     */
    public void setIscomprehensive(BigDecimal iscomprehensive){
        this.iscomprehensive = iscomprehensive;
    } 
	
	
	
    /**
     * 属性 avgaddspeed 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAvgaddspeed(){
        return avgaddspeed;
    }
	
    /**
     * 属性 avgaddspeed 的set方法
     * @return
     */
    public void setAvgaddspeed(BigDecimal avgaddspeed){
        this.avgaddspeed = avgaddspeed;
    } 
	
	
	
    /**
     * 属性 avgremovespeed 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAvgremovespeed(){
        return avgremovespeed;
    }
	
    /**
     * 属性 avgremovespeed 的set方法
     * @return
     */
    public void setAvgremovespeed(BigDecimal avgremovespeed){
        this.avgremovespeed = avgremovespeed;
    } 
	
	
	
    /**
     * 属性 coldstarttime 的get方法
     * @return BigDecimal
     */
    public BigDecimal getColdstarttime(){
        return coldstarttime;
    }
	
    /**
     * 属性 coldstarttime 的set方法
     * @return
     */
    public void setColdstarttime(BigDecimal coldstarttime){
        this.coldstarttime = coldstarttime;
    } 
	
	
	
    /**
     * 属性 hotstarttime 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHotstarttime(){
        return hotstarttime;
    }
	
    /**
     * 属性 hotstarttime 的set方法
     * @return
     */
    public void setHotstarttime(BigDecimal hotstarttime){
        this.hotstarttime = hotstarttime;
    } 
	
	
	
    /**
     * 属性 warmstarttime 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWarmstarttime(){
        return warmstarttime;
    }
	
    /**
     * 属性 warmstarttime 的set方法
     * @return
     */
    public void setWarmstarttime(BigDecimal warmstarttime){
        this.warmstarttime = warmstarttime;
    } 
	
	
	
    /**
     * 属性 opentostopspace 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOpentostopspace(){
        return opentostopspace;
    }
	
    /**
     * 属性 opentostopspace 的set方法
     * @return
     */
    public void setOpentostopspace(BigDecimal opentostopspace){
        this.opentostopspace = opentostopspace;
    } 
	
	
	
    /**
     * 属性 stoptoopenspace 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStoptoopenspace(){
        return stoptoopenspace;
    }
	
    /**
     * 属性 stoptoopenspace 的set方法
     * @return
     */
    public void setStoptoopenspace(BigDecimal stoptoopenspace){
        this.stoptoopenspace = stoptoopenspace;
    } 
	
	
	
    /**
     * 属性 summerpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSummerpower(){
        return summerpower;
    }
	
    /**
     * 属性 summerpower 的set方法
     * @return
     */
    public void setSummerpower(BigDecimal summerpower){
        this.summerpower = summerpower;
    } 
	
	
	
    /**
     * 属性 winterpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWinterpower(){
        return winterpower;
    }
	
    /**
     * 属性 winterpower 的set方法
     * @return
     */
    public void setWinterpower(BigDecimal winterpower){
        this.winterpower = winterpower;
    } 
	
	
	
    /**
     * 属性 leastpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLeastpower(){
        return leastpower;
    }
	
    /**
     * 属性 leastpower 的set方法
     * @return
     */
    public void setLeastpower(BigDecimal leastpower){
        this.leastpower = leastpower;
    } 
	
	
	
    /**
     * 属性 largestpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLargestpower(){
        return largestpower;
    }
	
    /**
     * 属性 largestpower 的set方法
     * @return
     */
    public void setLargestpower(BigDecimal largestpower){
        this.largestpower = largestpower;
    } 
	
	
	
    /**
     * 属性 largestpowerinleast 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLargestpowerinleast(){
        return largestpowerinleast;
    }
	
    /**
     * 属性 largestpowerinleast 的set方法
     * @return
     */
    public void setLargestpowerinleast(BigDecimal largestpowerinleast){
        this.largestpowerinleast = largestpowerinleast;
    } 
	
	
	
    /**
     * 属性 ifoncefm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIfoncefm(){
        return ifoncefm;
    }
	
    /**
     * 属性 ifoncefm 的set方法
     * @return
     */
    public void setIfoncefm(BigDecimal ifoncefm){
        this.ifoncefm = ifoncefm;
    } 
	
	
	
    /**
     * 属性 ifagcfm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIfagcfm(){
        return ifagcfm;
    }
	
    /**
     * 属性 ifagcfm 的set方法
     * @return
     */
    public void setIfagcfm(BigDecimal ifagcfm){
        this.ifagcfm = ifagcfm;
    } 
	
	
	
    /**
     * 属性 oncefmtodeath 的get方法
     * @return String
     */
    public String getOncefmtodeath(){
        return oncefmtodeath;
    }
	
    /**
     * 属性 oncefmtodeath 的set方法
     * @return
     */
    public void setOncefmtodeath(String oncefmtodeath){
        this.oncefmtodeath = oncefmtodeath;
    } 
	
	
	
    /**
     * 属性 oncefmrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOncefmrate(){
        return oncefmrate;
    }
	
    /**
     * 属性 oncefmrate 的set方法
     * @return
     */
    public void setOncefmrate(BigDecimal oncefmrate){
        this.oncefmrate = oncefmrate;
    } 
	
	
	
    /**
     * 属性 generatorclass1 的get方法
     * @return String
     */
    public String getGeneratorclass1(){
        return generatorclass1;
    }
	
    /**
     * 属性 generatorclass1 的set方法
     * @return
     */
    public void setGeneratorclass1(String generatorclass1){
        this.generatorclass1 = generatorclass1;
    } 
	
	
	
    /**
     * 属性 generatorclass2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratorclass2(){
        return generatorclass2;
    }
	
    /**
     * 属性 generatorclass2 的set方法
     * @return
     */
    public void setGeneratorclass2(BigDecimal generatorclass2){
        this.generatorclass2 = generatorclass2;
    } 
	
	
	
    /**
     * 属性 licencecode 的get方法
     * @return String
     */
    public String getLicencecode(){
        return licencecode;
    }
	
    /**
     * 属性 licencecode 的set方法
     * @return
     */
    public void setLicencecode(String licencecode){
        this.licencecode = licencecode;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaLogGenerator))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        BaLogGenerator other = (BaLogGenerator) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
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
            .append("generatorcode"+":"+getGeneratorcode())
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
            .append("connectvoltage"+":"+getConnectvoltage())
            .append("generatorvoltage"+":"+getGeneratorvoltage())
            .append("coalconsumeratio"+":"+getCoalconsumeratio())
            .append("opbegindate"+":"+getOpbegindate())
            .append("opstopdate"+":"+getOpstopdate())
            .append("commercialbegindate"+":"+getCommercialbegindate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("isagcflag"+":"+getIsagcflag())
            .append("isadjustflag"+":"+getIsadjustflag())
            .append("isdesulfurated"+":"+getIsdesulfurated())
            .append("iscoldbyair"+":"+getIscoldbyair())
            .append("isheatsupply"+":"+getIsheatsupply())
            .append("isdesalt"+":"+getIsdesalt())
            .append("isbidtype"+":"+getIsbidtype())
            .append("isenviron"+":"+getIsenviron())
            .append("isccunitmode"+":"+getIsccunitmode())
            .append("boilerpressure"+":"+getBoilerpressure())
            .append("desulfurateratio"+":"+getDesulfurateratio())
            .append("denoxratio"+":"+getDenoxratio())
            .append("desaltpetreratio"+":"+getDesaltpetreratio())
            .append("co2ratio"+":"+getCo2ratio())
            .append("dustratio"+":"+getDustratio())
            .append("gateid"+":"+getGateid())
            .append("sheetid"+":"+getSheetid())
            .append("cmd"+":"+getCmd())
            .append("operator"+":"+getOperator())
            .append("operatingdescription"+":"+getOperatingdescription())
            .append("operatedate"+":"+getOperatedate())
            .append("guid"+":"+getGuid())
            .append("extend1"+":"+getExtend1())
            .append("extend2"+":"+getExtend2())
            .append("marketid"+":"+getMarketid())
            .append("npstype"+":"+getNpstype())
            .append("npsgrade"+":"+getNpsgrade())
            .append("npgunitreloadingsycle"+":"+getNpgunitreloadingsycle())
            .append("npgdesignuseyear"+":"+getNpgdesignuseyear())
            .append("npgmodel"+":"+getNpgmodel())
            .append("npgaddre"+":"+getNpgaddre())
            .append("wpgregulatemode"+":"+getWpgregulatemode())
            .append("wptype"+":"+getWptype())
            .append("wpgaddtype"+":"+getWpgaddtype())
            .append("wpgshuitoufenlei"+":"+getWpgshuitoufenlei())
            .append("wpgbasin"+":"+getWpgbasin())
            .append("wpskurong"+":"+getWpskurong())
            .append("csxndzskr"+":"+getCsxndzskr())
            .append("csxnjzcfzhl"+":"+getCsxnjzcfzhl())
            .append("csxnjzfdzcsyccgl"+":"+getCsxnjzfdzcsyccgl())
            .append("csxnjzcszfdyccgl"+":"+getCsxnjzcszfdyccgl())
            .append("csxnjzdjhdcsgkkcxsj"+":"+getCsxnjzdjhdcsgkkcxsj())
            .append("csxnjzdjhdfdgckcxsj"+":"+getCsxnjzdjhdfdgckcxsj())
            .append("csxnjzcsgkhdgl"+":"+getCsxnjzcsgkhdgl())
            .append("csxnjzfdgkhdgl"+":"+getCsxnjzfdgkhdgl())
            .append("csxnjzjszflx"+":"+getCsxnjzjszflx())
            .append("zlscsxnjznzlf"+":"+getZlscsxnjznzlf())
            .append("zlscsxnjzzlfftbDwgs"+":"+getZlscsxnjzzlfftbDwgs())
            .append("zlscsxnjzzlfftbFdqy"+":"+getZlscsxnjzzlfftbFdqy())
            .append("zlscsxnjzzlfftbShyh"+":"+getZlscsxnjzzlfftbShyh())
            .append("dcjz"+":"+getDcjz())
            .append("dczedsc"+":"+getDczedsc())
            .append("grjzlx"+":"+getGrjzlx())
            .append("jzgryl"+":"+getJzgryl())
            .append("jzgzdgrllnl"+":"+getJzgzdgrllnl())
            .append("pjgrll"+":"+getPjgrll())
            .append("generatorModel"+":"+getGeneratorModel())
            .append("cutinWindspeed"+":"+getCutinWindspeed())
            .append("specifiedWindspeed"+":"+getSpecifiedWindspeed())
            .append("cutoutWindspeed"+":"+getCutoutWindspeed())
            .append("vaneDiameter"+":"+getVaneDiameter())
            .append("windfieldType"+":"+getWindfieldType())
            .append("inviteProject"+":"+getInviteProject())
            .append("generatorTowerNum"+":"+getGeneratorTowerNum())
            .append("standAlonePower"+":"+getStandAlonePower())
            .append("generatorStatus"+":"+getGeneratorStatus())
            .append("registerDate"+":"+getRegisterDate())
            .append("testRunDate"+":"+getTestRunDate())
            .append("tradeRunDate"+":"+getTradeRunDate())
            .append("closeRunDate"+":"+getCloseRunDate())
            .append("exitMarketDate"+":"+getExitMarketDate())
            .append("generatorclass"+":"+getGeneratorclass())
            .append("timeConsumption"+":"+getTimeConsumption())
            .append("hotSpotProportion"+":"+getHotSpotProportion())
            .append("buildingexaminecode"+":"+getBuildingexaminecode())
            .append("batchnumber"+":"+getBatchnumber())
            .append("firstcoupledate"+":"+getFirstcoupledate())
            .append("generatormodel"+":"+getGeneratormodel())
            .append("factor"+":"+getFactor())
            .append("connectvoltageorder"+":"+getConnectvoltageorder())
            .append("nominalpower"+":"+getNominalpower())
            .append("settlement"+":"+getSettlement())
            .append("formula"+":"+getFormula())
            .append("currentprice"+":"+getCurrentprice())
            .append("assumptionprice"+":"+getAssumptionprice())
            .append("efpricefectivedate"+":"+getEfpricefectivedate())
            .append("currentcode"+":"+getCurrentcode())
            .append("composite"+":"+getComposite())
            .append("iscomprehensive"+":"+getIscomprehensive())
            .append("avgaddspeed"+":"+getAvgaddspeed())
            .append("avgremovespeed"+":"+getAvgremovespeed())
            .append("coldstarttime"+":"+getColdstarttime())
            .append("hotstarttime"+":"+getHotstarttime())
            .append("warmstarttime"+":"+getWarmstarttime())
            .append("opentostopspace"+":"+getOpentostopspace())
            .append("stoptoopenspace"+":"+getStoptoopenspace())
            .append("summerpower"+":"+getSummerpower())
            .append("winterpower"+":"+getWinterpower())
            .append("leastpower"+":"+getLeastpower())
            .append("largestpower"+":"+getLargestpower())
            .append("largestpowerinleast"+":"+getLargestpowerinleast())
            .append("ifoncefm"+":"+getIfoncefm())
            .append("ifagcfm"+":"+getIfagcfm())
            .append("oncefmtodeath"+":"+getOncefmtodeath())
            .append("oncefmrate"+":"+getOncefmrate())
            .append("generatorclass1"+":"+getGeneratorclass1())
            .append("generatorclass2"+":"+getGeneratorclass2())
            .append("licencecode"+":"+getLicencecode())
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
    private Date desaltdate;
    private Date desulfurateddate;
    private Date desdirtdate;

	public Date getDesaltdate() {
		return desaltdate;
	}

	public void setDesaltdate(Date desaltdate) {
		this.desaltdate = desaltdate;
	}

	public Date getDesulfurateddate() {
		return desulfurateddate;
	}

	public void setDesulfurateddate(Date desulfurateddate) {
		this.desulfurateddate = desulfurateddate;
	}

	public Date getDesdirtdate() {
		return desdirtdate;
	}

	public void setDesdirtdate(Date desdirtdate) {
		this.desdirtdate = desdirtdate;
	}
}