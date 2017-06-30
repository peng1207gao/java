package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaMarketparticipant的POJO类
 *
 * @author  longshine  [Tue Mar 25 15:03:27 CST 2014]
 * 
 */
public class BaMarketparticipant implements Serializable{

    /** 
     * 属性participantname
     */
    private String participantname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性participanttype
     */
    private BigDecimal participanttype;
	
    /** 
     * 属性participantcode
     */
    private String participantcode;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性address
     */
    private String address;
	
    /** 
     * 属性postalcode
     */
    private String postalcode;
	
    /** 
     * 属性corporation
     */
    private String corporation;
	
    /** 
     * 属性linkman
     */
    private String linkman;
	
    /** 
     * 属性officephone
     */
    private String officephone;
	
    /** 
     * 属性telephone
     */
    private String telephone;
	
    /** 
     * 属性faxphone
     */
    private String faxphone;
	
    /** 
     * 属性email
     */
    private String email;
	
    /** 
     * 属性webaddress
     */
    private String webaddress;
	
    /** 
     * 属性licencecode
     */
    private String licencecode;
	
    /** 
     * 属性depositbank
     */
    private String depositbank;
	
    /** 
     * 属性depositname
     */
    private String depositname;
	
    /** 
     * 属性depositaccount
     */
    private String depositaccount;
	
    /** 
     * 属性registerdate
     */
    private Date registerdate;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性agreementid
     */
    private String agreementid;
	
    /** 
     * 属性businesscode
     */
    private String businesscode;
	
    /** 
     * 属性taxcode
     */
    private String taxcode;
	
    /** 
     * 属性geogrregionid
     */
    private String geogrregionid;
	
    /** 
     * 属性controlareaid
     */
    private String controlareaid;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性eastLongitude
     */
    private String eastLongitude;
	
    /** 
     * 属性northernLatitude
     */
    private String northernLatitude;
	
    /** 
     * 属性companyInstallCountVolume
     */
    private BigDecimal companyInstallCountVolume;
	
    /** 
     * 属性companyDispatchVolume
     */
    private BigDecimal companyDispatchVolume;
	
    /** 
     * 属性companyAccountsVolume
     */
    private BigDecimal companyAccountsVolume;
	
    /** 
     * 属性companyDispatchType
     */
    private BigDecimal companyDispatchType;
	
    /** 
     * 属性companyType
     */
    private BigDecimal companyType;
	
    /** 
     * 属性companyAccountsUnit
     */
    private BigDecimal companyAccountsUnit;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
    /** 
     * 属性gdj
     */
    private String gdj;
	
    /** 
     * 属性dfdc
     */
    private BigDecimal dfdc;
	
    /** 
     * 属性oldname
     */
    private String oldname;
	
    /** 
     * 属性dateofissue
     */
    private Date dateofissue;
	
    /** 
     * 属性expirationdate
     */
    private Date expirationdate;
	
    /** 
     * 属性installednum
     */
    private BigDecimal installednum;
	
    /** 
     * 属性servicepower
     */
    private BigDecimal servicepower;
	
    /** 
     * 属性basin
     */
    private String basin;
	
    /** 
     * 属性judicialperson
     */
    private String judicialperson;
	
    /** 
     * 属性taxrate
     */
    private BigDecimal taxrate;
	
    /** 
     * 属性powertype
     */
    private BigDecimal powertype;
	
    /** 
     * 属性dispatch
     */
    private BigDecimal dispatch;
	
    /** 
     * 属性isdistributed
     */
    private BigDecimal isdistributed;
	
    /** 
     * 属性isaggregation
     */
    private BigDecimal isaggregation;
	
    /** 
     * 属性rating
     */
    private BigDecimal rating;
	
    /** 
     * 属性powerkind
     */
    private BigDecimal powerkind;
	
    /** 
     * 属性gengroupid
     */
    private String gengroupid;
	
    /** 
     * 属性position
     */
    private String position;
	
    /** 
     * 属性zdkcdmmfts
     */
    private BigDecimal zdkcdmmfts;
	
    /** 
     * 属性uindustrytype
     */
    private String uindustrytype;
	
    /** 
     * 属性uelectricitytype
     */
    private String uelectricitytype;
	
    /** 
     * 属性uconsumertype
     */
    private String uconsumertype;
	
