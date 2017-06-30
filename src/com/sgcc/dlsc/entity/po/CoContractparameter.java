package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractparameter的POJO类
 *
 * @author  xiabaike  [Thu May 22 11:21:18 CST 2014]
 * 
 */
public class CoContractparameter implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
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
     * 属性contracttype
     */
    private String contracttype;
	
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
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性contracttemplatecode
     */
    private String contracttemplatecode;
	
    /** 
     * 属性dicId
     */
    private String dicId;
	
    /** 
     * 属性bookMark
     */
    private String bookmark;
    
    /**
     * CoContractparameter构造函数
     */
    public CoContractparameter() {
        super();
    }  
	
    /**
     * CoContractparameter完整的构造函数
     */  
    public CoContractparameter(String marketid,String tempparamid,String tempparamname,BigDecimal isshare,BigDecimal isdelete){
        this.marketid = marketid;
        this.tempparamid = tempparamid;
        this.tempparamname = tempparamname;
        this.isshare = isshare;
        this.isdelete = isdelete;
    }
    
	public String getBookmark() {
		return bookmark;
	}

	public void setBookmark(String bookmark) {
		this.bookmark = bookmark;
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
        if(tempparamid != null && tempparamid.trim().length() == 0){
            this.tempparamid = null;
        }else{
            this.tempparamid = tempparamid;
        }
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
     * 属性 contracttype 的get方法
     * @return String
     */
    public String getContracttype(){
        return contracttype;
    }
	
    /**
     * 属性 contracttype 的set方法
     * @return
     */
    public void setContracttype(String contracttype){
        this.contracttype = contracttype;
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
     * 属性 isdelete 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdelete(){
        return isdelete;
    }
	
    /**
     * 属性 isdelete 的set方法
     * @return
     */
    public void setIsdelete(BigDecimal isdelete){
        this.isdelete = isdelete;
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
     * 属性 contracttemplatecode 的get方法
     * @return String
     */
    public String getContracttemplatecode(){
        return contracttemplatecode;
    }
	
    /**
     * 属性 contracttemplatecode 的set方法
     * @return
     */
    public void setContracttemplatecode(String contracttemplatecode){
        this.contracttemplatecode = contracttemplatecode;
    } 
	
    /**
     * 属性 dicId 的get方法
     * @return String
     */
    public String getDicId(){
        return dicId;
    }
	
    /**
     * 属性 dicId 的set方法
     * @return
     */
    public void setDicId(String dicId){
        this.dicId = dicId;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractparameter))
	        return false; 
			
        if(getTempparamid() == null) 
	        return false;

        CoContractparameter other = (CoContractparameter) o;	        
	    return new EqualsBuilder()
            .append(this.getTempparamid(), other.getTempparamid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("marketid"+":"+getMarketid())
            .append("tempparamid"+":"+getTempparamid())
            .append("tempparamname"+":"+getTempparamname())
            .append("tempparamex"+":"+getTempparamex())
            .append("tempparamsql"+":"+getTempparamsql())
            .append("tempparamdesc"+":"+getTempparamdesc())
            .append("contracttype"+":"+getContracttype())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("isshare"+":"+getIsshare())
            .append("createdate"+":"+getCreatedate())
            .append("creator"+":"+getCreator())
            .append("isdelete"+":"+getIsdelete())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("contracttemplatecode"+":"+getContracttemplatecode())
            .append("dicId"+":"+getDicId())
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