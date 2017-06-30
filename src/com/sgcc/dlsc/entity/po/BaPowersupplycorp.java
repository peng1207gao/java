package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * BaPowersupplycorp的POJO类
 *
 * @author  longshine  [Wed May 28 18:13:01 CST 2014]
 * 
 */
public class BaPowersupplycorp implements Serializable{

    /** 
     * 属性powersupplycorpid
     */
    private String powersupplycorpid;
	
    /** 
     * 属性powersupplycorpname
     */
    private String powersupplycorpname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性powersupplycorpcode
     */
    private String powersupplycorpcode;
	
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
     * 属性geogrregionid
     */
    private String geogrregionid;
	
    /** 
     * 属性controlareaid
     */
    private String controlareaid;
	
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
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性superpowersupplycorpid
     */
    private String superpowersupplycorpid;
	
    /**
     * BaPowersupplycorp构造函数
     */
    public BaPowersupplycorp() {
        super();
    }  
	
    /**
     * BaPowersupplycorp完整的构造函数
     */  
    public BaPowersupplycorp(String powersupplycorpid,String powersupplycorpname,String marketid,Date starteffectivedate){
        this.powersupplycorpid = powersupplycorpid;
        this.powersupplycorpname = powersupplycorpname;
        this.marketid = marketid;
        this.starteffectivedate = starteffectivedate;
    }
 
	
	
    /**
     * 属性 powersupplycorpid 的get方法
     * @return String
     */
    public String getPowersupplycorpid(){
        return powersupplycorpid;
    }
	
    /**
     * 属性 powersupplycorpid 的set方法
     * @return
     */
    public void setPowersupplycorpid(String powersupplycorpid){
        if(powersupplycorpid != null && powersupplycorpid.trim().length() == 0){
            this.powersupplycorpid = null;
        }else{
            this.powersupplycorpid = powersupplycorpid;
        }
    } 
	
	
	
    /**
     * 属性 powersupplycorpname 的get方法
     * @return String
     */
    public String getPowersupplycorpname(){
        return powersupplycorpname;
    }
	
    /**
     * 属性 powersupplycorpname 的set方法
     * @return
     */
    public void setPowersupplycorpname(String powersupplycorpname){
        this.powersupplycorpname = powersupplycorpname;
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
     * 属性 powersupplycorpcode 的get方法
     * @return String
     */
    public String getPowersupplycorpcode(){
        return powersupplycorpcode;
    }
	
    /**
     * 属性 powersupplycorpcode 的set方法
     * @return
     */
    public void setPowersupplycorpcode(String powersupplycorpcode){
        this.powersupplycorpcode = powersupplycorpcode;
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
     * 属性 superpowersupplycorpid 的get方法
     * @return String
     */
    public String getSuperpowersupplycorpid(){
        return superpowersupplycorpid;
    }
	
    /**
     * 属性 superpowersupplycorpid 的set方法
     * @return
     */
    public void setSuperpowersupplycorpid(String superpowersupplycorpid){
        this.superpowersupplycorpid = superpowersupplycorpid;
    } 
	
	/**
     * 从表信息baPowersupplycorps
     */
	private Set baPowersupplycorps = new HashSet();
	
	/**
     * 从表baPowersupplycorps的add方法
     */
    public void addBaPowersupplycorp(Object baPowersupplycorp){
        this.baPowersupplycorps.add(baPowersupplycorp);
    }
   
    /**
     * 从表baPowersupplycorps的get方法
     */
    public Set getBaPowersupplycorps(){
        return this.baPowersupplycorps;
    } 
   
    /**
     * 从表baPowersupplycorps的set方法
     */
    public void setBaPowersupplycorps(Set baPowersupplycorps){
        this.baPowersupplycorps = baPowersupplycorps;
    }    
    
    /**
     * 从表baPowersupplycorps的remove方法
     */
	 public void removeBaPowersupplycorp(Object baPowersupplycorp){
		 this.baPowersupplycorps.remove(baPowersupplycorp);
	 } 
	
	/**
	 * 在主表中增加从表记录
     * @param arg0 
     */
    public void setAddGridDetail(String[] arg0) {
        if( arg0 == null ) return;

        int itemNum0 = Integer.parseInt(arg0[0]);
        for (int i = 0; i < itemNum0; i++) {
		    BaPowersupplycorp baPowersupplycorp = new BaPowersupplycorp();
		    this.baPowersupplycorps.add(baPowersupplycorp);
        }
    }	
	
	/**
	 * 返回从表记录集合
	 */
	public Set[] getSets() {
     	return new Set[]{};
	}
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaPowersupplycorp))
	        return false; 
			
        if(getPowersupplycorpid() == null) 
	        return false;

        BaPowersupplycorp other = (BaPowersupplycorp) o;	        
	    return new EqualsBuilder()
            .append(this.getPowersupplycorpid(), other.getPowersupplycorpid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("powersupplycorpid"+":"+getPowersupplycorpid())
            .append("powersupplycorpname"+":"+getPowersupplycorpname())
            .append("aliasname"+":"+getAliasname())
            .append("marketid"+":"+getMarketid())
            .append("powersupplycorpcode"+":"+getPowersupplycorpcode())
            .append("address"+":"+getAddress())
            .append("postalcode"+":"+getPostalcode())
            .append("corporation"+":"+getCorporation())
            .append("linkman"+":"+getLinkman())
            .append("officephone"+":"+getOfficephone())
            .append("telephone"+":"+getTelephone())
            .append("faxphone"+":"+getFaxphone())
            .append("email"+":"+getEmail())
            .append("webaddress"+":"+getWebaddress())
            .append("geogrregionid"+":"+getGeogrregionid())
            .append("controlareaid"+":"+getControlareaid())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("guid"+":"+getGuid())
            .append("superpowersupplycorpid"+":"+getSuperpowersupplycorpid())
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