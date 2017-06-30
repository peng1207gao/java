package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaTemplateparameter的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:36:22 CST 2013]
 * 
 */
public class BaTemplateparameter implements Serializable{

    /**
	 * @description 
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
     * 属性batype
     */
    private String batype;
	
    /** 
     * 属性batemplateid
     */
    private String batemplateid;
	
    /** 
     * 属性tempparamid
     */
    private String tempparamid;
	
    /** 
     * 属性tempparamname
     */
    private String tempparamname;
	
    /** 
     * 属性tempparamex
     */
    private String tempparamex;
	
    /** 
     * 属性tempparamsql
     */
    private String tempparamsql;
	
    /** 
     * 属性tempparamdesc
     */
    private String tempparamdesc;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性isshare
     */
    private BigDecimal isshare;
	
    /** 
     * 属性createdate
     */
    private Date createdate;
	
    /** 
     * 属性creator
     */
    private String creator;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /**
     * BaTemplateparameter构造函数
     */
    public BaTemplateparameter() {
        super();
    }  
	
    /**
     * BaTemplateparameter完整的构造函数
     */  
    public BaTemplateparameter(String guid,String marketid,String batemplateid,String tempparamid,String tempparamname,BigDecimal isshare){
        this.guid = guid;
        this.marketid = marketid;
        this.batemplateid = batemplateid;
        this.tempparamid = tempparamid;
        this.tempparamname = tempparamname;
        this.isshare = isshare;
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
     * 属性 batype 的get方法
     * @return String
     */
    public String getBatype(){
        return batype;
    }
	
    /**
     * 属性 batype 的set方法
     * @return
     */
    public void setBatype(String batype){
        this.batype = batype;
    } 
	
    /**
     * 属性 batemplateid 的get方法
     * @return String
     */
    public String getBatemplateid(){
        return batemplateid;
    }
	
    /**
     * 属性 batemplateid 的set方法
     * @return
     */
    public void setBatemplateid(String batemplateid){
        this.batemplateid = batemplateid;
    } 
	
    /**
     * 属性 tempparamid 的get方法
     * @return String
     */
    public String getTempparamid(){
        return tempparamid;
    }
	
    /**
     * 属性 tempparamid 的set方法
     * @return
     */
    public void setTempparamid(String tempparamid){
        this.tempparamid = tempparamid;
    } 
	
    /**
     * 属性 tempparamname 的get方法
     * @return String
     */
    public String getTempparamname(){
        return tempparamname;
    }
	
    /**
     * 属性 tempparamname 的set方法
     * @return
     */
    public void setTempparamname(String tempparamname){
        this.tempparamname = tempparamname;
    } 
	
    /**
     * 属性 tempparamex 的get方法
     * @return String
     */
    public String getTempparamex(){
        return tempparamex;
    }
	
    /**
     * 属性 tempparamex 的set方法
     * @return
     */
    public void setTempparamex(String tempparamex){
        this.tempparamex = tempparamex;
    } 
	
    /**
     * 属性 tempparamsql 的get方法
     * @return String
     */
    public String getTempparamsql(){
        return tempparamsql;
    }
	
    /**
     * 属性 tempparamsql 的set方法
     * @return
     */
    public void setTempparamsql(String tempparamsql){
        this.tempparamsql = tempparamsql;
    } 
	
    /**
     * 属性 tempparamdesc 的get方法
     * @return String
     */
    public String getTempparamdesc(){
        return tempparamdesc;
    }
	
    /**
     * 属性 tempparamdesc 的set方法
     * @return
     */
    public void setTempparamdesc(String tempparamdesc){
        this.tempparamdesc = tempparamdesc;
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
     * 属性 isshare 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsshare(){
        return isshare;
    }
	
    /**
     * 属性 isshare 的set方法
     * @return
     */
    public void setIsshare(BigDecimal isshare){
        this.isshare = isshare;
    } 
	
    /**
     * 属性 createdate 的get方法
     * @return Date
     */
    public Date getCreatedate(){
        return createdate;
    }
	
    /**
     * 属性 createdate 的set方法
     * @return
     */
    public void setCreatedate(Date createdate){
        this.createdate = createdate;
    } 
	
    /**
     * 属性 creator 的get方法
     * @return String
     */
    public String getCreator(){
        return creator;
    }
	
    /**
     * 属性 creator 的set方法
     * @return
     */
    public void setCreator(String creator){
        this.creator = creator;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaTemplateparameter))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaTemplateparameter other = (BaTemplateparameter) o;	        
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
            .append("batype"+":"+getBatype())
            .append("batemplateid"+":"+getBatemplateid())
            .append("tempparamid"+":"+getTempparamid())
            .append("tempparamname"+":"+getTempparamname())
            .append("tempparamex"+":"+getTempparamex())
            .append("tempparamsql"+":"+getTempparamsql())
            .append("tempparamdesc"+":"+getTempparamdesc())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("isshare"+":"+getIsshare())
            .append("createdate"+":"+getCreatedate())
            .append("creator"+":"+getCreator())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
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