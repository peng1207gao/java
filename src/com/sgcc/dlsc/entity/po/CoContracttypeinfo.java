package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * CoContracttypeinfo的POJO类
 *
 * @author  Administrator  [Thu Jan 23 11:08:07 CST 2014]
 * 
 */
public class CoContracttypeinfo implements Serializable{

    /** 
     * 属性contracttypeid
     */
    private String contracttypeid;
	
    /** 
     * 属性supertypeid
     */
    private String supertypeid;
	
    /** 
     * 属性typename
     */
    private String typename;
	
    /** 
     * 属性description
     */
    private String description;
	
    /** 
     * 属性isdefine
     */
    private BigDecimal isdefine;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性effectiveflag
     */
    private BigDecimal effectiveflag;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /**
     * CoContracttypeinfo构造函数
     */
    public CoContracttypeinfo() {
        super();
    }  
	
    /**
     * CoContracttypeinfo完整的构造函数
     */  
    public CoContracttypeinfo(String contracttypeid,String marketid){
        this.contracttypeid = contracttypeid;
        this.marketid = marketid;
    }
 
	
	
    /**
     * 属性 contracttypeid 的get方法
     * @return String
     */
    public String getContracttypeid(){
        return contracttypeid;
    }
	
    /**
     * 属性 contracttypeid 的set方法
     * @return
     */
    public void setContracttypeid(String contracttypeid){
        if(contracttypeid != null && contracttypeid.trim().length() == 0){
            this.contracttypeid = null;
        }else{
            this.contracttypeid = contracttypeid;
        }
    } 
	
	
	
    /**
     * 属性 supertypeid 的get方法
     * @return String
     */
    public String getSupertypeid(){
        return supertypeid;
    }
	
    /**
     * 属性 supertypeid 的set方法
     * @return
     */
    public void setSupertypeid(String supertypeid){
        this.supertypeid = supertypeid;
    } 
	
	
	
    /**
     * 属性 typename 的get方法
     * @return String
     */
    public String getTypename(){
        return typename;
    }
	
    /**
     * 属性 typename 的set方法
     * @return
     */
    public void setTypename(String typename){
        this.typename = typename;
    } 
	
	
	
    /**
     * 属性 description 的get方法
     * @return String
     */
    public String getDescription(){
        return description;
    }
	
    /**
     * 属性 description 的set方法
     * @return
     */
    public void setDescription(String description){
        this.description = description;
    } 
	
	
	
    /**
     * 属性 isdefine 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdefine(){
        return isdefine;
    }
	
    /**
     * 属性 isdefine 的set方法
     * @return
     */
    public void setIsdefine(BigDecimal isdefine){
        this.isdefine = isdefine;
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
     * 属性 effectiveflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEffectiveflag(){
        return effectiveflag;
    }
	
    /**
     * 属性 effectiveflag 的set方法
     * @return
     */
    public void setEffectiveflag(BigDecimal effectiveflag){
        this.effectiveflag = effectiveflag;
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
     * 从表信息coContracttypeinfos
     */
	private Set coContracttypeinfos = new HashSet();
	
	/**
     * 从表coContracttypeinfos的add方法
     */
    public void addCoContracttypeinfo(Object coContracttypeinfo){
        this.coContracttypeinfos.add(coContracttypeinfo);
    }
   
    /**
     * 从表coContracttypeinfos的get方法
     */
    public Set getCoContracttypeinfos(){
        return this.coContracttypeinfos;
    } 
   
    /**
     * 从表coContracttypeinfos的set方法
     */
    public void setCoContracttypeinfos(Set coContracttypeinfos){
        this.coContracttypeinfos = coContracttypeinfos;
    }    
    
    /**
     * 从表coContracttypeinfos的remove方法
     */
	 public void removeCoContracttypeinfo(Object coContracttypeinfo){
		 this.coContracttypeinfos.remove(coContracttypeinfo);
	 } 
	
	/**
	 * 在主表中增加从表记录
     * @param arg0 
     */
    public void setAddGridDetail(String[] arg0) {
        if( arg0 == null ) return;

        int itemNum0 = Integer.parseInt(arg0[0]);
        for (int i = 0; i < itemNum0; i++) {
		    CoContracttypeinfo coContracttypeinfo = new CoContracttypeinfo();
		    this.coContracttypeinfos.add(coContracttypeinfo);
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
		
        if (o == null || !(o instanceof CoContracttypeinfo))
	        return false; 
			
        if(getContracttypeid() == null) 
	        return false;

        CoContracttypeinfo other = (CoContracttypeinfo) o;	        
	    return new EqualsBuilder()
            .append(this.getContracttypeid(), other.getContracttypeid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("contracttypeid"+":"+getContracttypeid())
            .append("supertypeid"+":"+getSupertypeid())
            .append("typename"+":"+getTypename())
            .append("description"+":"+getDescription())
            .append("isdefine"+":"+getIsdefine())
            .append("marketid"+":"+getMarketid())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("effectiveflag"+":"+getEffectiveflag())
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