    /** 
     * 属性uvoltageLevel
     */
    private String uvoltageLevel;
	
    /** 
     * 属性uconsumeraddress
     */
    private String uconsumeraddress;
	
    /** 
     * 属性uproductionshift
     */
    private BigDecimal uproductionshift;
	
    /** 
     * 属性ucontractVolume
     */
    private BigDecimal ucontractVolume;
	
    /** 
     * 属性udeclareVolume
     */
    private BigDecimal udeclareVolume;
	
    /** 
     * 属性urunVolume
     */
    private BigDecimal urunVolume;
	
    /** 
     * 属性uifapprovetransprice
     */
    private BigDecimal uifapprovetransprice;
	
    /** 
     * 属性ifexecutefgflag
     */
    private BigDecimal ifexecutefgflag;
	
    /** 
     * 属性upricetype
     */
    private BigDecimal upricetype;
	
    /** 
     * 属性umeasurementinfo
     */
    private String umeasurementinfo;
	
    /** 
     * 属性safelevel
     */
    private BigDecimal safelevel;
	
    /** 
     * 属性isDelete
     */
    private BigDecimal isDelete;
	
    /** 
     * 属性datasource
     */
    private BigDecimal datasource;
	
    /**
     * BaMarketparticipant构造函数
     */
    public BaMarketparticipant() {
        super();
    }  
	
    /**
     * BaMarketparticipant完整的构造函数
     */  
    public BaMarketparticipant(String participantname,BigDecimal participanttype,String participantcode,String marketid,Date starteffectivedate,String participantid){
        this.participantname = participantname;
        this.participanttype = participanttype;
        this.participantcode = participantcode;
        this.marketid = marketid;
        this.starteffectivedate = starteffectivedate;
        this.participantid = participantid;
    }
 
	
	
    /**
     * 属性 participantname 的get方法
     * @return String
     */
    public String getParticipantname(){
        return participantname;
    }
	
