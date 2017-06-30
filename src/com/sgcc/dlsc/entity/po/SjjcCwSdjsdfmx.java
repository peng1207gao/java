package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcCwSdjsdfmx的POJO类
 *
 * @author  mengke  [Sat Mar 15 11:41:40 CST 2014]
 * 
 */
public class SjjcCwSdjsdfmx implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性companyname
     */
    private String companyname;
	
    /** 
     * 属性companyid
     */
    private String companyid;
	
    /** 
     * 属性provincename
     */
    private String provincename;
	
    /** 
     * 属性provinceid
     */
    private String provinceid;
	
    /** 
     * 属性wjjshtbm
     */
    private String wjjshtbm;
	
    /** 
     * 属性sj
     */
    private Date sj;
	
    /** 
     * 属性shudldf
     */
    private BigDecimal shudldf;
	
    /** 
     * 属性shoudldf
     */
    private BigDecimal shoudldf;
	
    /** 
     * 属性jfrl
     */
    private BigDecimal jfrl;
	
    /** 
     * 属性rldf
     */
    private BigDecimal rldf;
	
    /** 
     * 属性ydesdf
     */
    private BigDecimal ydesdf;
	
    /** 
     * 属性khdf
     */
    private BigDecimal khdf;
	
    /** 
     * 属性tbdf
     */
    private BigDecimal tbdf;
	
    /** 
     * 属性qtdf
     */
    private BigDecimal qtdf;
	
    /** 
     * 属性ysdfhjhs
     */
    private BigDecimal ysdfhjhs;
	
    /** 
     * 属性srcbbhs
     */
    private BigDecimal srcbbhs;
	
    /** 
     * 属性se
     */
    private BigDecimal se;
	
    /** 
     * 属性bz
     */
    private String bz;
	
    /** 
     * 属性gxsj
     */
    private Date gxsj;
	
    /**
     * SjjcCwSdjsdfmx构造函数
     */
    public SjjcCwSdjsdfmx() {
        super();
    }  
	
    /**
     * SjjcCwSdjsdfmx完整的构造函数
     */  
    public SjjcCwSdjsdfmx(String objId,String companyname,String companyid,String provincename,String provinceid){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 companyname 的get方法
     * @return String
     */
    public String getCompanyname(){
        return companyname;
    }
	
    /**
     * 属性 companyname 的set方法
     * @return
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    } 
	
    /**
     * 属性 companyid 的get方法
     * @return String
     */
    public String getCompanyid(){
        return companyid;
    }
	
    /**
     * 属性 companyid 的set方法
     * @return
     */
    public void setCompanyid(String companyid){
        this.companyid = companyid;
    } 
	
    /**
     * 属性 provincename 的get方法
     * @return String
     */
    public String getProvincename(){
        return provincename;
    }
	
    /**
     * 属性 provincename 的set方法
     * @return
     */
    public void setProvincename(String provincename){
        this.provincename = provincename;
    } 
	
    /**
     * 属性 provinceid 的get方法
     * @return String
     */
    public String getProvinceid(){
        return provinceid;
    }
	
    /**
     * 属性 provinceid 的set方法
     * @return
     */
    public void setProvinceid(String provinceid){
        this.provinceid = provinceid;
    } 
	
    /**
     * 属性 wjjshtbm 的get方法
     * @return String
     */
    public String getWjjshtbm(){
        return wjjshtbm;
    }
	
    /**
     * 属性 wjjshtbm 的set方法
     * @return
     */
    public void setWjjshtbm(String wjjshtbm){
        this.wjjshtbm = wjjshtbm;
    } 
	
    /**
     * 属性 sj 的get方法
     * @return Date
     */
    public Date getSj(){
        return sj;
    }
	
    /**
     * 属性 sj 的set方法
     * @return
     */
    public void setSj(Date sj){
        this.sj = sj;
    } 
	
    /**
     * 属性 shudldf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getShudldf(){
        return shudldf;
    }
	
    /**
     * 属性 shudldf 的set方法
     * @return
     */
    public void setShudldf(BigDecimal shudldf){
        this.shudldf = shudldf;
    } 
	
    /**
     * 属性 shoudldf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getShoudldf(){
        return shoudldf;
    }
	
    /**
     * 属性 shoudldf 的set方法
     * @return
     */
    public void setShoudldf(BigDecimal shoudldf){
        this.shoudldf = shoudldf;
    } 
	
    /**
     * 属性 jfrl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJfrl(){
        return jfrl;
    }
	
    /**
     * 属性 jfrl 的set方法
     * @return
     */
    public void setJfrl(BigDecimal jfrl){
        this.jfrl = jfrl;
    } 
	
    /**
     * 属性 rldf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRldf(){
        return rldf;
    }
	
    /**
     * 属性 rldf 的set方法
     * @return
     */
    public void setRldf(BigDecimal rldf){
        this.rldf = rldf;
    } 
	
    /**
     * 属性 ydesdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYdesdf(){
        return ydesdf;
    }
	
    /**
     * 属性 ydesdf 的set方法
     * @return
     */
    public void setYdesdf(BigDecimal ydesdf){
        this.ydesdf = ydesdf;
    } 
	
    /**
     * 属性 khdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getKhdf(){
        return khdf;
    }
	
    /**
     * 属性 khdf 的set方法
     * @return
     */
    public void setKhdf(BigDecimal khdf){
        this.khdf = khdf;
    } 
	
    /**
     * 属性 tbdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTbdf(){
        return tbdf;
    }
	
    /**
     * 属性 tbdf 的set方法
     * @return
     */
    public void setTbdf(BigDecimal tbdf){
        this.tbdf = tbdf;
    } 
	
    /**
     * 属性 qtdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getQtdf(){
        return qtdf;
    }
	
    /**
     * 属性 qtdf 的set方法
     * @return
     */
    public void setQtdf(BigDecimal qtdf){
        this.qtdf = qtdf;
    } 
	
    /**
     * 属性 ysdfhjhs 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYsdfhjhs(){
        return ysdfhjhs;
    }
	
    /**
     * 属性 ysdfhjhs 的set方法
     * @return
     */
    public void setYsdfhjhs(BigDecimal ysdfhjhs){
        this.ysdfhjhs = ysdfhjhs;
    } 
	
    /**
     * 属性 srcbbhs 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSrcbbhs(){
        return srcbbhs;
    }
	
    /**
     * 属性 srcbbhs 的set方法
     * @return
     */
    public void setSrcbbhs(BigDecimal srcbbhs){
        this.srcbbhs = srcbbhs;
    } 
	
    /**
     * 属性 se 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSe(){
        return se;
    }
	
    /**
     * 属性 se 的set方法
     * @return
     */
    public void setSe(BigDecimal se){
        this.se = se;
    } 
	
    /**
     * 属性 bz 的get方法
     * @return String
     */
    public String getBz(){
        return bz;
    }
	
    /**
     * 属性 bz 的set方法
     * @return
     */
    public void setBz(String bz){
        this.bz = bz;
    } 
	
    /**
     * 属性 gxsj 的get方法
     * @return Date
     */
    public Date getGxsj(){
        return gxsj;
    }
	
    /**
     * 属性 gxsj 的set方法
     * @return
     */
    public void setGxsj(Date gxsj){
        this.gxsj = gxsj;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcCwSdjsdfmx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcCwSdjsdfmx other = (SjjcCwSdjsdfmx) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("companyname"+":"+getCompanyname())
            .append("companyid"+":"+getCompanyid())
            .append("provincename"+":"+getProvincename())
            .append("provinceid"+":"+getProvinceid())
            .append("wjjshtbm"+":"+getWjjshtbm())
            .append("sj"+":"+getSj())
            .append("shudldf"+":"+getShudldf())
            .append("shoudldf"+":"+getShoudldf())
            .append("jfrl"+":"+getJfrl())
            .append("rldf"+":"+getRldf())
            .append("ydesdf"+":"+getYdesdf())
            .append("khdf"+":"+getKhdf())
            .append("tbdf"+":"+getTbdf())
            .append("qtdf"+":"+getQtdf())
            .append("ysdfhjhs"+":"+getYsdfhjhs())
            .append("srcbbhs"+":"+getSrcbbhs())
            .append("se"+":"+getSe())
            .append("bz"+":"+getBz())
            .append("gxsj"+":"+getGxsj())
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