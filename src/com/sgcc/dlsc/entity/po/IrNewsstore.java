package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * IrNewsstore的POJO类
 *
 * @author  toshiba  [Wed Aug 14 16:37:09 CST 2013]
 * 
 */
public class IrNewsstore implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性flowid
     */
    private String flowid;
	
    /** 
     * 属性itemid
     */
    private String itemid;
	
    /** 
     * 属性itemname
     */
    private String itemname;
	
    /** 
     * 属性numid
     */
    private String numid;
	
    /** 
     * 属性ntitle
     */
    private String ntitle;
	
    /** 
     * 属性nsummary
     */
    private String nsummary;
	
    /** 
     * 属性nsource
     */
    private String nsource;
	
    /** 
     * 属性nauthor
     */
    private String nauthor;
	
    /** 
     * 属性issuetime
     */
    private Timestamp issuetime;
	
    /** 
     * 属性endtime
     */
    private Timestamp endtime;
	
    /** 
     * 属性clicktimes
     */
    private BigDecimal clicktimes;
	
    /** 
     * 属性hottype
     */
    private String hottype;
	
    /** 
     * 属性opentype
     */
    private String opentype;
	
    /** 
     * 属性piclayouttype
     */
    private String piclayouttype;
	
    /** 
     * 属性issuetype
     */
    private String issuetype;
	
    /** 
     * 属性operuser
     */
    private String operuser;
	
    /** 
     * 属性opertime
     */
    private Date opertime;
	
    /** 
     * 属性verifytype
     */
    private String verifytype;
	
    /** 
     * 属性verifyinfo
     */
    private String verifyinfo;
	
    /** 
     * 属性backField1
     */
    private byte[] backField1;
	
    /** 
     * 属性backField2
     */
    private byte[] backField2;
	
    /** 
     * 属性backField3
     */
    private String backField3;
	
    /** 
     * 属性backField4
     */
    private String backField4;
	
    /** 
     * 属性backField5
     */
    private BigDecimal backField5;
	
    /** 
     * 属性backField6
     */
    private BigDecimal backField6;
	
    /** 
     * 属性keyword
     */
    private String keyword;
	
    /** 
     * 属性filecontent
     */
    private String filecontent;
	
    /** 
     * 属性addpic
     */
    private String addpic;
	
    /** 
     * 属性addfile1
     */
    private String addfile1;
	
    /** 
     * 属性addfile2
     */
    private String addfile2;
    private Integer  tyear;
    private Integer tmonth;
    private Integer tquarter;
    private Date tdate;
    private Integer timetype;
    /** 
     * 属性backField7
     */
    private String backField7;
    /** 
     * 属性backField8
     */
    private String backField8;
    /** 
     * 属性backField9
     */
    private String backField9;
    /** 
     * 属性backField10
     */
    private String backField10;
    
    
	
    /**
     * IrNewsstore构造函数
     */
    public IrNewsstore() {
        super();
    }  
	
    /**
     * IrNewsstore完整的构造函数
     */  
    public IrNewsstore(String guid,String itemid,String ntitle,Timestamp issuetime){
        this.guid = guid;
        this.itemid = itemid;
        this.ntitle = ntitle;
        this.issuetime = issuetime;
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
     * 属性 flowid 的get方法
     * @return String
     */
    public String getFlowid(){
        return flowid;
    }
	
    /**
     * 属性 flowid 的set方法
     * @return
     */
    public void setFlowid(String flowid){
        this.flowid = flowid;
    } 
	
    /**
     * 属性 itemid 的get方法
     * @return String
     */
    public String getItemid(){
        return itemid;
    }
	
    /**
     * 属性 itemid 的set方法
     * @return
     */
    public void setItemid(String itemid){
        this.itemid = itemid;
    } 
	
    /**
     * 属性 itemname 的get方法
     * @return String
     */
    public String getItemname(){
        return itemname;
    }
	
    /**
     * 属性 itemname 的set方法
     * @return
     */
    public void setItemname(String itemname){
        this.itemname = itemname;
    } 
	
    /**
     * 属性 numid 的get方法
     * @return String
     */
    public String getNumid(){
        return numid;
    }
	
    /**
     * 属性 numid 的set方法
     * @return
     */
    public void setNumid(String numid){
        this.numid = numid;
    } 
	
    /**
     * 属性 ntitle 的get方法
     * @return String
     */
    public String getNtitle(){
        return ntitle;
    }
	
    /**
     * 属性 ntitle 的set方法
     * @return
     */
    public void setNtitle(String ntitle){
        this.ntitle = ntitle;
    } 
	
    /**
     * 属性 nsummary 的get方法
     * @return String
     */
    public String getNsummary(){
        return nsummary;
    }
	
    /**
     * 属性 nsummary 的set方法
     * @return
     */
    public void setNsummary(String nsummary){
        this.nsummary = nsummary;
    } 
	
    /**
     * 属性 nsource 的get方法
     * @return String
     */
    public String getNsource(){
        return nsource;
    }
	
    /**
     * 属性 nsource 的set方法
     * @return
     */
    public void setNsource(String nsource){
        this.nsource = nsource;
    } 
	
    /**
     * 属性 nauthor 的get方法
     * @return String
     */
    public String getNauthor(){
        return nauthor;
    }
	
    /**
     * 属性 nauthor 的set方法
     * @return
     */
    public void setNauthor(String nauthor){
        this.nauthor = nauthor;
    } 
	
    /**
     * 属性 issuetime 的get方法
     * @return Date
     */
    public Timestamp getIssuetime(){
        return issuetime;
    }
	
    /**
     * 属性 issuetime 的set方法
     * @return
     */
    public void setIssuetime(Timestamp issuetime){
        this.issuetime = issuetime;
    } 
	
    /**
     * 属性 endtime 的get方法
     * @return Date
     */
    public Timestamp getEndtime(){
        return endtime;
    }
	
    /**
     * 属性 endtime 的set方法
     * @return
     */
    public void setEndtime(Timestamp endtime){
        this.endtime = endtime;
    } 
	
    /**
     * 属性 clicktimes 的get方法
     * @return BigDecimal
     */
    public BigDecimal getClicktimes(){
        return clicktimes;
    }
	
    /**
     * 属性 clicktimes 的set方法
     * @return
     */
    public void setClicktimes(BigDecimal clicktimes){
        this.clicktimes = clicktimes;
    } 
	
    /**
     * 属性 hottype 的get方法
     * @return String
     */
    public String getHottype(){
        return hottype;
    }
	
    /**
     * 属性 hottype 的set方法
     * @return
     */
    public void setHottype(String hottype){
        this.hottype = hottype;
    } 
	
    /**
     * 属性 opentype 的get方法
     * @return String
     */
    public String getOpentype(){
        return opentype;
    }
	
    /**
     * 属性 opentype 的set方法
     * @return
     */
    public void setOpentype(String opentype){
        this.opentype = opentype;
    } 
	
    /**
     * 属性 piclayouttype 的get方法
     * @return String
     */
    public String getPiclayouttype(){
        return piclayouttype;
    }
	
    /**
     * 属性 piclayouttype 的set方法
     * @return
     */
    public void setPiclayouttype(String piclayouttype){
        this.piclayouttype = piclayouttype;
    } 
	
    /**
     * 属性 issuetype 的get方法
     * @return String
     */
    public String getIssuetype(){
        return issuetype;
    }
	
    /**
     * 属性 issuetype 的set方法
     * @return
     */
    public void setIssuetype(String issuetype){
        this.issuetype = issuetype;
    } 
	
    /**
     * 属性 operuser 的get方法
     * @return String
     */
    public String getOperuser(){
        return operuser;
    }
	
    /**
     * 属性 operuser 的set方法
     * @return
     */
    public void setOperuser(String operuser){
        this.operuser = operuser;
    } 
	
    /**
     * 属性 opertime 的get方法
     * @return Date
     */
    public Date getOpertime(){
        return opertime;
    }
	
    /**
     * 属性 opertime 的set方法
     * @return
     */
    public void setOpertime(Date opertime){
        this.opertime = opertime;
    } 
	
    /**
     * 属性 verifytype 的get方法
     * @return String
     */
    public String getVerifytype(){
        return verifytype;
    }
	
    /**
     * 属性 verifytype 的set方法
     * @return
     */
    public void setVerifytype(String verifytype){
        this.verifytype = verifytype;
    } 
	
    /**
     * 属性 verifyinfo 的get方法
     * @return String
     */
    public String getVerifyinfo(){
        return verifyinfo;
    }
	
    /**
     * 属性 verifyinfo 的set方法
     * @return
     */
    public void setVerifyinfo(String verifyinfo){
        this.verifyinfo = verifyinfo;
    } 
	
    /**
     * 属性 backField1 的get方法
     * @return byte[]
     */
    public byte[] getBackField1(){
        return backField1;
    }
	
    /**
     * 属性 backField1 的set方法
     * @return
     */
    public void setBackField1(byte[] backField1){
        this.backField1 = backField1;
    } 
	
    /**
     * 属性 backField2 的get方法
     * @return byte[]
     */
    public byte[] getBackField2(){
        return backField2;
    }
	
    /**
     * 属性 backField2 的set方法
     * @return
     */
    public void setBackField2(byte[] backField2){
        this.backField2 = backField2;
    } 
	
    /**
     * 属性 backField3 的get方法
     * @return String
     */
    public String getBackField3(){
        return backField3;
    }
	
    /**
     * 属性 backField3 的set方法
     * @return
     */
    public void setBackField3(String backField3){
        this.backField3 = backField3;
    } 
	
    /**
     * 属性 backField4 的get方法
     * @return String
     */
    public String getBackField4(){
        return backField4;
    }
	
    /**
     * 属性 backField4 的set方法
     * @return
     */
    public void setBackField4(String backField4){
        this.backField4 = backField4;
    } 
	
    /**
     * 属性 backField5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackField5(){
        return backField5;
    }
	
    /**
     * 属性 backField5 的set方法
     * @return
     */
    public void setBackField5(BigDecimal backField5){
        this.backField5 = backField5;
    } 
	
    /**
     * 属性 backField6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackField6(){
        return backField6;
    }
	
    /**
     * 属性 backField6 的set方法
     * @return
     */
    public void setBackField6(BigDecimal backField6){
        this.backField6 = backField6;
    } 
	
    /**
     * 属性 keyword 的get方法
     * @return String
     */
    public String getKeyword(){
        return keyword;
    }
	
    /**
     * 属性 keyword 的set方法
     * @return
     */
    public void setKeyword(String keyword){
        this.keyword = keyword;
    } 
	
    /**
     * 属性 filecontent 的get方法
     * @return String
     */
    public String getFilecontent(){
        return filecontent;
    }
	
    /**
     * 属性 filecontent 的set方法
     * @return
     */
    public void setFilecontent(String filecontent){
        this.filecontent = filecontent;
    } 
	
    /**
     * 属性 addpic 的get方法
     * @return String
     */
    public String getAddpic(){
        return addpic;
    }
	
    /**
     * 属性 addpic 的set方法
     * @return
     */
    public void setAddpic(String addpic){
        this.addpic = addpic;
    } 
	
    /**
     * 属性 addfile1 的get方法
     * @return String
     */
    public String getAddfile1(){
        return addfile1;
    }
	
    /**
     * 属性 addfile1 的set方法
     * @return
     */
    public void setAddfile1(String addfile1){
        this.addfile1 = addfile1;
    } 
	
    /**
     * 属性 addfile2 的get方法
     * @return String
     */
    public String getAddfile2(){
        return addfile2;
    }
	
    /**
     * 属性 addfile2 的set方法
     * @return
     */
    public void setAddfile2(String addfile2){
        this.addfile2 = addfile2;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof IrNewsstore))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        IrNewsstore other = (IrNewsstore) o;	        
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
            .append("flowid"+":"+getFlowid())
            .append("itemid"+":"+getItemid())
            .append("itemname"+":"+getItemname())
            .append("numid"+":"+getNumid())
            .append("ntitle"+":"+getNtitle())
            .append("nsummary"+":"+getNsummary())
            .append("nsource"+":"+getNsource())
            .append("nauthor"+":"+getNauthor())
            .append("issuetime"+":"+getIssuetime())
            .append("endtime"+":"+getEndtime())
            .append("clicktimes"+":"+getClicktimes())
            .append("hottype"+":"+getHottype())
            .append("opentype"+":"+getOpentype())
            .append("piclayouttype"+":"+getPiclayouttype())
            .append("issuetype"+":"+getIssuetype())
            .append("operuser"+":"+getOperuser())
            .append("opertime"+":"+getOpertime())
            .append("verifytype"+":"+getVerifytype())
            .append("verifyinfo"+":"+getVerifyinfo())
            .append("backField1"+":"+getBackField1())
            .append("backField2"+":"+getBackField2())
            .append("backField3"+":"+getBackField3())
            .append("backField4"+":"+getBackField4())
            .append("backField5"+":"+getBackField5())
            .append("backField6"+":"+getBackField6())
            .append("keyword"+":"+getKeyword())
            .append("filecontent"+":"+getFilecontent())
            .append("addpic"+":"+getAddpic())
            .append("addfile1"+":"+getAddfile1())
            .append("addfile2"+":"+getAddfile2())
            .toString(); 
			
    } 
   
	

    public Integer getTyear() {
		return tyear;
	}

	public void setTyear(Integer tyear) {
		this.tyear = tyear;
	}

	public Integer getTmonth() {
		return tmonth;
	}

	public void setTmonth(Integer tmonth) {
		this.tmonth = tmonth;
	}

	public Integer getTquarter() {
		return tquarter;
	}

	public void setTquarter(Integer tquarter) {
		this.tquarter = tquarter;
	}

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public Integer getTimetype() {
		return timetype;
	}

	public void setTimetype(Integer timetype) {
		this.timetype = timetype;
	}

	public String getBackField7() {
		return backField7;
	}

	public void setBackField7(String backField7) {
		this.backField7 = backField7;
	}

	public String getBackField8() {
		return backField8;
	}

	public void setBackField8(String backField8) {
		this.backField8 = backField8;
	}

	public String getBackField9() {
		return backField9;
	}

	public void setBackField9(String backField9) {
		this.backField9 = backField9;
	}

	public String getBackField10() {
		return backField10;
	}

	public void setBackField10(String backField10) {
		this.backField10 = backField10;
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