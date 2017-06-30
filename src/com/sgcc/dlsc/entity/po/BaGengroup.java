package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaGengroup的POJO类
 *
 * @author  PETERZHANG  [Tue Feb 11 09:46:06 CST 2014]
 * 
 */
public class BaGengroup implements Serializable{

    /** 
     * 属性gengroupid
     */
    private String gengroupid;
	
    /** 
     * 属性gengroupname
     */
    private String gengroupname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性gengroupcode
     */
    private String gengroupcode;
	
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
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * BaGengroup构造函数
     */
    public BaGengroup() {
        super();
    }  
	
    /**
     * BaGengroup完整的构造函数
     */  
    public BaGengroup(String gengroupid,String gengroupname,Date starteffectivedate,String marketid){
        this.gengroupid = gengroupid;
        this.gengroupname = gengroupname;
        this.starteffectivedate = starteffectivedate;
        this.marketid = marketid;
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
        if(gengroupid != null && gengroupid.trim().length() == 0){
            this.gengroupid = null;
        }else{
            this.gengroupid = gengroupid;
        }
    } 
	
    /**
     * 属性 gengroupname 的get方法
     * @return String
     */
    public String getGengroupname(){
        return gengroupname;
    }
	
    /**
     * 属性 gengroupname 的set方法
     * @return
     */
    public void setGengroupname(String gengroupname){
        this.gengroupname = gengroupname;
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
     * 属性 gengroupcode 的get方法
     * @return String
     */
    public String getGengroupcode(){
        return gengroupcode;
    }
	
    /**
     * 属性 gengroupcode 的set方法
     * @return
     */
    public void setGengroupcode(String gengroupcode){
        this.gengroupcode = gengroupcode;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaGengroup))
	        return false; 
			
        if(getGengroupid() == null) 
	        return false;

        BaGengroup other = (BaGengroup) o;	        
	    return new EqualsBuilder()
            .append(this.getGengroupid(), other.getGengroupid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("gengroupid"+":"+getGengroupid())
            .append("gengroupname"+":"+getGengroupname())
            .append("aliasname"+":"+getAliasname())
            .append("gengroupcode"+":"+getGengroupcode())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("address"+":"+getAddress())
            .append("postalcode"+":"+getPostalcode())
            .append("corporation"+":"+getCorporation())
            .append("linkman"+":"+getLinkman())
            .append("officephone"+":"+getOfficephone())
            .append("telephone"+":"+getTelephone())
            .append("faxphone"+":"+getFaxphone())
            .append("email"+":"+getEmail())
            .append("webaddress"+":"+getWebaddress())
            .append("marketid"+":"+getMarketid())
            .append("guid"+":"+getGuid())
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