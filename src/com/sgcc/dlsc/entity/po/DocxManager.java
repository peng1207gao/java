package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxManager的POJO类
 *
 * @author  sss  [Fri Nov 15 15:29:34 CST 2013]
 * 
 */
public class DocxManager implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性docid
     */
    private String docid;
	
    /** 
     * 属性docname
     */
    private String docname;
	
    /** 
     * 属性moduleid
     */
    private String moduleid;
	
    /** 
     * 属性docmodeid
     */
    private String docmodeid;
	
    /** 
     * 属性version
     */
    private BigDecimal version;
	
    /** 
     * 属性nversion
     */
    private BigDecimal nversion;
	
    /** 
     * 属性effective
     */
    private BigDecimal effective;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性versiondesc
     */
    private String versiondesc;
	
    /** 
     * 属性ymd
     */
    private String ymd;
	
    /** 
     * 属性bak1
     */
    private String bak1;
	
    /** 
     * 属性bak2
     */
    private String bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /**
     * DocxManager构造函数
     */
    public DocxManager() {
        super();
    }  
	
    /**
     * DocxManager完整的构造函数
     */  
    public DocxManager(String guid,String marketId,String docid,String moduleid){
        this.guid = guid;
        this.marketId = marketId;
        this.docid = docid;
        this.moduleid = moduleid;
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
     * 属性 marketId 的get方法
     * @return String
     */
    public String getMarketId(){
        return marketId;
    }
	
    /**
     * 属性 marketId 的set方法
     * @return
     */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    } 
	
	
	
    /**
     * 属性 docid 的get方法
     * @return String
     */
    public String getDocid(){
        return docid;
    }
	
    /**
     * 属性 docid 的set方法
     * @return
     */
    public void setDocid(String docid){
        this.docid = docid;
    } 
	
	
	
    /**
     * 属性 docname 的get方法
     * @return String
     */
    public String getDocname(){
        return docname;
    }
	
    /**
     * 属性 docname 的set方法
     * @return
     */
    public void setDocname(String docname){
        this.docname = docname;
    } 
	
	
	
    /**
     * 属性 moduleid 的get方法
     * @return String
     */
    public String getModuleid(){
        return moduleid;
    }
	
    /**
     * 属性 moduleid 的set方法
     * @return
     */
    public void setModuleid(String moduleid){
        this.moduleid = moduleid;
    } 
	
	
	
    /**
     * 属性 docmodeid 的get方法
     * @return String
     */
    public String getDocmodeid(){
        return docmodeid;
    }
	
    /**
     * 属性 docmodeid 的set方法
     * @return
     */
    public void setDocmodeid(String docmodeid){
        this.docmodeid = docmodeid;
    } 
	
	
	
    /**
     * 属性 version 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(BigDecimal version){
        this.version = version;
    } 
	
	
	
    /**
     * 属性 nversion 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNversion(){
        return nversion;
    }
	
    /**
     * 属性 nversion 的set方法
     * @return
     */
    public void setNversion(BigDecimal nversion){
        this.nversion = nversion;
    } 
	
	
	
    /**
     * 属性 effective 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEffective(){
        return effective;
    }
	
    /**
     * 属性 effective 的set方法
     * @return
     */
    public void setEffective(BigDecimal effective){
        this.effective = effective;
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
     * 属性 versiondesc 的get方法
     * @return String
     */
    public String getVersiondesc(){
        return versiondesc;
    }
	
    /**
     * 属性 versiondesc 的set方法
     * @return
     */
    public void setVersiondesc(String versiondesc){
        this.versiondesc = versiondesc;
    } 
	
	
	
    /**
     * 属性 ymd 的get方法
     * @return String
     */
    public String getYmd(){
        return ymd;
    }
	
    /**
     * 属性 ymd 的set方法
     * @return
     */
    public void setYmd(String ymd){
        this.ymd = ymd;
    } 
	
	
	
    /**
     * 属性 bak1 的get方法
     * @return String
     */
    public String getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(String bak1){
        this.bak1 = bak1;
    } 
	
	
	
    /**
     * 属性 bak2 的get方法
     * @return String
     */
    public String getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(String bak2){
        this.bak2 = bak2;
    } 
	
	
	
    /**
     * 属性 bak3 的get方法
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DocxManager))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DocxManager other = (DocxManager) o;	        
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
            .append("marketId"+":"+getMarketId())
            .append("docid"+":"+getDocid())
            .append("docname"+":"+getDocname())
            .append("moduleid"+":"+getModuleid())
            .append("docmodeid"+":"+getDocmodeid())
            .append("version"+":"+getVersion())
            .append("nversion"+":"+getNversion())
            .append("effective"+":"+getEffective())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("updatetime"+":"+getUpdatetime())
            .append("versiondesc"+":"+getVersiondesc())
            .append("ymd"+":"+getYmd())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
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