    /**
     * 属性 participantname 的set方法
     * @return
     */
    public void setParticipantname(String participantname){
        this.participantname = participantname;
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
     * 属性 participanttype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getParticipanttype(){
        return participanttype;
    }
	
    /**
     * 属性 participanttype 的set方法
     * @return
     */
    public void setParticipanttype(BigDecimal participanttype){
        this.participanttype = participanttype;
    } 
	
	
	
    /**
     * 属性 participantcode 的get方法
     * @return String
     */
    public String getParticipantcode(){
        return participantcode;
    }
	
    /**
     * 属性 participantcode 的set方法
     * @return
     */
    public void setParticipantcode(String participantcode){
        this.participantcode = participantcode;
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
     * 属性 address 的get方法
     * @return String
     */
    public String getAddress(){
        return address;
    }
	
    /**
     * 属性 address 的set方法
     * @return
     */
    public void setAddress(String address){
        this.address = address;
    } 
	
	
	
    /**
     * 属性 postalcode 的get方法
     * @return String
     */
    public String getPostalcode(){
        return postalcode;
    }
	
    /**
     * 属性 postalcode 的set方法
     * @return
     */
    public void setPostalcode(String postalcode){
        this.postalcode = postalcode;
    } 
	
	
	
    /**
     * 属性 corporation 的get方法
     * @return String
     */
    public String getCorporation(){
        return corporation;
    }
	
    /**
     * 属性 corporation 的set方法
     * @return
     */
    public void setCorporation(String corporation){
        this.corporation = corporation;
    } 
	
	
	
    /**
     * 属性 linkman 的get方法
     * @return String
     */
    public String getLinkman(){
        return linkman;
    }
	
    /**
     * 属性 linkman 的set方法
     * @return
     */
    public void setLinkman(String linkman){
        this.linkman = linkman;
    } 
	
	
	
    /**
     * 属性 officephone 的get方法
     * @return String
     */
    public String getOfficephone(){
        return officephone;
    }
	
    /**
     * 属性 officephone 的set方法
     * @return
     */
    public void setOfficephone(String officephone){
        this.officephone = officephone;
    } 
	
	
	
    /**
     * 属性 telephone 的get方法
     * @return String
     */
    public String getTelephone(){
        return telephone;
    }
	
    /**
     * 属性 telephone 的set方法
     * @return
     */
    public void setTelephone(String telephone){
        this.telephone = telephone;
    } 
	
	
	
    /**
     * 属性 faxphone 的get方法
     * @return String
     */
    public String getFaxphone(){
        return faxphone;
    }
	
    /**
     * 属性 faxphone 的set方法
     * @return
     */
    public void setFaxphone(String faxphone){
        this.faxphone = faxphone;
    } 
	
	
	
    /**
     * 属性 email 的get方法
     * @return String
     */
    public String getEmail(){
        return email;
    }
	
    /**
     * 属性 email 的set方法
     * @return
     */
    public void setEmail(String email){
        this.email = email;
    } 
	
	
	
    /**
     * 属性 webaddress 的get方法
     * @return String
     */
    public String getWebaddress(){
        return webaddress;
    }
	
    /**
     * 属性 webaddress 的set方法
     * @return
     */
    public void setWebaddress(String webaddress){
        this.webaddress = webaddress;
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
     * 属性 depositbank 的get方法
     * @return String
     */
    public String getDepositbank(){
        return depositbank;
    }
	
    /**
     * 属性 depositbank 的set方法
     * @return
     */
    public void setDepositbank(String depositbank){
        this.depositbank = depositbank;
    } 
	
	
	
    /**
     * 属性 depositname 的get方法
     * @return String
     */
    public String getDepositname(){
        return depositname;
    }
	
    /**
     * 属性 depositname 的set方法
     * @return
     */
    public void setDepositname(String depositname){
        this.depositname = depositname;
    } 
	
	
	
    /**
     * 属性 depositaccount 的get方法
     * @return String
     */
    public String getDepositaccount(){
        return depositaccount;
    }
	
    /**
     * 属性 depositaccount 的set方法
     * @return
     */
    public void setDepositaccount(String depositaccount){
        this.depositaccount = depositaccount;
    } 
	
	
	
    /**
     * 属性 registerdate 的get方法
     * @return Date
     */
    public Date getRegisterdate(){
        return registerdate;
    }
	
    /**
     * 属性 registerdate 的set方法
     * @return
     */
    public void setRegisterdate(Date registerdate){
        this.registerdate = registerdate;
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
     * 属性 agreementid 的get方法
     * @return String
     */
    public String getAgreementid(){
        return agreementid;
    }
	
    /**
     * 属性 agreementid 的set方法
     * @return
     */
    public void setAgreementid(String agreementid){
        this.agreementid = agreementid;
    } 
	
	
	
    /**
     * 属性 businesscode 的get方法
     * @return String
     */
    public String getBusinesscode(){
        return businesscode;
    }
	
    /**
     * 属性 businesscode 的set方法
     * @return
     */
    public void setBusinesscode(String businesscode){
        this.businesscode = businesscode;
    } 
	
	
	
    /**
     * 属性 taxcode 的get方法
     * @return String
     */
    public String getTaxcode(){
        return taxcode;
    }
	
    /**
     * 属性 taxcode 的set方法
     * @return
     */
    public void setTaxcode(String taxcode){
        this.taxcode = taxcode;
    } 
	
	
	
    /**
     * 属性 geogrregionid 的get方法
     * @return String
     */
    public String getGeogrregionid(){
        return geogrregionid;
    }
	
    /**
     * 属性 geogrregionid 的set方法
     * @return
     */
    public void setGeogrregionid(String geogrregionid){
        this.geogrregionid = geogrregionid;
    } 
	
	
	
    /**
     * 属性 controlareaid 的get方法
     * @return String
     */
    public String getControlareaid(){
        return controlareaid;
    }
	
    /**
     * 属性 controlareaid 的set方法
     * @return
     */
    public void setControlareaid(String controlareaid){
        this.controlareaid = controlareaid;
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
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
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
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        if(participantid != null && participantid.trim().length() == 0){
            this.participantid = null;
        }else{
            this.participantid = participantid;
        }
    } 
	
	
	
    /**
     * 属性 eastLongitude 的get方法
     * @return String
     */
    public String getEastLongitude(){
        return eastLongitude;
    }
	
    /**
     * 属性 eastLongitude 的set方法
     * @return
     */
    public void setEastLongitude(String eastLongitude){
        this.eastLongitude = eastLongitude;
    } 
	
	
	
    /**
     * 属性 northernLatitude 的get方法
     * @return String
     */
    public String getNorthernLatitude(){
        return northernLatitude;
    }
	
    /**
     * 属性 northernLatitude 的set方法
     * @return
     */
    public void setNorthernLatitude(String northernLatitude){
        this.northernLatitude = northernLatitude;
    } 
	
	
	
    /**
     * 属性 companyInstallCountVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCompanyInstallCountVolume(){
        return companyInstallCountVolume;
    }
	
    /**
     * 属性 companyInstallCountVolume 的set方法
     * @return
     */
    public void setCompanyInstallCountVolume(BigDecimal companyInstallCountVolume){
        this.companyInstallCountVolume = companyInstallCountVolume;
    } 
	
	
	
    /**
     * 属性 companyDispatchVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCompanyDispatchVolume(){
        return companyDispatchVolume;
    }
	
    /**
     * 属性 companyDispatchVolume 的set方法
     * @return
     */
    public void setCompanyDispatchVolume(BigDecimal companyDispatchVolume){
        this.companyDispatchVolume = companyDispatchVolume;
    } 
	
	
	
    /**
     * 属性 companyAccountsVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCompanyAccountsVolume(){
        return companyAccountsVolume;
    }
	
    /**
     * 属性 companyAccountsVolume 的set方法
     * @return
     */
    public void setCompanyAccountsVolume(BigDecimal companyAccountsVolume){
        this.companyAccountsVolume = companyAccountsVolume;
    } 
	
	
	
    /**
     * 属性 companyDispatchType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCompanyDispatchType(){
        return companyDispatchType;
    }
	
    /**
     * 属性 companyDispatchType 的set方法
     * @return
     */
    public void setCompanyDispatchType(BigDecimal companyDispatchType){
        this.companyDispatchType = companyDispatchType;
    } 
	
	
	
    /**
     * 属性 companyType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCompanyType(){
        return companyType;
    }
	
    /**
     * 属性 companyType 的set方法
     * @return
     */
    public void setCompanyType(BigDecimal companyType){
        this.companyType = companyType;
    } 
	
	
	
    /**
     * 属性 companyAccountsUnit 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCompanyAccountsUnit(){
        return companyAccountsUnit;
    }
	
    /**
     * 属性 companyAccountsUnit 的set方法
     * @return
     */
    public void setCompanyAccountsUnit(BigDecimal companyAccountsUnit){
        this.companyAccountsUnit = companyAccountsUnit;
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
     * 属性 gdj 的get方法
     * @return String
     */
    public String getGdj(){
        return gdj;
    }
	
    /**
     * 属性 gdj 的set方法
     * @return
     */
    public void setGdj(String gdj){
        this.gdj = gdj;
    } 
	
	
	
    /**
     * 属性 dfdc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDfdc(){
        return dfdc;
    }
	
    /**
     * 属性 dfdc 的set方法
     * @return
     */
    public void setDfdc(BigDecimal dfdc){
        this.dfdc = dfdc;
    } 
	
	
	
    /**
     * 属性 oldname 的get方法
     * @return String
     */
    public String getOldname(){
        return oldname;
    }
	
    /**
     * 属性 oldname 的set方法
     * @return
     */
    public void setOldname(String oldname){
        this.oldname = oldname;
    } 
	
	
	
    /**
     * 属性 dateofissue 的get方法
     * @return Date
     */
    public Date getDateofissue(){
        return dateofissue;
    }
	
    /**
     * 属性 dateofissue 的set方法
     * @return
     */
    public void setDateofissue(Date dateofissue){
        this.dateofissue = dateofissue;
    } 
	
	
	
    /**
     * 属性 expirationdate 的get方法
     * @return Date
     */
    public Date getExpirationdate(){
        return expirationdate;
    }
	
    /**
     * 属性 expirationdate 的set方法
     * @return
     */
    public void setExpirationdate(Date expirationdate){
        this.expirationdate = expirationdate;
    } 
	
	
	
    /**
     * 属性 installednum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getInstallednum(){
        return installednum;
    }
	
    /**
     * 属性 installednum 的set方法
     * @return
     */
    public void setInstallednum(BigDecimal installednum){
        this.installednum = installednum;
    } 
	
	
	
    /**
     * 属性 servicepower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getServicepower(){
        return servicepower;
    }
	
    /**
     * 属性 servicepower 的set方法
     * @return
     */
    public void setServicepower(BigDecimal servicepower){
        this.servicepower = servicepower;
    } 
	
	
	
    /**
     * 属性 basin 的get方法
     * @return String
     */
    public String getBasin(){
        return basin;
    }
	
    /**
     * 属性 basin 的set方法
     * @return
     */
    public void setBasin(String basin){
        this.basin = basin;
    } 
	
	
	
    /**
     * 属性 judicialperson 的get方法
     * @return String
     */
    public String getJudicialperson(){
        return judicialperson;
    }
	
    /**
     * 属性 judicialperson 的set方法
     * @return
     */
    public void setJudicialperson(String judicialperson){
        this.judicialperson = judicialperson;
    } 
	
	
	
    /**
     * 属性 taxrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTaxrate(){
        return taxrate;
    }
	
    /**
     * 属性 taxrate 的set方法
     * @return
     */
    public void setTaxrate(BigDecimal taxrate){
        this.taxrate = taxrate;
    } 
	
	
	
    /**
     * 属性 powertype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowertype(){
        return powertype;
    }
	
    /**
     * 属性 powertype 的set方法
     * @return
     */
    public void setPowertype(BigDecimal powertype){
        this.powertype = powertype;
    } 
	
	
	
    /**
     * 属性 dispatch 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDispatch(){
        return dispatch;
    }
	
    /**
     * 属性 dispatch 的set方法
     * @return
     */
    public void setDispatch(BigDecimal dispatch){
        this.dispatch = dispatch;
    } 
	
	
	
    /**
     * 属性 isdistributed 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdistributed(){
        return isdistributed;
    }
	
    /**
     * 属性 isdistributed 的set方法
     * @return
     */
    public void setIsdistributed(BigDecimal isdistributed){
        this.isdistributed = isdistributed;
    } 
	
	
	
    /**
     * 属性 isaggregation 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsaggregation(){
        return isaggregation;
    }
	
    /**
     * 属性 isaggregation 的set方法
     * @return
     */
    public void setIsaggregation(BigDecimal isaggregation){
        this.isaggregation = isaggregation;
    } 
	
	
	
    /**
     * 属性 rating 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRating(){
        return rating;
    }
	
    /**
     * 属性 rating 的set方法
     * @return
     */
    public void setRating(BigDecimal rating){
        this.rating = rating;
    } 
	
	
	
    /**
     * 属性 powerkind 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowerkind(){
        return powerkind;
    }
	
    /**
     * 属性 powerkind 的set方法
     * @return
     */
    public void setPowerkind(BigDecimal powerkind){
        this.powerkind = powerkind;
    } 
	
	
	
    /**
     * 属性 gengroupid 的get方法
     * @return String
     */
    public String getGengroupid(){
        return gengroupid;
    }
	
    /**
     * 属性 gengroupid 的set方法
     * @return
     */
    public void setGengroupid(String gengroupid){
        this.gengroupid = gengroupid;
    } 
	
	
	
    /**
     * 属性 position 的get方法
     * @return String
     */
    public String getPosition(){
        return position;
    }
	
    /**
     * 属性 position 的set方法
     * @return
     */
    public void setPosition(String position){
        this.position = position;
    } 
	
	
	
    /**
     * 属性 zdkcdmmfts 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZdkcdmmfts(){
        return zdkcdmmfts;
    }
	
    /**
     * 属性 zdkcdmmfts 的set方法
     * @return
     */
    public void setZdkcdmmfts(BigDecimal zdkcdmmfts){
        this.zdkcdmmfts = zdkcdmmfts;
    } 
	
	
	
    /**
     * 属性 uindustrytype 的get方法
     * @return String
     */
    public String getUindustrytype(){
        return uindustrytype;
    }
	
    /**
     * 属性 uindustrytype 的set方法
     * @return
     */
    public void setUindustrytype(String uindustrytype){
        this.uindustrytype = uindustrytype;
    } 
	
	
	
    /**
     * 属性 uelectricitytype 的get方法
     * @return BigDecimal
     */
    public String getUelectricitytype(){
        return uelectricitytype;
    }
	
    /**
     * 属性 uelectricitytype 的set方法
     * @return
     */
    public void setUelectricitytype(String uelectricitytype){
        this.uelectricitytype = uelectricitytype;
    } 
	
	
	
    /**
     * 属性 uconsumertype 的get方法
     * @return BigDecimal
     */
    public String getUconsumertype(){
        return uconsumertype;
    }
	
    /**
     * 属性 uconsumertype 的set方法
     * @return
     */
    public void setUconsumertype(String uconsumertype){
        this.uconsumertype = uconsumertype;
    } 
	
	
	
    /**
     * 属性 uvoltageLevel 的get方法
     * @return BigDecimal
     */
    public String getUvoltageLevel(){
        return uvoltageLevel;
    }
	
    /**
     * 属性 uvoltageLevel 的set方法
     * @return
     */
    public void setUvoltageLevel(String uvoltageLevel){
        this.uvoltageLevel = uvoltageLevel;
    } 
	
	
	
    /**
     * 属性 uconsumeraddress 的get方法
     * @return String
     */
    public String getUconsumeraddress(){
        return uconsumeraddress;
    }
	
    /**
     * 属性 uconsumeraddress 的set方法
     * @return
     */
    public void setUconsumeraddress(String uconsumeraddress){
        this.uconsumeraddress = uconsumeraddress;
    } 
	
	
	
    /**
     * 属性 uproductionshift 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUproductionshift(){
        return uproductionshift;
    }
	
    /**
     * 属性 uproductionshift 的set方法
     * @return
     */
    public void setUproductionshift(BigDecimal uproductionshift){
        this.uproductionshift = uproductionshift;
    } 
	
	
	
    /**
     * 属性 ucontractVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUcontractVolume(){
        return ucontractVolume;
    }
	
    /**
     * 属性 ucontractVolume 的set方法
     * @return
     */
    public void setUcontractVolume(BigDecimal ucontractVolume){
        this.ucontractVolume = ucontractVolume;
    } 
	
	
	
    /**
     * 属性 udeclareVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUdeclareVolume(){
        return udeclareVolume;
    }
	
    /**
     * 属性 udeclareVolume 的set方法
     * @return
     */
    public void setUdeclareVolume(BigDecimal udeclareVolume){
        this.udeclareVolume = udeclareVolume;
    } 
	
	
	
    /**
     * 属性 urunVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUrunVolume(){
        return urunVolume;
    }
	
    /**
     * 属性 urunVolume 的set方法
     * @return
     */
    public void setUrunVolume(BigDecimal urunVolume){
        this.urunVolume = urunVolume;
    } 
	
	
	
    /**
     * 属性 uifapprovetransprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUifapprovetransprice(){
        return uifapprovetransprice;
    }
	
    /**
     * 属性 uifapprovetransprice 的set方法
     * @return
     */
    public void setUifapprovetransprice(BigDecimal uifapprovetransprice){
        this.uifapprovetransprice = uifapprovetransprice;
    } 
	
	
	
    /**
     * 属性 ifexecutefgflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIfexecutefgflag(){
        return ifexecutefgflag;
    }
	
    /**
     * 属性 ifexecutefgflag 的set方法
     * @return
     */
    public void setIfexecutefgflag(BigDecimal ifexecutefgflag){
        this.ifexecutefgflag = ifexecutefgflag;
    } 
	
	
	
    /**
     * 属性 upricetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUpricetype(){
        return upricetype;
    }
	
    /**
     * 属性 upricetype 的set方法
     * @return
     */
    public void setUpricetype(BigDecimal upricetype){
        this.upricetype = upricetype;
    } 
	
	
	
    /**
     * 属性 umeasurementinfo 的get方法
     * @return String
     */
    public String getUmeasurementinfo(){
        return umeasurementinfo;
    }
	
    /**
     * 属性 umeasurementinfo 的set方法
     * @return
     */
    public void setUmeasurementinfo(String umeasurementinfo){
        this.umeasurementinfo = umeasurementinfo;
    } 
	
	
	
    /**
     * 属性 safelevel 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSafelevel(){
        return safelevel;
    }
	
    /**
     * 属性 safelevel 的set方法
     * @return
     */
    public void setSafelevel(BigDecimal safelevel){
        this.safelevel = safelevel;
    } 
	
	
	
    /**
     * 属性 isDelete 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsDelete(){
        return isDelete;
    }
	
    /**
     * 属性 isDelete 的set方法
     * @return
     */
    public void setIsDelete(BigDecimal isDelete){
        this.isDelete = isDelete;
    } 
	
	
	
    /**
     * 属性 datasource 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatasource(){
        return datasource;
    }
	
    /**
     * 属性 datasource 的set方法
     * @return
     */
    public void setDatasource(BigDecimal datasource){
        this.datasource = datasource;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaMarketparticipant))
	        return false; 
			
        if(getParticipantid() == null) 
	        return false;

        BaMarketparticipant other = (BaMarketparticipant) o;	        
	    return new EqualsBuilder()
            .append(this.getParticipantid(), other.getParticipantid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("participantname"+":"+getParticipantname())
            .append("aliasname"+":"+getAliasname())
            .append("participanttype"+":"+getParticipanttype())
            .append("participantcode"+":"+getParticipantcode())
            .append("marketid"+":"+getMarketid())
            .append("address"+":"+getAddress())
            .append("postalcode"+":"+getPostalcode())
            .append("corporation"+":"+getCorporation())
            .append("linkman"+":"+getLinkman())
            .append("officephone"+":"+getOfficephone())
            .append("telephone"+":"+getTelephone())
            .append("faxphone"+":"+getFaxphone())
            .append("email"+":"+getEmail())
            .append("webaddress"+":"+getWebaddress())
            .append("licencecode"+":"+getLicencecode())
            .append("depositbank"+":"+getDepositbank())
            .append("depositname"+":"+getDepositname())
            .append("depositaccount"+":"+getDepositaccount())
            .append("registerdate"+":"+getRegisterdate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("agreementid"+":"+getAgreementid())
            .append("businesscode"+":"+getBusinesscode())
            .append("taxcode"+":"+getTaxcode())
            .append("geogrregionid"+":"+getGeogrregionid())
            .append("controlareaid"+":"+getControlareaid())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("guid"+":"+getGuid())
            .append("participantid"+":"+getParticipantid())
            .append("eastLongitude"+":"+getEastLongitude())
            .append("northernLatitude"+":"+getNorthernLatitude())
            .append("companyInstallCountVolume"+":"+getCompanyInstallCountVolume())
            .append("companyDispatchVolume"+":"+getCompanyDispatchVolume())
            .append("companyAccountsVolume"+":"+getCompanyAccountsVolume())
            .append("companyDispatchType"+":"+getCompanyDispatchType())
            .append("companyType"+":"+getCompanyType())
            .append("companyAccountsUnit"+":"+getCompanyAccountsUnit())
            .append("state"+":"+getState())
            .append("gdj"+":"+getGdj())
            .append("dfdc"+":"+getDfdc())
            .append("oldname"+":"+getOldname())
            .append("dateofissue"+":"+getDateofissue())
            .append("expirationdate"+":"+getExpirationdate())
            .append("installednum"+":"+getInstallednum())
            .append("servicepower"+":"+getServicepower())
            .append("basin"+":"+getBasin())
            .append("judicialperson"+":"+getJudicialperson())
            .append("taxrate"+":"+getTaxrate())
            .append("powertype"+":"+getPowertype())
            .append("dispatch"+":"+getDispatch())
            .append("isdistributed"+":"+getIsdistributed())
            .append("isaggregation"+":"+getIsaggregation())
            .append("rating"+":"+getRating())
            .append("powerkind"+":"+getPowerkind())
            .append("gengroupid"+":"+getGengroupid())
            .append("position"+":"+getPosition())
            .append("zdkcdmmfts"+":"+getZdkcdmmfts())
            .append("uindustrytype"+":"+getUindustrytype())
            .append("uelectricitytype"+":"+getUelectricitytype())
            .append("uconsumertype"+":"+getUconsumertype())
            .append("uvoltageLevel"+":"+getUvoltageLevel())
            .append("uconsumeraddress"+":"+getUconsumeraddress())
            .append("uproductionshift"+":"+getUproductionshift())
            .append("ucontractVolume"+":"+getUcontractVolume())
            .append("udeclareVolume"+":"+getUdeclareVolume())
            .append("urunVolume"+":"+getUrunVolume())
            .append("uifapprovetransprice"+":"+getUifapprovetransprice())
            .append("ifexecutefgflag"+":"+getIfexecutefgflag())
            .append("upricetype"+":"+getUpricetype())
            .append("umeasurementinfo"+":"+getUmeasurementinfo())
            .append("safelevel"+":"+getSafelevel())
            .append("isDelete"+":"+getIsDelete())
            .append("datasource"+":"+getDatasource())
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